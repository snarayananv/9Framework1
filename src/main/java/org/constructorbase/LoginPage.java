package org.constructorbase;

import org.backclass.BackClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BackClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement txtUser;

	@FindBy(id = "password")
	WebElement txtPass;

	@FindBy(id = "login")
	WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void loginFinal(String username, String password) {

		insertValue(getTxtUser(), username);
		insertValue(getTxtPass(), password);
		click(btnLogin);

	}


}
