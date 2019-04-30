Feature: Assert Title of Website

Scenario: Get the Title
    Given I am on Homepage 
    Then I get a title of website and assert it equals to "My Store"
    