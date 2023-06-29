package org.tem;

import org.backclass.SampleBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 extends SampleBaseClass {
	
	public Login1() {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "username")
	WebElement txtUsername;
	
	@FindBy(id = "password")
	WebElement txtPassword;
	
	@FindBy(id = "login")
	WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String user, String pass) {

		insertValue(getTxtUsername(), user);
		insertValue(getTxtPassword(), pass);
		click(btnLogin);
	}
		
	
}
