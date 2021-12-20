package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_confm {
	WebDriver driver;
	public Order_confm(WebDriver driver2) {

		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
private WebElement confirm_btn;

public WebElement getConfirm_btn() {
	return confirm_btn;
}
}
