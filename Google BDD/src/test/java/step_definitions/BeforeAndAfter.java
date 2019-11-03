package step_definitions;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class BeforeAndAfter{
    public static WebDriver driver;

    
    @Before
    public void openBrowser() throws MalformedURLException {
    	System.out.println("Open Browser");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Keoma\\Desktop\\Programação\\Automation-web\\Chrome driver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    }

     
    @After
    public void embedScreenshot() {
        driver.quit();
    }
    
}