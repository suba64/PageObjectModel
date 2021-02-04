package Com.Runnable.Testcases;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.iNetBankingPageObjects.LoginPage;

public class TC_Logintest_TC001 extends BaseClass

{
	
	
	List<WebElement> lnks=driver.findElements(By.tagName("a"));
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		logger.info("URL opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassWord(password);
		lp.clickSubmit();
		
	
		
	}

}
