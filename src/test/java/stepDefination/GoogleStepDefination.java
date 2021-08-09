package stepDefination;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefination extends Base 
{
	
@Given("I open a google website")
	public void i_open_a_google_website() {
	    // Write code here that turns the phrase above into concrete actions
driver.get("http://www.google.com");
	}
	//@When("I search Topic \\”(.*)\\” ")
	@When("I search Topic {string}")
	public void i_search_topic(String topic) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement el = driver.findElement(By.xpath("//input[@title='Search']"));
	    el.sendKeys(topic);
	  try  
	  {Actions act= new Actions(driver);	
	    WebElement SearchText=driver.findElement(By.xpath("(//ul[@jsname='erkvQe']//span)[1]"));
	    act.moveToElement(SearchText).click().build().perform();
	}
catch(StaleElementReferenceException e)
	  {
	Actions act= new Actions(driver);	
    WebElement SearchText=driver.findElement(By.xpath("(//ul[@jsname='erkvQe']//span)[1]"));
    act.moveToElement(SearchText).click().build().perform();
	  }
	}
	@Then("Search result displayed")
	public void search_result_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement searchText=driver.findElement(By.xpath("(//div[@class='g']//a)[1]"));
	Assert.assertTrue(searchText.isDisplayed());
	}
	@And("I launch website with title {string}")
	public void i_launch_selenium_website(String title) {
		WebElement searchText=driver.findElement(By.xpath("(//div[@class='g']//a)[1]"));
	searchText.click();
	Assert.assertTrue(driver.getTitle().equals(title));
	}
	@When("I search for Topic")
	public void i_search_for_topic(DataTable topicTable){
		for (Map<Object, Object> data : topicTable.asMaps(String.class, String.class)) 
		{ 
			String topic=data.get("Topic").toString();
	     WebElement el = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		   el.clear();
		   el.click();
	     el.sendKeys(topic);
		  try  
		  {Actions act= new Actions(driver);	
		    WebElement SearchText=driver.findElement(By.xpath("(//ul[@jsname='erkvQe']//span)[1]"));
		    act.moveToElement(SearchText).click().build().perform();
		}
	catch(StaleElementReferenceException e)
		  {
		Actions act= new Actions(driver);	
	    WebElement SearchText=driver.findElement(By.xpath("(//ul[@jsname='erkvQe']//span)[1]"));
	    act.moveToElement(SearchText).click().build().perform();
		  }}
	     }
	@After
    public void afterScenario(){
        if(driver!=null) 
        	{driver.close();
        	} 
      
    }
	
	@Given("User opens a website {string}")
	public void user_opens_a_website(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get(string);
	}

	@When("Website is successfully opened")
	public void website_is_successfully_opened() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Prited title is :"+driver.getTitle());
	}

	@Then("Website has title {string}")
	public void website_has_title(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.getTitle().equals(string));
		
	}
	
	//background check code
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.amazon.in/");
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User search for Lenovo Laptop")
	public void user_search_for_lenovo_laptop() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Add the first laptop that appears in the search result to the basket")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User basket should display with added item")
	public void user_basket_should_display_with_added_item() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User navigate for Lenovo Laptop")
	public void user_navigate_for_lenovo_laptop() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Add the laptop to the basket")
	public void add_the_laptop_to_the_basket() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
