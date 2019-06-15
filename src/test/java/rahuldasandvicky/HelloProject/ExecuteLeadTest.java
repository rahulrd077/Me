package rahuldasandvicky.HelloProject;

import rahuldasandvicky.HelloProject.Keyword;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExecuteLeadTest {
	
@Test

public void LeadTest() throws Exception {
	
	
Keyword key = new Keyword();
	
	ArrayList a = new ArrayList();
	
	FileInputStream file = new FileInputStream("D:\\ExcelFile\\Hey.xlsx");
	
	XSSFWorkbook wbks = new XSSFWorkbook(file);
	
	Sheet s = wbks.getSheet("Sheet1");
	
	Iterator itr = s.iterator();
	
	while(itr.hasNext()) {
		
		Row row = (Row)itr.next();
		
		Iterator rowitr = row.cellIterator();
		
		while (rowitr.hasNext()) {
			
			Cell cell =(Cell) rowitr.next();
			
			
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				
				a.add(cell.getStringCellValue());
				
				break;
				
case Cell.CELL_TYPE_BOOLEAN:
				
				a.add(cell.getBooleanCellValue());
				
				break;
				
case Cell.CELL_TYPE_NUMERIC:
	
	a.add(cell.getNumericCellValue());
	
	break;
				
				
				
				
			}
			
			}
			
			
		}
		
		
		for(int i = 0 ; i < a.size() ; i++) {
			
			if (a.get(i).equals("openbrowser")) {
				
				
				String keyword = (String)a.get(i);
				String Data = (String)a.get(i+1);
				String objectName = (String)a.get(i+2);
				String runmode = (String)a.get(i+3);
				
				System.out.println (keyword);
				System.out.println (Data);
				System.out.println (objectName);
				System.out.println (runmode);
				
				if(runmode.equals("Yes")){
					key.openbrowser();
				}
				
				
			}
		}
			
			for(int i = 0 ; i < a.size() ; i++) {
				
				if (a.get(i).equals("navigate")) {
					
					
					String keyword = (String)a.get(i);
					String Data = (String)a.get(i+1);
					String objectName = (String)a.get(i+2);
					String runmode = (String)a.get(i+3);
					
					System.out.println (keyword);
					System.out.println (Data);
					System.out.println (objectName);
					System.out.println (runmode);
					
					if(runmode.equals("Yes")){
						key.navigate(Data);
					}
		}
	
	}
for(int i = 0 ; i < a.size() ; i++) {
				
				if (a.get(i).equals("username")) {
					
					
					String keyword = (String)a.get(i);
					String Data = (String)a.get(i+1);
					String objectName = (String)a.get(i+2);
					String runmode = (String)a.get(i+3);
					
					
					System.out.println (keyword);
					System.out.println (Data);
					System.out.println (objectName);
					System.out.println (runmode);
					
					if(runmode.equals("Yes")){
						key.inputuser(Data, objectName);
			
					}
				}
}

for(int i = 0 ; i < a.size() ; i++) {
	
	if (a.get(i).equals("password")) {
		
		
		String keyword = (String)a.get(i);
		String Data = (String)a.get(i+1);
		String objectName = (String)a.get(i+2);
		String runmode = (String)a.get(i+3);
		
		System.out.println (keyword);
		System.out.println (Data);
		System.out.println (objectName);
		System.out.println (runmode);
		
		if(runmode.equals("Yes")){
			key.inputpass(Data,objectName);
	
	
}
		
	}
	
}
for(int i = 0 ; i < a.size() ; i++) {
	
	if (a.get(i).equals("log")) {
		
		
		String keyword = (String)a.get(i);
		String Data = (String)a.get(i+1);
		String objectName = (String)a.get(i+2);
		String runmode = (String)a.get(i+3);
		
		System.out.println (keyword);
		System.out.println (Data);
		System.out.println (objectName);
		System.out.println (runmode);
		
		if(runmode.equals("Yes")){
			key.login(objectName);
	
	
}

	}
}
for(int i = 0 ; i < a.size() ; i++) {
	
	if (a.get(i).equals("SelectDropDown")) {
		
		
		String keyword = (String)a.get(i);
		String Data = (String)a.get(i+1);
		String objectName = (String)a.get(i+2);
		String runmode = (String)a.get(i+3);
		
		System.out.println (keyword);
		System.out.println (Data);
		System.out.println (objectName);
		System.out.println (runmode);
		
		if(runmode.equals("Yes")){
			key.sel(objectName);
	
}
}
}
for(int i = 0 ; i < a.size() ; i++) {
	
	if (a.get(i).equals("Sel")) {
		
		
		String keyword = (String)a.get(i);
		String Data = (String)a.get(i+1);
		String objectName = (String)a.get(i+2);
		String runmode = (String)a.get(i+3);
		
		System.out.println (keyword);
		System.out.println (Data);
		System.out.println (objectName);
		System.out.println (runmode);
		
		if(runmode.equals("Yes")){
			key.sel2(objectName);
	
}
}
}
}
}
