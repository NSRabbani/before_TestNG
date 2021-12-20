package org.Mini_Project_mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	static File f = new File("D:\\Selenium\\data\\Sample_data.xlsx");

	public static void particular_data() throws IOException {

		System.out.println("--------particular cell data--------------");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(1);

		Cell cell = row.getCell(0);

		CellType type = cell.getCellType();

		if (type.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			int cellvalue = (int) numericCellValue;

			System.out.println(cellvalue);

		} else if (type.equals(CellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();

			System.out.println(stringCellValue);

		}

	}

	public static void Alldata() throws IOException {
		System.out.println("---------------All data--------------");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < NumberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();

					System.out.println(stringCellValue);

				} else if (cellType.equals(CellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();

					int cellvalue = (int) numericCellValue;

					System.out.println(cellvalue);
				}
			}
		}
	}

	public static void a_Row() throws IOException {

		System.out.println("-----------particular row---------------");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("sheet1");

		Row row = sheet.getRow(1);

		int physicalNumberOfCells = row.getPhysicalNumberOfCells();

		for (int i = 0; i < physicalNumberOfCells; i++) {

			Cell cell = row.getCell(i);

			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.STRING)) {

				String stringCellValue = cell.getStringCellValue();

				System.out.println(stringCellValue);

			} else if (cellType.equals(CellType.NUMERIC)) {

				double numericCellValue = cell.getNumericCellValue();

				int numericvalue = (int) numericCellValue;

				System.out.println(numericvalue);
			}
		}
	}

	public static void a_column() throws IOException {

		System.out.println("-------0 th column-----------");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("sheet1");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < physicalNumberOfRows; i++) {

			Row row = sheet.getRow(i);

			Cell cell = row.getCell(0);

			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.NUMERIC)) {

				double numericCellValue = cell.getNumericCellValue();

				int numeric = (int) numericCellValue;

				System.out.println(numeric);
			} else if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			{

			}

		}

	}
	
	public static void data_driven_write() throws Throwable {
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("sheet2").createRow(0);
		wb.getSheet("sheet2").getRow(0).createCell(0).setCellValue("Sl.No");
		wb.getSheet("sheet2").getRow(0).createCell(1).setCellValue("Name");
		wb.getSheet("sheet2").getRow(0).createCell(2).setCellValue("Age");
		
		wb.getSheet("sheet2").createRow(1).createCell(0).setCellValue("1");
		wb.getSheet("sheet2").getRow(1).createCell(1).setCellValue("Rabbani");
		wb.getSheet("sheet2").getRow(1).createCell(2).setCellValue("25");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		wb.close();
		
		System.out.println("success");
		
		
	}

	public static void main(String[] args) throws Throwable {
		///particular_data();
		//Alldata();
		//a_Row();
		//a_column();
data_driven_write();	
	
	}

}
