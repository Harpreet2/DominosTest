package com.accesshq.webtests;

import com.accesshq.ui.HomePage;
import com.accesshq.ui.MenuPage;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuTests extends BaseTestSuite {

    @Test
    public void selectStoreTest() throws InterruptedException {

        //Arrange
        new HomePage(driver).clickMenuButton();

        //Act
        MenuPage menuPage = new MenuPage(driver);

        menuPage.setPostcode(3064);
        new WebDriverWait(driver, 10).until(d -> menuPage.getStores() != null);

        menuPage.setStore("craigieburn");

        //Assert
        Assertions.assertEquals(true, menuPage.confirmStore("craigieburn"));


    }

}
