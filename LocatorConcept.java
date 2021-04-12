package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");

		// 1.id
//		WebElement username = driver.findElement(By.id("login-username"));
//		username.sendKeys("puja@yahoo.com");
//
//		WebElement nxtbtn = driver.findElement(By.id("login-signin"));
//		nxtbtn.click();

		// 2.name
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("puja@yahoo.com");
//
//		WebElement nxtbtn = driver.findElement(By.name("signin"));
//		nxtbtn.click();

		// 3.xpath
//		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("puja@yahoo.com");
//		
//		driver.findElement(By.xpath("//input[@id=\'login-signin\']")).click();

		// 4.css selector
//		driver.findElement(By.cssSelector("#login-username")).sendKeys("puja2902@yahhoo.com");
//		driver.findElement(By.cssSelector("#login-signin")).click();

		// 5.link text
		// driver.findElement(By.linkText("Forgotten username?")).click();

		// 6.partial link text
		// driver.findElement(By.partialLinkText("Forgotten")).click();

		// 7.class name is not unique
		driver.findElement(By.className("phone-no ")).sendKeys("puja2902@yahoo.com");

		// 1st preference id , name , xpath , csspath

	}

}
