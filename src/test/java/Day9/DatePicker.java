package Day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	
	//creating userdefined functions
	
	static void selectPastDate(WebDriver driver, String Year,String Month, String day)
	{
		while(true)
		{
			String getMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String getYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(Month.equals(getMonth) && Year.equals(getYear))
			{
				break;
			}
			else {
				
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous
			}				
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement date:dates)
		 {
			 if(date.getText().equals(day))
			 {
				 date.click();
				 break;
			 }	 
		 }
	}
	
	
	static void selectFutureDate(WebDriver driver, String Year,String Month, String day)
	{
		while(true)
		{
			String getMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String getYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(Month.equals(getMonth) && Year.equals(getYear))
			{
				break;
			}
			else {
				
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next
  
			}
		
			
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement date:dates)
		 {
			 if(date.getText().equals(day))
			 {
				 date.click();
				 break;
			 }
				 
		 }
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(0);
		//method 1:
		//driver.findElement(By.id("datepicker")).sendKeys("10/05/2024");
		
		//method 2:
		driver.findElement(By.id("datepicker")).click();  // open the date picker
		
		selectPastDate(driver,"2023","April","15");
	}

}
