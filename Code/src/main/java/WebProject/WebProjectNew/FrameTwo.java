package WebProject.WebProjectNew;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameTwo {

	public WebDriver driver;
	private FrameOne frameone;  
	private VariablesWebProject variables;


	public void CancelButtonCheker(String ExpectedUserRole, String ExpectedEmployeeName, String ExpectedStatus, String ExpectedUserName, String ExpectedPassword, String ExpectedConfirmpassword) throws InterruptedException{ 
		
		driver = FrameOne.getDriverFrameOne();
		Thread.sleep(500); 

		WebElement PIMWE = driver.findElement(By.xpath(VariablesWebProject.PIM)); 
		PIMWE.click(); 
		Thread.sleep(1000); 

		WebElement AddButtonWe = driver.findElement(By.xpath(VariablesWebProject.AddButtonXpathPIM)); 
		AddButtonWe.click(); 
		Thread.sleep(1000); 

		String[] StringParsed = ExpectedEmployeeName.split(" "); 

		WebElement EmployeeFirstName = driver.findElement(By.xpath(VariablesWebProject.FirstName)); 
		EmployeeFirstName.click(); 
		EmployeeFirstName.sendKeys(StringParsed[0]); 
		Thread.sleep(1000); 

		WebElement EmployeeID= driver.findElement(By.xpath(VariablesWebProject.ID)); 
		EmployeeID.sendKeys(Keys.DELETE); 
		EmployeeID.click(); 

		Thread.sleep(1000); 
		EmployeeID.sendKeys(VariablesWebProject.ConstantToSend); 
		Thread.sleep(1000); 

		WebElement EmployeeMidleName = driver.findElement(By.xpath(VariablesWebProject.MidleName)); 
		EmployeeMidleName.click(); 
		EmployeeMidleName.sendKeys("No data given"); 
		Thread.sleep(1000); 

		WebElement EmployeeLastName = driver.findElement(By.xpath(VariablesWebProject.LastName)); 
		EmployeeLastName.click(); 
		EmployeeLastName.sendKeys(StringParsed[1]); 
		Thread.sleep(1000); 

		WebElement ButtonSliderWe= driver.findElement(By.xpath(VariablesWebProject.ButtonSlider)); 
		ButtonSliderWe.click(); 

		Thread.sleep(1000); 
		WebElement UserNameAddWE = driver.findElement(By.xpath(VariablesWebProject.UserNameAdd)); 
		UserNameAddWE.click(); 
		UserNameAddWE.sendKeys(VariablesWebProject.NameToSend); 

		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,400)", ""); 
		Thread.sleep(1500); 

		WebElement PassWordADDWE = driver.findElement(By.xpath(VariablesWebProject.PassWordADD)); 
		PassWordADDWE.click(); 
		PassWordADDWE.sendKeys(VariablesWebProject.PasswordToSend); 
		Thread.sleep(1000); 

		if(ExpectedStatus == "Disabled") { 
			WebElement ListStatus= driver.findElement(By.xpath(VariablesWebProject.StatusXpathDiabledPIM)); 
			ListStatus.click(); 
		} 


		Thread.sleep(1000);
		WebElement PassWordConfirmationWE = driver.findElement(By.xpath(VariablesWebProject.PassWordConfirmation)); 
		PassWordConfirmationWE.click(); 
		PassWordConfirmationWE.sendKeys(VariablesWebProject.PasswordToSend); 
		Thread.sleep(1000); 

		driver.findElement(By.xpath(VariablesWebProject.SavePIM)).click(); 
	}
}