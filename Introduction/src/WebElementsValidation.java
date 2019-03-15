import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		System.out.println(driver.findElement(By.xpath("//button[@id='addModifyBtn']")).isDisplayed());
		driver.findElement(By.xpath("//div[@id='multicity']")).click();
		System.out.println(driver.findElement(By.xpath("//button[@id='addModifyBtn']")).isDisplayed());
	}

}
