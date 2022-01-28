package Rohit;

import java.util.Scanner;

public class MaxOf3 {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter 3 nums:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a>b && a>c)
			System.out.println("biggest is:"+a);
		else if(b>c)
			System.out.println("biggest is:"+b);
		else
			System.out.println("biggest is:"+c);
		
	}

}
