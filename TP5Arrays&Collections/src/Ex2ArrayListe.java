import java.util.*;
import java.util.Scanner;
public class Ex2ArrayListe {

 

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
		ArrayList<Etudiant> A = new ArrayList<Etudiant>();
		int rep,id ;
		 System.out.println("\t|----------- Menu ------------|");
		 	System.out.println();
			System.out.println("\t1 - Ajouter Un Etudiant");
			System.out.println("\t2 - Affichage Tous Les Etudiants ");
			System.out.println("\t3 - Quitter Le Programme ");
			System.out.println();
			
		do {
			System.out.print("\tDonnez Votre Choix : ");
			rep=in.nextInt();
			
			switch(rep)
			{
			case 1 :
				    System.out.println("\tVotre Choix est : Ajouter");
					System.out.print("\tId De Cette Etudiant : ");
					id=in.nextInt();
					Etudiant e = new Etudiant(id);
					A.add(e);
					break;
			case 2 : 
				System.out.println("\tVotre Choix est : Afficher");
				 System.out.println("\t|-------- Affichage ---------|");

				for(int i=0;i<A.size();i++) {
					System.out.println("Etudiant Numero "+(i+1)+" : ");
					A.get(i).afficher();
					
				}
				break;
				
			case 3 :
				System.out.println("Quitter Le Programme");
	
				break;
			}
			
		}while(rep!=3);
		
		
	
}
	
}