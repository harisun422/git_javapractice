package selenium_artifactid;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi {

	public static void main(String[] args) {
		Map<String,Integer> columns= new HashMap<String,Integer>();
		try {
			Workbook wb = new XSSFWorkbook(new File("C:\\Users\\delluser\\git\\selenium\\selenium_artifactid\\workbook01.xlsx"));
		
			Sheet currentsheet =wb.getSheet("Sheet1");
			Row r0= currentsheet.getRow(0);
			Iterator<Cell> cl = r0.iterator();
			System.out.println(cl.next().getStringCellValue());
			//r0.forEach(cell ->);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
