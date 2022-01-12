package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathAxesDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
//		enterSalaryForPersonSachinTendulkar();
	//	enterSalaryForPersonWhoIsNextToSachinTendulkar();
	//	FortheDesignationIndianFreedomFighterMaketheStatusasActive();
	//	ForthePersonRahulDravidHisPreviousRecordMaketheStatusasActive();
	//	fromParentIdentifyTheChildElement();
		fromChildElementIdentifyTheParentElement();
//		selectItemsFromDropDown();
	}

	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("file:D:\\EXAMPLE\\xpath_axes_html\\WebTableHTML.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 *  Based on the Person Name Sachin TEndulkar Enter the Salary
	 *  Syntax:
	 *  following-sibling
	 */
	private static void enterSalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
	}
	
	/*
	 *  Based on the Person Name Sachin TEndulkar Enter the Salary for the next record
	 *  Syntax:
	 *  following
	 */
	private static void enterSalaryForPersonWhoIsNextToSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("25000");
	}
	
	/*
	 *  For the Designation Indian Freedom Fighter Make the Status as Active
	 *  Syntax:
	 *  preceding-sibling
	 */
	private static void FortheDesignationIndianFreedomFighterMaketheStatusasActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	/*
	 *  For the Person Name RAhul Dravid His Previous Record Make the Status as Active
	 *  Syntax:
	 *  preceding
	 */
	private static void ForthePersonRahulDravidHisPreviousRecordMaketheStatusasActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	
	/*
	 *  From the Parent Table we can identify any Child Element
	 *  Syntax:
	 *  descendant
	 */
	private static void fromParentIdentifyTheChildElement()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[5]/td[6]/input")).sendKeys("20000");
	}
	
	/*
	 *  From the Edit Field (Child Element) we can identify any Parent Element
	 *  Syntax:
	 *  ancestor
	 */
	private static void fromChildElementIdentifyTheParentElement()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit5']/ancestor::td/ancestor::tr[1]/ancestor::table"));
		String val=oEle.getAttribute("id");
		System.out.println(val);
	}
	
	/**
	 * How to Select the Items from the Drop Down
	 * 
	 */
	private static void selectItemsFromDropDown()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[2]/select"));
			Select oSelect=new Select(oEle);
			oSelect.selectByVisibleText("Punjab");
			Thread.sleep(2000);
			oSelect.selectByIndex(2);
			Thread.sleep(2000);
			oSelect.selectByValue("guj");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
