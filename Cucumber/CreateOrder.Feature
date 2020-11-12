Feature: Creat order as a login user 

Scenario: Try to make order as a login user

Given  User is on HiBike hpage
When User sign in with valid credentials
And User select his product from Bicycle menu and submenu
And User select product options  and clicks on add to cart 
And User procced by clicking on Go to cart btn
Then User product is succesful added to his cart
And User click on checkout button and procced to Invoice address
Then User fill the invoice address fields and click on save button

Scenario: Try to make order as a guest
Given  User is on HiBike hpage
And User select his product from Bicycle menu and submenu
And User select product options  and clicks on add to cart 
And User procced by clicking on Go to cart btn
Then User product is succesful added to his cart
And User click on checkout button 
Then User shoul see optios to order as a guest 
