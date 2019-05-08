package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelPractice {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("/Users/nijataliyev/Desktop/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(file);
//		System.out.println(wb.getNumberOfSheets());
//		Sheet sh = wb.getSheetAt(0);
//		System.out.println(sh.getPhysicalNumberOfRows());
//		Row row = sh.getRow(3);
//		System.out.println(row.getCell(0));
		Sheet sh = wb.getSheet("Test1");
//		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
//			for (int j = 0; j < sh.getRow(i).getPhysicalNumberOfCells() ; j++) {
//				System.out.print(sh.getRow(i).getCell(j) + " ");
//			}
//			System.out.println();
//		}
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
	    cell.setCellValue("Azer");
	    FileOutputStream outStream = new FileOutputStream("/Users/nijataliyev/Desktop/Book1.xlsx");
		wb.write(outStream);
	}
}
