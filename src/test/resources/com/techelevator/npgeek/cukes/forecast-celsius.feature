Feature: Celsius button test

Scenario: Get a Celsius forecast
Given I am on the forecast page for Cuyahoga Valley National Park
When I click on the celsius button
Then I am taken to http://localhost:8080/m3-java-capstone/forecastDetail?tempUnit=celsius&parkCode=CVNP
And the celsius low is 3.33
And the celsius high is 16.67