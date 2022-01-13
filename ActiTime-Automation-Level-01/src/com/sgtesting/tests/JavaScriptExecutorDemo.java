package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScriptExecutorDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		dispayURL();
		dispayTitle();
		displayLinksCount();
//		enterValueInTextField1();
//		enterValueInTextField2();
//		clickOnButton1();
//		clickOnButton2();
//		clickOnCheckBox1();
//		clickOnCheckBox2();
//		clickOnRadioButton1();
//		clickOnRadioButton2();
		selectItemsFromDropDown();
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
			oBrowser.navigate().to("file:D:\\EXAMPLE\\xpath_html\\Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void dispayURL()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String url=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL of the Application :"+url);
	}
	
	private static void dispayTitle()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String title=(String) js.executeScript("var kk=document.title;return kk;");
		System.out.println("Title of the Application :"+title);
	}
	
	private static void displayLinksCount()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		long links=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
		System.out.println("# of Links :"+links);
	}
	
	private static void enterValueInTextField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
	}
	
	private static void enterValueInTextField2()
	{
		WebElement oEle=oBrowser.findElement(By.id("uid1user1name1"));
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].value='DemoUser1';",oEle);
	}
	
	private static void clickOnButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	
	private static void clickOnButton2()
	{
		WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void clickOnCheckBox1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk1windows').click();");
	}
	
	private static void clickOnCheckBox2()
	{
		WebElement oEle=oBrowser.findElement(By.id("chk1windows"));
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void clickOnRadioButton1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('rad2firefox').click();");
	}
	
	private static void clickOnRadioButton2()
	{
		WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void selectItemsFromDropDown()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String strScript="var kk=document.getElementById('tools');";
		strScript+="for(var i=0;i<kk.length;i++)";
		strScript+="{";
		strScript+="if(kk.options[i].text='Selenium WebDriver')";
		strScript+="{";
		strScript+="kk.options[i].selected='1';";
		strScript+="}";
		strScript+="}";
		js.executeScript(strScript);		
				
	}

}
