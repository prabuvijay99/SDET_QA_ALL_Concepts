package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//click on PIM
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();
		
		//click on dropdown
		driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[4]//div")).click();
		Thread.sleep(5000);
		
		// single element click
		//driver.findElement(By.xpath("//span[normalize-space()='Administration']")).click();
		
		//all 
		
		List<WebElement> dds = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(dds.size());
		
		for(WebElement drop:dds)
		{
			System.out.println(drop.getText());
		}

	}

}
