package org.pomofpom;

import org.openqa.selenium.WebDriver;
import org.pom.Add_proceed_to;
import org.pom.Evn_dress;
import org.pom.HomePage;
import org.pom.MyAcc;
import org.pom.MyStore;
import org.pom.Order_confm;
import org.pom.Payment_page;
import org.pom.Shipping_proceedto;
import org.pom.Women_page;
import org.pom.more_page;
import org.pom.summary_Proceed_to;

public class pageObjectManager {

	WebDriver driver;
		private HomePage hp;
		private MyStore my;
		private MyAcc ac;
		private Women_page wo;
		private Evn_dress evn_page;
		private more_page more;
		private summary_Proceed_to proceed_sumry;
		private Add_proceed_to proceed_address;
		private Shipping_proceedto proceed_shipping;
		private Payment_page pay;
		private Order_confm confirm_page;
		
		
		public MyStore getMy() {
			if (my==null) {
				my=new MyStore(driver);
			}
			return my;
		}
		public MyAcc getAc() {
			if (ac==null) {
				ac=new MyAcc(driver);
			}
			return ac;
		}
		public Women_page getWo() {
			if (wo==null) {
				wo=new Women_page(driver);
			}
			return wo;
		}
		public Evn_dress getEvn_page() {
			
			if (evn_page==null) {
				evn_page=new Evn_dress(driver);
			}
			return evn_page;
		}
		public more_page getMore() {
			if (more==null) {
				more=new more_page(driver);
			}
			return more;
		}
		public summary_Proceed_to getProceed_sumry() {
			if (proceed_sumry==null) {
				proceed_sumry=new summary_Proceed_to(driver);
			}
			return proceed_sumry;
		}
		public Add_proceed_to getProceed_address() {
			if (proceed_address==null) {
				proceed_address=new Add_proceed_to(driver);
			}
			return proceed_address;
		}
		public Shipping_proceedto getProceed_shipping() {
			if (proceed_shipping==null) {
				proceed_shipping=new Shipping_proceedto(driver);
			}
			return proceed_shipping;
		}
		public Payment_page getPay() {
			if (pay==null) {
				pay=new Payment_page(driver);
			}
			return pay;
		}
		public Order_confm getConfirm_page() {
			if (confirm_page==null) {
				confirm_page=new Order_confm(driver);
			}
			
			return confirm_page;
		}
	public pageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public HomePage getInstanceHp() {
		if (hp==null) {
			hp=new HomePage(driver);
		}
		return hp;
	}
	
	
	
	
	
}
