package tagName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class browserSelect {
	
	private static browserSelect var=null;
	private WebDriver driver;
	
	public browserSelect(){}
	
	public static browserSelect getinstance()
	{
		if (var==null)
		{
			var=new browserSelect();
		
		}
		return var;
	}
	
	public WebDriver getBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
				{
			System.setProperty("webdriver.firefox.marionette","src\\main\\resources\\selenium-server-standalone-3.0.0-beta3");
				driver=new FirefoxDriver();
				}
		else if(browser.equalsIgnoreCase("chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
	}
		return driver;
		}
	
	
}
