import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
public class Client {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		try (Scanner sc = new Scanner(System.in)) {
			Prog2 Xmltodoc = new Prog2();
			System.out.println("Entrer le chemin absolut du dossier a trier");
			String chemin= sc.nextLine();
			String chaine = Xmltodoc.PathToXMLstr(chemin,0);
			System.out.println("\n\nPathToXML- XML FORMAT\n\n<?xml version=\"1.0\"?>");
			System.out.println(chaine);
			System.out.println("\n\nPathToXML- TREE FORMAT");
			Xmltodoc.xmlToDoc(chaine).afficher(-5);
		}

		/*CheckBox checkbox1 = new CheckBox("1st checkbox");
		CheckBox checkbox2 = new CheckBox("2nd checkbox");
		Button button1 = new Button("1st Button");
		Button button2 = new Button("2nd Button");
		FieldSet fieldset1 = new FieldSet("1st FieldSet");
		FieldSet fieldset2 = new FieldSet("2nd FieldSet");

		Panel panel1 = new Panel("1st Panel");
		Panel panel2 = new Panel("2nd Panel");

		panel1.ajoute(checkbox1);
		panel1.ajoute(button1);
		panel1.ajoute(fieldset1);

		panel2.ajoute(checkbox2);
		panel2.ajoute(button2);
		panel2.ajoute(panel1);
		panel2.ajoute(fieldset2);
		
		System.out.println("");
		panel2.afficher(1);*/
}
}
