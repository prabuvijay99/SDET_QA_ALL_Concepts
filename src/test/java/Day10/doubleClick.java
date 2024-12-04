package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame("iframeResult");
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement click = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		field1.clear();
		field1.sendKeys("Hello Dhana");
		
		
		
		Actions act=new Actions(driver);
		act.doubleClick(click).perform();
		Thread.sleep(5000);
		
		//we dont have inner text so we are using attribute
		String text = field2.getAttribute("value");
		
		if(text.equals("Hello Dhana"))
		{
			System.out.println("Copied properly");
			
		}
		else
		{
			System.out.println("Not Copied properly");
		}
		
	driver.quit();
	}
}
