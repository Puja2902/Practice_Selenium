package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssFormPractice {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get("file:///Users/pujasharma/eclipse-workspace/Test/WebContent/form.html");

		WebElement firstName = driver.findElement(By.cssSelector("#fname"));

		js.executeScript("arguments[0].setAttribute('id','ffname')", firstName);
		
		firstName.sendKeys("Puja");
		setInputValue("sharma");
		onClick();

		// driver.quit();

	}

	public static void setInputValue(String str) {
		WebElement lastName = driver.findElement(By.cssSelector("#lname"));
		String val = "arguments[0].value='#abc'";
		val = val.replace("#abc", str);
		js.executeScript(val, lastName);

	}

	public static void onClick() {
		WebElement button = driver.findElement(By.cssSelector("#btn"));
		String clk = "arguments[0].click()";
		js.executeScript(clk, button);
	}

}
