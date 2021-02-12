package Task2;

import java.util.Scanner;

public class RandomChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a charecter");
		String str= sc.nextLine();
		
		if (str.toLowerCase().equals("r")|| str.toLowerCase().equals("a") || str.toLowerCase().equals("n")||str.toLowerCase().equals("d")|| str.toLowerCase().equals("o") || str.toLowerCase().equals("m"))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}

}
