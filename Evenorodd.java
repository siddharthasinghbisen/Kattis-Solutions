import java.util.Scanner;

public class Evenorodd {
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		int input = myobj.nextInt();
		myfunc(input); 
	}
	public static void myfunc(int input){
		if(input % 2 ==0){
			System.out.println("Bob");
			
		}else{
			System.out.println("Alice");
		}
	}

}
