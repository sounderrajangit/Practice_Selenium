package selenium.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlaunch {
	 

	public  void chrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sounderrajan.jothi\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

	public  void firefox() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\sounderrajan.jothi\\Desktop\\Drivers\\geckodriver-v0.26.0-win64\\gecko.exe");
		WebDriver driver = new FirefoxDriver();
	}

}
