package Day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkNewTabusingKeyboardActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.merriam-webster.com/dictionary/links");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement registerLink = driver.findElement(By.xpath("//a[@id='mw-global-nav-games-quizzes']"));
		//opening the new tab using click control
		act.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();
		//set will not have get index so need to convert to List
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindow.get(1));
		WebElement element = driver.findElement(By.id("gtm-gamesnav-link-toplogo"));
		System.out.println(element.getAttribute("title"));
		
		driver.switchTo().window(listWindow.get(0));
		driver.findElement(By.xpath("//input[@id='search-term']")).sendKeys("Nice Work Done!!!");

	}

}
