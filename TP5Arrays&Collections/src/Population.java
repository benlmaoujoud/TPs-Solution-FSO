
public class Population {
	
	 Chromosome chromo[]= new Chromosome[100];
	
	public Population(int nbChromo , int nbGene )
	{
		
		for(int i=0;i<nbChromo ;i++)
			chromo[i]=new Chromosome(nbGene);
	}
	
	public void afficher()
	{
		for(int i=0;i<chromo.length && chromo[i]!=null;i++)
		{
			System.out.print("Chromosome_"+(i+1)+" : ");
			chromo[i].afficher();
			System.out.println();
		}
		
	}
	
	public void mutation(Chromosome v , int a )	
	{
		if( v.gene[a].val==0 )
			v.gene[a].val=1;
		else
			v.gene[a].val=0;
		
	}
		
	public void croisement(Chromosome u ,Chromosome v ,int a)
	{
		int tmp=0;
		int n=u.gene.length;
		for(int i=a;i<n && u.gene[i]!=null;i++)
		{
			tmp=u.gene[i].val;
			u.gene[i].val=v.gene[i].val;
			v.gene[i].val=tmp;
			
		}
			
	}	

}
