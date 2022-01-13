package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AdvancedActitimeAssignment1 {
	private static WebDriver oBrowser=null;
	private static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow(); 
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginAsUser1();
		logout();
		loginAsUser2();
		logout();
		loginAsUser3();
		logout();
		login();
		minimizeFlyOutWindow(); 
		modifyUserPassword();
		logout();
		loginAsUser11();
		logout();
		loginAsUser21();
		logout();
		loginAsUser31();
		logout();
		login();
		minimizeFlyOutWindow(); 
		deleteUser1();
		deleteUser2N3();
		deleteUser2N3();
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
			Thread.sleep(1500);
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
			Thread.sleep(1500);
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
			Thread.sleep(1500);
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
			Thread.sleep(1500);
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
	private static void createUser1()
	{
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(1000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(1000);
			oPage.getAddUserFirstName().sendKeys("Dhanush");
			oPage.getAddUserLastName().sendKeys("U1");
			oPage.getAddUserEmail().sendKeys("abc@gmail.com");
			oPage.getUserName().sendKeys("User1");
			oPage.getAddUserPassword().sendKeys("pwduser1");
			oPage.getAddUserRetypePassword().sendKeys("pwduser1");
			Thread.sleep(2000);
			oPage.getCreateUserCreateButton().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try {
			//	oPage.getCreateUserButton().click();
			//	Thread.sleep(1000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(2000);
			oPage.getAddUserFirstName().sendKeys("Darshan");
			oPage.getAddUserLastName().sendKeys("U2");
			oPage.getAddUserEmail().sendKeys("abc@gmail.com");
			oPage.getUserName().sendKeys("User2");
			oPage.getAddUserPassword().sendKeys("pwduser2");
			oPage.getAddUserRetypePassword().sendKeys("pwduser2");
			Thread.sleep(3000);
			oPage.getCreateUserCreateButton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser3()
	{
		try {
			//	oPage.getCreateUserCreateButton().click();
			//	Thread.sleep(1000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(1000);
			oPage.getCreateUserCreateButton().click();
			oPage.getAddUserFirstName().sendKeys("Sathvik");
			oPage.getAddUserLastName().sendKeys("U3");
			oPage.getAddUserEmail().sendKeys("abc@gmail.com");
			oPage.getUserName().sendKeys("User3");
			oPage.getAddUserPassword().sendKeys("pwduser3");
			oPage.getAddUserRetypePassword().sendKeys("pwduser3");
			Thread.sleep(6000);
			oPage.getCreateUserCreateButton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser1()
	{
		try {
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("pwduser1");
			oPage.getLoginButton().click();
			Thread.sleep(1000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser2()
	{
		try {
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("pwduser2");
			oPage.getLoginButton().click();
			Thread.sleep(1000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser3()
	{
		try {
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("pwduser3");
			oPage.getLoginButton().click();
			Thread.sleep(1000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUserPassword()
	{
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(1500);
			oPage.getClickOnUser1().click();
			Thread.sleep(1500);
			oPage.getAddUserPassword().sendKeys("user1pwd");
			Thread.sleep(1500);
			oPage.getAddUserRetypePassword().sendKeys("user1pwd");
			Thread.sleep(1500);
			oPage.getCreateUserCreateButton().click(); 
			Thread.sleep(1500);
			oPage.getClickOnUser2().click();
			Thread.sleep(1500);
			oPage.getAddUserPassword().sendKeys("user2pwd");
			Thread.sleep(1500);
			oPage.getAddUserRetypePassword().sendKeys("user2pwd");
			Thread.sleep(1500);
			oPage.getCreateUserCreateButton().click(); 
			Thread.sleep(1500);
			oPage.getClickOnUser3().click();
			Thread.sleep(1500);
			oPage.getAddUserPassword().sendKeys("user3pwd");
			Thread.sleep(1500);
			oPage.getAddUserRetypePassword().sendKeys("user3pwd");
			Thread.sleep(1500);
			oPage.getCreateUserCreateButton().click(); 
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginAsUser11()
	{
		try {
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("user1pwd");
			oPage.getLoginButton().click();
			Thread.sleep(1000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser21()
	{
		try {
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("user2pwd");
			oPage.getLoginButton().click();
			Thread.sleep(1000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser31()
	{
		try {
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("user3pwd");
			oPage.getLoginButton().click();
			Thread.sleep(1000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser1() {
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(1000);
			oPage.getClickOnUser1().click();
			Thread.sleep(1500);
			oPage.getDeleteUserDeleteButton().click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(1500);
			oa.accept();
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void deleteUser2N3() {
		try {
			oPage.getClickOnUser1().click();
			Thread.sleep(1500);
			oPage.getDeleteUserDeleteButton().click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(1500);
			oa.accept();
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

