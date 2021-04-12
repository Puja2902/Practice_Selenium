package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.get("https://formy-project.herokuapp.com/datepicker");
			WebElement datePicker = driver.findElement(By.id("datepicker"));
			datePicker.sendKeys("12.04.2021");
			datePicker.sendKeys(Keys.RETURN);
			
	}

}
s