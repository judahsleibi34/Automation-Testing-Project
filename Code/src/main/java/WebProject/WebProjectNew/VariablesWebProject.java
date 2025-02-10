package WebProject.WebProjectNew;

public class VariablesWebProject {

	public static int counter = 0;
	public static final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static final String ErrorXpath = "//p[@class = \"oxd-text oxd-text--p oxd-alert-content-text\"]";
	public static  String Username = "JudahSleibi"; 
	public static  String Password = "Password";
	public static final String ErrorMassage = "Invalid credentials";
	public static String Error = null;

	public static final String UsernameXpath = "//input[@name = 'username']"; 
	public static final String PasswordXpath = "//input[@name = 'password']"; 

	public static final String EnterButton = "//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"; 

	public static String JobPanel = "//span[@class='oxd-topbar-body-nav-tab-item' and text()='Job ']"; 
	public static String Organization = "//span[@class='oxd-topbar-body-nav-tab-item' and text()='Organization ']"; 
	public static String Qualifications = "//span[@class='oxd-topbar-body-nav-tab-item' and text()='Qualifications ']"; 
	public static String Nationalities = "//a[@class='oxd-topbar-body-nav-tab-item' and text()='Nationalities']"; 
	public static String CorporateBranding = "//a[@class='oxd-topbar-body-nav-tab-item' and text()='Corporate Branding']"; 

	// Valid credential:
	public static final String UsernameXpathVC = "//p[contains(@class, 'oxd-text oxd-text--p') and contains(normalize-space(.), 'Username :')]";
	public static final String PasswordXpathVC = "//p[contains(@class, 'oxd-text oxd-text--p') and contains(normalize-space(.), 'Password :')]"; 
	public static final String ErrorXpathVC = "//p[@class = \"oxd-text oxd-text--p oxd-alert-content-text\"]";

	public static String UsernameText;  
	public static String PasswordText; 
	public static String ErrorText; 

	public static String LogInButtonXpath = "//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"; 

	public static String AdminFrameXpath = "//*[contains(@class, 'oxd-text oxd-text--span oxd-main-menu-item--name') and text()='Admin']"; 
	public static String AddButtonXpath = "//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary']";

	public static String UserRoleXpathAdmin = "//div[contains(@class, 'oxd-select-option')]//span[text()='Admin']"; 
	public static String UserRoleXpathESS = "//div[contains(@class, 'oxd-select-option')]//span[text()='ESS']"; 
	public static String StatusXpathEnabled = "//div[@class = 'oxd-select-option']//span[text()='Enabled']";  
	public static String StatusXpathDiabled = "//div[@class = 'oxd-select-option']//span[text()='Disabled']";   
	public static String UserNameXpath  = "(//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@data-v-957b4417='']//input[@autocomplete='off'])[1]"; 
	public static String EmployeeNameXpath = "//div[contains(@class, 'oxd-autocomplete-text-input--active')]//input[@placeholder='Type for hints...']"; 
	public static String DropDownListUserRole = "(//div[@class = 'oxd-select-text-input'])[1]"; 
	public static String DropDownListStatus = "(//div[@class = 'oxd-select-text-input'])[2]"; 
	public static String PasswordUserXpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//input[@type='password' and contains(@class, 'oxd-input--active')]";
	public static String PasswordConfirmationXpath = "//label[text()='Confirm Password']/ancestor::div[contains(@class, 'oxd-input-group')]/div//input[@type='password' and @autocomplete='off']"; 

	public static String Save = "//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"; 



	public static String LessthanSevenXpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message' and text()='Should have at least 7 characters']";
	public static String LessthanFiveXpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message' and text()='Should be at least 5 characters']"; 
	public static String PasswordDoesNotMatch ="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message' and text()='Passwords do not match']";
	public static String AlreadyExists ="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message' and text()='Already exists']";

	public static String CsSelectorRest = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--ghost"; 
	public static String Search = "//label[text()='Username']/ancestor::div[contains(@class, 'oxd-input-group')]/div/input"; 
	public static String Name = "//input[@placeholder='Type for hints...']"; 

	public static String CsSelectorSearch = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"; 
	public static String DeleteButton = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-header > div > div:nth-child(1) > div > label > span > i"; 
	public static String Delete  = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div:nth-child(2) > div > div > button"; 

	public static String delete = "//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--label-danger') and contains(., 'Yes, Delete')]"; 

	// PIM variables
	public static String PIM = "//span[@class = 'oxd-text oxd-text--span oxd-main-menu-item--name' and text() = 'PIM']";
	public static String AddButtonXpathPIM = "//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary']"; 
	public static String FirstName = "//input[@placeholder='First Name']";
	public static String ID = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']"; 
	public static String ConstantToSend = "12";
	public static String MidleName = "//input[@placeholder='Middle Name']"; 
	public static String LastName = "//input[@placeholder='Last Name']"; 
	public static String ButtonSlider = "//span[@class = 'oxd-switch-input oxd-switch-input--active --label-right']";
	public static String UserNameAdd = "(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active'])[2]"; 
	public static String PassWordADD = "//input[@class='oxd-input oxd-input--active' and @type='password']"; 
	public static String StatusXpathDiabledPIM = "//div[@class='oxd-radio-wrapper']//input[@type='radio' and @value='2']"; 

	public static String PassWordConfirmation = "//label[text()='Confirm Password']/following::input[1]"; 

	public static String SavePIM = "//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"; 

	public static String NameToSend = "George George";
	public static String PasswordToSend = "George@123";


}



