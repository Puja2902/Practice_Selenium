package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

		driver.get("https://formy-project.herokuapp.com/modal");

		WebElement modal = driver.findElement(By.id("modal-button"));
		modal.click();
		
		WebElement CloseModal = driver.findElement(By.id("close-button"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript( "arguments[0].click();", CloseModal);
		
		
		
		

	}

}
