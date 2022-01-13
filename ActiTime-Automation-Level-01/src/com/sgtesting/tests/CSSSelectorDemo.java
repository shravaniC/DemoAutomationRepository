package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteCSSSelector();
	//	relativeCSSUsingTagNameAlone();
	//	relativeCSSUsingTagNameWithIDAttributeValue();
	//	relativeCSSUsingIDAttributeValue();
	//	relativeCSSUsingTagNameWithClassAttributeValue();
	//	relativeCSSUsingClassAttributeValue();
	//	relativeCSSUsingTagNameWithAttributeNameValueCombibation();
	//	relativeCSSUsingTagNameWithMultipleAttributeNameValueCombibation();
	//	relativeCSSUsingAttributeNameValueCombibation();
	//	relativeCSSUsingTagNameWithAttributeNameCombibation();
	//	relativeCSSUsingTagNameWithAttributeNameCombibation_1();
	//	relativeCSSUsingTagNameWithAttributeNameCombibation_2();
	//	relativeCSSUsingTagNameWithAttributeNameCombibation_3();
	//	relativeCSSUsingTagNameWithPartialAttributeValue();
	//	relativeCSSUsingParentReference();
	//	relativeCSSUsingnthChildConcept();
		relativeCSSUsingSiblingConcept();
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
	
	private static void absoluteCSSSelector()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser12");
	}
	/*
	 * Case 1: Identify the Element based on Tag Name
	 * Syntax: <tagName>
	 */
	private static void relativeCSSUsingTagNameAlone()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser12");
	}
	
	/*
	 * Case 2: Identify the Element based on Tag Name with id attribute value
	 * Syntax: <tagName>#<id attribute value>
	 */
	private static void relativeCSSUsingTagNameWithIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser12");
	}
	
	/*
	 * Case 3: Identify the Element based id attribute value
	 * Syntax: #<id attribute value>
	 */
	private static void relativeCSSUsingIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser12");
	}
	
	/*
	 * Case 4: Identify the Element based on Tag Name with class attribute value
	 * Syntax: <tagName>.<class attribute value>
	 */
	private static void relativeCSSUsingTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser12");
	}
	
	/*
	 * Case 5: Identify the Element based class attribute value
	 * Syntax: .<class attribute value>
	 */
	private static void relativeCSSUsingClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser12");
	}
	
	/*
	 * Case 6: Identify the Element based tagname with attribute name and value combination
	 * Syntax: <tagName>[attributename='attributevalue']
	 */
	private static void relativeCSSUsingTagNameWithAttributeNameValueCombibation()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	/*
	 * Case 7: Identify the Element based tagname with multiple attribute name and value combination
	 * Syntax: <tagName>[attributename='attributevalue'][attributename='attributevalue']
	 */
	private static void relativeCSSUsingTagNameWithMultipleAttributeNameValueCombibation()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit'][name='submit1btn1']")).click();
	}
	
	/*
	 * Case 8: Identify the Element based irrespective of tagname with attribute name and value combination
	 * Syntax: *[attributename='attributevalue']
	 */
	private static void relativeCSSUsingAttributeNameValueCombibation()
	{
		oBrowser.findElement(By.cssSelector("*[value='Submit']")).click();
	}
	
	/*
	 * Case 9: Identify the Element based tagname with attribute name combination
	 * Syntax: <tagName>[attributename]
	 */
	private static void relativeCSSUsingTagNameWithAttributeNameCombibation()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links are :"+oLinks.size());
	}
	
	private static void relativeCSSUsingTagNameWithAttributeNameCombibation_1()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String content=link.getText();
			System.out.println(content);
		}
	}
	
	private static void relativeCSSUsingTagNameWithAttributeNameCombibation_2()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String content=link.getText();
			if(content.endsWith("Insitute"))
			{
				link.click();
			}
		}
	}
	// org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
	private static void relativeCSSUsingTagNameWithAttributeNameCombibation_3()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String content=link.getText();
			if(content.startsWith("Selenium"))
			{
				link.click();
			}
		}
	}
	
	/*
	 * Case 10: Identify the Element based partial attribute value
	 *  starts-with -->  ^
	 *  ends-with  -->   $
	 *  contains   -->   *
	 * Syntax: <tagName>[attributename ^='partial attributevalue']
	 * Syntax: <tagName>[attributename $='partial attributevalue']
	 * Syntax: <tagName>[attributename *='partial attributevalue']
	 */
	private static void relativeCSSUsingTagNameWithPartialAttributeValue()
	{
	//	oBrowser.findElement(By.cssSelector("input[id ^='btn1']")).click();
		oBrowser.findElement(By.cssSelector("input[id *='submit1']")).click();
	}

	/*
	 * Case 11: Identify the Element based Parent Reference
	 * Syntax: ParentElemnt > ChildElement
	 */
	private static void relativeCSSUsingParentReference()
	{
		oBrowser.findElement(By.cssSelector("div#d2 > form#frm2 >input")).click();
	}
	
	/*
	 * Case 12: Identify the Element based nth Child Concept
	 * Syntax: nth-child(number)
	 */
	private static void relativeCSSUsingnthChildConcept()
	{
	//	oBrowser.findElement(By.cssSelector("form#frm3 >input:nth-child(4)")).sendKeys("DemoUser4");
		oBrowser.findElement(By.cssSelector("form#frm3 >input:nth-child(1)")).sendKeys("DemoUser4");
	}
	
	/*
	 * Case 13: Identify the Element based sibling Concept
	 * Syntax: Element1 + Element2
	 */
	private static void relativeCSSUsingSiblingConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 >input + input + input + input")).sendKeys("DemoUser4");
	}
}
