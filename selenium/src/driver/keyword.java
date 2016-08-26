package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.orgHRM.Master.orgMaster;

public class keyword
{
	@Test
	public void driverscript() throws IOException
	{
		String res=null;
		orgMaster om=new orgMaster();
		String xlpath="F:\\morning630AM\\selenium\\src\\com\\orgHRM\\Testdata\\Keyword.xlsx";
		String xlout="F:\\morning630AM\\selenium\\src\\com\\orgHRM\\Results\\keyres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		for (int i = 1; i <= tcRc; i++)
		{
			String exec=ws.getRow(i).getCell(2).getStringCellValue();
			if (exec.equalsIgnoreCase("Y"))
			{
				ws.getRow(i).createCell(3);
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++) 
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tcId.equalsIgnoreCase(tstcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://orangehrm.qedgetech.com");
							break;
						case "login":
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":	
							res=om.org_Empreg("Sharath", "Chandra");
							break;
						case "Usereg":	
							res=om.org_Userreg("Sharath Chandra", "Sharath123456", "Sharath123456", "Sharath123456");
							break;
						case "Ulogin":	
							res=om.org_Login("Sharath123456", "Sharath123456");
							break;
						default:
							System.out.println("Select a Proper keyword");
							break;
						}
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							
							ws.getRow(i).getCell(3).setCellValue(res);
						}
						else
						{
							ws.getRow(i).getCell(3).setCellValue("Fail");
						}
						
					}
				}
				
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
