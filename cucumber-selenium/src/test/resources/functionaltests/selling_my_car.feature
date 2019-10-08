Feature: Selling My car

  @Sell
  Scenario Outline: Sell my car
    Given I am on car gurus home page
    Then I click on Sell My Car
    Then I click on Sell your car
    And I type <zip code>
    And I select <make>, <model>, <year>, <trim> from dropdown menu
    And I type <mileage> and click on I am still paying ...
    And I type <exterior> and <interior> colors, and <description>
    And I choose a <file>
    And I type <firstName> and <lastName>
    And I click on I am at least ... and sign in

    Examples: 
      | zip code | make     | model   | year   | trim  | mileage | exterior | interior | description             | file                                      | firstName | lastName |
      | "01242"  | "Toyota" | "Prius" | "2005" | "FWD" | "23000" | "black"  | "red"    | "I don't have this car" | "/Users/nijataliyev/Desktop/carGurus.png" | "John"    | "Mendes" |
