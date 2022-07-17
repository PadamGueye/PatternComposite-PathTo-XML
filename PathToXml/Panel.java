import java.util.ArrayList;

public class Panel extends Composant {
    ArrayList<Composant> composants = new ArrayList<Composant>();

    public Panel(String nom){
        super(nom);
    }

    public void ajoute(Composant c)
    {
        composants.add(c);
    }
    public void afficher(int espace){
        System.out.print(("<directory name=\""+getNom()+"\">\n").indent(espace));
        espace+=5;
        for(Composant c: composants){    
            c.afficher(espace);   
        }
        espace-=5;
        System.out.printf("</directory>\n".indent(espace));
        espace=1;
    }
}
