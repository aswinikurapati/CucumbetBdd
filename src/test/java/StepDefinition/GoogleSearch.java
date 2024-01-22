package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GoogleSearch {
	WebDriver driver;
	
	@Given("I am on the Google search page")
	public void i_am_on_the_google_search_page() {
		//WebDriverManager.edgedriver().setup();
	    //driver = new EdgeDriver();
	    //System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\aswin\\Downloads\\chromedriver_win32");
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
	    driver.get("http://www.google.com");
	}

	@When("I search for {string}")
	public void i_search_for(String Keyword) {
		driver.findElement(By.name("q")).sendKeys(Keyword , Keys.ENTER);
	  
	}

	@Then("the page title should start with {string}")
	public void the_page_title_should_start_with(String titleStartsWith) {
		System.out.println("TITLE= " + driver.getTitle().toLowerCase());
	}
	@Then("I validate the title should contain {string}")
	public void ivalidateTheTitleShouldContain(String Keyword) {
		System.out.println("TITLE= " + driver.getTitle().toLowerCase());
		Assert.assertEquals(driver.getTitle(),Keyword +" - Search ");
		driver.close();
	}


}