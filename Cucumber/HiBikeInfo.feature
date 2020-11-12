Feature: Verify HiBike Informations

Scenario: Try to navigate and open Retail store from HiBike informations

Given User is on HiBike page
And User click on HiBike Retail Store
Then User should be navigate to retail store page 

Scenario: Try to open JobRad Leasing page info 
Given User is on HiBike page
And User clicks on JobRad Leasing title
Then User should be navigate to Brands overview page
