package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTableGrids95969798 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation files\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20302/aus-vs-ind-2nd-test-india-tour-of-australia-2018-19");
        WebElement Table = driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int count = Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        int Sum = 0;
        for(int i=0; i<count-2 ;i++)
       {
    	  String RunsString = Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
    	  int Runs = Integer.parseInt(RunsString);
    	  Sum = Sum+Runs;
       }
        System.out.println(Sum);
        String ExtrasString = Table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
        int Extras = Integer.parseInt(ExtrasString);
        System.out.println(Extras);
        String TotalRunsActualString = Table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText();
        int TotalRunsActual = Integer.parseInt(TotalRunsActualString);
        System.out.println("Total Runs present on the table:"+TotalRunsActual);
        int TotalRunsExpected = Sum+Extras;
        System.out.println("Total Runs Calculated:"+TotalRunsExpected);
        
	}

}
