package com.wordpress.step_definitions;

import com.wordpress.pages.ProfilePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class ProfilePageStepDefs {
    ProfilePage profilePage = new ProfilePage();

    @Then("User enters {string} {string}")
    public void user_enters(String fieldName, String input) {
        profilePage.clear_field(fieldName);
        profilePage.enter_input_for_field(fieldName,input);
        profilePage.verifyValueOfField(fieldName, input);


    }

    @Then("User clicks on {string} toggle")
    public void user_clicks_on_toggle(String string) {
        if (!profilePage.toggle.isSelected()) {
            profilePage.toggle.click();
        }
    }
    @Then("User Saves profile details")
    public void user_saves_profile_details() {
        profilePage.saveBttn.click();
    }

    @Then("User's {} is {string}")
    public void user_s_first_name_is(String fieldName, String value) {
        profilePage.verifyValueOfField(fieldName, value);
    }

    @Then("User's gravatar toggle is on")
    public void user_s_gravatar_toggle_is_on() {
        Assert.assertTrue(profilePage.toggle.isSelected());
    }
}
