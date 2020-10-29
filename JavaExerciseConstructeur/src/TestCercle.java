
public class TestCercle {

	public static void main(String[] args) {
		Cercle c1=new Cercle(4);
		Cercle c2=new Cercle(6);
		c1.setRayon(18);
		c2.setRayon(25);
		double r1=c1.getRayon();
		double r2=c2.getRayon();
		double d1=c1.getDiametre();
		double d2=c2.getDiametre();
		double s1=c1.getSurface();
		double s2=c2.getSurface();
		System.out.println("Le Rayon du Cercle 1 : "+r1);
		System.out.println("Le Diametre du Cercle 1 : "+d1);
		System.out.println("La Surface  du Cercle 1 : "+s1);
		System.out.println("Le Rayon du Cercle 2 : "+r2);
		System.out.println("Le Diametre du Cercle 2 : "+d2);
		System.out.println("La Surface  du Cercle 2 : "+s2);
		
	
	}

}
