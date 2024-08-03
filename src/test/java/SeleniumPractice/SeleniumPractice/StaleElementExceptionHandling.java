package SeleniumPractice.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*findElements(), Handling StaleElementReferenceException and
     *tagName() methods */
public class StaleElementExceptionHandling{

	WebDriver driver;



	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}
		
	
	// RETRIEVE THE LIST OF WEBELEMENTS
	@Test
	public void test_findElements() {
		List<WebElement> orderedList = driver.findElements(By.xpath("//div[@class='widget-content']/ol/li"));
		for (WebElement e:orderedList) {
			System.out.println(e.getText());
		}
		}
		
	@Test
	public void test_staleElementException() {
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='widget LinkList']/descendant::a"));
	
		String path="(//div[@class='widget LinkList']/descendant::a)";
		
		for(int i=1;i<allLinks.size();i++) {
			  
			String individualLink = path+"["+i+"]"; 
			
			driver.findElement(By.xpath(individualLink)).click();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			driver.navigate().back();
			 
			
		}
		
	}	
	@Test
	public void test_ByTagName() {
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
		for (WebElement e: allLinks) {
			
			System.out.println(e.getText());
			System.out.println(e.getAttribute("href"));
		}
	
		}
	
	
	
	}
	

