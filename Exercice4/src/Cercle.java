
public class Cercle {
	Point a=new Point();
	public double r;
	public Cercle(Point a, double r) {
		this.a.x=a.x;
		this.a.y=a.y;
		this.r=r;
	}
	
	public void affiche() {
		a.afficher();
		System.out.println("R = "+r);
		
		
	}

}
