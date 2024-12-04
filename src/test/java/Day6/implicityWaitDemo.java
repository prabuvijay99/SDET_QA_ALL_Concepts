package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicityWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		// impilcity wait is better option than thread.sleep 
		// it need to declare once it is active until driver will get close it will take care all line of codes
		// only disadvantage is if the element takes long time to load at that time it will fail
		// for ex we have given time as 5 sec but element takes more than 5 ssecs means it will give noSuchElementException
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
			
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		
			}

}


