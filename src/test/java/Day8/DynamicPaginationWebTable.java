package Day8;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int pages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		System.out.println(pages);
		
		
		for(int p=1;p<=pages;p++)
		{
			if(p>1)
			{
			WebElement activePage = driver.findElement(By.xpath("//ul[@id='pagination']//li["+p+"]"));
			activePage.click();
			
			}
			
			// reading data from the page
			
			int rows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
			
			for(int r=1;r<=rows-1;r++)
			{		
					
			String productName = driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[2]")).getText();
			String productPrice = driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[3]")).getText();
			String onlyPrice = productPrice.replace("$", "");
			double finalProdPrice = Double.parseDouble(onlyPrice);
			
			System.out.println(productName+"\t"+finalProdPrice);
			
			}
		}
	driver.quit();	
}
}
