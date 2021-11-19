package artifacts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	@Test
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/webdrivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());
	
	}
	
}
