package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		// Simple Alert
     driver.findElement(By.id("alertButton")).click();
		//confirm Button
    	driver.findElement(By.id("confirmButton")).click();
		//prompt
		driver.findElement(By.id("promtButton")).click();
		Alert a = driver.switchTo().alert();
	a.sendKeys("Shrutii");
	     a.accept();
		System.out.println(a.getText());
		//alert shows after 5second
	driver.findElement(By.id("timerAlertButton")).click();


		
//	   a.accept();
		
	

	}

}
