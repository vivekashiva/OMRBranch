package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.ReusableCode;

/**
 * @Description To find the locators and generate getters for booking confirmation page
 * @author Viveka
 * @Date 08-07-2022
 */

public class BookingConfirmationPage extends ReusableCode {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderID;

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookItinerary;

	public WebElement getBookItinerary() {
		return bookItinerary;
	}

	public WebElement getOrderID() {
		return orderID;
	}

	/**
	 * @description To confirm order confirmation
	 * @date 08-07-2022
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */

	public String orderConfirmation() throws IOException, InterruptedException {

		Thread.sleep(8000);

		String orderID = getAttribute(getOrderID());
		System.out.println(orderID);
		click(getBookItinerary());

		return orderID;
	}
}








