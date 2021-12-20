package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Hotel {

	WebDriver driver;
	public Click_Hotel(WebDriver driver2) {

		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
}
	@FindBy(id ="radiobutton_0" )
	private WebElement rad;

	@FindBy(id ="continue" )
	private WebElement continu;
	
	public WebElement getRad() {
		return rad;
	}

	public WebElement getContinu() {
		return continu;
	}

}