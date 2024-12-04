package Day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFiles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
	
		/*	// to upload single file
		driver.findElement(By.id("filesToUpload"))
		.sendKeys("C:\\Users\\Prabhakaran Chandran\\Documents\\test1.txt");
		// verification
		
		String fileName = driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
		if(fileName.equals("test1.txt"))
		{
			System.out.println("file uploaded successfully");
		}
		else
		{
			System.out.println("File uploaded failed");
		}
	*/	
		String file1 = "C:\\Users\\Prabhakaran Chandran\\Documents\\test1.txt";
		String file2 = "C:\\Users\\Prabhakaran Chandran\\Documents\\test2.txt";
		
		driver.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2);
		
		int size = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if (size==2)
		{
			System.out.println("all files are uploaded");
		} else {
			System.out.println("Not uploaded correctly");
		}
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("test1.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("test.txt"))
		{
			System.out.println("Correct files are uploaded");
		}else {
			System.out.println("Wrong files are uploaded");
		}
	}

}
