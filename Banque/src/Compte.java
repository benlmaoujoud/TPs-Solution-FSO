
public class Compte {
	private long numCompte;
	private double soldCompte;
	
	// getters & Setters 
	
	public void setNumCompte(long numCompte)
	{
		this.numCompte=numCompte;
	}
	public void setSoldeCompte(double soldCompte )
	{
		this.soldCompte=soldCompte;
	}
	
	
	
	
	
	public void deposer(double s)
	{
		this.soldCompte+=s;
	}
	
	public void retirer(double s)
	{
		this.soldCompte-=s;
		
	}
	
	public String AvoirSolde()
	{
		return "Votre Solde : "+soldCompte ;
	}
	
	public String info()
	{
		return "Compte Numéro : "+numCompte+" , Solde : "+soldCompte+"Dhs "; 
		
	}
	

}
