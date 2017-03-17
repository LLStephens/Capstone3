Feature: Forecast Page

Scenario: Get a forecast
Given I am on the Cuyahoga Valley National Park page
When I click the forecast link
Then I land on http://localhost:8080/m3-java-capstone/forecastDetail?parkCode=CVNP
And the forecast value is 1
And the low is 38
And the high is 62
And forecast is rain
And the first recommendation is -Wear breathable layers
And the second recommendation is -Pack rain gear and wear waterproof shoes


#Scenario: Get a Celsius forecast
#Given I am on the Cuyahoga Valley National Park Farenheit forecast page
#When I click the celsius button
#Then I land on http://localhost:8080/m3-java-capstone/forecastDetail?tempUnit=celsius&parkCode=CVNP
#And the low is 3.33
#And the high is 16.67

