package TestNGPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataDriven {

	@Test
public void Login() throws IOException
{
Properties prop = new Properties();
FileInputStream fis =  new FileInputStream("C:\\Users\\gangadhar.a\\eclipse-workspace\\TestNGTutorial\\src\\TestNGPackage\\DataDriven.properties");
prop.load(fis);
System.out.println("UserName: "+prop.getProperty("UserName"));


}
}
