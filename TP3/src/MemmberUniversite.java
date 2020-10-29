
public class MemmberUniversite {

public  String nom;
public int dateNaissance;

public  int calculerAge()
{
return (2020 - dateNaissance);	
}

public void afficher()
{
	
	System.out.print("Je m'appelle   "+nom+" et j'ai "+calculerAge());
	
	
}


}
