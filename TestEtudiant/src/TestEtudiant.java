
public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant e1=new Etudiant();
		Etudiant e2=new Etudiant();
		e1.init("Mohamed","Benlmaoujoud", "ZG1390094");
		e1.affiche();
		e2.init("Mohamed","Benlmaoujoud", "ZG135254", 20, 19, 19);
		float moy=e2.getMoyenne();
		e2.affiche();
		System.out.print("Moyenne de Semester : "+moy);
		
		

	}

}
