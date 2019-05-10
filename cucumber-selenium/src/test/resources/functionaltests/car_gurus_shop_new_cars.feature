Feature: Shopping for cars

  @CarGuru
  Scenario Outline: Shop for the new car
    Given I am on car gurus home page
    When I click on New Cars
    Then I click on Shop Cars and handle pop up menu
    Then I select all mandatory fields <make> , <model> , <year>, <miles>, <trim>, and <zipcode>

    Examples: 
      | make     | model   | year   | miles   | trim    | zipcode |
      | "Toyota" | "Camry" | "2018" | "25 mi" | "L" | "02155" |
