Feature: Login to a website

  Scenario: Succesfull login to a website
    Given I am on the login page
    When I enter valid username and password
    And I click on Login button
    Then I should be logged in
