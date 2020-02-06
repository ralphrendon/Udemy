import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	
	public static WebDriver driver;
	
	
	
	
	
	

	
	
	@BeforeSuite
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Scripts\\chromedriver.exe");
		
		
		
		
		
		driver = new ChromeDriver();
		
		
		driver.get("http://m.demo.inplaymatrix.com/");
		
		
		
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void doLogin() {
		
		
	
		
		
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@name='Language']")));
		
		
		dropDown.selectByVisibleText("English");
		
		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("imqarhgr1");
		
		
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("asdf1234");
		
		driver.findElement(By.xpath("//button[@class='btn buttonFull button ui-btn ui-shadow ui-corner-all']")).click();
		
		
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		
		
		driver.quit();
	}

}
