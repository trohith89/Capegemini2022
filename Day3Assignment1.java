package Rohit;

import java.util.Scanner;

class fruit{
	String name,taste,size;
	void eat() {
		Scanner F = new Scanner(System.in);
		System.out.println("enter the name of the fruit:");
		name = F.next();
		System.out.println("enter the taste of the fruit:");
		taste = F.next();
		System.out.println("The"+name+"is"+taste);
	}
}

class apple extends fruit{
	@Override
	void eat() {
		System.out.println("The apple is very sweet");
	}
	
}
class orange extends fruit{
	@Override
	void eat() {
		System.out.println("The orange is very sour");
	}
	
}


public class Assignment1 {

	public static void main(String[] args) {
		
		fruit a = new apple();
		fruit o = new orange();
		fruit F = new fruit();
		a.eat();
		o.eat();
		F.eat();
		

	}

}
