package org.backclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class SampleBaseClass {

	public static WebDriver driver;

	public WebDriver getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}

	public void getUrl(String url) {

		driver.get(url);

	}

	public void maximize() {

		driver.manage().window().maximize();

	}

	public void implicitWait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

	}

	public void insertValue(WebElement e, String data) {

		e.sendKeys(data);

	}

	public void click(WebElement e) {

		e.click();

	}

	public void selectOptionByText(WebElement e, String data) {

		Select s = new Select(e);
		s.selectByVisibleText(data);

	}

	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
		return attribute;

	}

	public String getData(String name, int rownum, int cellnum) throws IOException {

		String value = null;
		File file = new File("C:\\Users\\User\\eclipse-workspace\\FrameWork\\excel sheet\\suriyasample.xlsx");
		FileInputStream stream = new FileInputStream(file);
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

				Date date = c.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
                value = dateformat.format(date);
             				
			} else {

				double cellValue = c.getNumericCellValue();
				long l = (long) cellValue;
				value = String.valueOf(l);							
			}
			break;

		default:
			break;
		}
		return value;

	}

	public void updateData(String name, int rownum, int colum, String value) throws IOException {

		File f = new File("C:\\Users\\User\\eclipse-workspace\\FrameWork\\excel sheet\\suriyasample.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
	    Sheet s = w.getSheet(name);
		Row r = s.getRow(rownum);
        Cell c = r.createCell(colum);
        c.setCellValue(value);
        FileOutputStream s1 = new FileOutputStream(f);
		w.write(s1);

	}
	
	
	
	
	
	
}

