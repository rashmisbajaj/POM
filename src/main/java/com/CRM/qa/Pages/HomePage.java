package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.Base.TestBase;

public class HomePage extends TestBase {

		@FindBy(xpath = "//span[contains(text(),'Rashmi')]")
		WebElement userNameLabel;

		@FindBy(xpath = "//div/a[3]/span")
		WebElement contactsLink;
		
		
		@FindBy(xpath = "//div/a[5]/span")
		WebElement dealsLink;

		@FindBy(xpath = "//a[contains(text(),'Tasks')]")
		WebElement tasksLink;
		
		@FindBy(xpath = "//i[@class='home icon']")
		WebElement HomeLnk;

		// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		public void ClickHome()
		{
			HomeLnk.click();
		}
		
		
		public boolean verifyCorrectUserNameHome(){
			return userNameLabel.isDisplayed();
		}
		
		
		public ContactsPage clickOnContactsLink(){
			contactsLink.click();
			return new ContactsPage();
		}
		
		public DealsPage clickOnDealsLink(){
			dealsLink.click();
			return new DealsPage();
		}
		
		public TasksPage clickOnTasksLink(){
			tasksLink.click();
			return new TasksPage();
		}
}
