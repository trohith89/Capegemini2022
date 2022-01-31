package Rohit;

import java.util.Scanner;
public class CompQuoNrem {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		 System.out.println("enter dividend and divisor:");
		 int dnd = s.nextInt();
		 int div = s.nextInt();
		 
		 int quo = dnd/div;
		 int rem = dnd%div;
		 
		 System.out.println("quo and rem are:"+quo+" "+rem);
		
	}

}
