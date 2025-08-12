package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1 {

		public static void main(String[] args) throws InterruptedException {
			
		
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.selenium.dev/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.quit();
		}

	}
