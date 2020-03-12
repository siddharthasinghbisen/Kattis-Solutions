import java.util.Scanner;

public class Autori {
	public static void main(String[] args){
		
		Scanner obj1 = new Scanner(System.in);
		String name = obj1.nextLine();
		
		getname(name);
	
	}
	static void getname(String name){
		String[] parts = name.split("-");
		
		for(int x=0;x<parts.length;x++){
			char first = parts[x].charAt(0);
			System.out.print(first);
		}
	}

}
