package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDom {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().minimize();

		SearchContext shadowRoot = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		WebElement element = shadowRoot.findElement(By.cssSelector("input#input"));
		element.sendKeys("Welcome Shadom Dom");
	}

}
