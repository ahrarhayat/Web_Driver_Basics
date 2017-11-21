import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class TestSelenium2 {
    public static void main(String[] args) {
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("http://www.google.com");

        //dependancy injection
        System.setProperty("webdriver.gecko.driver", "C:\\selenium_ff_driver\\geckodriver-v0.19.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        //    driver.get("https://www.google.com.bd/?gws_rd=ssl");


        //   System.out.println("Page title is: " + driver.getTitle());
        String baseUrl = "https://www.blinknetwork.com/login.html";
        String expectedTitle = "Electric Vehicle Charging | United States | Blink CarCharging";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);


        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        WebElement element= driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[3]/div/a[1]/div/div/img"));
        element.click();

        driver.get(baseUrl);

        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/table/tbody/tr/td[1]/div/form/div[3]/input"));
        element1.click();
       WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[3]/div/table/tbody/tr/td[3]/div/a[2]/div/div/img"));
       element2.click();
        driver.get(baseUrl);
       element=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/p[2]/a"));
       element.click();
       System.out.println("Test has been executed successfully");






    }
}