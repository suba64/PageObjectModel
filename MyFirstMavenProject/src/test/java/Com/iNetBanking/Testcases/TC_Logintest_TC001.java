package Com.iNetBanking.Testcases;

import org.testng.annotations.Test;

import Com.iNetBankingPageObjects.LoginPage;

public class TC_Logintest_TC001 extends BaseClass

{
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
