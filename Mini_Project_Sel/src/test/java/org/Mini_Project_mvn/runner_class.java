package org.Mini_Project_mvn;

import java.io.IOException;


import org.Mini_Project_Sel.Base_Class1;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.helpers.File_reader_manager;
import org.openqa.selenium.WebDriver;
import org.pomofpom.pageObjectManager;

public class runner_class extends Base_Class1{
	public static WebDriver driver = getbrowser("chrome");

	public static pageObjectManager pom = new pageObjectManager(driver);
	public static Logger log =Logger.getLogger(runner_class.class);
	public static void main(String[] args) throws Throwable {

		//String cell2 = cell("D:\\Selenium\\Manual tasks\\test cases.xlsx", 1, 1, 5);
		String url = File_reader_manager.getinstancefrm().getinstanceCR().url();
		geturl(url);
		sleep(2000);
		
		PropertyConfigurator.configure("log4j.properties");
		
		clickonelement(pom.getInstanceHp().getSignin());
		String username = File_reader_manager.getinstancefrm().getinstanceCR().username();
		
		passkeys(pom.getMy().getEmail(), username);
		
		String password = File_reader_manager.getinstancefrm().getinstanceCR().password();
		
		passkeys(pom.getMy().getPassword(), password);

		sleep(2000);
		
		clickonelement(pom.getMy().getSigin());
		sleep(2000);

		log.info("log in suceess");
		
		clickonelement(pom.getAc().getWomn_btn());

		clickonelement(pom.getWo().getDresses_btn());
		clickonelement(pom.getWo().getEve_dress());
		sleep(5000);

		clickonelement(pom.getEvn_page().getMore_btn());
		sleep(2500);

		clickonelement(pom.getMore().getQty_add());
		clickonelement(pom.getMore().getQty_add());
		clickonelement(pom.getMore().getQty_add());
		clickonelement(pom.getMore().getQty_add());

		sleep(2000);

		dropdown("index", pom.getMore().getSize(), "1");
		dropdown("ismultiple", pom.getMore().getSize(), null);

		clickonelement(pom.getMore().getColor());
		sleep(2000);

		clickonelement(pom.getMore().getAddtocart());
		sleep(3000);
		
		log.info("product added to cart");
		
		Screenshot("base_demo");
		sleep(2000);

		Jse("click", pom.getMore().getPopuproceedto());

		clickonelement(pom.getProceed_sumry().getProceedto());

		passkeys(pom.getProceed_address().getMessage(), "Mini Project 2nd Half");

		System.out.println(getatt("place holder", pom.getProceed_address().getMessage()));
		System.out.println(getatt("value", pom.getProceed_address().getMessage()));

		clickonelement(pom.getProceed_address().getProceedto());

		Jse("click", pom.getProceed_shipping().getCheckbox());

		clickonelement(pom.getProceed_shipping().getProceedto());

		clickonelement(pom.getPay().getPayment_method());

		clickonelement(pom.getConfirm_page().getConfirm_btn());
		sleep(3000);

		log.info("payment confirmed");
		
		Screenshot("base_d");

		currenturl(driver);

		/*
		 * TakesScreenshot t2 = (TakesScreenshot) driver; File s2 =
		 * t.getScreenshotAs(OutputType.FILE); File d2 = new
		 * File("D:\\Selenium\\Workspace\\Selenium\\screenst\\mini2a.png");
		 * FileUtils.copyFile(s2, d2);
		 */
	}
}
