Feature: Top Menu Bar
  I want verify all the menus in top menu bar exist and clickable

  @TopMenuBar
  Scenario: Menu items from top Menu Bar
    Given I am on KBB Home Page
    Then I get all menus from top
    And I verify all the menus are exist and are clickable


  
