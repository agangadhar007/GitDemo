package Java;

public class ReverseAString {
	public static void main(String[] args) {
		
String Name = "Mphasis";
String Reverse = "";
/*
for(int i=Name.length()-1; i>=0; i--)
{
	Reverse = Reverse+Name.charAt(i);
}
System.out.println(Name);
System.out.println(Reverse);
*/

StringBuffer sb = new StringBuffer(Name);
System.out.println(sb.reverse());
	}
}
