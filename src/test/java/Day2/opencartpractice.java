package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencartpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubeb
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Shirts");
		driver.findElement(By.cssSelector("div.nav-search-submit ")).click();
		driver.wait(1000);
		driver.findElement(By.cssSelector("span.a-button[id='a-autoid-7']")).click();

	}

}
