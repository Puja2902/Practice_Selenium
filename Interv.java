package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interv {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		Select selectBydropDown = new Select(driver.findElement(By.xpath("//select[@id='multiselect1']")));
		selectBydropDown.selectByVisibleText("Swift");
		
		
	}

}
