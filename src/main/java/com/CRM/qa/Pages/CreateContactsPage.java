package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.Base.TestBase;

public class CreateContactsPage extends TestBase {

	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement mName;
	
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")
	WebElement saveBtn;
	
	
	
	// Initializing the Page Objects:
	public CreateContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createNewContact(String fname, String lname, String mname)
	{
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		mName.sendKeys(mname);
		saveBtn.click();
		
	}
//public void savecontact()
//{
//	saveBtn.click();
//}

}