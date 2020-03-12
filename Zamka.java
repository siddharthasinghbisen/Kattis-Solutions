import java.util.Scanner;

public class Zamka {
public static void main(String[] args){
		
		Scanner obj1 = new Scanner(System.in);
		int L = obj1.nextInt();
		int D = obj1.nextInt();
		int X = obj1.nextInt();
		
		getmin(L,D,X);
		getmax(L,D,X);
	
	}
	static void getmin(int L, int D, int X){
		int min = 0;
		for(int x=L;x<=D;x++){
			if(getsum(x)==X){
				min = x;
				System.out.println(min);
				break;
			}			
		}
		}
	static void getmax(int L, int D, int X){
		int max = 0;
		for(int y=D;y>=L;y--){
			if(getsum(y)==X){
				max = y;
				System.out.println(max);
				break;
			}			
		}
	}
	static int getsum(int num){
		int rem = 0;
		int sum=0;
		while(num!=0){
			rem = num % 10;
			sum = sum+rem;
			num = num/10;
		}
		return(sum);
	}

}
