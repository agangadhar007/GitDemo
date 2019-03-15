import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BackUp\\D Drive\\Automation files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		// To find the number of frames present in window
		System.out.println(driver.findElements(By.tagName("iframe")).size());// based on the count of frames, we can identify the frames using index												 
		// driver.switchTo().frame(0);//Identifying a frame based on its index
		// driver.switchTo().frame(arg0);//Identifying a frame using frame ID
		// To perform actions present on frames, control should be switched to that frame from the main window
		 
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		// Again to perform actions on main window, control should get back to main
		// window from frame
		driver.switchTo().defaultContent();
		
	}

}
