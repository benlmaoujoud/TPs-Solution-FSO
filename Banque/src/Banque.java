
public class Banque {

	public static void main(String[] args) {
		Compte x = new Compte();
		x.setSoldeCompte(10000);
		x.setNumCompte(25487996587l);
		
		Client clt = new Client("Mohamed","Benlmaoujoud",25,x);

		clt.x.deposer(1000);
		clt.afficher();
		clt.x.retirer(1500);
		clt.afficher();
		
		
	}

}
