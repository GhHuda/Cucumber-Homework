@TechfiosLoginFeature @regression
Feature: Techfios login functionality validation

Background: 
Given User is on techfios login page
When User enters username as "demo@techfios.com"

@Login1 @smoke
Scenario: User should be able to login with valid credential
#Given User is on techfios login page

#When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks on signin button

Then User should land on dashboard page


@Login2
Scenario: User should not be able to login with invalid credential
#Given User is on techfios login page

#When User enters username as "demo@techfios.com"
When User enters password as "abc1234"
When User clicks on signin button

Then User should land on dashboard page