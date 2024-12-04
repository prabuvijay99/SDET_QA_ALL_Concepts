package Day6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sleepDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//gives Nosuchelementexception bcos element not yet load so we need to wait for sometime to load
		
		Thread.sleep(5000); // have more disadvantage not to be used in realtime project
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		
	}

}
