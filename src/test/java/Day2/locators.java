package Day2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		// total number of links 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links "+ links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images "+ images.size());
		
		driver.findElement(By.partialLinkText("Lapto")).click();
		
		System.out.println("the end");
		
	}

}
