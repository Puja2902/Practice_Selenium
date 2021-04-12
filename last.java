package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class last {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://omayo.blogspot.com/");

		WebElement text = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		text.sendKeys("hello");

		Select select = new Select(driver.findElement(By.xpath("//select[@id='multiselect1']")));
		select.selectByVisibleText("Swift");

		WebElement button = driver.findElement(By.xpath("//button[@id='but2']"));
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());

		WebElement check = driver.findElement(By.xpath("//input[@id='dte']"));
		System.out.println(check.isSelected());

		driver.quit();

	}

}
