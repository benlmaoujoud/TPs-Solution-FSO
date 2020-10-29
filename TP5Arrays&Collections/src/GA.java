
public class GA {

	public static void main(String[] args) {
			
			Population p =new Population(10,20);
			p.afficher();
			System.out.println("After operation : ");
			p.mutation(p.chromo[4], 6);
			p.croisement(p.chromo[0], p.chromo[9], 15);			///p.mutation(p.chromo[3], 6);
			p.afficher();
			
	}

	
	
	
}
