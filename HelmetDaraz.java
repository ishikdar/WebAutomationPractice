package bd.com.AutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HelmetDaraz extends BaseDriver {
	
	@Test (priority = 0)
	public void OpenUrl() throws InterruptedException{
		driver.get(DarazLink);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@Test (priority = 1)
	public void ActionHover() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement automotiveMotorbike = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement motorcycleRidingGear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		
		action.moveToElement(automotiveMotorbike).perform();
		Thread.sleep(2000);
		
		action.moveToElement(motorcycleRidingGear).perform();
		Thread.sleep(2000);
		
		helmet.click();
		Thread.sleep(2000);
		
		
	}

}
