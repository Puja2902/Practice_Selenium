package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class You {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		getPage("https://www.youtube.com/");
		changeColor("#search-input > #search","red");
		enterData("#search-input > #search", "maalang song");
		driver.findElement(By.cssSelector("#search-form > #search-icon-legacy")).click();
		driver.findElement(By.partialLinkText("Full Video: Malang (Title Track)")).click();
		try {
			Thread.sleep(9999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().to("https://www.youtube.com/feed/trending");
	

	}

	public static void getPage(String url) {
		driver.get(url);
	}

	public static void enterData(String css, String value) {
		WebElement cssV = driver.findElement(By.cssSelector(css));
		String scriptTobeExecuted = "arguments[0].value='dil'";
		scriptTobeExecuted = scriptTobeExecuted.replace("dil", value);
		js.executeScript(scriptTobeExecuted, cssV);

	}
	public static void changeColor(String css,String color) {
		WebElement cssV=driver.findElement(By.cssSelector(css));
		String scriptExecute = "arguments[0].style.backgroundColor='yellow'";
		scriptExecute = scriptExecute.replace("yellow", color);
		js.executeScript(scriptExecute, cssV);
	}

}
