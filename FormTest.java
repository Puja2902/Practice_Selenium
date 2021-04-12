package selenium;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest{
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		openUrl("file:///Users/pujasharma/eclipse-workspace/Test/WebContent/form.html");
	
		
		
	}
	public static void openUrl(String url) {
		driver.get(url);
	}
	public static void setAttribute(WebElement element , String attribute , String value) {
		//WebElement first = driver.findElement(By.cssSelector("#fname"));
		String attributeValue = "#abc";
		attributeValue = attributeValue.replace("#abc", value);
		js.executeScript("arguments[0].setAttribute('id','ffnam'");
	}
	
	
}