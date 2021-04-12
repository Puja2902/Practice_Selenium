package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Work {
	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		openPage("file:///Users/pujasharma/eclipse-workspace/Test/WebContent/form.html");
		enterData("#fname", "chetan");
		enterData("#lname", "choudhary");
		changeColor("#fname", "yellow");
		changeColor("#lname", "green");
		clickButton("#btt1");
		selectDropDown("#cars", 1);
		changeColor("#cars","orange");
		clickButton("#btn");
		// quitBrowser();

	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static void enterData(String css, String value) {
		WebElement cssValue = getElement(css);
		String scriptTobeExecuted = "arguments[0].value='chetan'";
		scriptTobeExecuted = scriptTobeExecuted.replace("chetan", value);
		js.executeScript(scriptTobeExecuted, cssValue);
	}

	public static void changeColor(String css, String color) {
		WebElement CssElement = getElement(css);
		String scriptTobeExecuted = "arguments[0].style.backgroundColor='yellow'";
		scriptTobeExecuted = scriptTobeExecuted.replace("yellow", color);
		js.executeScript(scriptTobeExecuted, CssElement);
	}

	public static void clickButton(String css) {
		WebElement cssElement = getElement(css);
		cssElement.click();
	}

	public static void selectDropDown(String css, int index) {
		WebElement ele = driver.findElement(By.cssSelector(css));
		Select sel = new Select(ele);
		sel.selectByIndex(index);

	}
	public static WebElement getElement(String ccs) {
		WebElement element = driver.findElement(By.cssSelector(ccs));
		return element;
	}
	public static void quitBrowser() {
		driver.quit();
	}

}
