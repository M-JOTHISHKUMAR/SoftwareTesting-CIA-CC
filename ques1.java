package cc1_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ques1 {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		WebElement name = driver.findElement(By.id("user-name"));
		name.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		WebElement addTo = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		addTo.click();
		WebElement cart = driver.findElement(By.id("shopping_cart_container"));
		cart.click();
		WebElement check = driver.findElement(By.id("checkout"));
		check.click();
		WebElement fname = driver.findElement(By.id("first-name"));
		fname.sendKeys("jothish");
		WebElement lname = driver.findElement(By.id("last-name"));
		lname.sendKeys("kumar");
		WebElement post = driver.findElement(By.id("postal-code"));
		post.sendKeys("jo@346");
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		System.out.println("Sauce Labs Fleece Jacket");
		System.out.println("$49.99");
		}
}
