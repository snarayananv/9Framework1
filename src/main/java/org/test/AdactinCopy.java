package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.backclass.BackClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class AdactinCopy extends BackClass {

//	public void login() {
//
//		getDriver();
//		maximizeWin();
//		impilctWait(10);
//		loadUrl("https://adactinhotelapp.com/");
//		WebElement txtUser = driver.findElement(By.id("username"));
//		insertValue(txtUser, "nitish123");
//		WebElement txtPass = driver.findElement(By.id("password"));
//		insertValue(txtPass, "V54198");
//		WebElement btnLog = driver.findElement(By.id("login"));
//		click(btnLog);
//	}
//
//	public void searchHotel() throws AWTException {
//
//		WebElement ddLocation = driver.findElement(By.id("location"));
//		selectOptionByText(ddLocation, "Sydney");
//		WebElement ddHotels = driver.findElement(By.id("hotels"));
//		selectOptionByText(ddHotels, "Hotel Creek");
//		WebElement ddRoom = driver.findElement(By.id("room_type"));
//		selectOptionByText(ddRoom, "Super Deluxe");
//		WebElement ddRoomNo = driver.findElement(By.id("room_nos"));
//		selectOptionByText(ddRoomNo, "2 - Two");
//		WebElement ddAdultRoom = driver.findElement(By.id("adult_room"));
//		selectOptionByText(ddAdultRoom, "3 - Three");
//		WebElement ddChild = driver.findElement(By.id("child_room"));
//		selectOptionByText(ddChild, "0 - None");
//		WebElement ddSubmit = driver.findElement(By.id("Submit"));
//		click(ddSubmit);
//		WebElement ddSelect = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
//        click(ddSelect);
//        WebElement ddcontinue = driver.findElement(By.id("continue"));
//        click(ddcontinue);
//
//	}
//
//	public void bookAHotel() {
//		WebElement bhFirstName = driver.findElement(By.id("first_name"));
//		insertValue(bhFirstName, "Suriya");
//		WebElement bhLastName = driver.findElement(By.id("last_name"));
//		insertValue(bhLastName, "Narayanan");
//		WebElement bhAddress = driver.findElement(By.id("address"));
//		insertValue(bhAddress, "121/64,Ponnagaram,Rajapalayam");
//		WebElement bhCredit = driver.findElement(By.id("cc_num"));
//		insertValue(bhCredit, "9790383744443738");
//		WebElement bhCreditType = driver.findElement(By.id("cc_type"));
//		selectOptionByText(bhCreditType, "Master Card");
//		WebElement bhMonth = driver.findElement(By.id("cc_exp_month"));
//		selectOptionByText(bhMonth, "February");
//		WebElement bhYear = driver.findElement(By.id("cc_exp_year"));
//		selectOptionByText(bhYear, "2012");
//		WebElement bhCvv = driver.findElement(By.id("cc_cvv"));
//		insertValue(bhCvv, "167");
//		WebElement bhBook = driver.findElement(By.id("book_now"));
//		click(bhBook);
//
//	}
//
//	public void bookingConfirm() {
//
//		WebElement bcOrderNo = driver.findElement(By.id("order_no"));
//		String attribute = bcOrderNo.getAttribute("value");
//		System.out.println(attribute);
//
//	}
//
//	public static void main(String[] args) throws AWTException, IOException {
//		AdactinBackClass a = new AdactinBackClass();
//		a.login();
//		a.searchHotel();
//		a.bookAHotel();
//		a.bookingConfirm();
//
//	}

}
