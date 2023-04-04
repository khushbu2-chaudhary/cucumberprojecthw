@LoginFeature @Regression

Feature: Techfios colour page functionality validation

@Scinerio1
Scenario: User should be able to change colour with valid credential
 Given Set SkyBlue Background button exists
 When I click on the button
 Then the background color will change to sky blue

@Scinerio2
Scenario: White Background Change with valid credential
Given User Set SkyWhite Background button exists
When User click on the button2
Then the background color will change to white

