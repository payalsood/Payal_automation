package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyClass {
	

	
@Test
public void login(){
System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
System.out.println(System.getProperty("webdriver.chrome.driver"));
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("palli_pink@yahoo.com");
driver.findElement(By.id("pass")).sendKeys("fdfds");
driver.findElement(By.id("loginbutton")).click();

}
}

