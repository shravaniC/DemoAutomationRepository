package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent; 
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
public class ImpotandDeleteTask {
	 private static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyPutWindow();
			importTask();
			//copyFilePath();
			//logout();
			//closeApplication();
		}
		private static void launchBrowser()
		{
			try {
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
			try {
				oBrowser.navigate().to("http://localhost:83/login.do");
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void login()
		{
			try {
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				//oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				//Thread.sleep(4000);
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	    private static void minimizeFlyPutWindow()
	    {
	    	try {
	    		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	    		Thread.sleep(2000);
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    private static void importTask()
	    {
	    	try {
	    		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
	    		Thread.sleep(200);
	    		oBrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
	    		Thread.sleep(200);
	    		oBrowser.findElement(By.xpath("//*[@id=\"dropzoneClickableArea\"]")).click();
	    		Thread.sleep(200);
	    		String filepath="D:\\EXAMPLE\\Demo\\Sample.csv";
	    		copyFilePath(filepath);
	    		Robot robot=new Robot();
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		Thread.sleep(1000);
	    		robot.keyPress(KeyEvent.VK_V);
	    		Thread.sleep(1000);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		Thread.sleep(1000);
	    		robot.keyRelease(KeyEvent.VK_V);
	    		Thread.sleep(1000);
	    		robot.keyPress(KeyEvent.VK_ENTER);
	    		Thread.sleep(1000);
	    		robot.keyRelease(KeyEvent.VK_ENTER);
	    		Thread.sleep(1000);
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    private static void copyFilePath(String filepath)
	    {
	    	StringSelection stringselection=new StringSelection(filepath);
	    	Toolkit toolkit=Toolkit.getDefaultToolkit();
	    	Clipboard clipboard=toolkit.getSystemClipboard();
	    	clipboard.setContents(stringselection,null);
	    }
	    private static void logout()
	    {
	    	try {
	    		oBrowser.findElement(By.linkText("Logout")).click();
	    		Thread.sleep(4000);
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    private static void closeApplication()
	    {
	    	try {
	    		oBrowser.close();
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	}
