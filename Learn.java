package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textbox = driver.findElement(By.xpath("//textarea[@id='ta1']"));		
		textbox.sendKeys("puja test");	
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='drop1']"));
		Select sel = new Select(drop);
		sel.selectByValue("abc");

		
		
		
		
		driver.quit();

	}

}
