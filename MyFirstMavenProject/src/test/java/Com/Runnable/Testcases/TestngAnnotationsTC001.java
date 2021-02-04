package Com.Runnable.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngAnnotationsTC001 {
	
	WebDriver driver;
	
	
	@BeforeMethod
	@Parameters({"link"})
	public void toolsQAInitialSetup(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//String url="https://www.toolsqa.com/";
				driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
				
	}

	@Test(priority=0)
	public void toolsQATitleTest()
	{
		String title=driver.getTitle(); 
		System.out.println("The title of the page is " +title);
		Assert.assertEquals(title, "Free QA Automation Tools Tutorial for Beginners with Examples");
			}
	@Test(priority=1)
	public void toolsQAHomepage()
	{
		System.out.println("ToolsQAHomePage");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
