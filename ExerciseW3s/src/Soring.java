import java.util.Scanner;
public class Soring {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arr2[] = new int[arr.length];
		System.out.println("Befor Reversing ...");
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
			
		}
		System.out.print(" ]");
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			arr2[j]=arr[i];
			j++;

		}
		System.out.println("\nAfter Reversing ...");
		System.out.print("[");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(" "+arr2[i]);
			
		}
		System.out.print(" ]");
		
	}

}
