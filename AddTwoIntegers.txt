package Rohit;

import java.util.Scanner;

public class AddTwoInt {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter 1st:");
		int a = s.nextInt();
		System.out.println("enter 2nd:");
		int b = s.nextInt();
		int res = a + b;
		
		System.out.println("sum is:"+res);
	}

}
