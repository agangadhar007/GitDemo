package TestNGPackage;

import org.testng.annotations.Test;

public class TestNGHelperAttributes136 {

	@Test(enabled=false)
	public void Testcase1()
	{
		System.out.println("Print Testcase1");
	}
	@Test(timeOut=5000)
	public void Testcase2()
	{
		System.out.println("Print Testcase2");
	}
	@Test(dependsOnMethods= {"Testcase2"})
	public void BTestcase3()
	{
		System.out.println("Print Testcase3");
	}
	@Test(dependsOnMethods= {"Testcase2","BTestcase3"})
	public void ATestcase4()
	{
		System.out.println("Print Testcase4");
	}
}
