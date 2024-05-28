package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.chromedriver", "driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement uname=driver.findElement(By.id("firstName"));
		uname.sendKeys("AMAR");
		
		WebElement Lname=driver.findElement(By.id("lastName"));
	Lname.sendKeys("THAKARE");
		
	
	WebElement email=driver.findElement(By.id("userEmail"));
	email.sendKeys("Amarthakare@gmail.com");
	
WebElement radio =driver.findElement(By.xpath("//div[text()='Gender']/../div/div[2]"));
radio.click();

WebElement mobno=driver.findElement(By.xpath("//input[@id='userNumber']"));
mobno.sendKeys("9921168994");
	

WebElement dob=driver.findElement(By.id("dateOfBirthInput"))	;
dob.sendKeys("24 march 2003"); 

//for subject
WebElement sub=driver.findElement(By.id("subjectsContainer"));
sub.sendKeys("s");

//WebElement dropdwn=driver.findElement(By.id("state"));
//Select select=new Select(dropdwn);
//select.selectByVisibleText("Rajasthan");

	}

	

	
	
}
