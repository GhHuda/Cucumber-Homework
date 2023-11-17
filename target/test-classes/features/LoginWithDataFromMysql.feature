@DBLoginFeature
Feature: Teschfios login functionality validation 
Background:  
Given User is on codefios login page 

Scenario: User should be able to login using valid credential
When User enters "username" from mysql database
When User enters "password" from mysql database
When User clicks on signin button

Then User should land on dashboard page 

