package Strings;
import java.io.*;

public class getChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Rohit");
		char[] s2 = new char[3];
		try {
			s1.getChars(0, 1, s2, 0);
			System.out.print("copied value:");
			System.out.println(s2);
		}catch(Exception ex) {
			System.out.println("raised exception:");
		}

	}

}
