Feature: Price My Next Car
  I want verify Price My Next Car feature works as per requirement

  @PriceCar
  Scenario Outline: Price of new car
    Given I am on KBB Home Page
    Then I click on Car Values
    Then I select "<make>" and "<model>" of the car
    And I click on Price My Next Car
    And I choose "<year>"

    Examples: 
      | make | model | year |
      | Audi | A4    | 2018 |
      | BMW  | M5    | 2019 |
