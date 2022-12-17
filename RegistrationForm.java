package bd.com.AutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationForm extends BaseDriver {
	
	@Test (priority = 0)
	public void OpenUrl() throws InterruptedException{
		driver.get(RegistrationLink);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	
	//Question No 1
	
	@Test (priority = 1)
	public void FormFillUp() throws InterruptedException {
		
		//Text field
		WebElement name = driver.findElement(By.id("name"));
		WebElement mobileNumber = driver.findElement(By.id("phone"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement address = driver.findElement(By.id("address"));
		
		
		
		WebElement submit = driver.findElement(By.name("submit"));
		
		
		name.sendKeys("Md Al Imran Shikdar");
		Thread.sleep(2000);
		mobileNumber.sendKeys("01303743739");
		Thread.sleep(2000);
		email.sendKeys("test@email.com");
		Thread.sleep(2000);
		password.sendKeys("123456");
		Thread.sleep(2000);
		address.sendKeys("Uttara, Dhaka, Bangladesh");
		Thread.sleep(2000);
		

		
		submit.click();
		
		Thread.sleep(2000);
		
		
	}
	
	
	//Question No 2
	
	@Test (priority = 3)
	public void DropDownNorway() throws InterruptedException {
		
		//Drop down
		WebElement dropdownItem = driver.findElement(By.className("custom-select"));
		Select select = new Select(dropdownItem);
		select.selectByValue("1");
		
		Thread.sleep(2000);
	}
	
	
	
	
	//Question No 3
	
	@Test (priority = 2)
	public void GenderCheckbox() throws InterruptedException {
		
		//Check box & Gender
		WebElement genderMale = driver.findElement(By.id("male"));
		genderMale.click();
		Thread.sleep(2000);
		
		WebElement tuesdayCheckbox = driver.findElement(By.id("tuesday"));
		WebElement fridayCheckbox = driver.findElement(By.id("friday"));
		
		tuesdayCheckbox.click();
		fridayCheckbox.click();
		
		Thread.sleep(2000);
	}

}
