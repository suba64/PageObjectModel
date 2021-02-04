package Com.Runnable.Testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	public String baseURL="http://demo.guru99.com/V1/index.php";
	public String username="mngr300260";
	public String password="sYnytet";
	WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		logger=Logger.getLogger("eBanking")	;
		PropertyConfigurator.configure("Log4j.properties");

}
	
	@AfterClass
	public void tearDown()
	{
    	driver.quit();
    }
}

