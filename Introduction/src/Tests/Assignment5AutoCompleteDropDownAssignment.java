package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5AutoCompleteDropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BackUp\\D Drive\\Automation files\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys("Uni");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys(Keys.DOWN);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		while(!text.equalsIgnoreCase("United Arab Emirates"))
		{
			i++;
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>12)
			{
				System.out.println("Option is not found");
				break;
			}
		}

	}

}
