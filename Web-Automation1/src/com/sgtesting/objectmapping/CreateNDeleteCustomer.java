package com.sgtesting.objectmapping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNDeleteCustomer {
	private static String path=System.getProperty("user.dir");
	private static String filename = path +"\\Library\\ObjectMap\\objectmap.properties";
	public static ObjectMap objmap = new ObjectMap(filename);
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
//		logout();
//		
//		closeApplication();
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

	private static void minimizeFlyOutWindow() {
		try {
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createCustomer() {
		try {
			oBrowser.findElement(objmap.getLocator("clickOnTask")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("addNewDropdownInTask")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("newCustomerOption")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("customerNameField")).sendKeys("Infosys");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("customerDescriptionField")).sendKeys("For Testing Purpose");
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("saveCustomerButton")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyCustomer() {
		try {
			Thread.sleep(5000);
			oBrowser.findElement(objmap.getLocator("customerSettingIcon")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("customerActiveArchievedDropDown")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("customerArchievedSelection")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("saveCustomerButton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objmap.getLocator("saveCustomerButton")).click();
			Thread.sleep(500);
			oBrowser.findElement(objmap.getLocator("closeSettingsWindow")).click();
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer() {
		try {
			Thread.sleep(5000);
			oBrowser.findElement(objmap.getLocator("customerSettingIcon")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("clickActionButtontoDeleteCustomer")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("clickDeleteCutomer")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("clickOnDeleteConfirmation")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
