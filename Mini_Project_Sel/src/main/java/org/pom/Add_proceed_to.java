package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_proceed_to {
	public WebDriver driver;
	public Add_proceed_to(WebDriver driver2) {

		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "message")
	private WebElement message;
		@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
		private WebElement proceedto;

	public WebElement getMessage() {
		return message;
	}
	
	public WebElement getProceedto() {
	return proceedto;
}
}
