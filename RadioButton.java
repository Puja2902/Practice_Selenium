package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
		
		radiobutton1.click();
		WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radiobutton2.click();
		
		WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		radiobutton3.click();
		
		
	}

}
