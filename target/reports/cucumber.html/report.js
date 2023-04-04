$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature1/techfios.feature");
formatter.feature({
  "name": "Techfios colour page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "White Background Change with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scinerio2"
    }
  ]
});
formatter.step({
  "name": "User Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.colourpage.user_Set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the button2",
  "keyword": "When "
});
formatter.match({
  "location": "steps.colourpage.user_click_on_the_button2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.colourpage.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "passed"
});
});