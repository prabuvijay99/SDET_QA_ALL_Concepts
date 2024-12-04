package Day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker1Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://dummy-tickets.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.xpath("//a[@class='s_tab_btn nav-link active']")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//input[@id='dp1728887808713']")).click();
		
		
		

	}

}
