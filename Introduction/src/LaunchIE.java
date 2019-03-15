import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.ie.driver", "C:\\work\\IEDriverServer.exe");
        
        WebDriver Driver = new InternetExplorerDriver();
        //Hit url on browser
        Driver.get("http://google.com");
        System.out.println(Driver.getTitle());
	}

}
