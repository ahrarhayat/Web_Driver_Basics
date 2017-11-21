import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("http://www.google.com");

        //dependancy injection
    System.setProperty("webdriver.gecko.driver", "C:\\selenium_ff_driver\\geckodriver-v0.19.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
    //    driver.get("https://www.google.com.bd/?gws_rd=ssl");



     //   System.out.println("Page title is: " + driver.getTitle());
        String baseUrl = "https://www.google.com/";
        String expectedTitle = "Wikipedia";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        WebElement element = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        element.sendKeys("Genweb2");




      element = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[3]/center/input[1]"));
        element.click();
     //element=driver.findElement(By.xpath("//*[@id=\"loginFormID\"]/div[3]/div[2]/button"));
        element = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div/h3/a"));
        element.click();
     //element=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/a[2]"));
    // element.click();




    }
}