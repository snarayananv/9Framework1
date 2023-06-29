package org.backclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackClass {

	public static WebDriver driver;

	public static WebDriver getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void maximizeWin() {
		driver.manage().window().maximize();

	}

	public static void closeWindow() {
		driver.close();

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void insertValue(WebElement e, String object) {
		e.sendKeys(object);

	}

	public void click(WebElement element) {
		element.click();

	}

	public static void impilctWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

	public void selectOptionByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public String getAttribute(WebElement element, String Object) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getData(String name, int rownum, int cellnum) throws IOException {

		String value = null;
		File f = new File("C:\\Users\\User\\eclipse-workspace\\FrameWork\\excel sheet\\suriyabasesheet.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(name);
		Row r = s.getRow(rownum);
		Cell c = r.getCell(cellnum);
		CellType type = c.getCellType();
		switch (type) {
		case STRING:
			value = c.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				value = dateFormat.format(d);

			} else {

				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);

			}
			break;

		default:
			break;
		}
		return value;

	}

	public String updateData(String name, int rownum, int column, String value) throws IOException {

		File f = new File("C:\\Users\\User\\eclipse-workspace\\FrameWork\\excel sheet\\suriyabasesheet.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(name);
		Row r = s.getRow(rownum);
		Cell c = r.createCell(column);
		c.setCellValue(value);
		FileOutputStream outputStream = new FileOutputStream(f);
		w.write(outputStream);
		return value;

	}

}
