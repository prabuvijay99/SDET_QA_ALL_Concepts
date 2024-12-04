package Day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// get the row size of the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		// get the columns of the table
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		
		System.out.println("The number of Rows in the table :"+rows.size());
		System.out.println("The number of Columns in the table :"+columns.size());
		
		// get a particular data in the table
		WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[1]"));
		System.out.println(data.getText());
		
		// get all data in the table
		
		for(int row=2;row<=rows.size();row++)
		{
			for(int column=1;column<=columns.size();column++)
			{
				WebElement data1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+column+"]"));
				System.out.print(data1.getText()+"\t\t");
			}
			System.out.println();
		}
		
		
		for(int row=2;row<=rows.size();row++)
		{
			for(int column=1;column<=columns.size();column++)
			{
				WebElement data1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+column+"]"));
				String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td[2]")).getText();
				if(authorName.equals("Mukesh"))
				{
					System.out.print(data1.getText()+"\t\t");
				}
				
			}System.out.println();
			
		}
		int total = 0;
		for(int row=2;row<=rows.size();row++)
		{
			
			String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td[4]")).getText();
			int amount = Integer.parseInt(text);
			total=total+amount;
		

	}
		System.out.println(total);

}
}
