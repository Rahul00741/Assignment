package com.ShopWorxV1.TestCeses;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ShopWorxV1.PageObjects.LoginPage;

public class TC_LoginTest extends BaseClass
{
	@Test
	public void loginTest() throws IOException 
	{
			
		
		
		LoginPage lp=new LoginPage(driver);
		lp.clickSubmit();
		
		lp.setUserName(username);
			
		lp.setPassword(password);
		
		lp.clickLogin();
		
		captureScreen(driver,"Login Page");
		
	}
}
