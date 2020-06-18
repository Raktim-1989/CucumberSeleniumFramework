package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitionTestData {

	WebDriver driver;
	
	@Given("^User navigates the URL$")
	public void user_navigates_the_URL() {
		System.setProperty("webdriver.chrome.driver", "./" + "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.xpath("//input[@name =  'login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name =  'passwd']")).sendKeys(password);
	}

	@And("^User clicks on button$")
	public void user_clicks_on_button() {
		driver.findElement(By.xpath("//input[@value =  'Sign in']")).click();
	}

	@Then("^Login successful$")
	public void login_successful()  {
		System.out.println("Login successful");
	}
	@Then("^Browser is closed$")
	public void browser_is_closed() {
		driver.quit();
		System.out.println("browser closed");
		
	}


}
