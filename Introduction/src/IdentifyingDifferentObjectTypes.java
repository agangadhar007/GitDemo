import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IdentifyingDifferentObjectTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Automation files\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://spicejet.com");
driver.manage().window().maximize();



//Static drop downs
Select s=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
s.selectByValue("AED");
s.selectByIndex(1);
s.selectByVisibleText("USD");	
s.selectByIndex(1);


//Dynamic Drop downs
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
driver.findElement(By.xpath("//a[@value='HYD']")).click();
driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();
//Date
//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();


//Checkbox
System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();		
System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());		
//driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$ButtonSubmit")).click();	


//RadioButton
driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();


/*
//Clicking on Radio Button based on its position
int count=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
for(int i=0;i<count;i++)
{
	driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(1).click();
	//System.out.println("1");
	}
	*/
/*
//Clicking on all the Radio Buttons present in the group based on its position
int count1=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
for(int i=0;i<count1;i++)
{
	driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
	}
*/

/*
//Clicking on Radio Button present in the group without using its value attribute in Xpath.
int count2=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
for(int i=0;i<count2;i++)
{
	String text=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
if(text.equals("RoundTrip"))
{
	driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();	
	System.out.println("Testing");
}

}*/


	}

}
