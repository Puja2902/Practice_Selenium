package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		waitMethod();
		openPage("https://omayo.blogspot.com");
		flash("#ta1"); // highlight element
		drawBorder("#ta1"); // draw border

		// File screenshotFile = ((TakesScreenshot)
		// driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshotFile , new
		// File("/Users/pujasharma/eclipse-workspace/MySeleniumProject/src/main/java/selenium"));

	}

	public static void waitMethod() {
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static void flash(String css) {
		WebElement element = findElement(css);
		String bgColor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 50; i++) {
			changeColor("yellow", css);
			changeColor(bgColor, css);
		}
	}

	public static void changeColor(String color, String css) {
		WebElement colorElement = findElement(css);
		String executeScript = "arguments[0].style.backgroundColor='colo'";
		executeScript = executeScript.replace("colo", color);
		js.executeScript(executeScript, colorElement);
	}

	public static WebElement findElement(String css) {
		WebElement ele = driver.findElement(By.cssSelector(css));
		return ele;
	}

	public static void drawBorder(String css) {
		WebElement toBorder = findElement(css);
		String executeScript = "arguments[0].style.border='3px solid red' ";
		js.executeScript(executeScript, toBorder);

	}

}
