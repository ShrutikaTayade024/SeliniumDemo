package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglab_BY_XPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@name='user-name']"));     //username XPATH
		username.sendKeys("standard_user");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));      //password XPATH
		pass.sendKeys("secret_sauce");
		
	    //button XPATH
		WebElement button=driver.findElement(By.xpath("//input[@id='login-button']"));  
		button.click();
		
		//for click on link
		WebElement openjacket=driver.findElement(By.xpath("//a[@id='item_5_title_link']"));  
		openjacket.click();
		
		Thread.sleep(100);
		
		//String str=driver.getWindowHandle();
		//driver.switchTo().window(str);
		
		//for ADD to cart
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click(); 
		
	
		//check cart
	WebElement chkcart=driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));  
	chkcart.click();
	
	driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();  //checkout
	
	
	
	WebElement name=driver.findElement(By.id("first-name"));    
	name.sendKeys("Shrutika");
	
	WebElement Lname=driver.findElement(By.id("last-name"));    
	Lname.sendKeys("Tayade");
	

	WebElement zipcode=driver.findElement(By.id("postal-code"));    
	zipcode.sendKeys("444808");
	
	driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();  //sublit

	driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();  //finish

	}

}
