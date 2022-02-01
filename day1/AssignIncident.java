package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class AssignIncident extends BaseClass {
@Test
public void assignIncident() throws InterruptedException {
		 
			//driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//div[text()='Open']")).click();
			//driver.switchTo().defaultContent();
			
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("(//table[@id='incident_table']//tr[2])[2]/td[3]/a")).click();
			driver.switchTo().defaultContent();
			
			// Assign the incident to  Software group
			driver.switchTo().frame("gsft_main");
			String innum = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
			System.out.println(innum);
			WebElement assign = driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']"));
			assign.click();
			driver.switchTo().defaultContent();
			Set<String> w = driver.getWindowHandles();
			List<String>list=new ArrayList<String>(w);
			driver.switchTo().window(list.get(1));
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Software",Keys.ENTER);
			driver.findElement(By.xpath("//a[text()='Software']")).click();
			driver.switchTo().window(list.get(0));
			
			
			// Update the incident with Work Notes
			
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys("The incident is assigned to software group");
		
			driver.findElement(By.xpath("(//button[@class='form_action_button  action_context btn btn-default'])[1]")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(innum,Keys.ENTER);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("gsft_main");
			String attribute = driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']")).getAttribute("Value");
			System.out.println(attribute);
			driver.switchTo().defaultContent();
			if(attribute.contains("Software"))
				System.out.println(" Assignment group is Software");
			else
				System.out.println("Assigned not Software group");

	}

}
