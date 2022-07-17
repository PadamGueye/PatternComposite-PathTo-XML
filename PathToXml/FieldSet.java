public class FieldSet extends Composant {

	public FieldSet(String nom)
	{
		super(nom);
	}

	public void afficher(int espace)
	{
		System.out.print(("<file name=\""+getNom()+"\">\n").indent(espace));
	}
}

