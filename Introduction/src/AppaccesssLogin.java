import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppaccesssLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://appaccess.mphasis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='textfield']")).sendKeys("2344173");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Venkataravi@173");
	    driver.findElement(By.xpath("//input[@value='Log On']")).click();
	    driver.findElement(By.xpath("//img[@src='images/log_icon.png']")).click();
	    //driver.close();
	    driver.quit();
	    
	}

}
