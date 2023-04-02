package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasaGlobal {
	public static WebDriver driver;
	public static Select s;

	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public void maxWindow() {
		driver.manage().window().maximize();
	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public void quit() {
		driver.quit();
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public String txtMessage(WebElement element) {
		return element.getText();

	}

	public String currentUrl() {
		return driver.getCurrentUrl();

	}

	public void selectOptionByText(WebElement element, String text, WebElement element1, String text1,
			WebElement element2, String text2, WebElement element3, String text3, WebElement element4, String text4,
			WebElement element5, String text5) {
		s = new Select(element);
		s.selectByVisibleText(text);
		s = new Select(element1);
		s.selectByVisibleText(text1);
		s = new Select(element2);
		s.selectByVisibleText(text2);
		s = new Select(element3);
		s.selectByVisibleText(text3);
		s = new Select(element4);
		s.selectByVisibleText(text4);
		s = new Select(element5);
		s.selectByVisibleText(text5);

	}

	public void selectbytxt1(WebElement element6, String text6, WebElement element7, String text7, WebElement element8,
			String text8) {
		s = new Select(element6);
		s.selectByVisibleText(text6);
		s = new Select(element7);
		s.selectByVisibleText(text7);
		s = new Select(element8);
		s.selectByVisibleText(text8);

	}

	public String getordertext(WebElement element) {
		return element.getAttribute("value");

	}
}
