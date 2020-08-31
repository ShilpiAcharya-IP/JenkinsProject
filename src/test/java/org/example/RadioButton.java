package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //location of the chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/apple/IdeaProjects/TestNG/SeleniumMavenJune/src/main/resources/drivers/chromedriver");

        //create instance of the browser
        driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyCheckboxisSelected() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("vfb-6-0")).click();
        Thread.sleep(2000);
        boolean isSelected = driver.findElement(By.id("vfb-6-0")).isSelected();
        Assert.assertEquals(isSelected, true);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
