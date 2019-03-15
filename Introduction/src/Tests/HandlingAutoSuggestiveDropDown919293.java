package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestiveDropDown919293 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BackUp\\D Drive\\Automation files\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
	    String text = (String) js.executeScript(script);
	    System.out.println(text);
	    int i = 0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
		{
			
			i++;
			Thread.sleep(2000);
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		    text = (String) js.executeScript(script);
		    System.out.println(text);
		    if(i>10)
		    {
		    System.out.println(("Element not found"));
		    break;		   
		    }
		    }
		}
		
	}


