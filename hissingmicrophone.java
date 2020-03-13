import java.util.Scanner;

public class hissingmicrophone {
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		
		findhiss(name);
	}	
	static void findhiss(String name){
		for(int x= 0; x<=name.length(); x++){
			if(name.contains("ss")){
				System.out.println("hiss");
				break;
			}
			else{
				System.out.println("no hiss");
				break;
			}
		}
	}

}
