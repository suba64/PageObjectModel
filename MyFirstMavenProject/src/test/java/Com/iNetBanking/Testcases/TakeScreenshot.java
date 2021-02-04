package Com.iNetBanking.Testcases;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeScreenshot {
	
	public static void main(String[] args) throws IOException
	{
		//WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/");
		driver.manage().window().maximize();
		
		// Rightclick and select a value
		WebElement homePageText=driver.findElement(By.xpath("//span[text()='Coding Ground ']"));
		
		Actions ac=new Actions(driver);
		ac.contextClick(homePageText).build().perform();
		
		
		//Syntax for capturing screenshot....! 
		TakesScreenshot screenshot= ((TakesScreenshot)driver);
		File scr=screenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File("F:/Screenshot/Test1_Login.png");
		
		FileUtils.copyFile(scr, dest);
		
		//Syntax for Alert Handling
		Alert al=driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.sendKeys("ok");
		
		
		//Hnadling multiple windows
		String parentwndw=driver.getWindowHandle();
		Set<String> wndws=driver.getWindowHandles();
		for(String window:wndws)
		{
			if(!parentwndw.equals(window))
			{
				
			String childwindwTitle=driver.switchTo().window(window).getTitle();
			driver.close();
		}
		
		driver.switchTo().window(parentwndw);
		
		}
		
		}

}
