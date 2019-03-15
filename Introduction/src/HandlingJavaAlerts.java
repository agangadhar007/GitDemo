import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\BackUp\\D Drive\\Automation files\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
driver.switchTo().alert().accept();// "accept()" method is used to click positive actions like ok/Yes/Done etc.
//driver.switchTo().alert().dismiss(); "dismiss()" method is used to click negative actions like No/None etc.
//System.out.println(driver.switchTo().alert().getText()); "getText()" method is used to get the alert message of the popup
//driver.switchTo().alert().sendKeys("fesfe"); "sendKeys()" method is used to enter some value to text box present in popup
	}

}
