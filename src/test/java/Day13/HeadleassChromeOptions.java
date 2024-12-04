package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadleassChromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("web Page Launched");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Headless testing");
		System.out.println("entered the input");
		
		
		
	}

	

}

		

