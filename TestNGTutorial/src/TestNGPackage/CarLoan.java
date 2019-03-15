package TestNGPackage;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan extends DataDriven {
	@Parameters({"URL","USERNAME"})
	@Test
	public void CarLoanWeb(String URLname, String UserName) throws IOException 
	{
		Login();
		System.out.println("CarLoanWeb");
		System.out.println(URLname);
		System.out.println(UserName);
		
	}
	
	@Test
	public void CarLoanMobile() 
	{
		System.out.println("CarLoanMobile");
	}
	@Test(groups=("Smoke"))
	public void CarLoanAPI() 
	{
		System.out.println("CarLoanAPI");
	}

}
