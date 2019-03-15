import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BackUp\\D Drive\\Automation files\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20302/aus-vs-ind-2nd-test-india-tour-of-australia-2018-19");
       WebElement table = driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int Rows = table.findElements(By.xpath("//div[class='cb-col cb-col-8 text-right text-bold']")).size();
		System.out.println(Rows);
		
		
		
}
}