package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_proceedto {

	WebDriver driver;
	public Shipping_proceedto(WebDriver driver2) {

		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//input[@type='checkbox']")
private WebElement checkbox;

@FindBy(xpath = "//button[@name='processCarrier']")
private WebElement proceedto;

public WebElement getCheckbox() {
	return checkbox;
}

public WebElement getProceedto() {
	return proceedto;
}
}
