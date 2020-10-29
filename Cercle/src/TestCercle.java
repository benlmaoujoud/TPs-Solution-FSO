import java.util.Scanner;

public class TestCercle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float x,y,r;
		Cercle z =new Cercle();
		System.out.println("Lecture des Donneés : ");
		System.out.print(" x = ");
		x=input.nextFloat();
		System.out.print(" y = ");
		y=input.nextFloat();
		System.out.print(" r = ");
		r=input.nextFloat();
		z.init(x, y);
		z.init(r);
		z.afficher();
		r=8.25f;
		z.setRayon(r);
		z.afficher();
		x=2;
		y=2;
		z.deplacerCenter(x, y);
		z.afficher();
		
		
		
		
	}

}
