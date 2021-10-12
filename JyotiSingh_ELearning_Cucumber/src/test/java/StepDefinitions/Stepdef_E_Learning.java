package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef_E_Learning {

	WebDriver driver = null;
	// Step definition for Scenario-1 
	@Given("User has launched the application")
	public void launching_eLearning_app() throws InterruptedException {
		String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/src/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Navigating to the E-Learning URL
		driver.get("http://elearningm1.upskills.in/");
		Thread.sleep(2000);
		System.out.println("E-Learning website is launched successfully");
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Sign up! link")
	public void clicks_on_sign_up_link() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign up!'))]")).click();
		System.out.println("Registration page is displayed");
	}

	@And("Enter valid credential in First name textbox")
	public void enter_first_name() {
		driver.findElement(By.xpath("//input[@id='registration_firstname']")).sendKeys("Jyoti");
		System.out.println("First name is entered");
	}

	@And("Enter valid credential in Last name textbox")
	public void enter_last_name() {
		driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys("Singh");
		System.out.println("Last name is entered");
	}

	@And("Enter valid credential in e-mail textbox")
	public void enter_email_ID() {
		driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys("Cucumber123@gmail.com");
		System.out.println("Email ID is entered");
	}

	@And("Enter valid credential in username textbox")
	public void enter_username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Jyoti2021");
		System.out.println("Username is entered");
	}

	@And("Enter valid credential in pass textbox")
	public void enter_pass() {
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys("Wonderful@2021");
		System.out.println("pass is entered");
	}

	@And("Enter valid credential in confirm password textbox")
	public void enter_confirm_password() {
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys("Wonderful@2021");
		System.out.println("Confirmed password is entered");
	}

	@And("Enter valid credential in phone textbox")
	public void enter_phone() {
		driver.findElement(By.xpath("//input[@id='registration_phone']")).sendKeys("1234567890");
		System.out.println("Phone number is entered");
	}

	@And("Selected Valid credentials from Language list box")
	public void selected_language() {
		System.out.println("English Language is selected");
	}

	@And("Click Student radio button in Profile")
	public void click_student_radio_button() {
		System.out.println("Student profile is selected");
	}

	@And("Click on Register button")
	public void click_on_register_button() {
		driver.findElement(By.xpath("//button[@id='registration_submit']")).click();
		System.out.println("Register button is clicked");
	}

	@Then("User got registered as Student successfully")
	public void registered_as_student() throws InterruptedException {
		System.out.println("Confirmation message is displayed");
		Thread.sleep(2000);
		driver.quit();
		
	}
	// Step definition for Scenario-2 
	
	@Given("User should have launched the application")
	public void launch_application() throws InterruptedException {
		launching_eLearning_app();
	}

	@When("Enter valid credentials in Username textbox")
	public void enter_username_textbox() {
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("Jyoti2021");
		System.out.println("Username is entered");
	}

	@And("Enter valid credential in pass text box")
	public void enter_pass_text_box() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Wonderful@2021");
		System.out.println("Password is entered");
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
		System.out.println("Login button is clicked");
	}

	@Then("Student Home page should get displayed")
	public void student_home_page_displayed() throws InterruptedException {
		System.out.println("User is logged in and Student Home page is displayed");
		Thread.sleep(2000);
	}
	
	// Step definition for Scenario-3 
	@Given ("User should have launched the application")
	public void launch_app() throws InterruptedException {
		System.out.println("e-Learning application is already launched");
	}
		
	@And("User should have logged in as student and present in Home page")
	public void logged_in_as_student_home_page() {
		System.out.println("Student Home page is displayed");
	}

	@When("Click on Edit Profile link")
	public void click_on_edit_profile_link() {
		driver.findElement(By.xpath("//a[contains(text(),'Edit profile')]")).click();
		System.out.println("Edit profile page is displayed");
	}

	@And("Enter valid credentials in pass textbox")
	public void enter_valid_credentials_in_pass_textbox() {
		driver.findElement(By.xpath("//input[@id='profile_password0']")).sendKeys("Wonderful@2021");
		System.out.println("Old Password is entered");
	}

	@And("Enter valid credentials in New password textbox")
	public void enter_valid_credentials_in_new_password_textbox() {
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("Beautiful@2021");
		System.out.println("New Password is entered");
	}

	@And("Enter valid credentials in Confirm password textbox")
	public void enter_valid_credentials_in_confirm_password_textbox() {
		driver.findElement(By.xpath("//input[@id='profile_password2']")).sendKeys("Beautiful@2021");
		System.out.println("New Password is confirmed");
	}

	@And("Click on Save Changes")
	public void click_on_save_changes() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='profile_apply_change']")).click();
		System.out.println("Password is updated and changed are saved");
		Thread.sleep(2000);
	}

	@Then("New profile should be saved successfully")
	public void new_profile_saved() throws InterruptedException {
		System.out.println("Profile is updated successfully and confirmation message is displayed");
		Thread.sleep(2000);
		driver.close();
	}


}
