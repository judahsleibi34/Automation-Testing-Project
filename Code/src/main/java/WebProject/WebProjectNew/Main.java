package WebProject.WebProjectNew;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Main {


	private BeforeClass beforeclass;
	private LoginClass loginclass;
	private VariablesWebProject variables;
	private FrameOne frameone;
	private FrameTwo frametwo;

	@BeforeTest
	public void setUpTest() throws Exception {
		beforeclass = new BeforeClass();  
		variables = new VariablesWebProject();
		frameone = new FrameOne();
		beforeclass.Setup();
		
		if (frameone == null) {
	        System.out.println("ERROR: frameone is NULL after initialization!");
	    } else {
	        System.out.println("DEBUG: frameone successfully initialized.");
	    }
	}

	@Test(priority = 1)
	public void MainFrameEntrance() throws Exception {
		if (VariablesWebProject.counter == 0) { 
			loginclass = new LoginClass(); 
			loginclass.URLOpenning();
			loginclass.LogInAsAdminNegativePath();
			loginclass.LogInAsAdminHappypath();

			VariablesWebProject.counter += 1;
		}
	}
	

	@Test(priority = 2, dataProvider = "TestData") 
	public void AdminFrameEntrance(String ExpectedUserRole, String ExpectedEmployeeName, String ExpectedStatus, String ExpectedUserName, String ExpectedPassword, String ExpectedConfirmpassword) throws Exception {
		if (VariablesWebProject.counter == 1) { 
			frameone = new FrameOne();
			frameone.AdminFrameOpen();
			frameone.UserAdding(ExpectedUserRole, ExpectedEmployeeName, ExpectedStatus, ExpectedUserName, ExpectedPassword, ExpectedConfirmpassword);
                    
			VariablesWebProject.counter += 1;
		}
	}
	
	@Test(priority = 3, dataProvider = "TestData") 
	public void PIMFrameEntrance(String ExpectedUserRole, String ExpectedEmployeeName, String ExpectedStatus, String ExpectedUserName, String ExpectedPassword, String ExpectedConfirmpassword) throws Exception {
		if (VariablesWebProject.counter == 2) { 
			frametwo = new FrameTwo();
			frametwo.CancelButtonCheker(ExpectedUserRole, ExpectedEmployeeName, ExpectedStatus, ExpectedUserName, ExpectedPassword, ExpectedConfirmpassword);
                 
			VariablesWebProject.counter += 1;
		}
	}
	

	@DataProvider(name = "TestData") 
	public Object [][] provideLoginData() 

	{ 
		return new Object[][]  
				{ 

			{"ESS","aniket Ashok patil","Enabled","Jus12", "Judah@123", "Judah@123"},  
				}; 
	}
}


