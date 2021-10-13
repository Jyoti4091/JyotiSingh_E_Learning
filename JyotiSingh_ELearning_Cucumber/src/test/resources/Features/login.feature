Feature: Testing E-Learning Functionalities

  #Scenario-1
  Scenario: To verify whether application allows user to get registered as Student
    Given User has launched the E-Learning application
    When User clicks on Sign up! link
    And Enter valid credential in First name textbox
    And Enter valid credential in Last name textbox
    And Enter valid credential in e-mail textbox
    And Enter valid credential in username textbox
    And Enter valid credential in pass textbox
    And Enter valid credential in confirm password textbox
    And Enter valid credential in phone textbox
    And Selected Valid credentials from Language list box
    And Click Student radio button in Profile
    And Click on Register button
    Then User got registered as Student successfully

  #Scenario-2
  Scenario: To verify whether application allows student to get logged in by entering valid credentials
    Given User should have launched the application
    When Enter valid credentials in Username textbox
    And Enter valid credential in pass text box
    And Click on Login button
    Then Student Home page should get displayed

  #Scenario-3
  Scenario: To verify whether application allows user to change the password in Edit Profile page
    Given E-Learning pplication has been launched by user
    And User should have logged in as student and present in Home page
    When Click on Edit Profile link
    And Enter valid credentials in pass textbox
    And Enter valid credentials in New password textbox
    And Enter valid credentials in Confirm password textbox
    And Click on Save Changes
    Then New profile should be saved successfully
