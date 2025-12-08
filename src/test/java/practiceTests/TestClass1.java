package practiceTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void validateStringEqualityTest() {
        String actual = "Selenium TestNG";
        String expected = "Selenium TestNG";

        Assert.assertEquals(actual, expected, "Strings are not equal!");
    }

    @Test
    public void validateStringContainsTest() {
        String fullText = "Welcome to Selenium Automation";
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
