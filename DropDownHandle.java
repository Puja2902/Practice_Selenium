package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
	//	WebElement drop = driver.findElement(By.id("drop1"));

		// Select select = new Select(drop);

		// select.selectByVisibleText("doc 1");
		// select.selectByIndex(1);
		// select.selectByValue("doc 1");
		// selectValueFromDropDown(drop, "doc 1");
//		List<WebElement> listdown = select.getOptions();
//		System.out.println(listdown.size());
//
//		for (int i = 0; i < listdown.size(); i++) {
//			String valuePrint = listdown.get(i).getText();
//			System.out.println(valuePrint);
//		}

		List<WebElement> listPrint = driver.findElements(By.xpath("//select[@id='drop1']//option"));
		System.out.println(listPrint.size());

		for (int i = 0; i < listPrint.size(); i++) {
			String Vprint = listPrint.get(i).getText();
			System.out.println(Vprint);
		}

		driver.quit();

	}

	// method for dropdown
//	public static void selectValueFromDropDown(WebElement element, String value) {
//		Select select = new Select(element);
//		select.selectByVisibleText(value);
}
