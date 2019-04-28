package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.Base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(linkText="Forgot your password?")
	WebElement ForgetPwdLink;
	
	@FindBy(name="password")
	WebElement password;
	

	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean ValidateForgotPwdLink(){
		return ForgetPwdLink.isDisplayed();
	
		
		
	}
	
	
	
	public HomePage login(String un, String pwd){
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();    	
		return new HomePage();
	}
}