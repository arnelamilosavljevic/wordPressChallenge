package com.wordpress.step_definitions;

import com.wordpress.pages.LoginPage;
import com.wordpress.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageStepDefs {

    LoginPage loginPage = new LoginPage();
    ProfilePage profilePage = new ProfilePage();


    @Given("User is on WordPress Log In home page")
    public void user_is_on_word_press_log_in_home_page(){
        loginPage.verifyTitle("login");
    }

    @When("User logs in")
    public void user_logs_in() {
        loginPage.login();
    }

    @When("User logs in with {string} and {string} credentials")
    public void user_logs_in_with_and_credentials(String string, String string2){
        loginPage.login(string,string2);
    }


    @Then("clicks on {string}")
    public void clicks_on(String string) {
        loginPage.profileIcon.click();


    }


    @Then("{string} page is displayed")
    public void page_is_displayed(String pageName){
        loginPage.verifyTitle(pageName);

    }



    @Then("User logs out")
    public void user_logs_out() {
        profilePage.logOutBttn.click();
        profilePage.verifyTitle("wordpress");
    }

}
