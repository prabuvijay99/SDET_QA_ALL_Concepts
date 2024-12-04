package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		driver.manage().window().maximize();
		System.out.println("Display Status :"+ status);

		boolean enabled = driver.findElement(By.id("small-searchterms")).isEnabled();
		System.out.println("search bo is enabled :" + enabled);
		
		
		if (enabled == true)
				{
			driver.findElement(By.id("small-searchterms")).sendKeys("Commerce");
				}
			
		boolean selected = driver.findElement(By.xpath("//input[contains(@id,'male')]")).isSelected();
		System.out.println("gender selected :"+selected);
		
	}

}
