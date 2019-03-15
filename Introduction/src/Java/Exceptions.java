package Java;

public class Exceptions {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
try
{
	int a =4;
	int b =0;
	int ar[] = new int[5];
	System.out.println(ar[7]);
	int c =a/b;
	
	System.out.println(c);
	
}


catch(IndexOutOfBoundsException ie)
{
	
	System.out.println("IndexOutOfBoundsException is caught");
}
catch(ArithmeticException ae)
{
	System.out.println("ArithmeticException is caught");
}
catch(Exception e)
{
	System.out.println("Exception is caught");
}

finally
{
System.out.println("Finally block got executed");	
}


	}

}
