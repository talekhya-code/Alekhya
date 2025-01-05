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
Feature: Contacts Feature

  Background: 
    Given The application is launched
    When User clicks the login button
    When User enters the alekhyat02@gmail.com and Alekhya@t02
    When User clicks the login button on login page
    Then Verify user is navigated to Home Page
    And User clicks on Contacts

  @tag1
  Scenario: Creating a contact, editing and then deleting
    When User clicks on create button
    Then Verify user is navigated to create new contact page
    And User enter the mandatory fields
    And User clicks on save button
    Then Verify the contact is created
    When User clicks on edit icon
    Then Edit firstname and lastname
    And User clicks on save button
    Then User clicks on delete icon
    Then User clicks on delete button on popup

  @tag2
  Scenario: Creating a contact
    When User clicks on create button
    Then Verify user is navigated to create new contact page
    And User enter the mandatory fields
    And User clicks on save button
    Then Verify the contact is created

  @tag3
  Scenario: Editing a contact from the list
    When User clicks on Edit icon for a particular contact
    Then Edit firstname and lastname
    And User clicks on save button

  @tag4
  Scenario: Deleting a contact from the list
    When User clicks on Delete icon for a particular contact
    Then User clicks on delete button on popup

  @tag5
  Scenario: Creating a contact and editing
    When User clicks on create button
    Then Verify user is navigated to create new contact page
    And User enter the mandatory fields
    And User clicks on save button
    Then Verify the contact is created
    When User clicks on edit icon
    Then Edit firstname and lastname
    And User clicks on save button

  @tag6
  Scenario: Creating a contact and deleting
    When User clicks on create button
    Then Verify user is navigated to create new contact page
    And User enter the mandatory fields
    And User clicks on save button
    Then Verify the contact is created
    Then User clicks on delete icon
    Then User clicks on delete button on popup

  @tag7
  Scenario: Editing a contact and deleting
    When User clicks on Edit icon for a particular contact
    Then Edit firstname and lastname
    And User clicks on save button
    Then User clicks on delete icon
    Then User clicks on delete button on popup
