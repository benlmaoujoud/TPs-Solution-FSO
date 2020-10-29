import java.util.Scanner;
public class Etudiant {

	int id;
	Scanner input = new Scanner(System.in);
	String nom , prenom;
	
	public Etudiant(int id)
	{
		this.id=id; 
		System.out.print("\tDonnez Le Nom : ");
		nom=input.nextLine();
		System.out.print("\tDonnez Le Prenom : ");
		prenom=input.nextLine();
	}
	
	public void afficher()
	{	System.out.println("\t\tNom : "+nom);
		System.out.println("\t\tPrenom : "+prenom);
		System.out.println("\t\tId : "+id);
    } 
	
}
