package JavaMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers"); // press any key after launch
		
		Actions obj = new Actions(driver);
		//obj.keyDown(Keys.CONTROL).pause(1000).sendKeys(Keys.ENTER).build().perform(); // for combine action eg. control & entre
		obj.moveToElement(driver.findElement(By.xpath("//img[@alt='User Avatar'][1]")))
		.click(driver.findElement(By.xpath("//a[@href='/users/1']"))).build().perform();
		
		obj.contextClick().click().perform(); // for right click mouse
		//driver.findElement(By.linkText("Nested Frames")).click();
		
	}

}
