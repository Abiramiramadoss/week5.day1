package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;
	@BeforeMethod
	public void precondition() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
			 driver = new ChromeDriver();
			driver.get("https://dev36135.service-now.com/navpage.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Abiakr@1606");
			driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
			driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
			Thread.sleep(1000);
	}
	public void postcondition() {
		driver.close();
	}

}
