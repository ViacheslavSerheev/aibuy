Feature: Schedule Demo

  Scenario: Schedule Demo from Home Page
    Given I am on home page
    When I click on Schedule Demo Button
    When I enter First Name: "John"
    When I enter Last Name: "Smith"
    When I enter Email: "johnsmithtest@gmail.com"
    When I enter Phone Number: "1234567891"
    When I click on Submit Button
    Then I see Success Message

  Scenario: Schedule Demo from Home Page with incorrect email
    Given I am on home page
    When I click on Schedule Demo Button
    When I enter First Name: "John"
    When I enter Last Name: "Smith"
    When I enter Email: "johnsmithtestgmail.com"
    When I enter Phone Number: "1234567891"
    When I click on Submit Button
    Then I see email error message