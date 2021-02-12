package Task2;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		 while(true){
			 System.out.println("enter a number");
			 n= sc.nextInt();
			 if (n%2==0) {
				 System.out.println("good going");
				 continue;	 
			 }
			 else
			 {
				 System.out.print("its over");
				 break;
			 }
		 }
		
	}

}
