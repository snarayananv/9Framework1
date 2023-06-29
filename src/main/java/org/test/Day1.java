package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day1 {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		File file = new File("C:\\Users\\User\\eclipse-workspace\\FrameWork\\excel sheet\\Book.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Sheet1");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);

		Row row2 = sheet.getRow(3);

		int physicalNumberOfCells = row2.getPhysicalNumberOfCells();

		System.out.println(physicalNumberOfCells);
	}
}
