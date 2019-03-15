import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BackUp\\D Drive\\Automation files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//img[@title='LOGIN NOW']")).click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> pointer = id.iterator();
		String ParentID = pointer.next();
		String ChildID = pointer.next();
		System.out.println(driver.getTitle());
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
		driver.switchTo().window(ParentID);
		System.out.println(driver.getTitle());
	}

}
