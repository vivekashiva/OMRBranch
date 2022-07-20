package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.ReusableCode;

//Select hotel page by selecting a hotel
public class SelectHotelPage extends ReusableCode {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='radio'][1]")
	private WebElement btnRadio;

	@FindBy(id="continue")
	private WebElement btnContinue;

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtConfirmBook;

	@FindBy(id="radiobutton_span")
	private WebElement errorwithoutSelecting;

	public WebElement getTxtConfirmBook() {
		return txtConfirmBook;
	}

	public WebElement getErrorwithoutSelecting() {
		return errorwithoutSelecting;
	}

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void selectHotel() {
		click(getBtnRadio());
		click(getBtnContinue());
	}


	//Select hotel page by not selecting any hotel
	public void ClickContinue() {
		click(getBtnContinue());

	}
}
