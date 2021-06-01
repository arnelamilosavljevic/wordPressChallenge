package com.wordpress.pages;

import com.wordpress.utilities.BrowserUtils;
import com.wordpress.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static org.junit.Assert.assertEquals;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(className = "gravatar")
    public WebElement profileIcon;

    @FindBy(linkText = "Visit site")
    public WebElement VisitSiteBttn;

    public void verifyTitle(String pageName) {


        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="";
        BrowserUtils.waitForPageToLoad(5);
        switch(pageName.toLowerCase().replace(" ","")){
            case "home":
                expectedTitle="My Home ‹ Site Title — WordPress.com";
                break;
            case "profile":
                if (Driver.getDriver().getTitle() != "My Profile — WordPress.com"){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    actualTitle = Driver.getDriver().getTitle();
                }
                expectedTitle="My Profile — WordPress.com";
                break;
            case "wordpress":
                if (Driver.getDriver().getTitle() != "WordPress.com"){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    actualTitle = Driver.getDriver().getTitle();
                }
                expectedTitle="WordPress.com";
                break;
            case "login":
                expectedTitle="Log In — WordPress.com";
        }
        assertEquals(expectedTitle,actualTitle);
    }

}
