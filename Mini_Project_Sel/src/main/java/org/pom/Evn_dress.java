package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evn_dress {

	WebDriver driver;
	
	@FindBy(xpath="//a[@title='View']")
	private WebElement more_btn;

	public Evn_dress(WebDriver driver2) {

		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getMore_btn() {
		return more_btn;
	}
	
}
