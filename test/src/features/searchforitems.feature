Feature: Searching for items
  I want to search for a couple items

  Scenario Outline: 
    Given I am on Home Page
    Then I search for "<item>"

    Examples: 
      | item   |
      | dress  |
      | blouse |
