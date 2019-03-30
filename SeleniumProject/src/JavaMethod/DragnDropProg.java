package JavaMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropProg {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/drag_drop.html"); // press any key after launch
			
			Actions obj = new Actions(driver);
			//obj.dragAndDrop(driver.findElement(By.xpath("//li[@data-id='2']/a")),driver.findElement(By.xpath("//ol[@id='amt7']"))).build().perform();
	// its not mandaary it will always work so used below code
			
		//	obj.clickAndHold(driver.findElement(By.xpath("//li[@data-id='2']/a"))).moveToElement(driver.findElement(By.xpath("//ol[@id='amt7']"))).build().perform(); 
			// use released.build.perform to released the value
		
			/*obj.clickAndHold(driver.findElement(By.xpath("//li[@data-id='2']/a"))).moveToElement(driver.findElement(By.xpath("//ol[@id='amt7']")))
			.release().build().perform();*/
			
			obj.clickAndHold(driver.findElement(By.xpath("//li[@data-id='2']/a"))).moveToElement(driver.findElement(By.xpath("//ol[@id='amt7']"))).release()
			.build().perform();
			
	}

}
