public class Button extends Composant {
    public Button(String nom)
	{
		super(nom);
	}

	public void afficher(int espace)
	{	
		System.out.print(("<file name=\""+getNom()+"\">\n").indent(espace));
	}
}
