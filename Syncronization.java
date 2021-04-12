package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// implicitly wait is applied globally ; applicable to all the elements on the
		// page ; applied on all elements
		// driver is interacting - Element not found exception , if element is found in
		// 2 sec it will ignore next 18 sec, perform next
		// action that's why dynamic
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://omayo.blogspot.com/");

		WebElement userName = driver.findElement(By.xpath("//input[@name='userid']"));

		WebElement password = driver.findElement(By.xpath("//input[@name='pswrd']"));

		sendKeys(driver, userName, 10, "Puja");
		sendKeys(driver, password, 10, "he12");

	}

	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

}
