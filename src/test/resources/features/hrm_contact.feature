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
Feature: Title of your feature
  I want to use this template for my feature file

Background:
Given User is already logged in to application
|username|password|
|Admin|admin123|

  @tag1
  Scenario: Contact Data
  
    Given Employee in Employeepage
    When Click on the info tab
    And click contact details tab
    And User in contact Details page
    When Enter the contact information 
    |Street1|Street2|City|State|Home|Mobile|Work|WorkMail|OtherMail|
    |adssfd|wrwet|Pen|NJ|12345|3456|34355|djfhdsj@gmail.com|sdgsads@gmail.com|
    And Click on save
    Then I validate the outcomes
   

  
