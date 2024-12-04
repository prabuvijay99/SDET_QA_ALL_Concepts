package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceShadowDOM {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
		
		SearchContext shadowRoot = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		WebElement element1 = shadowRoot.findElement(By.cssSelector("span#shadow-element"));
		System.out.println(element1.getText());
		
		
		SearchContext shadowRoot2 = shadowRoot.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		WebElement element2 = shadowRoot2.findElement(By.cssSelector("span#nested-shadow-element"));
		System.out.println(element2.getText());
	
		SearchContext shadowRoot3 = shadowRoot2.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		WebElement element3 = shadowRoot3.findElement(By.cssSelector("#multi-nested-shadow-element"));
		System.out.println(element3.getText());
	}

}
