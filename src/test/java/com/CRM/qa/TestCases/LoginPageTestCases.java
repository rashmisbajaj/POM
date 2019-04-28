package com.CRM.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.Base.TestBase;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class LoginPageTestCases extends TestBase {
	
		LoginPage loginPage;
		HomePage homePage;
		
		public LoginPageTestCases()
		{
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();	
		}
		
		@Test(priority=2)
		public void loginPageTitleTest(){
			String title = loginPage.validateLoginPageTitle();
			Assert.assertEquals(title,"CRM");
		}
		
		@Test(priority=3)
		public void Verifylink(){
			loginPage.ValidateForgotPwdLink();

		}
		
		@Test(priority=1)
		public void loginTest(){
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		

	}


