#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: AutomaztionPractise

  Scenario: Order T-Shirt
    Given user is on login page
		When user enters username "reyazatfarhina@gmail.com"
		And user enters password "GUDDU1coco"
		And user clicks on Login button
		And Validate Successfull Login
		And navigate to TShirts Section
		And Chose List View
		And AddTo Cart the dispayed Tshirt
		And Proceed to Checkout
		
		
	
		
		
		
		


