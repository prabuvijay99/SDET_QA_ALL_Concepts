package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleselectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Select DropDown  --->  select tag should availale in html
		
		//capture the dropdown webelement
		WebElement dd = driver.findElement(By.xpath("//select[@id='country']"));
		
		//passing the webelement to the select class
		Select slt=new Select(dd);
		// byVisibleText
		slt.selectByVisibleText("Canada");
		
		Thread.sleep(3000);
		
		//byValue
		slt.selectByValue("usa");
		
		Thread.sleep(3000);
		//byindex
		slt.selectByIndex(6);
		
		
		
		
	}

}
