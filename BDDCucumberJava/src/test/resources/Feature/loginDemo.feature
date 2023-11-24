Feature: Login Functionality

  Scenario: Verify successful login with correct username and password
    Given the user opens the browser
    When the user navigates to the login page
    And enters the correct username and password
    And clicks the login button
    And the user has entered the OTP
    And clicks the verify button
    Then The user is navigated to home page 

 