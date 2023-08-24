@smoke
Feature: Sign In with Account created

  Scenario: Sign In with Valid data
    Given I am on the homepage
    When I navigate to Sign in page
    And fill my data and continue
    And hover to bakery
    And add items to cart
    Then user should be SignIn successfully