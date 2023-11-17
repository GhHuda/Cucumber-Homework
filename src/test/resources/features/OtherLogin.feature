@OtherLoginFeature @regression
Feature: Other Techfios login functionality validation

@OtherLogin1
Scenario Outline: User should not be able to login with invalid credential
Given User is on techfios login page

When User enters username as "<username>"
When User enters password as "<password>"
When User clicks on signin button

Then User should land on dashboard page

Examples:
|username|password|
|demo@techfios.com|abc123|
|demo@techfios.com|abc1234|
|demo1@techfios.com|abc1234|


#@OtherLogin2 @smoke
#Scenario: User should not be able to login with invalid credential
#Given User is on techfios login page
#
#When User enters username as "demo@techfios.com"
#When User enters password as "abc1234"
#When User clicks on sigin button
#
#Then User should land on dashboard page
#
#
#@OtherLogin3
#Scenario: User should not be able to login with invalid credential
#Given User is on techfios login page
#
#When User enters username as "demo1@techfios.com"
#When User enters password as "abc1234"
#When User clicks on sigin button
#
#Then User should land on dashboard page