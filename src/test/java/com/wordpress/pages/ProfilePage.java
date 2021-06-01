package com.wordpress.pages;

import com.wordpress.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage{
    public ProfilePage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//button[@class='button sidebar__me-signout-button is-compact']")
    public WebElement logOutBttn;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "display_name")
    public WebElement displayName;

    @FindBy(id = "description")
    public WebElement aboutMe;

    @FindBy(className = "components-form-toggle__input")
    public WebElement toggle;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveBttn;


    public void enter_input_for_field(String fieldName, String input){
        switch(fieldName.toLowerCase().replace(" ","")){
            case "firstname":
                firstName.sendKeys(input);
                break;
            case "lastname":
                lastName.sendKeys(input);
                break;

            case "aboutme":
                aboutMe.sendKeys(input);
                break;
        }
    }

    public void verifyValueOfField(String fieldName, String input){
        String actual = "";
        switch(fieldName.toLowerCase().replace(" ","")){
            case "firstname":
                actual = firstName.getAttribute("value");
                break;
            case "lastname":
                actual = lastName.getAttribute("value");
                break;
            case "aboutme":
                actual = aboutMe.getAttribute("value");
                break;
            case "displayname":
                actual = displayName.getAttribute("value");
                break;
        }

        Assert.assertEquals(input, actual);
    }

    public void clear_field(String fieldName) {
        switch (fieldName.toLowerCase()){
            case "firstname" :
                firstName.clear();
                break;
            case "lastname" :
                lastName.clear();
                break;
            case "aboutme" :
                aboutMe.clear();
                break;
        }
    }
}

