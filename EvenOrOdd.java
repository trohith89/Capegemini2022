package Rohit;

import java.util.Scanner;

public class EvenOrOdd {
		public static void main(String args[]) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("enter the num:");
			int n = s.nextInt();
			
			if(n%2 == 0)
				System.out.println("num is even");
			else
				System.out.println("num is odd");
		}

	}



