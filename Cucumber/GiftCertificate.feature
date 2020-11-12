Feature: Verify Gift Certificate functionality

Scenario: Try to bye gift voucher as a guest 

Given User is o HiBike home page
And User navigate and clicks on Gift Certificate
And User select from gift voucher dropdown menu 
And User add voucher to the cart and procced to checkout
Then User  gift voucher should be in the cart 


Scenario: Try to bye gift voucher as a loged in user
Given User login with his valid credentials
When User navigate and clicks on Gift Certificate
And User select from gift voucher dropdown menu 
And User add voucher to the cart and procced to checkout
Then User  gift voucher should be in the cart 