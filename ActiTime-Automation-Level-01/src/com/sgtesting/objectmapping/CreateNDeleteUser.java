package com.sgtesting.objectmapping;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNDeleteUser {
	private static String path=System.getProperty("user.dir");
	private static String filename = path +"\\Library\\ObjectMap\\objectmap.properties";
	public static ObjectMap objmap = new ObjectMap(filename);
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
//		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}

	private static void launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeApplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login() {
		try {
			System.out.println("admin entering");
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("admin"); //(locator value)username --> admin
			System.out.println("password entering");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			//oBrowser.findElement(prop.getProperty('username');
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	private static void minimizeFlyOutWindow() {
//		try {
//			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	private static void createUser()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(objmap.getLocator("createUserButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("createUserAddButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("firstName")).sendKeys("Dhanush");
			oBrowser.findElement(objmap.getLocator("lastName")).sendKeys("V");
			oBrowser.findElement(objmap.getLocator("email")).sendKeys("Dhanush@gmail.com");
			oBrowser.findElement(objmap.getLocator("userName")).sendKeys("Dhanush");
			oBrowser.findElement(objmap.getLocator("password")).sendKeys("Dhanushv");
			oBrowser.findElement(objmap.getLocator("passwordCopy")).sendKeys("Dhanushv");
			oBrowser.findElement(objmap.getLocator("createUserCreateButton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser() {
		try {
			Thread.sleep(5000);
			oBrowser.findElement(objmap.getLocator("clickOnUser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deleteUserDeleteButton")).click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(2000);
			oa.accept();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void logout() {
		try {
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
