package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

public class HomeLoan {

	@Test(groups=("Smoke"))
	public void HomeLoanWeb() 
	{
		System.out.println("HomeLoanWeb");
	}
	@Parameters({"URL"})
	@Test
	public void HomeLoanMobile(String URLname) 
	{
		System.out.println("HomeLoanMobile");
		System.out.println(URLname);
	}
	@Test
	public void HomeLoanAPI() 
	{
		System.out.println("HomeLoanAPI");
		Assert.assertTrue(false);
	}
	@Test(groups=("Smoke"))
	public void TestHomeLoanAPI() 
	{
		System.out.println("Testing Regex");
	}

}
