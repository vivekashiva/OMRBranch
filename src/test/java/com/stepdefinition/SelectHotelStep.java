package com.stepdefinition;

import org.testng.Assert;

import com.pagemanager.PageObjectManager;
import com.reusable.ReusableCode;

import cucumber.api.java.en.Then;

public class SelectHotelStep extends ReusableCode {
	
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should select a hotel")
	public void userShouldSelectAHotel() {
	    pom.getSelectHotelPage().selectHotel();
	}

	@Then("User should verify after selecting a hotel confirmation message in book hotel page as {string}")
	public void userShouldVerifyAfterSelectingAHotelConfirmationMessageInBookHotelPageAs(String expectedHotelConfirmationMessage) {
	    Assert.assertEquals(expectedHotelConfirmationMessage, getText(pom.getSelectHotelPage().getTxtConfirmBook()));
	}

	@Then("User should click continue without selecting any hotel")
	public void userShouldClickContinueWithoutSelectingAnyHotel() {
	   pom.getSelectHotelPage().ClickContinue();
	}

	@Then("User should verify the select hotel page error message without selecting any hotel {string}")
	public void userShouldVerifyTheSelectHotelPageErrorMessageWithoutSelectingAnyHotel(String expectedHotelErrorMessage) {
	   Assert.assertEquals(expectedHotelErrorMessage, getText(pom.getSelectHotelPage().getErrorwithoutSelecting()));
	}


}
