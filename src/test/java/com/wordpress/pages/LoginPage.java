package com.wordpress.pages;


import com.wordpress.utilities.BrowserUtils;
import com.wordpress.utilities.ConfigurationReader;
import com.wordpress.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(css="#usernameOrEmail")
    public WebElement inputUsername;

    @FindBy(css="[type='submit']")
    public WebElement continueButton;


    @FindBy(id = "password")
    public WebElement inputPassword;


    public void login(String username, String password){
        this.inputUsername.sendKeys(username);
        this.continueButton.click();
        this.inputPassword.sendKeys(password);
        this.continueButton.click();
        BrowserUtils.waitForClickability(this.VisitSiteBttn, 5);
    }

    public void login(){
        this.inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
        this.continueButton.click();
        this.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        this.continueButton.click();
        BrowserUtils.waitForClickability(this.VisitSiteBttn, 5);
    }



}

