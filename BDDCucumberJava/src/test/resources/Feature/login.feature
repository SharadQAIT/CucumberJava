# Author
# Date
# Description

Feature: feature to login test functionality

  Scenario: Check login is successfully with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
    
    
