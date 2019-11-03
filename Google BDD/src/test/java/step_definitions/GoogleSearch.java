package step_definitions;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearch{
    public WebDriver driver;
    
    
    public GoogleSearch()
    {
    	driver = BeforeAndAfter.driver;
    	
    }
    
    
    @When("^the user access the Google$")
    public void access_the_google() throws Throwable {
    	driver.get("https://www.google.com.br");
    }
    

    @When("^clicks on search$")
    public void user_search() throws Throwable {
        System.out.println("To do step 2");
    }
    

    @Then("^the Google do the search$")
    public void searched() throws Throwable {
    	System.out.println("To do step 3");
    }
    
    
}