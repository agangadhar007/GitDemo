package TestNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAttribute {
	@Test(dataProvider="GetData")
	public void Testcase1(String UserName, String Password) 
	{
		System.out.print("Print Test case1");
		System.out.print(UserName);
		System.out.print(Password);
	}
	@DataProvider
	public Object[][] GetData()
	{
		//1st value represents Row and 2nd value represents Column of a Data set
		Object[][] data = new Object[3][2];
		data[0][0] = "1stUserName";
		data[0][1] = "1stPassword";
		
		data[1][0] = "2ndUserName";
		data[1][1] = "2ndPassword";
		
		data[2][0] = "3rdUserName";
		data[2][1] = "3rdPassword";
		return data;
	}
}
