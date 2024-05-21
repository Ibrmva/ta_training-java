import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelloWebDriver {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/Users/gulaiymibraimova/chromedriver-mac-x64/chromedriver");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));// Maximize the browser window
        driver.get("https://pastebin.com/EXhJH47W");
        String title = driver.getTitle();
        System.out.println(title);
        int iframe = driver.findElements(By.tagName("iframe")).size();
        System.out.println(iframe);
//        WebDriverWait = new WebDriverWait(driver, Duration.ofMillis(20000));
        WebElement searchBox = driver.findElement(By.cssSelector("[name='q']"));
        searchBox.sendKeys("Selenium");
//        WebElement div = driver
//                .findElement(
//                        By.id("div"));
//        driver.quit();
//        div.findElement(By.xpath("myXpath"));
    }

    @Test
    public void testGoogleSearch() {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Hello from WebDriver", "10 Minutes", "helloweb");
        searchInput.submit();
        // Add more steps here if needed, such as verifying the search results
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }


    }
}


//
//import org.openqa.selenium.By;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.*;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.NoSuchElementException;
////import package webdriver_api_basics;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class HelloWebDriver {
//    private WebDriver driver;
//    private HelloWebDriver pastebinHomePage;
//
//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "/Users/gulaiymibraimova/chromedriver_mac64/chromedriver");
//        WebDriver driver = new ChromeDriver();
////        pastebinHomePage = new HelloWebDriver(driver);
////        driver.manage().window().maximize();
//        driver.get("http://google.com");
//    }
//
//    @Test
//    public void HelloWebDriver() {
//        driver.open();
//        driver.createNewPaste("Hello from WebDriver", "10 Minutes", "helloweb");
//        // Add assertions or verification steps as needed
//    }
//
//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}





//public class HelloWebDriver {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.selenium.dev");
//        WebElement searchInput = driver.findElement(By.id("q"));
//        searchInput. sendKeys( "selenium java") ;
//        List<WebElement> searchBtn = driver. findElements(By. xpath ("//*[@value='Go']"));
//        searchBtn.get(0).click();
////        Thread.sleep(2000);
////        driver.quit();
//
//
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(15))
//                .pollingEvery(Duration.ofSeconds(3))
//                .ignoring(NoSuchElementException.class)
//                .ignoring(StaleElementReferenceException.class)
//                .withMessage("Timeout for waiting search result list was exceeded!");
//        List<WebElement> searchResults = wait.until(By.xpath("//div[contains(@class)]"));
//        List<WebElement> searchResults = driver.findElements(By.xpath("//div[contains(@class)]"));
//        System.out.println("Search results number for requested term:" + searchResults.size());
//        driver.quit();
//
//        private static WebElement waitForElementLocatedBy(WebDriver driver,By by){
//            return new WebDriverWait(driver, 10)
//                    .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
//        }
//
//    }
//}
