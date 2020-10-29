
public class Chromosome {
	
	Gene gene[]=new Gene[100] ;

	
	public Chromosome(int nbGen) {
		
		for(int i=0;i<nbGen; i++)
		{
			gene[i]=new Gene();
			
			
		}
		
	}
	
	public void afficher()
	{
	
		System.out.print(" [ ");
		for(int i=0;i<gene.length && gene[i]!=null;i++)
			System.out.print(" "+gene[i].val);
		System.out.print(" ] ");
		
		
	}
	
	

}
