package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo {
	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		openPage("https://omayo.blogspot.com/");
		enterData("#ta1", "hello world");
		changeColor("#ta1", "pink");
		//js.executeScript("window.scrollBy(0,1000)"); scroll by pixel
		scrollByElement("#uploadfile");
		driver.findElement(By.cssSelector("#uploadfile")).sendKeys("/Users/pujasharma/Desktop/Receipt _ LinkedIn.pdf");
		
		

	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static void enterData(String css, String value) {
		WebElement cssV = driver.findElement(By.cssSelector(css));
		String scrpitTobeExecuted = "arguments[0].value='puja'";
		scrpitTobeExecuted = scrpitTobeExecuted.replace("puja", value);
		js.executeScript(scrpitTobeExecuted, cssV);
	}

	public static void changeColor(String css, String color) {
		WebElement SelectedCssElement = driver.findElement(By.cssSelector(css));
		String scriptToExecute = "arguments[0].style.backgroundColor='yellow'";
		scriptToExecute = scriptToExecute.replace("yellow", color);
		js.executeScript(scriptToExecute, SelectedCssElement);
	}
	public static void scrollByElement(String css) {
		WebElement element = driver.findElement(By.cssSelector(css));
		String executeScript = "arguments[0].scrollIntoView()";
		js.executeAsyncScript(executeScript, element);
	}
	

}
