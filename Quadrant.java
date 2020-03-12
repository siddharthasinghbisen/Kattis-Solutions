import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args){
		Scanner myobj1 = new Scanner(System.in);
		int x = myobj1.nextInt();
		int y = myobj1.nextInt();
		myfunc(x,y);
	}
	public static void myfunc(int x, int y){
			
		if(x > 0 && y > 0){
			System.out.println("1"); //Quadrant 1
			
		}else if(x < 0 && y > 0){
			System.out.println("2"); //Quadrant 2
			
		}else if(x < 0 && y < 0){
			System.out.println("3"); //Quadrant 3
			
		}else if(x > 0 && y < 0){
			System.out.println("4"); //Quadrant 4
		}
	}
		

}
