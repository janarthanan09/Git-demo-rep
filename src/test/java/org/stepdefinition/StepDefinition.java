package org.stepdefinition;

import org.baseclass.BasaGlobal;
import org.pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BasaGlobal {
	BasaGlobal b;
	PojoClass p;

	@Given("User launch adactin web application")
	public void user_launch_adactin_web_application() {

	}

	@Then("User verify login page is displayed")
	public void user_verify_login_page_is_displayed() {
		p = new PojoClass();
		String txt = txtMessage(p.getConTxt());
		System.out.println(txt);
		String c = currentUrl();
		boolean ada = c.contains("adactin");
		System.out.println(ada);
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {

		p = new PojoClass();
		type(p.getTxtUser(), "janarthanan123");
		type(p.getpass(), "Janarthanan@09");

	}

	@When("User clicks Login button")
	public void user_clicks_Login_button() {
		p = new PojoClass();
		btnClick(p.loginbtn());

	}

	@When("User enters Location, Hotels, Room Type, Number of Rooms, Adults per Room,Children per Room")
	public void user_enters_Location_Hotels_Room_Type_Number_of_Rooms_Adults_per_Room_Children_per_Room() {
		p = new PojoClass();
		selectOptionByText(p.selectOptionByText(), "New York", p.selectOptionByText1(), "Hotel Sunshine",
				p.selectOptionByText2(), "Super Deluxe", p.selectOptionByText3(), "5 - Five", p.selectOptionByText4(),
				"2 - Two", p.selectOptionByText5(), "0 - None");

	}

	@When("User clicks radio and continue button")
	public void user_clicks_radio_and_continue_button() {
		p = new PojoClass();
		btnClick(p.btnlogin1p());
		btnClick(p.btnlogin2p());
		btnClick(p.btnlogin3p());

	}

	@When("User enters First Name, Last Name, Billing Address")
	public void user_enters_First_Name_Last_Name_Billing_Address() {
		p = new PojoClass();
		type(p.fstname(), "jana");
		type(p.lastname(), "B");
		type(p.adderss(), "qwertyuioopalksjdhfgmznxbcv");

	}

	@When("User enters Credit Card No, Credit Card Type, Expiry Date & year, CVV Number")
	public void user_enters_Credit_Card_No_Credit_Card_Type_Expiry_Date_year_CVV_Number() {
		p = new PojoClass();
		type(p.cardno(), "1234567890123456");

		selectbytxt1(p.selectbytext6(), "American Express", p.selectbytext7(), "December", p.selectbytext8(), "2022");
		type(p.cardcvv(), "0923");

	}

	@When("User clicks Book now")
	public void user_clicks_Book_now() throws InterruptedException {
		p = new PojoClass();
		btnClick(p.booknow());
		Thread.sleep(10000);
		System.out.println("order number= " + getordertext(p.odrnum()));
	}
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		p = new PojoClass();
		type(p.getTxtUser(), username);
		type(p.getpass(), password);
	}

	@When("User enters {string}, {string}, {string}, {string}, {string},{string}")
	public void user_enters(String loc, String hotel, String room, String num, String typ, String child) {
		p = new PojoClass();
		selectOptionByText(p.selectOptionByText(), loc, p.selectOptionByText1(), hotel,
				p.selectOptionByText2(), room, p.selectOptionByText3(), num , p.selectOptionByText4(),
				typ, p.selectOptionByText5(), child);

	}

	@When("User enters {string}, {string}, {string}")
	public void user_enters(String first, String last, String bil) {
		p = new PojoClass();
		type(p.fstname(), first);
		type(p.lastname(), last);
		type(p.adderss(), bil);

	}

	@When("User enters {string}, {string}, {string} & {string}, {string}")
	public void user_enters(String crdno11, String crdtyp11, String mon11, String yr11, String cvv11) {
		p = new PojoClass();
		type(p.cardno(), crdno11);

		selectbytxt1(p.selectbytext6(), crdtyp11, p.selectbytext7(), mon11, p.selectbytext8(), yr11);
		type(p.cardcvv(), cvv11);

	}



}
