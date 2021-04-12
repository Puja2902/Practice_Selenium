package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement source = driver.findElement(By.id("image"));
		WebElement target = driver.findElement(By.id("box"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
		
		
		
	}

}
