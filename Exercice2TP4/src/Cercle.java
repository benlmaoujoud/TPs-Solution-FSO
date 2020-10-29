
public class Cercle extends FormeFigure {

	int r;
	public Cercle(int x, int y,int r) {
		super(x, y);
		this.r=r;
		
	}
	
	public void afficher()
	{
		System.out.println("Je suis une Cercle de centre (x , y)= ("+x+" , "+y+")");
		System.out.println("Rayon : "+r);
		
	}

}
