package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FORM_Automate {

	public static void main(String[] args) {
	
		System.setProperty("webdrriver.chrome.driver", "driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	     driver.manage().window().maximize();
	  
	     //for firstname
	    WebElement fname=driver.findElement(By.name("firstname"));
	    fname.sendKeys("Shrutika");
	    
	    //for lastname
	    WebElement Lname=driver.findElement(By.name("lastname"));
	    Lname.sendKeys("Tayade");
	    
	   // for Gender 
	  driver.findElement(By.id("sex-1")).click();
	  //for Experience
	  driver.findElement(By.id("exp-0")).click();
  //div[@style='font-family:verdana,helvetica,arial,verdana,sans-serif;font-size:14px;margin-bottom:10px;padding:0']
	 
	  //for date
	  WebElement date=driver.findElement(By.id("datepicker"));
	date.sendKeys("12-3-2024");
	//  driver.findElement(By.id("datepicker")).click();
//      driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
	  
	//for Proffesion
	  driver.findElement(By.id("profession-1")).click();
	  
	  
	  //tool
	  driver.findElement(By.id("tool-2")).click();
	   driver.findElement(By.id("tool-2")).click();
	  
	
	//for content
	
	  

	}

}
