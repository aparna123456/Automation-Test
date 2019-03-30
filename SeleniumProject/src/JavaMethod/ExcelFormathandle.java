package JavaMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFormathandle {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		XSSFWorkbook Workbook = new XSSFWorkbook(new FileInputStream(".\\Resources\\Paractice excle.xlsx"));

		XSSFSheet Sheet = Workbook.getSheet("sheet1");
		
		Iterator<Row> rows = Sheet.iterator();
		
		
		while (rows.hasNext())
		{
			Row Rowobj = rows.next();
		//	System.out.println(Rowobj.getCell(0).getStringCellValue());
		
		
		//to read all row specific cell
		
		Iterator<Cell> cell = Rowobj.cellIterator();
		
		while (cell.hasNext())
		{
			Cell cellobj = cell.next();
			
			switch(cellobj.getCellTypeEnum())
			{
			case STRING:
			System.out.println(cellobj.getRichStringCellValue());
			break;
			case NUMERIC:
				System.out.println(cellobj.getNumericCellValue());
				break;
			case BOOLEAN:
				System.out.println(cellobj.getBooleanCellValue());
				break;
			case FORMULA:
				System.out.println(cellobj.getCellFormula());
				break;
			
			}
			
		}
			
		}

	}

}
