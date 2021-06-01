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

 @smoke @fillInfo
  Scenario: User fills information on Profile page
    Given User is on WordPress Log In home page
    When User logs in with "arnelamilosavljevic@gmail.com" and "Progres99@" credentials
    Then "Home" page is displayed
    And clicks on "Profile"
    And "Profile" page is displayed
    And User enters "firstName" "Arnela"
    And User enters "lastName" "Milosavljevic"
    And User's displayName is "arnelamilosavljevicgmailcom"
    And User enters "AboutMe" "Hired"
    And User clicks on "Hide my Gravatar profile" toggle
    Then User Saves profile details
    Then User logs out



  @smoke @savedProfileDet
  Scenario: User should be able to review saved profile details
    Given User is on WordPress Log In home page
    When User logs in with "arnelamilosavljevic@gmail.com" and "Progres99@" credentials
    Then "Home" page is displayed
    And clicks on "Profile"
    And "Profile" page is displayed
    And User's firstName is "Arnela"
    And User's lastName is "Milosavljevic"
    And User's displayName is "arnelamilosavljevicgmailcom"
    And User's aboutMe is "Hired"
    And User's gravatar toggle is on
    Then User logs out








