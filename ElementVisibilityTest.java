package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://omayo.blogspot.com/");

		// 1.isDisplayed() method :applicable for all elements ; returns T/F ;

		Boolean b1 = driver.findElement(By.xpath("//button[@id='but2']")).isDisplayed();
		System.out.println(b1);

		Boolean b2 = driver.findElement(By.xpath("//button[@id='but2']")).isEnabled();
		System.out.println(b2);

		Boolean b3 = driver.findElement(By.xpath("//button[@id='but1']")).isDisplayed();
		System.out.println(b3);

		Boolean b4 = driver.findElement(By.xpath("//button[@id='but1']")).isEnabled();
		System.out.println(b4);

		// 2.isSelected() method is applicable for dropdown,radio,checkbox

		Boolean b5 = driver.findElement(By.xpath("//input[@id='dte']")).isSelected();
		System.out.println(b5);

		Boolean b6 = driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected();
		System.out.println(b6);
		driver.quit();
	}

}
