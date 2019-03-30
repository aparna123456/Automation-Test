package JavaMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/drag_drop.html"); // press any key after launch
			
			Actions obj = new Actions(driver);
			
			WebElement source = driver.findElement(By.xpath("//a[@class='button button-orange'][text()=' 5000 ']"));
			WebElement destination = driver.findElement(By.xpath("//ol[@id='amt7']"));
			
			
			obj.dragAndDrop(source, destination).build().perform();
			
			
		//	obj.dragAndDrop(driver.findElement(By.xpath("//a[@class='button button-orange'][text()=' 5000 ']")),driver.findElement(By.xpath("//ol[@id='amt7']"))).build().perform();
			
/*	obj.clickAndHold(driver.findElement(By.xpath("//a[@class='button button-orange']")))
	.moveToElement(driver.findElement(By.xpath("//ol[@id='amt7']"))).release().build().perform();*/
		
	}

}
