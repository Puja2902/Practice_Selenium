package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		WebElement firstDropDown = driver.findElement(By.xpath("//select[@id='first']"));

		Select select = new Select(firstDropDown);

		select.selectByVisibleText("Google");

		List<WebElement> printList = driver.findElements(By.xpath("//select[@id='animals']//option"));
		System.out.println(printList.size());

		for (int i = 0; i < printList.size(); i++) {
			String Lprint = printList.get(i).getText();
			System.out.println(Lprint);
		}
		
		WebElement multiple = driver.findElement(By.xpath("//select[@id='second']"));
		Select s = new Select(multiple);
		s.selectByVisibleText("Pizza");
			
		//driver.quit();
	}
}
