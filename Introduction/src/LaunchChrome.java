import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation files\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://google.com");//Takes us to the particular URL
//driver.findElement(By.xpath("//div[@id='gs_lc0']/input")).sendKeys("Happy Birthday");
System.out.println(driver.getTitle());//gets the Title of the tab
System.out.println(driver.getCurrentUrl());//Gets the current URL
//System.out.println(driver.getPageSource());------Prints page source
driver.navigate().to("https://flipkart.com");
driver.manage().window().maximize();
//driver.navigate().back();
//driver.navigate().forward();
//driver.close();//closes current browser opened by selenium
//driver.quit();//closes all the browsers opened by selenium
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("T shirts");

	}
	

}
