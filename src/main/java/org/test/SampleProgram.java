package org.test;

import java.io.IOException;

import org.backclass.SampleBaseClass;
import org.constructorbase.SearchHotel;
import org.constructorbase.SelectHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tem.BookAHotel1;
import org.tem.Login1;
import org.tem.SearchHotel1;
import org.tem.SelectHotel1;

public class SampleProgram extends SampleBaseClass {

	public void login() throws IOException {

		getDriver();
		getUrl("https://adactinhotelapp.com/");
		maximize();
		implicitWait();
		Login1 l = new Login1();
		l.login(l.getData("Sample", 1, 0), l.getData("Sample", 1, 1));

	}

	public void searchHotel() throws IOException {

		SearchHotel1 s = new SearchHotel1();
		s.searchHotel(s.getData("Sample", 1, 2), s.getData("Sample", 1, 3), s.getData("Sample", 1, 4),
				s.getData("Sample", 1, 5), s.getData("Sample", 1, 6), s.getData("Sample", 1, 7));

	}

	public void selectHotel() {

		SelectHotel1 s = new SelectHotel1();
		s.selectHotel1();

	}

	public void bookAHotel() throws IOException, InterruptedException {

		BookAHotel1 b =new BookAHotel1();
		b.bookAHotel12(b.getData("Sample", 0, 8), b.getData("Sample", 0, 9), b.getData("Sample", 1, 10), b.getData("Sample", 1, 11), b.getData("Sample", 1, 12), b.getData("Sample", 1, 13), b.getData("Sample", 1, 14), b.getData("Sample", 1, 15));

		
	}

/*	public void bookigConfirmation() throws InterruptedException, IOException {
		Thread.sleep(5000);
		WebElement bcOrderNo = driver.findElement(By.id("order_no"));
		String attribute = getAttribute(bcOrderNo, "value");

		updateData("Sample", 1, 17, attribute);
		driver.quit();

	}         */

	public static void main(String[] args) throws InterruptedException, IOException {

		SampleProgram s1 = new SampleProgram();
		s1.login();
		s1.searchHotel();
		s1.selectHotel();
		s1.bookAHotel();
		/* s1.bookigConfirmation(); */
	}

}
