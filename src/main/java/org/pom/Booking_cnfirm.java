package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_cnfirm {
WebDriver driver;
	public Booking_cnfirm(WebDriver driver2) {

		this.driver=driver2;
	
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "my_itinerary")
	private WebElement my_itr_btn;
	
	public WebElement getMy_itr_btn() {
		return my_itr_btn;
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}

	@FindBy(id = "logout")
	private WebElement logout_btn;
	
}
