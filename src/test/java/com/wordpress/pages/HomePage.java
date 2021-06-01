package com.wordpress.pages;

import com.wordpress.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){ PageFactory.initElements(Driver.getDriver(),this); }


}