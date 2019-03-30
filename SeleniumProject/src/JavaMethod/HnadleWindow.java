package JavaMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HnadleWindow {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");

		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.tagName("h3")).getText();
	//	System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> WindowId=driver.getWindowHandles();
		Iterator<String> id=WindowId.iterator();
	
		while(id.hasNext()) {
			String lastid= id.next();
			System.out.println(lastid);
			
			driver.switchTo().window(lastid);
			
			driver.findElement(By.tagName("h3")).getText();
			System.out.println(driver.findElement(By.tagName("h3")).getText());

		}
	
			}

}
