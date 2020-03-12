import java.util.Scanner;

public class Faktor {
	public static void main(String[] args){
				
				Scanner obj1 = new Scanner(System.in);
				int A = obj1.nextInt(); //the number of articles you plan to publish
				int I = obj1.nextInt(); //the impact factor the owners require.
				int X;
				
				X = A * (I-1) + 1 ;
				System.out.println(X);
				
				
				
				
				
			}
		

	}

