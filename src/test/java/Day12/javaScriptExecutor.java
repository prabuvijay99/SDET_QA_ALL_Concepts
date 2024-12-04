package Day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {
/* alternative for click(),sendkeys() if these methods we are not able to handle 
 * we can use alternative JSE to perform same actions
*/
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// perfer only when getting ElementInterceptedException	
		//JavaScriptExecutor
		
				/*ChromeDriver driver=new ChromeDriver(); 
				JavascriptExecutor js=driver;
				*/
		
		/* normal method
		 * driver.findElement(By.xpath("//input[@id='name']")).sendKeys("dhana");
		 */		
		
		
		// alternate of sendkeys method from javascriptexecutor
		
		WebElement nameInput = driver.findElement(By.xpath("//input[@id='name']"));	
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('value','dhana')", nameInput);
		
		/* normal method of click()
		 * driver.findElement(By.xpath("//input[@id='male']")).click();
		 */
		
		//alternate for click from javascriptexecutor
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='female']"));
		jse.executeScript("arguments[0].click()",radioButton);
	}

}
