package Task2;

import java.util.Scanner;

public class floatingpoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double n= sc.nextDouble();
		if (n==0)
		{
			System.out.println("Zero");
		}
		if (n>=0)
		{
			System.out.println("positive");
		}
		else 
		{
			System.out.println("negative");
		}
if (Math.abs(n)<1)
{
	System.out.println("small");
}
if (Math.abs(n)>1000000)
{
	System.out.println("large");
}
	}

}
