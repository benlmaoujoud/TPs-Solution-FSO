
public class Client extends Personne{
	Compte x= new Compte();

	public Client(String nom, String prenom, int age,Compte x) {
		super(nom, prenom, age);
		this.x=x;
		
	}

	public void afficher()
	{
		super.afficher();
		System.out.println(x.info());
	
	}
	
}
