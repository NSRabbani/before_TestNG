package org.pomofpom;

import org.openqa.selenium.WebDriver;
import org.pom.Book_hotel;
import org.pom.Booking_cnfirm;
import org.pom.Click_Hotel;
import org.pom.Select_Hotel_page;
import org.pom.login_page;

public class Page_Object_Manager {
	WebDriver driver;
	private  login_page log;
	private  Select_Hotel_page sel;
	private  Click_Hotel clik;
	private  Book_hotel book;
	private  Booking_cnfirm bookcn;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public  login_page login() {
		if (log == null) {

			log = new login_page(driver);

		}
		return log;
	}

	public  Select_Hotel_page selct() {

		if (sel == null) {
			sel = new Select_Hotel_page(driver);

		}
		return sel;
	}

	public  Click_Hotel clickpage() {
		if (clik == null) {

			clik = new Click_Hotel(driver);

		}
		return clik;
	}
	
	public  Book_hotel booking() {
		if (book==null) {
			
			book = new Book_hotel(driver);
		}
		return book;
	}
	public  Booking_cnfirm bookcnfrm() {
		if (bookcn==null) {
			bookcn=new Booking_cnfirm(driver);
		}return bookcn;
	}



}


