package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.ReusableCode;

//Login with valid credentials
public class LoginPage extends ReusableCode{
	{
		System.out.println("branch c check");
		System.out.println("branch c check");
		System.out.println("branch c check");
	}
	
	{
		System.out.println("c vbnm");
		System.out.println("c vbnm");
		System.out.println("c vbnm");
		System.out.println("c vbnm");
		System.out.println("c vbnm");
		System.out.println("c vbnm");
		System.out.println("c vbnm");
		System.out.println("c vbnm");
	}
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="username")
	private WebElement txtUserName;

	@FindBy (id="password")
	private WebElement txtPassword;

	@FindBy (id="login")
	private WebElement btnLogin;

	@FindBy (xpath="//div[@class='auth_error']")
	private WebElement txtErrorLogin;
	
	@FindBy (id="username_show")
	private WebElement txtLoginSuccess;

	public WebElement getTxtLoginSuccess() {
		return txtLoginSuccess;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtErrorLogin() {
		return txtErrorLogin;
	}

	
	public void login(String username, String password) throws IOException {
		//String txtUserName = getPropertyFileValue(username);
		//String txtPass = getPropertyFileValue(password);
		type(getTxtUserName(), username);
		type(getTxtPassword(), password);
		click(getBtnLogin());
	}

	//Login with Enter Key
	public void loginWithEnter(String username, String password) throws AWTException {
		//String txtUserName = getPropertyFileValue(username);
		//String txtPass = getPropertyFileValue(password);
		type(getTxtUserName(), username);
		type(getTxtPassword(), password);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
