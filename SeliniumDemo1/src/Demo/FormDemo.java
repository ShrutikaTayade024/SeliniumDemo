package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormDemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.drive.chrome", "driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Lenovo/OneDrive/Desktop/SeliniumHTMLDemo/forms/index.html?fname=Shruti&Mname=Pradip&Lname=Tayade&Female=on&mobno=9359371306&Adress=at-kolha+ta-achalpur+dist-Amaravati&email=Shru%40gmail.com");
	driver.manage().window().maximize();
	
	WebElement fname=driver.findElement(By.name("fname"));
	fname.sendKeys("Amruta");
	

	WebElement mname=driver.findElement(By.name("Mname"));
	mname.sendKeys("Mangesh");
	
	WebElement lname=driver.findElement(By.name("Lname"));
	lname.sendKeys("Lokhande");
	
	WebElement mnam=driver.findElement(By.id("course"));
Select dropdown = new Select(mnam);  
dropdown.selectByVisibleText("Ruby");  
//	Select dropdown = new Select(driver.findElement(By.id("course")));  
//	dropdown.selectByVisibleText("Python");
	
	driver.findElement(By.xpath("//input[@id='Female']"));

  
	
	
	}
	

}
