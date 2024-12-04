package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement sliderpos = driver.findElement(By.xpath("//div[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']//span"));
		System.out.println("Slider position: "+sliderpos.getLocation());
		Actions act=new Actions(driver);
		act.dragAndDropBy(sliderpos, 200, 4).perform();
		System.out.println("Slider position after Moving: "+sliderpos.getLocation());
		act.dragAndDropBy(sliderpos, -150, 4).perform();
		System.out.println("Slider position after Moving back: "+sliderpos.getLocation());
		driver.quit();
		
	}

}
