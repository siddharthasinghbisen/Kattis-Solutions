import java.util.Scanner;

public class filip {
	public static void main(String[] args){
		Scanner obj= new Scanner(System.in);
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		
		if(reversenum(num1)>reversenum(num2)){
			System.out.println(reversenum(num1));
		}else{
			System.out.println(reversenum(num2));

		}
	}
	static int reversenum(int num){
		
		int reverse = 0;
		while(num !=0){
			reverse = reverse * 10;
			reverse = reverse + num%10;
			num = num/10;
		}
		
		return(reverse);	
	}

}
