package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestXpath {
	
	private WebDriver driver;


	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://testpages.eviltester.com/styled/index.html");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test_xpath() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//a[text()='Basic Web Page Example']")).click();
	System.out.println(driver.findElement(By.xpath("//p[@class='main']")).getText());
	driver.navigate().back();
	driver.findElement(By.id("elementattributestest")).click();
    driver.findElement(By.cssSelector("button.styled-click-button")).click();
	}
}
