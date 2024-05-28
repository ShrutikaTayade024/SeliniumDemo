package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {

//		System.setProperty("webriver.driver.chrome", "driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.check-plagiarism.com/#google_vignette");
//		driver.manage().window().maximize();
//		WebElement d=driver.findElement(By.xpath("//p[text()='Upload File']"));
//		d.click();
//		d.sendKeys("C:\\Users\\Lenovo\\Downloads");
		
		
		
		System.setProperty("webriver.driver.chrome", "driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/upload-download");
	driver.manage().window().maximize();
	
	WebElement D=driver.findElement(By.id("uploadFile"));
	D.sendKeys("D:\\css.txt");
		
	}

}
