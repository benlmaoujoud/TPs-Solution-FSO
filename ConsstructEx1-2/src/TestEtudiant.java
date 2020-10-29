
public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant e1=new Etudiant("Mohamed","Benlmaoujoud","ZG139094");
		Etudiant e2=new Etudiant("Mohamed","Benlmaoujoud","ZG139094",20f,20f,20f);
		e1.affiche();
		float moy=e2.getMoyenne();
		System.out.print("Moyenne de Semester : "+moy);
		


	}

}
