package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;
import com.reusable.ReusableCode;

import cucumber.api.java.en.When;

public class CommonSteps extends ReusableCode{
	PageObjectManager pom = new PageObjectManager(); 
	
	/**
	 * Description: verify after login successful
	 * @param expectedLoginSuccessfull
	 * Date: 08-07-2022
	 */
	@When("User should verify after login {string}")
	public void userShouldVerifyAfterLogin(String expectedLoginSuccessfull) {
		Assert.assertEquals(expectedLoginSuccessfull, getAttribute(pom.getLoginPage().getTxtLoginSuccess(),"value"));
	}
}
