$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TechfiosBilling.feature");
formatter.feature({
  "name": "Techfios Other billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BillingFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the \"\u003cpassword\u003e\" in the password field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on bankCash",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on newAccount",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountTitle\u003e\" in the accountTitle field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the description field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the initialBalance field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the accountNumber field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the contactPerson field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cPhone\u003e\" in the Phone field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinternetBankingURL\u003e\" in the internetBankingURL field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "Phone",
        "internetBankingURL"
      ]
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Huda Saving Account",
        "Saving Account",
        "$50000",
        "12345678",
        "Huda",
        "9451230000",
        "http://www.testbanking.com"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BillingFeature"
    }
  ]
});
formatter.step({
  "name": "User enters the \"demo@techfios.com\" in the username field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_enters_the_in_the_username_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"abc123\" in the password field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_enters_the_in_the_password_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on bankCash",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_clicks_on_bankCash()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on newAccount",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_clicks_on_newAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Huda Saving Account\" in the accountTitle field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_enters_in_the_accountTitle_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Saving Account\" in the description field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_enters_in_the_description_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"$50000\" in the initialBalance field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_enters_in_the_initialBalance_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"12345678\" in the accountNumber field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_enters_in_the_accountNumber_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Huda\" in the contactPerson field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_enters_in_the_contactPerson_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"9451230000\" in the Phone field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_enters_in_the_Phone_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"http://www.testbanking.com\" in the internetBankingURL field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_enters_in_the_internetBankingURL_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_clicks_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.HomeWorkLoginStepDefinition.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});