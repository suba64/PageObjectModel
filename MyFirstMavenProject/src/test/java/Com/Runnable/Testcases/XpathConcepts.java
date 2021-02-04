package Com.Runnable.Testcases;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathConcepts {
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://flipkart.com";

		// clicking the Login button
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebDriverWait wait=new WebDriverWait(driver,120);
		WebElement usrnme=driver.findElement(By.xpath("//*[contains(text(),'Enter Email')]"));
		wait.until(ExpectedConditions.visibilityOf(usrnme));
		usrnme.sendKeys("r.subasri@yahoo.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("chandranravi");
		driver.findElement(By.xpath("//button[@type='submit']/span")).click();
		

		
		

	}
	
	

}
