package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tasks{

	/**
	 * Created By:
	 * Created Date:
	 * Test case ID:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void createTask(WebDriver oBrowser) {
		try {

			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input"))
			.sendKeys("Test Scenario");
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Test case ID:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void deleteTask(WebDriver oBrowser) {
		try {

			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
