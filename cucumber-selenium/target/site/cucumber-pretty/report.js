$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionaltests/test.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearch.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for something",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.search_for_something()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});