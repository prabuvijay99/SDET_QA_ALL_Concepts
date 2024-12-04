package Day14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().minimize();
		int noOFBrokenLinks = 0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
	
		for(WebElement link:links)
		{
			String linkValue = link.getAttribute("href");
			
			if (linkValue.isEmpty() || linkValue==null)
			{
				System.out.println(linkValue + "dont have attribute not possible to check");
				continue;
			}
			
			try
			{
				URL urllink=new URL(linkValue);
				HttpURLConnection connection=(HttpURLConnection) urllink.openConnection();
				connection.connect();
				if (connection.getResponseCode()>= 400)
				{
					System.out.println(linkValue +": Broken Link");
					noOFBrokenLinks++;
					
				}
				else
				{
					System.out.println(linkValue +": Not Broken Link");
				}
			} 
			catch(Exception e)
			{
				
			}
			
		}
		System.out.println(noOFBrokenLinks);
		}	
		
	}


