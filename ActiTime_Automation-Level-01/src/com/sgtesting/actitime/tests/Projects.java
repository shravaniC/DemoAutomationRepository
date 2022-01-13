package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;

public class Projects extends Initialize{
	
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
	public static void createProject() {
		try{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.className("createNewProject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("testProject");
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e){
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
	public static void modifyProject() {
		try{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("This is Testing purpose");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[1]")).click();
			Thread.sleep(2000);
		}
		catch(Exception e){
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
	public static void deleteProject(){
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
