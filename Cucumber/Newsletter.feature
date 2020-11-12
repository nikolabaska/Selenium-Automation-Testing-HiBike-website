Feature: Verify HIBIKE NEWSLETTER functionality

Scenario: Input valid email address into Newsletter field

Given User nagivate open HiBike home page and navigate to Newsletter field
When User type valid email address and click on subscribe button
Then User should be navigate to new confirmatation text page

Scenario: Input invalid email address into Newsletter field
Given User nagivate open HiBike home page and navigate to Newsletter field
When User type invalid simbols an characters and clicks on subscribe button
Then User should be navigate to new text page with eror info