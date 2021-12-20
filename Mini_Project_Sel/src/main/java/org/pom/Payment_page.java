package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {
	WebDriver driver;
	public Payment_page(WebDriver driver2) {

		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//a[@class='bankwire']")
private WebElement payment_method;
public WebElement getPayment_method() {
	return payment_method;
}
}
