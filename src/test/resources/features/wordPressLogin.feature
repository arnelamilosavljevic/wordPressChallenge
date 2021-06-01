Feature: WordPress Log In functionality
  Agile story: As a user, when I am on the Words Press Log In page,
I should be able to login with given credentials and press on MyProfile page.

  @smoke @login
  Scenario: Login
    Given User is on WordPress Log In home page
    When User logs in
    Then "Home" page is displayed
    And clicks on "Profile"
    And "Profile" page is displayed
    Then User logs out









