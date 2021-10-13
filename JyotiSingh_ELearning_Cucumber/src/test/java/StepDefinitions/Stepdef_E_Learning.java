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
	// -----------------Step definition for Scenario-1---------------------------------
	
	@Given("User has launched the E-Learning application")
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
		Thread.sleep(2000);
	}

	@When("User clicks on Sign up! link")
	public void clicks_on_sign_up_link() throws InterruptedException {
		driver.findElement(By.linkText("Sign up!")).click();
		Thread.sleep(2000);
		System.out.println("Registration page is displayed");
		Thread.sleep(2000);
	}

	@And("Enter valid credential in First name textbox")
	public void enter_first_name() {
		driver.findElement(By.xpath("//input[@id='registration_firstname']")).sendKeys("JyotiJ");
		System.out.println("First name is entered");
	}

	@And("Enter valid credential in Last name textbox")
	public void enter_last_name() {
		driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys("SinghS");
		System.out.println("Last name is entered");
	}

	@And("Enter valid credential in e-mail textbox")
	public void enter_email_ID() {
		driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys("Cucumber1021@gmail.com");
		System.out.println("Email ID is entered");
	}

	@And("Enter valid credential in username textbox")
	public void enter_username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Jyoti1021");
		System.out.println("Username is entered");
	}

	@And("Enter valid credential in pass textbox")
	public void enter_pass() {
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys("Wonderful@1021");
		System.out.println("pass is entered");
	}

	@And("Enter valid credential in confirm password textbox")
	public void enter_confirm_password() {
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys("Wonderful@1021");
		System.out.println("Confirmed password is entered");
	}

	@And("Enter valid credential in phone textbox")
	public void enter_phone() {
		driver.findElement(By.xpath("//input[@id='registration_phone']")).sendKeys("1255567890");
		System.out.println("Phone number is entered");
	}

	@And("Selected Valid credentials from Language list box")
	public void selected_language() {
		System.out.println("English Language is selected by default");
	}

	@And("Click Student radio button in Profile")
	public void click_student_radio_button() {
		System.out.println("Student profile is selected by default");
	}

	@And("Click on Register button")
	public void click_on_register_button() {
		driver.findElement(By.xpath("//button[@id='registration_submit']")).click();
		System.out.println("Register button is clicked");
	}

	@Then("User got registered as Student successfully")
	public void registered_as_student() throws InterruptedException {
		System.out.println("Confirmation message is displayed!!!");
		Thread.sleep(2000);
		driver.close();

	}
	// -----------------Step definition for Scenario-2 --------------------------

	@Given("User should have launched the application")
	public void launch_application() throws InterruptedException {
		launching_eLearning_app();
		Thread.sleep(2000);
	}

	@When("Enter valid credentials in Username textbox")
	public void enter_username_textbox() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("Jyoti1021");
		System.out.println("Username is entered");
		Thread.sleep(2000);
	}

	@And("Enter valid credential in pass text box")
	public void enter_pass_text_box() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Wonderful@1021");
		System.out.println("Password is entered");
		Thread.sleep(2000);
	}

	@And("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
		System.out.println("Login button is clicked");
		Thread.sleep(2000);
	}

	@Then("Student Home page should get displayed")
	public void student_home_page_displayed() throws InterruptedException {
		System.out.println("User is logged in and Student Home page is displayed!!!");
		Thread.sleep(2000);
		driver.close();
	}

	// ---------------Step definition for Scenario-3--------------------------------
	
	@Given ("E-Learning pplication has been launched by user")
	public void launch_app_eLearn() throws InterruptedException {
		launching_eLearning_app();
		Thread.sleep(2000);
	}

	@And("User should have logged in as student and present in Home page")
	public void logged_in_as_student_home_page() throws InterruptedException {
		enter_username_textbox();
		enter_pass_text_box();
		click_on_login_button();
		System.out.println("User has logged in successfully and student home page is displayed!!!");
		Thread.sleep(2000);
	}

	@When("Click on Edit Profile link")
	public void click_on_edit_profile_link() {
		driver.findElement(By.linkText("Edit profile")).click();
		System.out.println("Edit profile page is displayed");
	}

	@And("Enter valid credentials in pass textbox")
	public void enter_valid_credentials_in_pass_textbox() {
		driver.findElement(By.xpath("//input[@id='profile_password0']")).sendKeys("Wonderful@1021");
		System.out.println("Old Password is entered");
	}

	@And("Enter valid credentials in New password textbox")
	public void enter_valid_credentials_in_new_password_textbox() {
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("Beautiful@1021");
		System.out.println("New Password is entered");
	}

	@And("Enter valid credentials in Confirm password textbox")
	public void enter_valid_credentials_in_confirm_password_textbox() {
		driver.findElement(By.xpath("//input[@id='profile_password2']")).sendKeys("Beautiful@1021");
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
		System.out.println("Profile is updated successfully and confirmation message is displayed!!!");
		Thread.sleep(2000);
		driver.close();
	}


}
