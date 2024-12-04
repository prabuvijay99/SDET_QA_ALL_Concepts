package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		// id with tagname
		driver.findElement(By.cssSelector("a#cartur")).click();
		System.out.println("clicked cart");
		
		//xpath
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		System.out.println("Home");
		
		// css -- tagname with attriute and its value
		driver.findElement(By.cssSelector("a[onclick=\"byCat('monitor')\"]")).click();
		System.out.println("Monitor");
		
		// css -- tagname classname with attribute and its value
		driver.findElement(By.cssSelector("a.nav-link[data-target='#exampleModal']")).click();
		System.out.println("contact us");
		
		System.out.println("the end");
	
	}

}
