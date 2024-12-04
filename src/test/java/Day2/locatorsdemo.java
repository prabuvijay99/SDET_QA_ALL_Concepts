package Day2;

/*Locators
 * id
 * name
 * linktext
 * partiallinktext
 * classname
 * tagname
 * Css selector -  tag and id, tag and class, tag and attribute ,tag and class and attribute
 * Xpath - relative and absolute 
 * 
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Locate single element id name and linkText partial link text
		//id
		boolean displayed = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(displayed);
				
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		
		// to locate multiple webelement tagname and classname
		// class name for getting group of elements webelements returns list<webelement>
		
		List<WebElement> Links = driver.findElements(By.className("list-inline-item"));
		System.out.println("no of links "+ Links.size() );
		
		
		// tagname we can get group of elements
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("Overall links "+AllLinks.size());
		
		List<WebElement> Images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images :"+ Images.size());
		driver.quit();
		
		
	}

}

// findelement() -- single
// findelements() -- Multiple 

/*
 * Scenario1 if the locator matching with one webelement
 * findelement - return single webelement
 * finelements - return single webelement
 * 
 * Scenario2: if the locator matching with multiple webelement
 * findelement - return single webelemnt
 * findelemnts - return multiple webelemnt
 * 
 * scenario 3: if the locator not matching with no element
 * findelement - return No such element exception
 * findelements - return 0
 */



