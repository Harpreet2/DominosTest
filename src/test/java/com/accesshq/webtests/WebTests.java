package com.accesshq.webtests;

import com.accesshq.ui.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTests extends BaseTestSuite {

    @Test
    public void clickMenuButtonTest() {

        //Arrange
        HomePage homePage = new HomePage(driver);

        //Act
        homePage.clickMenuButton();

        //Assert
        Assertions.assertEquals("https://www.dominos.com.au/menu", driver.getCurrentUrl());


    }

}
