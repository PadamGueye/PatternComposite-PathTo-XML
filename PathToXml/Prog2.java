import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
public class Prog2{

    public String PathToXMLstr(String folderpath, int espace) {
      File dir  = new File(folderpath);
      File[] liste = dir.listFiles();
      String Chaine = ("<directory name=\""+dir.getName()+"\">\n").indent(espace);
      espace+=5;
      for(File item : liste){

        if(item.isDirectory())
        {
          Chaine = Chaine+PathToXMLstr(item.getAbsolutePath(),espace); 
        } 
        else if(item.isFile())
        { 
          Chaine = Chaine+("<file name=\""+item.getName()+"\"/>\n").indent(espace); 
        }
        }
        espace-=5;
        Chaine = Chaine+("</directory>\n").indent(espace);
        espace=1; 

      return Chaine;
}

public Composant xmlToDoc(String ChaineXml) throws ParserConfigurationException, SAXException, IOException{
  String chaine="<?xml version=\"1.0\"?>";
  chaine= chaine.concat(ChaineXml);
  DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
  DocumentBuilder builder = builderFactory.newDocumentBuilder();
  StringBuilder xmlStringBuilder = new StringBuilder();
  xmlStringBuilder.append(chaine);
  ByteArrayInputStream input = new ByteArrayInputStream(
  xmlStringBuilder.toString().getBytes("UTF-8"));
  Document doc = builder.parse(input);
  Element element = doc.getDocumentElement();
  return insertElement(element); 
}
  

    private static Composant insertElement(Element element) {
      Dossier racine = new Dossier(element.getAttribute("name"));
      NodeList nodes = element.getChildNodes();
      for(int i=0 ; i<nodes.getLength(); i++){
        if(nodes.item(i).getNodeType()==Node.ELEMENT_NODE){
          Element eElement =  (Element)nodes.item(i);
          if(eElement.getNodeName().equals("file")){
            Composant fichierDoc = new Fic(eElement.getAttribute("name"));
            racine.ajoute(fichierDoc);
          }
          else if(eElement.getNodeName().equals("directory")){
            racine.ajoute(insertElement(eElement));
          }
        }
      }
  return racine;
} 
}