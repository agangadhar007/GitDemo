package Java;

public class Strings {

	public static void main(String[] args) {
		// Creating an object for String class can be done in 2 ways, given below
		String str = "Payment $100 paid";
		String str1 = "Done";
//Other way--- String str1 = new String("Payment $100 paid");
		// Diferent methods from String class
		System.out.println(str.charAt(8)); //
		System.out.println(str.indexOf("$"));
		System.out.println(str.substring(str.indexOf("$")));
		System.out.println(str.length());
		System.out.println(str.concat(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str.substring(8, 12));
		System.out.println(str.contains(str1));
		System.out.println(str.codePointAt(1));
		System.out.println(str.codePointBefore(2));

		// Reversing a string and Palindrome

		String S = "malayalam";
		String T = "";

		for (int i = S.length() - 1; i >= 0; i--) {
			T = T + S.charAt(i);
		}
		System.out.println(S);
		System.out.println(T);
	
		if(S.equals(T)) 
			System.out.println("String is a Palindrome");
		else
			System.out.println("String is not a Palindrome");
	}

}
