@smoke
Feature: Create Jumia Account

  Scenario: Create a new account
    Given I am on the Jumia homepage
    When I click on the Account link and choose Sign in
    And fill my data and submit
    Then user should be registered successfully