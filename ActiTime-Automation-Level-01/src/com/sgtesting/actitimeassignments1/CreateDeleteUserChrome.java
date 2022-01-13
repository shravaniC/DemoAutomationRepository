package com.sgtesting.actitimeassignments1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CreateDeleteUser {
	public static WebDriver oBrowser;

	static void LaunchBrowser() {
		try {
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void navigate() {
		try {
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void closeapplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void login() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void logout() {
		try {
			// oBrowser.findElement(By.linkText("Logout")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createuser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User");
			oBrowser.findElement(By.name("email")).sendKeys("abs@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_usernameField']")).sendKeys("Dhanush");
			oBrowser.findElement(By.name("password")).sendKeys("abs12345");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abs12345");
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteuser() {
		try {
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='User, Demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(2000);
			oa.accept();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class CreateDeleteUserChrome {

	public static void main(String[] args) {
		CreateDeleteUser.LaunchBrowser();
		CreateDeleteUser.navigate();
		CreateDeleteUser.login();
		CreateDeleteUser.createuser();
		CreateDeleteUser.deleteuser();
		CreateDeleteUser.logout();
		CreateDeleteUser.closeapplication();
	}

}
