package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.reusable.ReusableCode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * 
 * @author Viveka
 *Description: To perform Hooks
 *Date: 08-07-2022
 */

public class HooksClass extends ReusableCode {

	/**
	 * Description: Before Scenario execution
	 * Date: 08-07-2022
	 * @throws Exception
	 */

	@Before
	public void beforeScenario() throws Exception {
		getDriverType(getPropertyFileValue("browserType"));
		String url = getPropertyFileValue("url");
		loadURL(url);
		maximize();
		implicitlyWait();
	}

	/**
	 * Description: After Scenario Execution
	 * Date: 08-07-2022
	 * @param sc
	 */

	@After
	public void afterScenario(Scenario sc) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		sc.embed(b, "Every Scenario");
		close();
	}
}
