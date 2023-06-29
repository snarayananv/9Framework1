package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FrameWork1 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\User\\eclipse-workspace\\FrameWork\\excel sheet\\fmPractise.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(stream);

		Sheet s = w.getSheet("Excel1");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row row = s.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				CellType type = cell.getCellType();

				switch (type) {
				case STRING:

					String s1 = cell.getStringCellValue();

					System.out.println(s1);

					break;

				case NUMERIC:

					if (DateUtil.isCellDateFormatted(cell)) {

						Date d = cell.getDateCellValue();

						SimpleDateFormat si = new SimpleDateFormat("dd-mm-yyyy");
						String format = si.format(d);
						System.out.println(format);

					} else {

						double n = cell.getNumericCellValue();

						long l = (long) n;

						String s2 = String.valueOf(l);

						System.out.println(s2);
					}
					break;
				default:
					break;
				}

			}

		}

	}
}
