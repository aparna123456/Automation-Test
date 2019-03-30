package JavaMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//maximum methods in action class are overloaded
//double click is also can be used here
public class Actionclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers"); // press any key after launch
		
		Actions obj = new Actions(driver);
	//obj.moveToElement(driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']"))); //by move to element
	obj.clickAndHold(driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']")))
	.release().
	click(driver.findElement(By.xpath("//a[@href='/users/1']"))).build().perform();
	}
}
