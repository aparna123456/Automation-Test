package JavaMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameEx {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");

		driver.findElement(By.linkText("Nested Frames")).click();
		
		//driver.findElement(By.tagName("h3")).getText();
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset//frame[@name='frame-top']")));				// SWITHCH FRAME
		
		driver.switchTo().frame(driver.findElement((By.xpath("//frameset//frame[@name='frame-middle']"))));
		//driver.findElement(By.tagName("body"));
		System.out.println(driver.findElement(By.tagName("body")).getText());
			
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset//frame[@name='frame-bottom']")));
			System.out.println(driver.findElement(By.tagName("body")).getText());
		
	// plz chek with pankaj as error bcz of parentFrame 
		
	}

}
