package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		username.submit();
//		Thread.sleep(1000);
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
//		password.submit();
	//	Thread.sleep(1000);
		
		WebElement button=driver.findElement(By.id("login-button"));
		button.click();
		
		
		WebElement text=driver.findElement(By.linkText("Sauce Labs Backpack"));
		text.click();
		
		WebElement cart=driver.findElement(By.linkText("ADD TO CART"));
		cart.click();
		
		
		
		
	}

}
