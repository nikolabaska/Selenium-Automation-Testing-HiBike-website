Feature: Create Account

Scenario: Try to create account with valid email and password

Given User navigate to HIbike home page
And User clicks on MyAccount 
And User navigate to new account form and type valid email and password
Then User Repeat his password and procced by clicking on Create new account button


Scenario: Try to create account with invalid email address
Given User navigate to HIbike home page
And User clicks on MyAccount 
And User navigate to new account form and type invalid email and password
Then User Repeat his password and procced by clicking on Create new account button