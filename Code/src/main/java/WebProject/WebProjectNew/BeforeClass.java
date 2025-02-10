package WebProject.WebProjectNew;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeClass {

    private static WebDriver driver; 
    public Actions actions;  
    public SoftAssert softAssert; 
    public WebDriverWait wait; 
    public JavascriptExecutor jsExecutor;
    
    private VariablesWebProject variables;
    
    
    public BeforeClass() throws Exception {
    	variables = new VariablesWebProject();
        System.out.println("Before testing...");
    }

    public void Setup() throws Exception {
    	
    	WebDriverManager.chromedriver().setup(); ;
    	driver = new ChromeDriver();
		driver.manage().window().maximize(); 

        try {
            if (driver == null) {
                WebDriverManager.chromedriver().setup(); 
                driver = new ChromeDriver(); 
                driver.manage().window().maximize(); 
                System.out.println("Driver initialized successfully.");
            }

            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            actions = new Actions(driver); 
            softAssert = new SoftAssert(); 
            jsExecutor = (JavascriptExecutor) driver;

            driver.get(VariablesWebProject.URL);
        } catch (Exception e) {
            System.err.println("Error during setup: " + e.getMessage());
            e.printStackTrace();
            throw e;  
        }
    }

    public void quit() {
        if (driver != null) {
            driver.quit();  
            driver = null;  
        }
    }

    public static WebDriver getDriver() {
    	if (driver == null) {
            System.err.println("Driver not initialized yet.");
        } else {
            System.out.println("Driver is ready...");
        }
        return driver;
    }
}
