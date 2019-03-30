import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	
	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.ie.driver", "D:\\Software\\Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");*/
		
		System.setProperty("webdriver.ie.driver", ".\\Resources\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://www.facebook.com");
		
System.setProperty("", "");

	}

}
