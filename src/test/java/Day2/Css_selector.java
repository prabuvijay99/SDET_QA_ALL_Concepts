package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("search")).sendKeys("MacBook");
		driver.findElement(By.xpath("//button[@data-lang='en-gb']")).click();
		driver.quit();
		
		
	}

}
