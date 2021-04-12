package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.get("https://formy-project.herokuapp.com/scroll");

		WebElement fullName = driver.findElement(By.id("name"));
		Actions action = new Actions(driver);
		action.moveToElement(fullName);
		fullName.sendKeys("Puja Sharma");

		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("04072021");

		driver.quit();
	}

}
