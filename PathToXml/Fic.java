public class Fic extends Composant{
        public Fic(String nom)
        {
            super(nom);
        }
    
        public void afficher(int espace)
        {
            if(espace<5){
                System.out.print(("├─── "+getNom()+"\n").indent(espace));
            }
            else{
                System.out.print("│"+("└─── "+getNom()+"\n").indent(espace));
            }
        }
}