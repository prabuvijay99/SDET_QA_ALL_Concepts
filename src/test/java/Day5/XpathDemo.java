package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		// Xpath with Single attribute
		driver.findElement(By.xpath("//*[@data-csa-c-content-id='nav_cs_bestsellers']")).click();
		
		// Xpath with text() method
		driver.findElement(By.xpath("//a[text()='Electronics']")).click();
		
		//Xpath with Multiple attriute
		driver.findElement(By.xpath("//a[@class='nav-a  '][@data-csa-c-content-id='nav_cs_mobiles']")).click();
		
//		mutliple attributes using 'and' and 'or'
		String output = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal' and text()='Samsung Original 25W Type-C Travel Adaptor without Cable, White']")).getText();
		System.out.println(output);
		
		driver.findElement(By.xpath("(//a[@aria-current='step' or @class='a-color-base a-link'])[4]")).click();
		String amt = driver.findElement(By.xpath("//span[@class='a-size-extra-large a-color-base a-text-bold']")).getText();
		System.out.println(amt);
		
		
	}

}
