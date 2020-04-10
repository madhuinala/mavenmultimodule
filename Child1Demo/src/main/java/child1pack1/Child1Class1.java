package child1pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child1Class1 {
	
	public WebDriver driver = null;
	
	public WebDriver child1Method1(String browser){
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}else{
			/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/driver/geckodriver.exe");
			driver = new FirefoxDriver();*/
			System.out.println("Firefox driver not found");
		}
			
		
		System.out.println(System.getProperty("env"));
		
		return driver;
	}
}
