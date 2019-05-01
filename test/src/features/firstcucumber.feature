Feature: Assert Title Of Website

	Background:
	 Given I am on Home Page

  Scenario: Get the title of web application
   
    Then I get a title of website and assert it equals to My Store
    Then I hover over DRESS menu and click CASUAL DRESSES
    And I verify CASUAL DRESSES appears in breadcrumb

  
