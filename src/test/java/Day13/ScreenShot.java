package Day13;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File full = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//screenShots//full.png");
		full.renameTo(dest);
		
		WebElement header = driver.findElement(By.xpath("//div[@class='rb_header '] "));
		File head = header.getScreenshotAs(OutputType.FILE);
		File head_d=new File(System.getProperty("user.dir")+"//screenShots//head.png");
		head.renameTo(head_d);
		
		WebElement logoimg = driver.findElement(By.xpath("//img[@alt='redBus' and @class='rb_logo']"));
		File logo = logoimg.getScreenshotAs(OutputType.FILE);
		File iLogo=new File(System.getProperty("user.dir")+"//screenShots//logo.png");
		logo.renameTo(iLogo);
		
		
		
		driver.quit();
				
		
	}

}
