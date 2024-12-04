package Day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class openNewTabandWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindow.get(0));		
		driver.findElement(By.id("APjFqb")).sendKeys("Google Search");
		
		driver.switchTo().window(listWindow.get(1));
		driver.findElement(By.id("name")).sendKeys("Prabha");
	}

}
