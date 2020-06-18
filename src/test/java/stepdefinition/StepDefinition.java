package stepdefinition;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver; 
	@Given("^User opens the browser$")
	public void user_opens_the_browser()  {
		System.setProperty("webdriver.chrome.driver", "./" + "Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("^User opens the application$")
	public void user_opens_the_application()  {
		driver.get("https://myhpgas.in/myHPGas/Index.aspx");
		
	}

	@Then("^application successfully opened$")
	public void application_successfully_opened()  {
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^user eneters valid username$")
	public void user_eneters_valid_username()  {
		System.out.println("username enetered");
	}

	@When("^User breakes capcha$")
	public void user_breakes_capcha() {
	System.out.println("capcha broke successfully");	
	}

	@Then("^login successful$")
	public void login_successful()  {
		System.out.println("login successful");
	}



	 @When("^I am Raktim$")
	    public void i_am_raktim() throws Throwable {
	        System.out.println("Raktim name is verified");
	    }

	    @When("^I am having 8 years of exp$")
	    public void i_am_having_8_years_of_exp() throws Throwable {
	        System.out.println("I am having 8 years of experience");
	    }

	    @Then("^My name is Raktim Sarkar$")
	    public void my_name_is_raktim_sarkar() throws Throwable {
	        System.out.println("My name is Raktim Sarkar");
	    }

	    @Then("^I am getting a good package$")
	    public void i_am_getting_a_good_package() throws Throwable {
	        System.out.println("Raktim is getting a good package");
	    }

	    @And("^I am sarkar$")
	    public void i_am_sarkar() throws Throwable {
	        
	     System.out.println("I am srakar"); 
	   }

	    @And("^I am working for CTS$")
	    public void i_am_working_for_cts() throws Throwable {
	        System.out.println("I am working for CTS");	    }

	}
