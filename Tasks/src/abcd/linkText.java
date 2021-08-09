package abcd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\rm21174\\Desktop\\Files\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    //Opening the air bnb Goa homestays page
	    driver.get("https://www.airbnb.co.in/s/Goa/all");
	    
	    //locating an element via link text in Selenium now, and clicking on that stay
	    driver.findElement(By.linkText("Standard One Bedroom Suite with Pool &amp; Jacuzzi")).click();
	 
	            driver.quit();
	}

}
