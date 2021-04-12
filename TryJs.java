package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TryJs {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		getUrl("https://www.amazon.in/");
	
	
		enterData("#twotabsearchtextbox", "lakme matte lipstick");
		clickTab("#nav-search-submit-button");

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void enterData(String css, String data) {
		WebElement cssElement = findElement(css);
		String executeScript = "arguments[0].value='data'";
		executeScript = executeScript.replace("data", data);
		js.executeScript(executeScript, cssElement);
	}

	public static void clickTab(String css) {
		findElement(css).click();
	}

	public static WebElement findElement(String css) {
		WebElement ele = driver.findElement(By.cssSelector(css));
		return ele;

	}

}
