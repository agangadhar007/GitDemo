import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BackUp\\D Drive\\Automation files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
Assert.assertTrue(driver.findElement(By.id("")).isSelected());
Assert.assertFalse(driver.findElement(By.id("")).isSelected());
Assert.assertEquals(driver.findElement(By.id("")).getText(),"Happy");

	}

}
