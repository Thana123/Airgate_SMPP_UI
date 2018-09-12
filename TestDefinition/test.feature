Feature: test

 
Scenario: Create connection in Air Gateway system
When Open "http://www.google.com" and "12" and "13" login
Then I verify that the page displays createconnection
And the page displays AG createconnection button
 
