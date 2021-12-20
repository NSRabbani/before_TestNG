package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	WebDriver driver;
	public login_page(WebDriver driver2) {

		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog_btn() {
		return log_btn;
	}

	@FindBy(id = "username")
	private WebElement user;
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@class='login_button']")
	private WebElement log_btn;
	
	
	
	
}
