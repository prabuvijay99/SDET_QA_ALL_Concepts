package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
			
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); // switch to frame 1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frames Learning!!!");
		
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2); // switch to frame 1
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Switching the frames!!!");

		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3); // switch to frame 1
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Third Frame!!!");
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//div[@data-value='I am a human']")).click();
		driver.findElement(By.xpath("//div[@data-answer-value='Web Testing']")).click();
	
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4); // switch to frame 1
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Fourth Frame!!!");
		
			
		
	}

}
