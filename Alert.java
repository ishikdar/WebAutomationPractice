package bd.com.AutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Alert extends BaseDriver {
	
	@Test (priority = 0)
	public void OpenUrl() throws InterruptedException{
		driver.get(AlertLink);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	
	@Test (priority = 1)
	public void AlertAssertion() throws InterruptedException {
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
		
		jsAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String resultText1 = resultText.getText();
		Assert.assertEquals(resultText1, "You successfully clicked an alert");
		Thread.sleep(3000);
		
		
		SoftAssert softAssert = new SoftAssert();
		jsConfirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		String resultText2 = resultText.getText();
		softAssert.assertEquals(resultText2, "You clicked: Cancel");
		Thread.sleep(3000);
		
		
		jsPrompt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Imran");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String resultText3 = resultText.getText();
		Assert.assertEquals(resultText3, "You entered: Imran");
		Thread.sleep(3000);
		
		softAssert.assertAll();		
	}
	

}
