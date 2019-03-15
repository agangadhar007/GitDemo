import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAjaxMouseInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BackUp\\D Drive\\Automation files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		// mouse over to a specific element and Click, enter the data in capital letters
		// and then select the entered data
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("Hello").doubleClick().build().perform();
		// mouse over to a specific element and right click on it
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-yourAccount']"))).contextClick().build()
				//.perform();
		//move over using coordinates
		a.moveByOffset(0, 0);
		
	}

}
