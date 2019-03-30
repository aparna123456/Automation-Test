package JavaMethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//Resources//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", ".\\Resources\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		//button[@onclick='jsAlert()']
		
		Alert obj=driver.switchTo().alert();
		System.out.println(obj.getText());
		obj.accept();
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		System.out.println(obj.getText());
		obj.dismiss();
		
		//button[@onclick='jsConfirm()']//
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		System.out.println(obj.getText());
		obj.sendKeys("aparna");
		
		//button[@onclick='jsPrompt()']
		
		}

}
