package week5.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
public class DeleteIncident extends BaseClass {
@Test
public void deleteIncident() throws InterruptedException {
		
			driver.findElement(By.xpath("//div[text()='Open']")).click();
			//driver.switchTo().defaultContent();
			
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("(//table[@id='incident_table']//tr[2])[2]/td[3]/a")).click();
			driver.switchTo().defaultContent();
			
			
					
			//Delete the incident
			driver.switchTo().frame("gsft_main");
			String innum = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
			System.out.println(innum);
			driver.findElement(By.id("sysverb_delete_bottom")).click();
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//button[@id='ok_button']")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(innum,Keys.ENTER);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("gsft_main");
			String result = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
			System.out.println(result);
			driver.switchTo().defaultContent();
			if (result.contains("No records")) {
				System.out.println("Incident deleted successfully");
				
			}
			else
			{
				System.out.println("Incident not deleted");
			}
			
			
		
			

	}

}
