Feature: MyAccount-Login Feature
Description: This test case will testthe login functionality

Scenario: Login in with a valid username and password
Given open browser
When user Enters the url "https://practice.automationtesting.in/"
And Clicks on My Account Menu
And Enters registered username and password 
And clicks on login button
Then User must successfully login to the application page

