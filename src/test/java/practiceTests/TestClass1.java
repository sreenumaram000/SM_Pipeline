package practiceTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless=new");
    	options.addArguments("--no-sandbox");
    	options.addArguments("--disable-dev-shm-usage");

    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }

    @Test
    public void validateStringEqualityTest() {
        String actual = "Selenium TestNG";
        String expected = "Selenium TestNG";

        Assert.assertEquals(actual, expected, "Strings are not equal!");
    }

    @Test(groups = {"smoke"})
    public void validateStringContainsTest() {
        String fullText = "Wel111come to Selenium Automation";
        String expectedText = "Selenium";

        Assert.assertTrue(fullText.contains(expectedText),
                "Text does not contain expected value");
    }

    @Test
    public void validateStringNotNullTest() {
        String name = "PracticeTest";

        Assert.assertNotNull(name, "String value is null");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
