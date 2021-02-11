package Swap;
import java.util.Scanner;

public class inputfromuser {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a value: ");  
		String str= sc.nextLine();                
		System.out.print("Value entered by user "+str);
	}

}
