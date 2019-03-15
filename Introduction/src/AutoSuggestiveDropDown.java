import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BackUp\\D Drive\\Automation files\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Mum");
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("hp-widget__sTo")).clear();
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Che");
		driver.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.ENTER);
	}

}
