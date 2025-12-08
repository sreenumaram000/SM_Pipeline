package practiceTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass2 {

    WebDriver driver;

//    @BeforeClass
//    public void setUp() {
//    	ChromeOptions options = new ChromeOptions();
//    	options.addArguments("--headless=new");
//    	options.addArguments("--no-sandbox");
//    	options.addArguments("--disable-dev-shm-usage");
//
//    	WebDriverManager.chromedriver().setup();
//    	WebDriver driver = new ChromeDriver(options);
//        driver.get("https://www.google.com");
//    }

    @Test
    public void validatePageTitle() {
        String actualTitle = "Google";
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle,
                "❌ Page title does not match");
    }

    @Test
    public void validateCurrentUrlContainsGoogle() {
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("google"),
                "❌ URL does not contain 'google'");
    }

    @Test
    public void validateStringOperations() {

        String actualText = "Selenium TestNG Framework";
        String expectedSubstring = "TestNG";

        // contains
        Assert.assertTrue(actualText.contains(expectedSubstring),
                "❌ Expected substring not found");

        // startsWith
        Assert.assertTrue(actualText.startsWith("Selenium"),
                "❌ String does not start with Selenium");

        // length validation
        Assert.assertTrue(actualText.length() > 10,
                "❌ String length validation failed");
    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
