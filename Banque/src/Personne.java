
public class Personne {
	private  String  nom , prenom;
	
	private int age;
	
	public Personne (String nom, String prenom , int age)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		
	}
	
	public void afficher()
	{
		System.out.println("Nom : "+nom+"\nPrenom : "+prenom+"\nAge : "+age);
	}

}

