package Day9;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datePicker2Demo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String Year="2022";
		String Month="Jan";
		String day="31";
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
				
		//select year from drop down
		WebElement getYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year=new Select(getYear);
		year.selectByVisibleText(Year);
		
		//select month from drop down
		WebElement getMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select month=new Select(getMonth);
		month.selectByVisibleText(Month);
		
		//select day from table
		List<WebElement> Dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement date:Dates)
		{
			if(date.getText().equals(day))
			{
				date.click();
				break;
			}
		}
	}
}
