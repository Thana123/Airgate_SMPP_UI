Feature: test
 
Scenario: Create connection in Air Gateway system
Given launch "C:\testdata\SMSC Override\Browser\chromedriver.exe" browser
When Open "driver" and "www.google.com" and "" and "" login
Then I verify that the page displays createconnection
And the page displays AG createconnection button
 
