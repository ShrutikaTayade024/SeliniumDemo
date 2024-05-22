package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Insta_login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("__itz_shru__");
		
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Shrutika@123");
		
		
	}
}
