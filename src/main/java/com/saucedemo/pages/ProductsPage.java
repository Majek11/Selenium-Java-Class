package com.saucedemo.pages;

import com.saucedemo.pages.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private By productsHeader = By.xpath("//span[@class='title' and text()='Products']");

    public boolean isHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}
