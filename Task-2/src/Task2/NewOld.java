package Task2;

import java.util.Scanner;

public class NewOld {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
				
		
		if(n%2!=0)
		{
			System.out.println("NEW");
		}
		else
		{
			if(n>=2 && n<=5)
			{
				System.out.println("OLD");
			}
			if(n>=6 && n<=30)
			{
				System.out.println("NEW");
			}
			else
			{
				System.out.println("OLD");
			}
		}
	}

}
