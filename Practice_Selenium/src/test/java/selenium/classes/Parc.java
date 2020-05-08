package selenium.classes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parc {

	public static void main(String[] args) {

		String s1 = "kanak";
		String s2 = "raj2an";
		
		ArrayList l = new ArrayList();
		

		
		WebDriver driver= new FirefoxDriver();
		driver.findElement(By.id("")).getText();
		
		
	

		for (int i = 0; i <= s2.length() - 1; i++)
			if (Character.isDigit(s2.charAt(i))) {
				System.out.println(s2.charAt(i));
			}

		char[] ar = s2.toCharArray();
		System.out.println(ar[0]);
		String t = "";

		// Thread.sleep(1000);

		for (int i = s1.length() - 1; i >= 0; i--) {

			t = t + s1.charAt(i);

		}

		System.out.println(t);

		if (t.equals(s1)) {

			System.out.println("palandrom");
		} else {

			System.out.println("not palandrom");
		}

	}

}
