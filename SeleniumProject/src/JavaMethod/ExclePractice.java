package JavaMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExclePractice {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		XSSFWorkbook Workbook = new XSSFWorkbook(new FileInputStream(".\\Resources\\Paractice excle.xlsx"));

		XSSFSheet Sheet = Workbook.getSheet("sheet1");
		
		//System.out.println(Sheet.getRow(0).getCell(0));
		//System.out.println(Sheet.getRow(1).getCell(2));
		
		Iterator<Row> rows = Sheet.iterator();
		
		// to read specific rows and column
		while (rows.hasNext())
		{
			Row Rowobj = rows.next();
		//	System.out.println(Rowobj.getCell(0).getStringCellValue());
		
		
		//to read all row specific cell
		
		Iterator<Cell> cell = Rowobj.cellIterator();
		
		while (cell.hasNext())
		{
			Cell cellobj = cell.next();
			System.out.println(cellobj.getStringCellValue());
		}
			
		}
	
	}
	

}
