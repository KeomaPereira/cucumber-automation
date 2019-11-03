package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class GoogleHomePage {

	public GoogleHomePage(WebDriver driver){
		
	}    

	
	@FindBy(how=How.LINK_TEXT, using="")
	public static WebElement toDo;
	
		
	public static class HeaderPage 
	{
		
		@FindBy(how=How.LINK_TEXT, using="")
		public static WebElement toDo;
		
		
	}
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	