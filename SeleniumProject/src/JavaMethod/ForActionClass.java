package JavaMethod;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class ForActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses"); // press any key after launch
		
		Actions obj = new Actions(driver);
		//obj.keyDown(Keys.entre).perform(); // keydown uses only for alt, shift, control key
//	obj.keyDown(Keys.CONTROL).perform(); // to perform single action
		//Thread.sleep(1000); // delete thread
		obj.keyDown(Keys.CONTROL).pause(1000).sendKeys(Keys.ENTER).build().perform(); // for combine action eg. control & entre
	
		//obj.sendKeys(Keys.ENTER).perform(); // for other use send keys
		
	//	obj.keyDown(keys.copy).build.perform();
		

	}

}
