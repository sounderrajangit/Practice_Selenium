package selenium.classes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Class1 extends Browserlaunch {
	Browserlaunch al = new Browserlaunch();
	
	static WebDriver driver;
	public static void main(Parc[] args) throws InterruptedException {
   
		driver.get("https://www.google.com");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("test");

		Thread.sleep(3000);

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbtc']"));

		// System.out.println(list.size());

		for (int i = 0; i <= list.size(); i++) {

			if (list.get(i).getText().contains("testosterone")) {

				list.get(i).click();
				break;
			}
		}

	}

}
