import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//Resources//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");

	}

}
