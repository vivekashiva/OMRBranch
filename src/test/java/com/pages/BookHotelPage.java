package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.ReusableCode;

/**
 * Description: TO find the locators and generate getters
 * @author Viveka
 * Date: 08-07-2022
 */
public class BookHotelPage extends ReusableCode {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="first_name1")
	private WebElement txtFirstName1;

	@FindBy(id="last_name")
	private WebElement txtLastName;

	@FindBy(id="address")
	private WebElement txtAddress;

	@FindBy(id="cc_num")
	private WebElement txtcreditCardNo;

	@FindBy(id="cc_type")
	private WebElement dDnccType;

	@FindBy(id="cc_exp_month")
	private WebElement dDnccExpMonth;

	@FindBy(id="cc_exp_year")
	private WebElement dDnExpYear;

	@FindBy(id="cc_cvv")
	private WebElement txtCVV;

	@FindBy(id="book_now")
	private WebElement btnBook;

	@FindBy(id="first_name_span")
	private WebElement firstNameError;

	@FindBy(id="last_name_span")
	private WebElement lastNameError;

	@FindBy(id="address_span")
	private WebElement addressError;

	@FindBy(id="cc_num_span")
	private WebElement ccNumError;

	@FindBy(id="cc_type_span")
	private WebElement ccTypeError;

	@FindBy(id="cc_expiry_span")
	private WebElement expiryError;

	@FindBy(id="cc_cvv_span")
	private WebElement cvvNumError;

	@FindBy(xpath="//td[contains(text(),'Booking')]")
	private WebElement txtBookConfirmation;

	public WebElement getTxtBookConfirmation() {
		return txtBookConfirmation;
	}
	public WebElement getFirstNameError() {
		return firstNameError;
	}

	public WebElement getLastNameError() {
		return lastNameError;
	}

	public WebElement getAddressError() {
		return addressError;
	}

	public WebElement getCcNumError() {
		return ccNumError;
	}

	public WebElement getCcTypeError() {
		return ccTypeError;
	}

	public WebElement getExpiryError() {
		return expiryError;
	}

	public WebElement getCvvNumError() {
		return cvvNumError;
	}


	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtcreditCardNo() {
		return txtcreditCardNo;
	}

	public WebElement getdDnccType() {
		return dDnccType;
	}

	public WebElement getdDnccExpMonth() {
		return dDnccExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
	/**
	 * Description: Book hotel by selecting all fields
	 * Date: 08-07-2022
	 * @param firstName
	 * @param lastName
	 * @param billingAddress
	 * @param creditCardNo
	 * @param creditCardType
	 * @param expiryMonth
	 * @param expiryYear
	 * @param cVVNumber
	 * @throws InterruptedException
	 */

	//book hotel page by selecting all fields
	public void bookHotel(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cVVNumber) throws InterruptedException {
		type(getTxtFirstName(), firstName);
		type(getTxtLastName(), lastName);
		type(getTxtAddress(), billingAddress);
		type(getTxtcreditCardNo(), creditCardNo);
		selectOptionsByText(getdDnccType(), creditCardType);
		selectOptionsByText(getdDnccExpMonth(), expiryMonth);
		selectOptionsByText(getdDnExpYear(), expiryYear);
		type(getTxtCVV(), cVVNumber);
		click(getBtnBook());
	}

	/**
	 * Description: Book hotel without selecting any fields
	 * Date: 08-07-2022
	 */
	
	//book hotel page without selecting any fields
	public void bookHotelWithoutDatas() {
		click(getBtnBook());

	}

}
