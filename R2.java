import java.util.Scanner;

public class R2 {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int R1 = obj.nextInt();
		int S = obj.nextInt();
		
		int R2 = (S * 2) - R1;
		
		System.out.println(R2);
	}
	
}
