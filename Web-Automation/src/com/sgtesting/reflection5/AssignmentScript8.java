
package com.sgtesting.reflection5;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentScript8{

	public static void main(String[] args) {
		executeAllScenarios();

	}
	
	private static void executeAllScenarios()
	{
		FileInputStream fin=null;
		String filePath=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			filePath=System.getProperty("user.dir");
			String filename=filePath+"\\DataFiles\\Assignment1.xlsx";
			fin=new FileInputStream(filename);
			wb=new XSSFWorkbook(fin);
			int sc=wb.getNumberOfSheets();
			for(int s=0;s<sc;s++)
			{
			String name=wb.getSheetName(s);
			sh=wb.getSheet(name);
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
				
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+"  --> "+methodname);
				
				
				Class clsObject=Class.forName(pkgclassname);
				Object obj=clsObject.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				
				method.invoke(obj);
				
			}
			System.out.println("------------------------------------");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

