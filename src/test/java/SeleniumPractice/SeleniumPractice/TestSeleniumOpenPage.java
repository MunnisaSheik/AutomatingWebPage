package SeleniumPractice.SeleniumPractice;
import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestSeleniumOpenPage {

	@Test
	public void test_openPage() {
//		String location=System.getProperty("user.dir");
//		System.out.println(location);
//		System.setProperty("webdriver.edge.driver", "./src/jars//msedgedriver.exe");
//		WebDriver driver= new EdgeDriver();
//		driver.manage().window().maximize();
//	    driver.get("https://omayo.blogspot.com/");
//	 // Thread.sleep(10000);
//	    driver.quit();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
//		
		//driver.findElement(By.id("ta1")).sendKeys("munnisha");
		
		//String text=driver.findElement(By.xpath("//*[@id='HTML11']/div[1]/textarea")).getText();
		//System.out.println("print the statement---->"+text);
		//driver.close();
		
		//driver.findElement(By.xpath("//*[@class='widget HTML']/div[1]/textarea")).sendKeys("Munnisha");
		
		//driver.findElement(By.xpath("//*[@id='HTML15']/div[1]/input[1]")).click();
//		
		//driver.findElement(By.id("alert1")).click();
//		driver.switchTo().alert().accept();
	
		//driver.findElement(By.id("checkbox1")).click();
	
//		driver.findElement(By.id("prompt")).click();
//		driver.switchTo().alert().sendKeys("munnisha");
//	    driver.switchTo().alert().accept();
//		
//		driver.findElement(By.id("alert2")).click();
//		String text=driver.switchTo().alert().getText();
//		System.out.println("print---------->"+text);
		
		
		//driver.findElement(By.linkText("jqueryui")).click();
		
		//driver.findElement(By.partialLinkText("test")).click();
	}
	

}
