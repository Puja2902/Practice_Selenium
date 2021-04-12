package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractice {
	static WebDriver driver;

	static JavascriptExecutor js;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pujasharma/Downloads/chromedriver");
		driver = new ChromeDriver();

		js = (JavascriptExecutor) driver;
		driver.get("file:///Users/pujasharma/eclipse-workspace/Test/WebContent/hello.html");

		WebElement p1 = driver.findElement(By.cssSelector(".check"));
		js.executeScript("arguments[0].setAttribute('class','check1')", p1);

		String s = (String) js.executeScript("return arguments[0].getAttribute('class')", p1);

		System.out.println(s);

		setValueInInput("chek");

		changeColor("blue");
		onClick();

		// driver.quit();
	}

	public static void setValueInInput(String str) {
		WebElement text = driver.findElement(By.cssSelector("input[type=\"text\"]"));
		String jj = "arguments[0].value = '#abc ' ";
		jj = jj.replace("#abc", str);
		js.executeScript(jj, text);
	}

	public static void changeColor(String color) {
		WebElement para = driver.findElement(By.cssSelector(".check"));
		String templateScript = "arguments[0].style.backgroundColor= '#clr' ";
		templateScript = templateScript.replace("#clr", color);
		js.executeScript(templateScript, para);

	}

	public static void onClick() {
		WebElement button = driver.findElement(By.cssSelector("button#zzz"));
		String clk = "arguments[0].click()";
		js.executeScript(clk, button);

	}

}
