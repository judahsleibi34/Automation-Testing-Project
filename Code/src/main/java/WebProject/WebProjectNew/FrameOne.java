package WebProject.WebProjectNew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class FrameOne {

	public static WebDriver driver;
	private BeforeClass beforeclass;  
	private VariablesWebProject variables;

	public String ExpectedEmployeeName;

	// Entering the Admin page
	public void AdminFrameOpen() throws Exception{ 

		driver = LoginClass.driver;

		Thread.sleep(500);
		variables = new VariablesWebProject();
		driver.findElement(By.xpath(VariablesWebProject.AdminFrameXpath)).click(); 

	}

	// Adding Users
	public void UserAdding(String ExpectedUserRole, String ExpectedEmployeeName, String ExpectedStatus, String ExpectedUserName, String ExpectedPassword, String ExpectedConfirmpassword) throws InterruptedException{ 

		Thread.sleep(500); 

		// Data handling
		ExpectedEmployeeName = ExpectedEmployeeName.substring(0, ExpectedEmployeeName.length() - 1); 
		System.out.println("Expected UserRole: " + ExpectedUserRole); 
		System.out.println("Expected Employee Name: " + this.ExpectedEmployeeName); 
		System.out.println("Expected Status: " + ExpectedStatus); 
		System.out.println("Expected Username: " + ExpectedUserName); 
		System.out.println("Expected Password: " + ExpectedPassword); 
		System.out.println("Expected Confirm password: " + ExpectedConfirmpassword); 

		String EmployeeNameXpathSelection = "//div[contains(@class, 'oxd-autocomplete-option')]//span[contains(text(), '" + ExpectedEmployeeName + "')]"; 

		WebElement AddButton= driver.findElement(By.xpath(VariablesWebProject.AddButtonXpath)); 
		AddButton.click(); 

		// Drop down list opening
		Thread.sleep(1000); 
		WebElement ListUserRole = driver.findElement(By.xpath(VariablesWebProject.DropDownListUserRole)); 
		ListUserRole.click(); 

		// User mode selection
		if(ExpectedUserRole.equals("ESS"))  
		{ 
			WebElement ESSPlaceHolder = driver.findElement(By.xpath(VariablesWebProject.UserRoleXpathESS)); 
			ESSPlaceHolder.click(); 
		} 

		if(ExpectedUserRole == "Admin") { 
			WebElement AdminPlaceHolder = driver.findElement(By.xpath(VariablesWebProject.UserRoleXpathAdmin)); 
			AdminPlaceHolder.click(); 
		} 

		Thread.sleep(1000); 
		WebElement ListUser = driver.findElement(By.xpath(VariablesWebProject.DropDownListStatus)); 
		ListUser.click(); 

		// Status selection 
		if(ExpectedStatus.equals("Enabled"))  
		{ 
			WebElement ListStatus= driver.findElement(By.xpath(VariablesWebProject.StatusXpathEnabled)); 
			ListStatus.click(); 
		} 

		if(ExpectedStatus == "Disabled") { 
			WebElement ListStatus= driver.findElement(By.xpath(VariablesWebProject.StatusXpathDiabled)); 
			ListStatus.click(); 
		} 

		// Password 
		Thread.sleep(1000); 
		WebElement Password= driver.findElement(By.xpath(VariablesWebProject.PasswordUserXpath)); 
		Password.click(); 
		Password.sendKeys(ExpectedPassword); 

		Thread.sleep(1000); 
		WebElement EmployeeName= driver.findElement(By.xpath(VariablesWebProject.EmployeeNameXpath)); 
		EmployeeName.click(); 
		EmployeeName.sendKeys(ExpectedEmployeeName); 

		Thread.sleep(1500); 
		WebElement EmployeeNameSelection= driver.findElement(By.xpath(EmployeeNameXpathSelection));		 

		Thread.sleep(500); 
		EmployeeNameSelection.click(); 

		Thread.sleep(1000); 
		WebElement EmployeeUserName= driver.findElement(By.xpath(VariablesWebProject.UserNameXpath)); 
		EmployeeUserName.click(); 
		EmployeeUserName.sendKeys(ExpectedUserName); 

		Thread.sleep(1000); 
		WebElement PasswordConfirmation= driver.findElement(By.xpath(VariablesWebProject.PasswordConfirmationXpath)); 
		PasswordConfirmation.click(); 
		Thread.sleep(500); 
		PasswordConfirmation.sendKeys(ExpectedConfirmpassword); 


		driver.findElement(By.xpath(VariablesWebProject.Save)).click(); 

		String text; 
		int Size; 
		SoftAssert softAssert = new SoftAssert();
		try {
			WebElement LessthanSevenXpathWE= driver.findElement(By.xpath(VariablesWebProject.LessthanSevenXpath)); 
			text = LessthanSevenXpathWE.getText(); 
			Size = text.length(); 
			softAssert.assertTrue(Size <= 7, "Need more charecters the minimum is seven!"); 
		} 

		catch (Exception e) {
			System.out.println("DEBUG: No error message for less than 7 characters.");
		}

		try {
			WebElement LessthanFiveXpathWE = driver.findElement(By.xpath(VariablesWebProject.LessthanFiveXpath)); 

			text = LessthanFiveXpathWE.getText(); 
			Size = text.length(); 

			softAssert.assertTrue(Size <= 5, "Need more charecters the minimum is five!"); 

		} 
		catch (Exception e) {
			System.out.println("DEBUG: No error message for less than 5 characters.");
		}

		try {
			WebElement NoMatchedPasswordsWE= driver.findElement(By.xpath(VariablesWebProject.PasswordDoesNotMatch)); 
			text = NoMatchedPasswordsWE.getText(); 
			softAssert.assertNotEquals(text, "Passwords do not match", "Passwords do not match..."); 

		} catch (Exception e) {
			System.out.println("DEBUG: No password mismatch error message.");
		}

		try {
			WebElement AlreadyExistsWE= driver.findElement(By.xpath(VariablesWebProject.AlreadyExists)); 
			text = AlreadyExistsWE.getText(); 
			softAssert.assertNotEquals(text, "Already exists", "Already exists username try new names..."); 

		} catch (Exception e) {
			System.out.println("DEBUG: No username already exists error message.");
		}


		driver.findElement(By.xpath(VariablesWebProject.Save)).click(); 

		String Search;  
		Thread.sleep(10000); 

		WebElement RestWE= driver.findElement(By.cssSelector(VariablesWebProject.CsSelectorRest)); 
		RestWE.click(); 


		WebElement UserName = driver.findElement(By.xpath(VariablesWebProject.Search)); 
		UserName.click(); 

		UserName.sendKeys(ExpectedUserName); 
		ListUserRole = driver.findElement(By.xpath(VariablesWebProject.DropDownListUserRole)); 
		ListUserRole.click(); 

		if(ExpectedUserRole.equals("ESS"))  
		{ 
			WebElement ESSPlaceHolder = driver.findElement(By.xpath(VariablesWebProject.UserRoleXpathESS)); 
			ESSPlaceHolder.click(); 

		} 

		if(ExpectedUserRole.equals("Admin")) { 
			WebElement AdminPlaceHolder = driver.findElement(By.xpath(VariablesWebProject.UserRoleXpathAdmin)); 
			AdminPlaceHolder.click(); 
		} 

		EmployeeName = driver.findElement(By.xpath(VariablesWebProject.Name)); 

		EmployeeName.click(); 



		EmployeeName.sendKeys(ExpectedEmployeeName); 
		Thread.sleep(1000); 

		String Label = "//div[@class = 'oxd-autocomplete-option']//span[contains(text(), '" + ExpectedEmployeeName + "')]"; 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		WebElement ClickLabel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Label))); 
		ClickLabel.click(); 

		Thread.sleep(1000); 

		ListUser = driver.findElement(By.xpath(VariablesWebProject.DropDownListStatus)); 
		ListUser.click(); 

		if(ExpectedStatus == "Enabled")  
		{ 
			WebElement ListStatus= driver.findElement(By.xpath(VariablesWebProject.StatusXpathEnabled)); 
			ListStatus.click(); 

		} 

		if(ExpectedStatus == "Disabled") { 
			WebElement ListStatus= driver.findElement(By.xpath(VariablesWebProject.StatusXpathDiabled)); 
			ListStatus.click(); 
		} 

		WebElement SearchWE= driver.findElement(By.cssSelector(VariablesWebProject.CsSelectorSearch)); 
		SearchWE.click(); 

		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,400)", ""); 

		Thread.sleep(3000); 
		try {
			String UserNameActual = "//div[@class = 'oxd-table-cell oxd-padding-cell']//div[text() = '" + ExpectedUserName + "']";
			WebElement ActualUserName = driver.findElement(By.xpath(UserNameActual));
			String OutputUserName = ActualUserName.getText();
			softAssert.assertEquals(OutputUserName, ExpectedUserName, "No match for UserName!");
			System.out.println("DEBUG: UserName matched.");
		} catch (Exception e) {
			System.out.println("DEBUG: UserName not found: " + e.getMessage());
		}

		try {
			String RoleActual = "//div[@class = 'oxd-table-cell oxd-padding-cell']//div[text() = '" + ExpectedUserRole + "']";
			WebElement ActualRole = driver.findElement(By.xpath(RoleActual));
			String OutputRole = ActualRole.getText();
			softAssert.assertEquals(OutputRole, ExpectedUserRole, "No match for Role!");
			System.out.println("DEBUG: Role matched.");
		} catch (Exception e) {
			System.out.println("DEBUG: Role not found: " + e.getMessage());
		}

		try {
			String NameActual = "//div[@class = 'oxd-table-cell oxd-padding-cell']//div[text() = '" + ExpectedEmployeeName + "']";
			WebElement ActualName = driver.findElement(By.xpath(NameActual));
			String Outputname = ActualName.getText();
			softAssert.assertEquals(Outputname, ExpectedEmployeeName, "No match for Employee Name!");
			System.out.println("DEBUG: Employee Name matched.");
		} catch (Exception e) {
			System.out.println("DEBUG: Employee Name not found: " + e.getMessage());
		}

		try {
			String StatusActual = "//div[@class = 'oxd-table-cell oxd-padding-cell']//div[text() = '" + ExpectedStatus + "']";
			WebElement ActualStatus = driver.findElement(By.xpath(StatusActual));
			String Outputstatus = ActualStatus.getText();
			softAssert.assertEquals(Outputstatus, ExpectedStatus, "No match for Status!");
			System.out.println("DEBUG: Status matched.");
		} catch (Exception e) {
			System.out.println("DEBUG: Status not found: " + e.getMessage());
		}

		softAssert.assertAll();

		Thread.sleep(1500); 

		WebElement DeleteButtonWE = driver.findElement(By.cssSelector(VariablesWebProject.DeleteButton)); 
		Thread.sleep(1000); 
		DeleteButtonWE.click(); 



		WebElement DeleteWE = driver.findElement(By.cssSelector(VariablesWebProject.Delete)); 
		Thread.sleep(1000); 
		DeleteWE.click(); 

		Thread.sleep(1000); 

		WebElement DeleteWEfinal = driver.findElement(By.xpath(VariablesWebProject.delete)); 
		DeleteWEfinal.click(); 
		// Job: 

		Thread.sleep(3000); 
		
		WebElement JobWE = driver.findElement(By.xpath(VariablesWebProject.JobPanel)); 
		JobWE.click(); 

		// Organization:  
		Thread.sleep(3000); 
		WebElement OrganizationWE = driver.findElement(By.xpath(VariablesWebProject.Organization)); 
		OrganizationWE.click(); 

		// Qualifications:  
		Thread.sleep(3000); 
		WebElement QualificationsWE = driver.findElement(By.xpath(VariablesWebProject.Qualifications)); 
		QualificationsWE.click(); 

		// Nationalities: 
		Thread.sleep(3000); 
		WebElement NationalitiesWE = driver.findElement(By.xpath(VariablesWebProject.Nationalities)); 
		NationalitiesWE.click(); 

		// Corporate Branding: 
		Thread.sleep(3000); 
		WebElement CorporateBrandingWE = driver.findElement(By.xpath(VariablesWebProject.CorporateBranding)); 
		CorporateBrandingWE.click(); 

		softAssert.assertAll(); 
	} 
	
    public static WebDriver getDriverFrameOne() {
    	if (driver == null) {
            System.err.println("Driver not initialized yet.");
        } else {
            System.out.println("Driver is ready...");
        }
        return driver;
    }

} 






