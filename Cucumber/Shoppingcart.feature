Feature: Verify functionality of adding product to the cart  

Scenario: Try to add product into the cart as a guest

Given User navigate to HiBike home page
When User navigate to main menu 
And User select product from Bicycle submenu
And User select options for his product and clicks on add to cart button
And User procced by clicking on Go to cart button 
Then User product is succesful added to the cart

Scenario: Login and try to add product into the cart 
Given  User navigate to HiBike home page
When User signin with valid credentials
And User select his product from Bicycle submenu
And User select product options  and clicks on add to cart button
And User procced by clicking on Go to cart 
Then User product is succesful added to the cart