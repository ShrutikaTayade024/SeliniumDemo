package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ajio_ecommerse {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome", "driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginAjio")).click();
		
	//enter mobno
		driver.findElement(By.name("username")).sendKeys("9359371306");
		driver.findElement(By.className("login-btn")).click();
		
		//male/female
		driver.findElement(By.id("gender1")).click();
		
	}

}
