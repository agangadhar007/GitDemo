import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebDriverScope76777879 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		
		// Printing the count of links present in the web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Printing the count of links present in only footer of web page by limiting the scope of web driver
		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//Printing the count of links present in only 1st column of footer of web page by limiting the scope of web driver
		//Observe the below XPath
		WebElement FirstColumn = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(FirstColumn.findElements(By.tagName("a")).size());
		
		//Clicking and opening each link in different tab
		for(int i=1;i<FirstColumn.findElements(By.tagName("a")).size();i++)
		{
			//String ClickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			FirstColumn.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
			//Thread.sleep(2000L);
			//driver.switchTo().
		}
		
		//Switch to each tab and get tab title
		Set<String> Tabs = driver.getWindowHandles();
		Iterator<String> It = Tabs.iterator();
		while(It.hasNext())
		{
			//System.out.println(driver.getTitle());
			driver.switchTo().window(It.next());
			System.out.println(driver.getTitle());
		}
		
	}
}
