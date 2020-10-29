
public class Rectangle extends FormeFigure{
	int langueur;
	int largeur ;
	public Rectangle(int x, int y,int largeur ,int langueur) {
		super(x, y);
		this.largeur=largeur;
		this.langueur=langueur;
	}
	
	
	public void afficher()
	{
		
	System.out.println("Je suis un Rectangle de centre (x , y)= ("+x+" , "+y+")");
	System.out.println("Langueur  : "+langueur);
	System.out.println("Largeur : "+largeur);
	
		
	}
}
