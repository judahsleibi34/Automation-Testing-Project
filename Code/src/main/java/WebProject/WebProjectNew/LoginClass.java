package WebProject.WebProjectNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class LoginClass {


	public static WebDriver driver;
	private BeforeClass beforeclass;  
	private VariablesWebProject variables;

	public LoginClass() throws Exception {
		beforeclass = new BeforeClass();
		variables = new VariablesWebProject();
	}

	public void SetupClass() throws Exception {
		beforeclass.Setup();  
	}


	// Test case 1- Ability to open URL: 
	public void URLOpenning() throws InterruptedException{ 
		driver = BeforeClass.getDriver();
		driver.get(VariablesWebProject.URL);
		System.out.println("URL oppened");
	} 

	// Test case 2- Ability to login as an Admin with invalid credentials: 
	public void LogInAsAdminNegativePath() throws InterruptedException{ 
		System.out.println("Admin negative");
		Thread.sleep(1500); 

		// UserName
		WebElement username = driver.findElement(By.xpath(VariablesWebProject.UsernameXpath)); 
		username.click(); 
		username.sendKeys(VariablesWebProject.Username); 

		// Password
		WebElement password = driver.findElement(By.xpath(VariablesWebProject.PasswordXpath)); 
		password.click(); 
		password.sendKeys(VariablesWebProject.Password); 
		Thread.sleep(200); 

		// Enter button
		driver.findElement(By.xpath(VariablesWebProject.EnterButton)).click(); 
		Thread.sleep(1500); 

		// Error reader
		VariablesWebProject.Error = driver.findElement(By.xpath(VariablesWebProject.ErrorXpath)).getText(); 

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(VariablesWebProject.Error, VariablesWebProject.ErrorMassage, "Username or Password are wrong can't login, Test passed.."); 

		Thread.sleep(1000); 

	} 

	// Test case 3- Ability to login as an Admin with valid credentials: 
	public void LogInAsAdminHappypath() throws InterruptedException{ 

		Thread.sleep(1500); 

		VariablesWebProject.UsernameText = driver.findElement(By.xpath(VariablesWebProject.UsernameXpathVC)).getText(); 
		VariablesWebProject.Username = VariablesWebProject.UsernameText.split(":")[1].trim(); 

		VariablesWebProject.PasswordText = driver.findElement(By.xpath(VariablesWebProject.PasswordXpathVC)).getText(); 
		VariablesWebProject.Password = VariablesWebProject.PasswordText.split(":")[1].trim(); 

		System.out.println("Username: " + VariablesWebProject.Username); 
		System.out.println("Pasword: " + VariablesWebProject.Password); 


		WebElement username = driver.findElement(By.xpath(VariablesWebProject.UsernameXpath)); 
		username.click(); 
		username.sendKeys(VariablesWebProject.Username); 

		WebElement password = driver.findElement(By.xpath(VariablesWebProject.PasswordXpath)); 
		password.click(); 
		password.sendKeys(VariablesWebProject.Password); 
		Thread.sleep(200); 
		driver.findElement(By.xpath(VariablesWebProject.LogInButtonXpath)).click(); 

		Thread.sleep(1000); 


		try { 

			Thread.sleep(500); 
			VariablesWebProject.Error = driver.findElement(By.xpath(VariablesWebProject.ErrorXpath)).getText(); 

			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotEquals(VariablesWebProject.Error, VariablesWebProject.ErrorMassage, "Username or Password are wrong -_-"); 

		} 


		catch(Exception e) {} 

		Thread.sleep(1000); 

	} 

}


