package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_Log_In {

	public static void main(String[] args) {
	System.out.println("Hello");
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  WebElement email=driver.findElement(By.id("email"));
  email.sendKeys("");

	}

}
