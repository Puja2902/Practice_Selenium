package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
		name.sendKeys("Puja");

		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Sharma");

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("2902ps@gmail.com");

		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("123455");

		driver.findElement(By.cssSelector("input[name='address']")).sendKeys("sonari");

		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("jsr");

		WebElement drop = driver.findElement(By.xpath("//select[@name='state']"));
		Select s = new Select(drop);

		s.selectByVisibleText("Indiana");

		driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("321");
		driver.findElement(By.cssSelector("input[name='website']")).sendKeys("hello");

		driver.findElement(By.xpath("//input[@type='radio' and @value='yes']")).click();

		driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("learning selenium");

		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

}
