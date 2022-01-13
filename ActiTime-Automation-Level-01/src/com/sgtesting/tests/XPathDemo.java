package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
//		absoluteXPath();
	//  relativeXPathTagNameAlone();
	//	relativeXPathTagNameWithIndex();
	//	relativeXPathTagNameWithAttributeNameAndValue();
	//	relativeXPathWithAttributeNameAndValue();
	//	relativeXPathWithAttributeValueAlone();
	//	relativeXPathTagNameWithMultipleAttributeNameAndValue();
	//	relativeXPathTagNameWithMultipleAttributeNameAndValueUsingORoperator();
	//	relativeXPathTagNameWithMultipleAttributeNameAndValueUsingAndoperator();
	//	relativeXPathTagNameWithPartialMatchingOfAttributeValue();
	//	relativeXPathTagNameWithAttributeName();
	//	relativeXPathTagNameWithAttributeName_1();
	//	relativeXPathTagNameWithAttributeName_2();
		relativeXPathTagNameWithAttributeName_3();
	//	relativeXPathTagNameWithTextContent();
//		relativeXPathTagNameWithPartialTextContent();
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

	private static void absoluteXPath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}

	/**
	 * Case 1: Identify the element based on tagName itself
	 * Syntax:
	 * //<tagName>
	 */
	private static void relativeXPathTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}

	/**
	 * Case 2: Identify the element based on tagName and index
	 * Syntax:
	 * //<tagName>[index]
	 */
	private static void relativeXPathTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 3: Identify the element based on tagName 
	 * with attribute name and attribute value combination
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue']
	 */
	private static void relativeXPathTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	/**
	 * Case 4: Identify the element based on irespective of any tagName 
	 * only attribute name and attribute value combination
	 * Syntax:
	 * //*[@attributename='attributevalue']
	 */
	private static void relativeXPathWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//*[@name='submit1btn1']")).click();
	}
	
	/**
	 * Case 5: Identify the element based on irespective of any tagName 
	 *  and irrespective of attribute name but only attribute value combination
	 * Syntax:
	 * //*[@*='attributevalue']
	 */
	private static void relativeXPathWithAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='submit1btn1']")).click();
	}
	
	/**
	 * Case 6: Identify the element based on tagName 
	 * with multiple attribute name and attribute value combinations
	 * Syntax:
	 * //<tagName>[@attributename1='attributevalue'][@attributename2='attributevalue']
	 */
	private static void relativeXPathTagNameWithMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@class='submit1btn1']")).click();
	}
	
	/**
	 * Case 7: Identify the element based on tagName 
	 * with multiple attribute name and attribute value combinations using OR operator
	 * Syntax:
	 * //<tagName>[@attributename1='attributevalue' or @attributename2='attributevalue']
	 */
	private static void relativeXPathTagNameWithMultipleAttributeNameAndValueUsingORoperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' or @class='submit1btn1']")).click();
	}
	
	/**
	 * Case 8: Identify the element based on tagName 
	 * with multiple attribute name and attribute value combinations using and operator
	 * Syntax:
	 * //<tagName>[@attributename1='attributevalue' and @attributename2='attributevalue']
	 */
	private static void relativeXPathTagNameWithMultipleAttributeNameAndValueUsingAndoperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @class='submit1btn1']")).click();
	}
	
	/**
	 * Case 9: Identify the element based on tagName 
	 * with partial matching of attribute value 
	 * Syntax:
	 * starts-with(@attributename,attributevalue)
	 * ends-with(@attributename,attributevalue)
	 * contains(@attributename,attributevalue)
	 * 
	 * //<tagName>[starts-with(@attributename,attributevalue)]
	 * //<tagName>[ends-with(@attributename,attributevalue)]
	 * //<tagName>[contains(@attributename,attributevalue)]
	 */
	private static void relativeXPathTagNameWithPartialMatchingOfAttributeValue()
	{
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit1')]")).click();
	}
	
	/**
	 * Case 10: Identify the element based on tagName 
	 * with attribute name alone
	 * Syntax:
	 * //<tagName>[@attributename]
	 */
	private static void relativeXPathTagNameWithAttributeName()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links :"+oLinks.size());
	}
	
	private static void relativeXPathTagNameWithAttributeName_1()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String linktext=link.getText();
			System.out.println(linktext);
		}
	}
	
	private static void relativeXPathTagNameWithAttributeName_2()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String linktext=link.getText();
			if(linktext.endsWith("Insitute"))
			{
				link.click();
			}
		}
	}
	// org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
	private static void relativeXPathTagNameWithAttributeName_3()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String linktext=link.getText();
			link.click();
		}
	}
	
	/**
	 * Case 11: Identify the element based on Text Content
	 * Syntax:
	 * //<tagName>[text()='text content']
	 */
	private static void relativeXPathTagNameWithTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='S G Software Testing Insitute']")).click();
	}
	
	/**
	 * Case 11: Identify the element based on partial Text Content
	 * Syntax:
	 * starts-with(text(),'text content')
	 * ends-with(text(),'text content')
	 * contains(text(),'text content')
	 * //<tagName>[starts-with(text(),'text content')]
	 * //<tagName>[ends-with(text(),'text content')]
	 * //<tagName>[contains(text(),'text content')]
	 */
	private static void relativeXPathTagNameWithPartialTextContent()
	{
		oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G Software')]")).click();
	}
}
