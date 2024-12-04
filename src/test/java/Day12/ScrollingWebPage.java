package Day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.worldometers.info/geography/how-many-countries-are-there-in-the-world/");
		driver.manage().window().maximize();
		//scroll till some pixel
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)", "");
		System.out.println(jse.executeScript("return window.pageYOffset;", ""));//2000 pi

		//scroll till some webelement
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Kenya']"));
		jse.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println(jse.executeScript("return window.pageYOffset;", ""));//3113 pi
		
		//scroll till last 
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(jse.executeScript("return window.pageYOffset;", ""));//2000 pi
		Thread.sleep(3000);
		
		//scroll upto initial position
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(jse.executeScript("return window.pageYOffset;", ""));//2000 pi
	}
	
}
