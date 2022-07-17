public class CheckBox extends Composant {
    public CheckBox(String nom)
	{
		super(nom);
	}

	public void afficher(int espace)
	{
		System.out.print(("<file name=\""+getNom()+"\">\n").indent(espace));
	}
}
