package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GitHubTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Sign in"));
		action.moveToElement(element).click();
		Thread.sleep(3000);

		driver.findElement(By.id("login_field")).sendKeys("arminsaric99");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("password");
		Thread.sleep(2000);

		driver.findElement(
				By.className("btn btn-primary btn-block js-sign-in-button"))
				.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.findElement(
				By.className("HeaderMenu-link HeaderMenu-link-sign-up flex-shrink-0 d-none d-lg-inline-block no-underline border color-border-default rounded px-2 py-1"))
				.click();

		driver.findElement(
				By.className("js-continue-input js-continue-focus-target signup-input form-control input-block flex-1 border-0 rounded-0 p-0 box-shadow-none color-text-white f4 text-mono"))
				.sendKeys("someone@gmail.com");
		driver.findElement(
				By.className("js-continue-button signup-continue-button form-control px-3 width-full width-sm-auto mt-4 mt-sm-0"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(
				By.className("js-continue-button signup-continue-button form-control px-3 width-full width-sm-auto mt-4 mt-sm-0"))
				.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(1000);

		WebElement mainMenu = driver
				.findElement(By
						.className("HeaderMenu-link border-0 width-full width-lg-auto px-0 px-lg-2 py-3 py-lg-2 no-wrap d-flex flex-items-center flex-justify-between js-details-target"));
		Actions ac = new Actions(driver);

		ac.moveToElement(mainMenu);

		WebElement subMenu = driver.findElement(By
				.className("color-fg-default h4"));
		ac.moveToElement(subMenu);
		ac.click().build().perform();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.close();

	}

}
