package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;
import com.reusable.ReusableCode;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CancelBookingStep extends ReusableCode {

	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * Description: User should cancel the order ID
	 * Date: 08-07-2022
	 * @throws Exception
	 */

	@Then("User should cancel the order ID")
	public void userShouldCancelTheOrderID() throws Exception {
		String orderConfirmation = pom.getBookingConfirmationPage().orderConfirmation();
		pom.getCancelBookingPage().cancelBook(orderConfirmation);

	}

	/**
	 * Description: Verify the successful cancelled orderID message
	 * Date: 08-07-2022
	 * @param expectedCancelBookingMessage
	 */
	
	@Then("User should verify the successful cancelled orderID message in Booked Itinerary page as {string}")
	public void userShouldVerifyTheSuccessfulCancelledOrderIDMessageInBookedItineraryPageAs(String expectedCancelBookingMessage) {
		//System.out.println(pom.getCancelBookingPage().getCancelBookingSuccess().getText());
		Assert.assertEquals(expectedCancelBookingMessage, getText(pom.getCancelBookingPage().getCancelBookingSuccess()));
	}
	
	/**
	 * Description: User should cancel the existing order ID
	 * @param orderID
	 * Date: 08-07-2022
	 */

	@When("User should cancel the booked order ID {string}")
	public void userShouldCancelTheBookedOrderID(String orderID) {
		pom.getCancelBookingPage().cancelExistingOrder(orderID);
	}
}
