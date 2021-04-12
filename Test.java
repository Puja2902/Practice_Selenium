package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static WebDriver driver;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		driver = new ChromeDriver();
		openWebPage("file:///Users/pujasharma/eclipse-workspace/Test/WebContent/form.html");

		WebElement result = findElement("#fname");
		System.out.println(result);

	}

	public static WebElement findElement(String selector) {
		By var = By.cssSelector(selector);
		WebElement element = driver.findElement(var);
		return element;
	}

	public static void openWebPage(String url) {
		driver.get(url);

	}
}