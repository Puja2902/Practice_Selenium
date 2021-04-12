package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.get("https://formy-project.herokuapp.com/switch-window");

		WebElement tab = driver.findElement(By.id("new-tab-button"));
		tab.click();
		String originalHandle = driver.getWindowHandle();
		System.out.println(originalHandle);

		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		driver.switchTo().window(originalHandle);
		
		WebElement alertbutton = driver.findElement(By.id("alert-button"));
		alertbutton.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}

}
