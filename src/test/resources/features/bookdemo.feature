Feature: Book Demo

  Scenario: Book Demo from Home Page for 30 minutes in Kyiv Timezone
    Given I am on home page
    When I click on Book Demo Button
    When I select available date
    When I select thirty minutes demo
    When I select Demo Time
    When I enter First Name to Book: "John"
    When I enter Last Name to Book: "Smith"
    When I enter Email to Book: "johnsmithtest@gmail.com"
#    When I click Submit Button
#    Then I see Success Message after book

  Scenario: Book Demo from Home Page for 1 hour and go back while editing
    Given I am on home page
    When I click on Book Demo Button
    When I select available date
    When I select one hour demo
    When I select Demo Time
    When I enter First Name to Book: "John"
    When I enter Last Name to Book: "Smith"
    When I enter Email to Book: "johnsmithtest@gmail.com"
#    When I click Back Button

  Scenario: Book Demo from Home Page for 1 hour and US/Pacific Timezone
    Given I am on home page
    When I click on Book Demo Button
    When I select available date
    When I select one hour demo
    When I select Timezone
    When I select Demo Time
    When I enter First Name to Book: "John"
    When I enter Last Name to Book: "Smith"
    When I enter Email to Book: "johnsmithtest@gmail.com"
