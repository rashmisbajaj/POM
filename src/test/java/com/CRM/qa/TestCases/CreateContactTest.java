package com.CRM.qa.TestCases;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CRM.qa.Base.TestBase;
import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.CreateContactsPage;
import com.CRM.qa.Pages.DealsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;
import com.CRM.qa.Util.TestUtil;

public class CreateContactTest {

	public class ContactsPageTest extends TestBase{

		LoginPage loginPage;
		HomePage homePage;
		TestUtil testUtil;
		ContactsPage contactsPage;
		DealsPage dealsPage;
		CreateContactsPage createContactsPage;
		 String sheetName = "contacts";
			
		   
		public ContactsPageTest(){
				super();
				
		}
		
		
		@BeforeMethod
		public void setUp() throws InterruptedException {
			
			initialization();
			testUtil = new TestUtil();
			contactsPage = new ContactsPage();
			createContactsPage=new CreateContactsPage();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		
		@Test(priority=2)
		public void Checkcontact()
		{
			contactsPage.CreateContact();
			driver.navigate().refresh();
			//contactsPage.selectContacts();
			contactsPage.selectContactsByName("Hardik Santosh Bajaj");
		}
		@DataProvider
		public Object[][] getCRMtestData()
		{
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
//	
//	@Test(priority=1,dataProvider="getCRMtestData")
//	public void CreateNewContact(String FirstName,String LastName,String MiddleName)
//	{
//		contactsPage.CreateContact();
//		contactsPage.ClickNewContactBtn();
//	//	createContactsPage.createNewContact("Rashmi", "Bajaj", "Santosh");
//		
//		createContactsPage.createNewContact(FirstName, LastName, MiddleName);
//		
//		contactsPage.CreateContact();
//		
//	}
		@AfterMethod
		public void tearDown(){
		//driver.quit();
		}
		
	}

}
