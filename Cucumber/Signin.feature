Feature: Sign in functionality

Scenario: Verify login functionality with valid credentials

Given User is on HiBike home page 
When User navigate to Sign in 
And User type his valid email and valid password
And User procced by clicking on Login  button 
Then User is succesfull loged in

Scenario: Verify login functionality with invalid email and valid password
Given User is on HiBike home page
When user navigate to Sign in form 
And User type invalid email and valid password
And usser procced by clicking on Login button
Then User should not be able to log in

Scenario: Verify login functionality with valid email and invalid password
Given User is on HiBike home page
When user navigate to Sign in form 
And User type valid email and invalid password
And usser procced by clicking on Login button
Then User should not be able to log in
