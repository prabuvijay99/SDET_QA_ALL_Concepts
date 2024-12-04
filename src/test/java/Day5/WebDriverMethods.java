package Day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//getCurrentUrl - return the url of the current web page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//getTitle() -returnt he title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//getPageSource() - returns the source of the webpage
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle - returnt the id of the single window
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowsId = driver.getWindowHandles();
		System.out.println(windowsId);
		
		
		
	}

}
