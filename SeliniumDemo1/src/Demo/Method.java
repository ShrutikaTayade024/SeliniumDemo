package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");

		  String text1 = driver.getTitle();
	       System.out.println("returns title of webpage " + text1);


	       String text2 = driver.getCurrentUrl();
	       System.out.println(text2);
	}

}
