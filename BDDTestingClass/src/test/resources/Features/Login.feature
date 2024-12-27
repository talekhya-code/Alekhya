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
Feature: Login Feature

  Background: 
    Given The application is launched
    When User clicks the login button

  Scenario: Verify login page in Free CRM
    Then Verify the Login Page have all fields

  Scenario Outline: Login to the CRM app using credentials
    When User enters the <UserId> and <Password>
    When User clicks the login button on login page
    Then Verify user is navigated to Home Page

    Examples: 
      | UserId               | Password    |
      | alekhyat02@gmail.com | Alekhya@t02 |
