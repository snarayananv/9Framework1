package tset;

import java.io.IOException;

import org.backclass.BackClass;
import org.constructorbase.BookAHotel;
import org.constructorbase.BookingConfirmation;
import org.constructorbase.LoginPage;
import org.constructorbase.SearchHotel;
import org.constructorbase.SelectHotel;
import org.tem.BookAHotel1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgPractise1 extends BackClass {

	@BeforeClass
	private void beforeClass() {
		getDriver();
		maximizeWin();
		impilctWait(10);
		loadUrl("https://adactinhotelapp.com/");

	}

	@AfterClass
	private void afterClass() {
		closeWindow();

	}

	@BeforeMethod
	private void beforeMethod() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

	}

	@AfterMethod
	private void afterMethod() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

	}

	@Parameters({ "username", "password" })

	@Test(priority = -5)
	private void adactinLogin(String username, String password) throws IOException {

		LoginPage l = new LoginPage();
		l.loginFinal(username, password);
	}

	@Parameters({ "location", "hotels", "room_type", "room_nos", "adult_room", "child_room" })
	@Test(priority = -4)
	private void adactinSearchHotel(String location, String hotels, String room_type, String room_nos,
			String adult_room, String child_room) throws IOException {

		SearchHotel s = new SearchHotel();
		s.searchHotelFinal(location, hotels, room_type, room_nos, adult_room, child_room);

	}

	@Test(priority = -3)
	private void adactinSelectHotel() {

		SelectHotel s = new SelectHotel();
		s.selectHotelFinal();
	}

	@Parameters({ "first_name", "last_name", "address", "cc_num", "cc_type", "cc_exp_month", "cc_exp_year", "cc_cvv" })
	@Test(priority = -2)

	private void adactinBookAHotel(String first_name, String last_name, String address, String cc_num, String cc_type,
			String cc_exp_month, String cc_exp_year, String cc_cvv) throws IOException, InterruptedException {

		BookAHotel b = new BookAHotel();
		b.bookHotelFinal(first_name, last_name, address, cc_num, cc_type, cc_exp_month, cc_exp_year, cc_cvv);

	}

/*	@Test(priority = -1)

	private void adactinBookingConfirmation() throws IOException {

		BookingConfirmation b = new BookingConfirmation();
		String bookingFinal = b.bookingFinal();
		System.out.println(updateData("Sheet1", 1, 17, bookingFinal));

	}      */
}
