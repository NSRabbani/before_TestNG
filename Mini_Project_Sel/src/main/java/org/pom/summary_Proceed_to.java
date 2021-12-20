package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class summary_Proceed_to {

	WebDriver driver;
	
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedto;

	
	
	public summary_Proceed_to(WebDriver driver2) {

	this.driver=driver2;
	
	PageFactory.initElements(driver, this);
	
	}



	public WebElement getProceedto() {
		return proceedto;
	}
	
	
}
