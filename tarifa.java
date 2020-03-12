import java.util.Scanner;

public class tarifa {
public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		int megabytelimit = obj.nextInt();
		int NumberofMonth = obj.nextInt();
		int max = 0;
		
		for(int x=1;x<=NumberofMonth;x++){
			
			int inp = obj.nextInt();
			max = max + (megabytelimit - inp);
			
		}
		System.out.println(max+megabytelimit);
		}

}
