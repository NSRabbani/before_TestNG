package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class more_page {

	WebDriver driver;
	public more_page(WebDriver driver2) {

		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	
		
	}
	@FindBy(xpath = "//select[@class='form-control attribute_select no-print']")
	private WebElement size;

	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement qty_add;
	
	@FindBy(name = "Pink")
	private WebElement color;
	
	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addtocart;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement popupproceedto;
	
	public WebElement getSize() {
		return size;
	}

	public WebElement getQty_add() {
		return qty_add;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getPopuproceedto() {
		return popupproceedto;
	}
	
	
	
	
	
	
	
}
