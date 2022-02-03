package Strings;

public class intern {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString
		String s1 = new String("rohit");
		String s2 = s1.intern();
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);

	}

}
