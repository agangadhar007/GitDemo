//Testing second version
package TestNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Annotations {
	
	@Test
	public void PersonalLoanWeb() 
	{
		System.out.println("PersonalLoanWeb");
	}
	
	@Test
	public void PersonalLoanMobile() 
	{
		System.out.println("PersonalLoanMobile");
	}
	@Test
	public void PersonalLoanAPI() 
	{
		System.out.println("PersonalLoanAPI");
	}
	@BeforeTest
	public void BeforeTest() 
	{
		System.out.println("First in the Test");
	}
	@AfterTest
	public void AfterTest() 
	{
		System.out.println("Last in the Test");
	}
	@AfterSuite
	public void AfterSuite() 
	{
		System.out.println("Last in the Suite");
	}
	@BeforeSuite
	public void BeforeSuite() 
	{
		System.out.println("First in the Suite");
	}
	@AfterMethod
	public void AfterMethod() 
	{
		System.out.println("Executing after every test case");
	}
	@BeforeMethod
	public void BeforeMethod() 
	{
		System.out.println("Executing before every test case");
	}
	@AfterClass
	public void AfterClass() 
	{
		System.out.println("Last in the class");
	}
	@BeforeClass
	public void BeforeClass() 
	{
		System.out.println("First in the class");
	}
}
//Testing purpose only
