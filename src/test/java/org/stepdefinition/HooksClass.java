package org.stepdefinition;

import org.baseclass.BasaGlobal;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BasaGlobal {
	@Before
	public void beforeExecution() {
		launchBrowser();
		maxWindow();
		getUrl("https://adactinhotelapp.com/");
	}

	@After
	public void afterExecution() {
		driver.quit();
	}

}
