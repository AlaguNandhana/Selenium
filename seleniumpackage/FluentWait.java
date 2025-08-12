package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 //import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		
		test();
	}
		
		public static void test() {
			
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	//	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		//		.withTimeout(Duration.of)
				
				driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		
		
	}

}
