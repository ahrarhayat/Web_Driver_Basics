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
        driver.get("http://117.58.241.66:8282/web/#/login");



        System.out.println("Page title is: " + driver.getTitle());
        String baseUrl = "http://117.58.241.66:8282/web/#/login";
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
        WebElement element = driver.findElement(By.xpath("//*[@id=\"loginFormID\"]/div[1]/input"));
        element.sendKeys("famsadmin");


      element = driver.findElement(By.xpath("//*[@id=\"loginFormID\"]/div[2]/input"));
     element.sendKeys("111111111");
     element=driver.findElement(By.xpath("//*[@id=\"loginFormID\"]/div[3]/div[2]/button"));
     element.click();
     element=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/a[2]"));
     element.click();




    }
}