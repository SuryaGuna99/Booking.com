package execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void getURL(String url) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	public void textxpath(String path) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(path)).click();
	}
	public void typed(By by , String value) {
		driver.findElement(by).sendKeys(value);
	}
	public void Click(By by) {
		driver.findElement(by).click();
	}
	public void Quit() throws InterruptedException{
		Thread.sleep(100000);
		driver.quit();
	}
	public void scrolldown(){
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	public String gettext(By by) {
		return driver.findElement(by).getAttribute("value");
	}
}
