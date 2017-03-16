Feature: Survey Input Page

Scenario: Test a Survey
Given I am on the survey input page
And I choose the park Cuyahoga Valley National Park
And I enter the email address beiberfanboy@aol.com
And I enter the state Ohio
And I choose the activity level Inactive
When I submit the survey
Then The Url base should be http://localhost:8080/m3-java-capstone/surveyResults

