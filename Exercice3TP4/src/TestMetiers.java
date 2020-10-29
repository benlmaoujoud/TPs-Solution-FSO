
public class TestMetiers {

	public static void main(String[] args) {

		Personne [] prs = new Personne[3];
		prs[0]= new Menuisier("Ahmed");
		prs[1] = new Plombier("Yassine");
		prs[2] =new Menuisier("Salim");
		for(int i=0;i<prs.length;i++)
			prs[i].show();
		

	}

}
