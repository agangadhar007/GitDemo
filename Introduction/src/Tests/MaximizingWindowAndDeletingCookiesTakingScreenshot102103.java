package Tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizingWindowAndDeletingCookiesTakingScreenshot102103 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation files\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize(); //Maximizes the window
		driver.manage().deleteAllCookies();  //Deletes all the cookies
		//driver.manage().deleteCookieNamed("Mention the name of the cookie"); //Delete a specific cookie
		driver.navigate().to("https://www.flipkart.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\ScreenshotGan.png"));
	}

}
 	