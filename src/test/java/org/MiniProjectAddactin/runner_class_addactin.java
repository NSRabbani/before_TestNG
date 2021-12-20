package org.MiniProjectAddactin;

import java.io.IOException;

//import Mini_Project_Sel.Base_Class;
import java.util.Arrays;

import org.Mini_Project_Sel.Base_Class1;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.helpers.Configuration_reader;
import org.helpers.File_reader_manager;
import org.openqa.selenium.WebDriver;
import org.pom.Book_hotel;
import org.pom.Booking_cnfirm;
import org.pom.Click_Hotel;
import org.pom.Select_Hotel_page;
import org.pom.login_page;
import org.pomofpom.Page_Object_Manager;

public class runner_class_addactin extends Base_Class1 {

public static WebDriver driver= getbrowser("chrome");

//public static login_page log =new login_page(driver);
//public static Select_Hotel_page selct = new Select_Hotel_page(driver);
//public static Click_Hotel cl=new Click_Hotel(driver);
//public static Book_hotel bk =new Book_hotel(driver);
//public static Booking_cnfirm bc=new Booking_cnfirm(driver);

public static Page_Object_Manager pom =new Page_Object_Manager(driver);
public static Logger log =Logger.getLogger(runner_class_addactin.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

		String url = File_reader_manager.getinstanceFrm().getinstanceCR().geturl();		
		System.out.println(url);
		geturl(url);

		log.info("Adactin launched successflly");
		
		//String cell1 = cell("D:\\\\Selenium\\\\Manual tasks\\\\test cases.xlsx", 0, 2, 6);
		
		String usn = File_reader_manager.getinstanceFrm().getinstanceCR().username();
		
		passkeys(pom.login().getUser(), usn);

		//String cell2 = cell("D:\\\\Selenium\\\\Manual tasks\\\\test cases.xlsx", 0, 3, 6);
		
		String psw = File_reader_manager.getinstanceFrm().getinstanceCR().password();
		
		passkeys(pom.login().getPass(), psw);

		clickonelement(pom.login().getLog_btn());
		log.info("Login successfull");
		sleep(3000);

		dropdown("value", pom.selct().getLocation(), "Paris");
		
		dropdown("value", pom.selct().getHotels(), "Hotel Hervey");


		dropdown("value", pom.selct().getRoom_type(), "Super Deluxe");


		dropdown("value", pom.selct().getRoom_nos(), "1");


		clear(pom.selct().getDatepick_in());
		
		//String cell3 = cell("D:\\\\Selenium\\\\Manual tasks\\\\test cases.xlsx", 0, 9, 6);
		
		String getdatein = File_reader_manager.getinstanceFrm().getinstanceCR().getdatein();
		
		passkeys(pom.selct().getDatepick_in(), getdatein);

		clear(pom.selct().getDatepick_out());
		
		//String cell4 = cell("D:\\\\Selenium\\\\Manual tasks\\\\test cases.xlsx", 0, 10, 6);
		
		String getdateout = File_reader_manager.getinstanceFrm().getinstanceCR().getdateout();
		
		passkeys(pom.selct().getDatepick_out(), getdateout);
		
		dropdown("value",pom.selct().getAdult_room() , "1");

		dropdown("value", pom.selct().getChild_room(), "1");

		clickonelement(pom.selct().getSubmit());

		sleep(3000);
		log.info("Hotel searching successflly done");
		
		clickonelement(pom.clickpage().getRad());
		clickonelement(pom.clickpage().getContinu());
		sleep(3000);
		String fname = File_reader_manager.getinstanceFrm().getinstanceCR().fname();
		
		passkeys(pom.booking().getF_name(),fname);
		
		String lname = File_reader_manager.getinstanceFrm().getinstanceCR().lname();
		
		passkeys(pom.booking().getL_name(),lname);
		
		String addres = File_reader_manager.getinstanceFrm().getinstanceCR().addres();
		
		passkeys(pom.booking().getAdd(), addres);
		
		String cardno = File_reader_manager.getinstanceFrm().getinstanceCR().cardno();
		
		passkeys(pom.booking().getCc_num(),cardno);

		dropdown("value", pom.booking().getCc_type(), "MAST");
		dropdown("value", pom.booking().getCc_exp_month(), "12");
		dropdown("value", pom.booking().getCc_exp_yearame(), "2022");
		
		String ccvno = File_reader_manager.getinstanceFrm().getinstanceCR().ccvno();
		
		passkeys(pom.booking().getCc_cvv(), ccvno);
		
		sleep(3000);
		clickonelement(pom.booking().getBook_now());
		log.info("Hotel booking successflly done");
		sleep(6000);
		clickonelement(pom.bookcnfrm().getMy_itr_btn());
		sleep(3000);

		Screenshot("adact");
		clickonelement(pom.bookcnfrm().getLogout_btn());
		log.info("Logout process successflly done");
	}
}
