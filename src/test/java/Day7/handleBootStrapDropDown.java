package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//select single drop down
		
		driver.findElement(By.xpath(" //input[@value='Angular']")).click();
		
		// all drop downs
		
		List<WebElement> dropdowns = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		System.out.println("Size of the dropdown: "+ dropdowns.size());
		
		
		for(WebElement dp:dropdowns)
		{	
			dp.click();
			System.out.println(dp.getText());
			
		}
		
		
		// select multiple dropdown
		for(WebElement dp1:dropdowns)
		{	
			
			String text = dp1.getText();
			if(text.equals("Java") || text.equals("Python") || text.equals("MySQL"))
			{
				dp1.click();
			}
			
		}
		
		

	}

}
