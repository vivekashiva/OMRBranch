package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pagemanager.PageObjectManager;
import com.reusable.ReusableCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * 
 * @author Viveka 
 * Description: LoginPage Step Definition
 * Date: 08-07-2022
 */

public class LoginPageStep extends ReusableCode {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * Description: User is on the Adactin Page
	 * Date: 08-07-2022
	 * @throws IOException
	 */

	@Given("User is on the Adactin Page")
	public void userIsOnTheAdactinPage() throws IOException {

	}

	/**
	 * @Description User should perform login
	 * @Date 08-07-2022
	 * @param userName
	 * @param passWord
	 * @throws IOException
	 */

	@When("User should perform login {string},{string}")
	public void userShouldPerformLogin(String userName, String passWord) throws IOException {
		pom.getLoginPage().login(userName, passWord);
	}

	/**
	 * Description: User should perform login using enter key
	 * Date: 08-07-2022
	 * @param userName
	 * @param passWord
	 * @throws AWTException
	 */

	@When("User should perform login {string},{string} using enter key")
	public void userShouldPerformLoginUsingEnterKey(String userName, String passWord) throws AWTException {
		pom.getLoginPage().loginWithEnter(userName, passWord);
	}

	/**
	 * Description: User should verify after invalid login error message 
	 * Date: 08-07-2022
	 * @param expectedErrorMessage
	 */

	@When("User should verify after login error message which contains {string}")
	public void userShouldVerifyAfterLoginErrorMessageWhichContains(String expectedErrorMessage) {
		WebElement txtErrorLogin = pom.getLoginPage().getTxtErrorLogin();
		Assert.assertTrue(txtErrorLogin.getText().contains(expectedErrorMessage));
	}
}
