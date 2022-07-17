abstract class Composant {
    private String nom;
    public Composant(String nom){this.nom =nom;}
    public void ajoute(Composant c ){}
    public String getNom(){return this.nom;}
    public abstract void afficher(int espace);
}
