package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

public class NavigationTests {
    public static void main(String[] args) {

        BrowserType("chrome");
        BrowserType("edge");
        BrowserType("opera");

    }
    public static void BrowserType(String browserName){

        WebDriver driver = BrowserFactory.getDriver(browserName);
        driver.get("https://google.com");

        String googleTitel1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");

        String etsyTitel1 = driver.getTitle();

        driver.navigate().back();

        String googleTitel2 = driver.getTitle();

        driver.navigate().forward();

        String etsyTitel2 = driver.getTitle();

        StringUtility.verifyEquals(googleTitel1,googleTitel2);
        StringUtility.verifyEquals(etsyTitel1,etsyTitel2);

        driver.quit();

    }
}
