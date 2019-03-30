package JavaMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");

		driver.findElement(By.linkText("Frames")).click();
		
		driver.findElement(By.tagName("h3")).getText();
		
		driver.findElement(By.linkText("iFrame")).click();
			
			driver.findElement(By.tagName("h3")).getText();
			System.out.println(driver.findElement(By.tagName("h3")).getText());
			
			driver.findElement(By.id("mceu_16-open")).click();
			
			driver.switchTo().frame(0); // SWITHCH FRAME
			
			driver.findElement(By.tagName("P")).getText();
			System.out.println(driver.findElement(By.tagName("P")).getText());
			


	}

}
