package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDOwn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
	//	WebElement Select_xpath=driver.findElement(By.xpath("//select[@id='pet-select']"));
		
		WebElement Select_xpath=driver.findElement(By.id("pet-select"));
		

		
		
		Select Select_Pet=new Select(Select_xpath);
		
		System.out.println("hi");
		Select_Pet.selectByIndex(1);
		//Select_Pet.selectByValue("parrot");
		//Select_Pet.selectByVisibleText("Spider");
		
		driver.manage().window().minimize();
	}

}
