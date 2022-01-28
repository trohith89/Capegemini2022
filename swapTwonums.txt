package Rohit;

import java.util.Scanner;

public class SwapTwo {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter 1st:");
		int a = s.nextInt();
		System.out.println("enter 2nd:");
		int b = s.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after swapping:"+a+" "+b);
	}

}
