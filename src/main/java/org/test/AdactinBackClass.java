package org.test;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.text.Element;

import org.backclass.BackClass;
import org.constructorbase.BookAHotel;
import org.constructorbase.BookingConfirmation;
import org.constructorbase.LoginPage;
import org.constructorbase.SearchHotel;
import org.constructorbase.SelectHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.css.CSS.GetBackgroundColorsResponse;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

public class AdactinBackClass extends BackClass {

	public void login() throws IOException {

		getDriver();
		maximizeWin();
		impilctWait(10);
		loadUrl("https://adactinhotelapp.com/");
		LoginPage l = new LoginPage();
		l.loginFinal(getData("Sheet1", 1, 0), getData("Sheet1", 1, 1));

	}

	public void searchHotel() throws AWTException, IOException {

		SearchHotel s = new SearchHotel();
		s.searchHotelFinal(s.getData("Sheet1", 1, 3), s.getData("Sheet1", 1, 4), s.getData("Sheet1", 1, 5),
				s.getData("Sheet1", 1, 6), s.getData("Sheet1", 1, 7), s.getData("Sheet1", 1, 8));

	}

	public void selectHotel() throws IOException {

		SelectHotel s1 = new SelectHotel();
		s1.selectHotelFinal();
	}

	public void bookAHotel() throws IOException {

		BookAHotel b = new BookAHotel();
		b.bookHotelFinal(b.getData("Sheet1", 1, 9), b.getData("Sheet1", 1, 10), b.getData("Sheet1", 1, 11),
				b.getData("Sheet1", 1, 12), b.getData("Sheet1", 1, 13), b.getData("Sheet1", 1, 14),
				b.getData("Sheet1", 1, 15), b.getData("Sheet1", 1, 16));

	}

	public void bookingConfirm() throws IOException {

		BookingConfirmation b1 = new BookingConfirmation();
		String text = b1.bookingFinal();
		System.out.println(updateData("Sheet1", 1, 17, text));
		
	}

	public static void main(String[] args) throws AWTException, IOException {
		AdactinBackClass a = new AdactinBackClass();
		a.login();
		a.searchHotel();
		a.selectHotel();
		a.bookAHotel();
		a.bookingConfirm();

	}

}
