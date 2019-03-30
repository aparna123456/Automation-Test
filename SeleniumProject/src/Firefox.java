import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args)
	{
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Software\\Driver\\geckodriver.exe"); here we used hard code for Driver.
		//FirefoxDriver driver=new FirefoxDriver();
		//driver.get("http://www.seleniumhq.com");//
		
		
		
		//System.setProperty("webdriver.gecko.driver", ".\\Resources\\geckodriver.exe");// resource folder use in framework.in real practice. 
		System.setProperty("webdriver.gecko.driver", ".\\Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.com");
		
	}

}
