package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdrriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");

		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys("__itz_shru__");
		
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("Shrutika@123");
		
		WebElement btn=driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
		btn.click();
	// Take ScreenShot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ((TakesScreenshot) ts).getScreenshotAs(OutputType.FILE);

		File des = new File("D:\\SeliniumScreenShot\\insta.png");
        FileHandler.copy(src, des);
		System.out.println("Done");
	}

}
