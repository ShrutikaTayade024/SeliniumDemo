package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {

	public static void main(String[] args) throws InterruptedException {
   
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//a[@class='signin']"));
		signin.click();
		
		//username
				driver.findElement(By.id("login1")).sendKeys("Shrutika");
				
				  driver.findElement(By.id("password")).sendKeys("Shruuuuuuuuu");
		//for signin button
		driver.findElement(By.name("proceed")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(1000);
		a.accept();
		driver.switchTo().defaultContent();
		

  
		
		
		
		
		
	}

}
