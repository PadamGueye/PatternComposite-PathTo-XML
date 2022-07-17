import java.util.ArrayList;

public class Dossier extends Composant  {
    ArrayList<Composant> composants = new ArrayList<Composant>();

    public Dossier(String nom){
        super(nom);
    }

    public void ajoute(Composant c)
    {
        composants.add(c);
    }
    public void afficher(int espace){
        if(espace<0){
            System.out.print(("*"+getNom()+"\n"));
        }
        else if(espace>=0 &&espace<5){
            System.out.print(("├─── "+getNom()+"\n").indent(espace));
        }
        else{
            System.out.print("│"+("└─── "+getNom()+"\n").indent(espace));
        }
        espace+=5;
        
        for(Composant c: composants){    
            c.afficher(espace);   
        }
        espace-=5;
    }
}
