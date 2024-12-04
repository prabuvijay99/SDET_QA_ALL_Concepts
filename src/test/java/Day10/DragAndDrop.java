package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(rome, italy).perform();
		
		
		
		WebElement wash = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement us = driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(wash, us).perform();
	
		
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(madrid, spain).perform();
		
		WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement korea = driver.findElement(By.xpath("//div[@id='box105']"));
		act.dragAndDrop(seoul, korea).perform();
		
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(oslo, sweden).perform();
		

		WebElement stock = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement nor = driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(stock, nor).perform();
		
		WebElement copen = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement den = driver.findElement(By.xpath("//div[@id='box104']"));
		act.dragAndDrop(copen, den).perform();
		
		
		driver.quit();
	}

}
