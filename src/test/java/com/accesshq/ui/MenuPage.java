package com.accesshq.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuPage {
    private WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setPostcode(int code) {
        WebElement postcode = driver.findElement(By.id("customer-suburb"));
        postcode.sendKeys(String.valueOf(code));
    }

    public void setStore(String store) {
        for(WebElement currentStore : driver.findElements(By.className("storeAddress"))) {
             if(currentStore.getText().toLowerCase().contains(store)) {
                currentStore.click();
            }
        }
    }

    public boolean confirmStore(String store) {
        WebElement currentStore = driver.findElement(By.className("storeNameDiv"));
        if(currentStore.getText().toLowerCase().contains(store)) {
            return true;
        }
        throw new NotFoundException();
    }

    public String getStores() {
        WebElement store = driver.findElement(By.className("resultStoreNameDiv"));
        return store.getText();
    }

}
