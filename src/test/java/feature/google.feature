Feature: Google search
Background:
Given I am on the Google search page
@smoke 
   Scenario: Finding some cheese
  
  When I search for "Cheese!"
  Then the page title should start with "cheese"
@smoke 
  Scenario: Finding Cucumber in Google
  
  When I search for "Cucumber BDD!"
  Then the page title should start with "Cucumber"

  Scenario Outline: Finding different keywords in Google
    When I search for "<keyword>"
    Then the page title should start with "<keyword1>"

  Examples:
    | keyword  |  |keyword1|
    | Selenium |  |Selenium|
    | Postman   |  |Postman |