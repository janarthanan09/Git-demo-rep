package org.pojo;

import org.baseclass.BasaGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BasaGlobal {
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(xpath = "//p[contains(text(),'Adactin Launches')]")
	private WebElement contain;

	@FindBy(id = "login")
	private WebElement login;

	@FindBy(id = "location")
	private WebElement text;

	@FindBy(id = "hotels")
	private WebElement text1;

	@FindBy(id = "room_type")
	private WebElement text2;

	@FindBy(name = "room_nos")
	private WebElement text3;
	@FindBy(id = "adult_room")
	private WebElement text4;

	@FindBy(id = "child_room")
	private WebElement text5;

	@FindBy(id = "Submit")
	private WebElement btnlogin1;

	@FindBy(id = "radiobutton_0")
	private WebElement btnlogin2;

	@FindBy(id = "continue")
	private WebElement btn3;

	@FindBy(id = "first_name")
	private WebElement txtname;

	@FindBy(id = "last_name")
	private WebElement lstname;

	@FindBy(id = "address")
	private WebElement add;

	@FindBy(id = "cc_num")
	private WebElement crdno;

	@FindBy(id = "cc_type")
	private WebElement crdtyp;

	@FindBy(id = "cc_exp_month")
	private WebElement crdexpmon;

	@FindBy(id = "cc_exp_year")
	private WebElement crdexpyr;
	@FindBy(name = "cc_cvv")
	private WebElement crdcvv;
	@FindBy(id = "book_now")
	private WebElement boknow;

	@FindBy(id = "order_no")
	private WebElement ordno;

	public WebElement odrnum() {
		return ordno;
	}

	public WebElement booknow() {
		return boknow;

	}

	public WebElement cardcvv() {
		return crdcvv;

	}

	public WebElement selectbytext8() {
		return crdexpyr;

	}

	public WebElement selectbytext7() {
		return crdexpmon;

	}

	public WebElement selectbytext6() {
		return crdtyp;

	}

	public WebElement cardno() {
		return crdno;

	}

	public WebElement adderss() {
		return add;

	}

	public WebElement lastname() {
		return lstname;

	}

	public WebElement fstname() {
		return txtname;

	}

	public WebElement btnlogin3p() {
		return btn3;
	}

	public WebElement btnlogin2p() {
		return btnlogin2;
	}

	public WebElement btnlogin1p() {
		return btnlogin1;
	}

	public WebElement selectOptionByText5() {
		return text5;
	}

	public WebElement selectOptionByText4() {
		return text4;
	}

	public WebElement selectOptionByText3() {
		return text3;
	}

	public WebElement selectOptionByText2() {
		return text2;
	}

	public WebElement selectOptionByText1() {
		return text1;
	}

	public WebElement selectOptionByText() {
		return text;
	}

	public WebElement loginbtn() {
		return login;
	}

	public WebElement getTxtUser() {
		return userName;
	}

	public WebElement getpass() {
		return pass;
	}

	public WebElement getConTxt() {
		return contain;
	}

}
