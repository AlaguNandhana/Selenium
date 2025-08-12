package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/login/");
		WebElement login = driver.findElement(By.id("loginbutton"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(login);
		actions.build().perform();
		System.out.println("Done");
		Thread.sleep(3000);
	
	}

}
