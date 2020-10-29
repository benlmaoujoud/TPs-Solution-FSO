import java.util.Scanner;

public class TestCercle {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		Point z=new Point();
		
		float r;
		System.out.println("Lecture des Donneés : ");
		System.out.print(" x = ");
		z.x=input.nextFloat();
		System.out.print(" y = ");
		z.y=input.nextFloat();
		System.out.print(" r = ");
		r=input.nextFloat();
		Cercle w =new Cercle(z,r);
		w.affiche();
		
		
		
	}

}
