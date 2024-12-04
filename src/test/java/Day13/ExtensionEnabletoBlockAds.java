package Day13;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ExtensionEnabletoBlockAds {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Users\\Prabhakaran Chandran\\Downloads\\uBlock.crx");
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputText1")).sendKeys("Welcome");
		Actions act=new Actions(driver);
		//pressing CTRL+A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		//CTRL+C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		//TAG
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		//CTRL+V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();


	}

}
