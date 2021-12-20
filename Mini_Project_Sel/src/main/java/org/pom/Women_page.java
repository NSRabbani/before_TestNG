package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_page {
	WebDriver driver;
	
	
	
@FindBy(xpath="//a[contains(@title,'your favorites dresses')]")
private WebElement dresses_btn;

@FindBy(xpath="//a[contains(@title,'Browse our different')]")
private WebElement eve_dress;

public Women_page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);

}

public WebElement getDresses_btn() {
	return dresses_btn;
}

public WebElement getEve_dress() {
	return eve_dress;
}
}
