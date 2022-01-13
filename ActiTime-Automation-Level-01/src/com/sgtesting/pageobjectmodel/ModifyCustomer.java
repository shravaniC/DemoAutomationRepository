package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyCustomer {
	private static WebDriver oBrowser=null;
	private static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
		logout();
		closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:83/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createCustomer() {
		try {
			oPage.getClickOnTask().click();
			Thread.sleep(1000);
			oPage.getAddNewDropdownInTask().click();
			Thread.sleep(1000);
			oPage.getNewCustomerOption().click();
			Thread.sleep(1000);
			oPage.getCustomerNameField().sendKeys("Oracle");
			Thread.sleep(1000);
			oPage.getCustomerDescriptionField().sendKeys("Testing Adding Customer feature ");
			Thread.sleep(1000);
			oPage.getSaveCustomerButton().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteCustomer()
	{
		try {
			oPage.getclickSettingCustomertDelete().click();
			Thread.sleep(1000);
			oPage.getclickActionButtontoDeleteCustomer().click();
			oPage.getclickDeleteCutomer().click();
			Thread.sleep(1000);
			oPage.getClickDeleteCustomerConfirm().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void modifyCustomer()
	{
		try {
			oPage.getclickSettingCustomertDelete().click();
			Thread.sleep(1000);
			oPage.getmodifyCustomerclickoncustomernamefield().click();
			Thread.sleep(1000);
			oPage.getmodifyCustomerclickoncustomernamefieldtoclear().clear();
			Thread.sleep(1000);
			oPage.getmodifyCustomername().sendKeys("Oracle1");
			Thread.sleep(1000);
			oPage.getAfterModifyCloseCustomerWindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

