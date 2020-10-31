package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public WebDriver driver;
	
	//default setup
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	public void test()
	{
		//get website
		driver.get("https://www.facebook.com/");
	}
	
}
