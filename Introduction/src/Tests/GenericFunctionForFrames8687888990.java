package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericFunctionForFrames8687888990 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation files\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://fantasycricket.dream11.com/IN/");//this site is not exist now.
		int FrameNumber = findFrameNumber(driver, By.xpath("give XPath of required object"));
		driver.switchTo().frame(FrameNumber);
		driver.findElement(By.xpath("give XPath of required object")).click();
		driver.switchTo().defaultContent();
		FrameNumber = findFrameNumber(driver, By.xpath("give XPath of another required object"));
		driver.switchTo().frame(FrameNumber);
		driver.findElement(By.xpath("give XPath of another required object")).click();
		driver.switchTo().defaultContent();
	}
	
	public static int findFrameNumber(ChromeDriver driver, By by)
	{
		int i;
		int FrameCount = (driver.findElements(By.tagName("iframe")).size());
		for(i=0; i<FrameCount; i++)
		{
		driver.switchTo().frame(i);
		  int count = driver.findElements(by).size();
		  if (count>0)
		  {
			  //driver.findElement(By.xpath("give XPath of required object")).click();
			  break;
		  }
		  
		}
		return i;
	}

}
