Feature: News Page

  Scenario: News Page's navigation is correct
    Given I am on news page
    When I click on Videos Tab Button
    Then I see Videos Title
    When I click on News Tab Button
    Then I see News Title
    When I navigate on News Slider