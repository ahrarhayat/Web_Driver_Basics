import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class myClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\selenium_ff_driver\\geckodriver-v0.19.0-win64\\geckodriver.exe");

        System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        String alertMessage = "";

        driver.get("https://web.skype.com/en/");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(alertMessage);
        driver.quit();
    }
}
