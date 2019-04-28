package com.CRM.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.Base.TestBase;
import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.DealsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;
import com.CRM.qa.Util.TestUtil;

public class HomePageTestCases extends TestBase {
		LoginPage loginPage;
		HomePage homePage;
		TestUtil testUtil;
		ContactsPage contactsPage;
		DealsPage dealsPage;

		public HomePageTestCases() {
			super();
		}

		
		@BeforeMethod
		public void setUp() {
			initialization();
			testUtil = new TestUtil();
			contactsPage = new ContactsPage();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		
		@Test(priority=1)
		public void verifyHomePageTitleTest(){
			String homePageTitle = homePage.verifyHomePageTitle();
			Assert.assertEquals(homePageTitle, "CRM");
		}
		
		@Test(priority=2)
		public void verifyUserNameTest(){
			
			Assert.assertTrue(homePage.verifyCorrectUserNameHome());
		}
		
		@Test(priority=3)
		public void verifyContactsLinkTest(){
			contactsPage = homePage.clickOnContactsLink();
		}
		
		@Test(priority=3)
		public void verifyDealsLinkTest(){
			dealsPage = homePage.clickOnDealsLink();
		}
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		

	}

