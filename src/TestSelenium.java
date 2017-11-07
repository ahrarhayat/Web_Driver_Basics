import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("http://www.google.com");

    System.setProperty("webdriver.gecko.driver", "C:\\selenium_ff_driver\\geckodriver-v0.19.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("hello world");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());



    }
}