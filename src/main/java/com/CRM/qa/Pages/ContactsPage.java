package com.CRM.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.Base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement contactsLabel;
	
	@FindBy(xpath = "//div[1]/div/div[1]/a[3]")
	WebElement newContactLink;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/a/button")
	WebElement newContactBtn;
	
	@FindBy(xpath= "//*[text()='Hardik Santosh Bajaj']/preceding-sibling::td/div")
	WebElement ContactChkBox;
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	
	public boolean verifyContactsLabel(){
		return contactsLabel.isDisplayed();
	}
	
	
	public void CreateContact()
	{
		
		newContactLink.click();
	}
	
		public void ClickNewContactBtn()
		{
		newContactBtn.click();
		

	}
		
		public void selectContactsByName(String name){
			driver.findElement(By.xpath("//*[text()='"+name+"']/preceding-sibling::td/div")).click();
		//	@FindBy(xpath= "//*[text()='Hardik Santosh Bajaj']/preceding-sibling::td/div")
		//	driver.findElement(By.xpath("driver.findElement(By.xpath("//a[text()='"+name+"']/preceding-sibling::td/div").click();
		}
		
		
	
//		public void selectContacts()
//		{
//			ContactChkBox.click();
//			
//		}
		
		}

