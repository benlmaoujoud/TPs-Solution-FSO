
public class Exercice1 {

	public static void main(String[] args) {

		MemmberUniversite mem = new MemmberUniversite();
		Fonctionnaire     fct = new Fonctionnaire();
		Etudiant          etd = new Etudiant();
		Professeur        prfs= new Professeur();
		Secretaire        scrt= new Secretaire();
		
		
		fct.dateEntree=2009;
		fct.dateNaissance=1986;
		fct.nom="Yasmine ";
		fct.afficher();
		
		System.out.println();
		
		etd.anneeScolaire=2020;
		etd.dateNaissance=1999;
		etd.nom="Mohamed Benlmaoujoud";
		etd.afficher();
		
		System.out.println();
		
		prfs.dateEntree=2006;
		prfs.dateNaissance=1979;
		prfs.grade="Professeur de l'etudes superieur";
		prfs.nom="Gabli Mohamed ";
		prfs.afficher();
		
		System.out.println();
		
		scrt.dateEntree=2002;
		scrt.nom="Hanane";
		scrt.dateNaissance=1980;
		scrt.afficher();
		
		

	}

}
