
public class PointColore extends Point {

	String color; 
	public PointColore(double x, double y, String color ) {
		super(x, y);
		this.color=color;
		
	}
	public void afficher()
	{
		System.out.println("( x , y ) = ( "+x+" , "+y+" )\n Color : "+color);
		
	}
	

}
