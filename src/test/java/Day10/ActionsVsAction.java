package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement rightClick = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		
		Actions act=new Actions(driver);
		// stored created action in a variable -- Action
		Action buildAction = act.contextClick(rightClick).build();
		 // perform the mouse action
		buildAction.perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();

	}

}
