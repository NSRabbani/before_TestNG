package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAcc {

	WebDriver driver;
	@FindBy(xpath="//a[text()='Women']")
	private WebElement womn_btn;
	
	public MyAcc(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomn_btn() {
		return womn_btn;
	}
	
	
}
