package com.accesshq;

import com.accesshq.ui.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTests {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.dominos.com.au/");
        driver.manage().window().maximize();

    }

    @Test
    public void clickMenuButtonTest() {

        //Arrange
        HomePage homePage = new HomePage(driver);

        //Act
        homePage.clickMenuButton();

        //Assert
        Assertions.assertEquals("https://www.dominos.com.au/menu", driver.getCurrentUrl());


    }

    @AfterEach
    public void cleanup() {
        driver.quit();
    }
}
