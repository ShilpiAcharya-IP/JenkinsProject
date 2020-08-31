package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserCommands {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //location of the chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/apple/IdeaProjects/TestNG/SeleniumMavenJune/src/main/resources/drivers/chromedriver");

        //create instance of the browser
        driver = new ChromeDriver();

        driver.get("http://whiteboxqa.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyPageTitle() throws InterruptedException {
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "QA/QE/SDET Training.";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void verifyCurrentUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "http://whiteboxqa.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
