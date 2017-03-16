Feature: Survey Input Test

Scenario: Test a Survey
Given I am on the survey input page
And i choose the Cuyahoga Valley National Park
And i enter the email address beiberfanboy@aol.com
And i enter the state is Ohio
And i enter activity level inactive
When i submit the survey 
#Then i win

Scenario: Test a Park
Given I am on the Home Page
When I click the link for Cuyahoga Valley National Park
Then I am taken to the park detail page
And the title is Cuyahoga Valley National Park
And the elevation