package Day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rightClick = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(rightClick).perform();
		driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();
		
		driver.switchTo().alert().accept();
	}

}
