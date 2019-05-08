$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionaltests/kbb_next_car.feature");
formatter.feature({
  "name": "Price My Next Car",
  "description": "  I want verify Price My Next Car feature works as per requirement",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Price of new car",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PriceCar"
    }
  ]
});
formatter.step({
  "name": "I am on KBB Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Car Values",
  "keyword": "Then "
});
formatter.step({
  "name": "I select \"\u003cmake\u003e\" and \"\u003cmodel\u003e\" of the car",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on Price My Next Car",
  "keyword": "And "
});
formatter.step({
  "name": "I choose \"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "make",
        "model",
        "year"
      ]
    },
    {
      "cells": [
        "Audi",
        "A4",
        "2018"
      ]
    },
    {
      "cells": [
        "BMW",
        "M5",
        "2019"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Price of new car",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PriceCar"
    }
  ]
});
formatter.step({
  "name": "I am on KBB Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "KBBMenuBarSteps.i_am_on_KBB_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Car Values",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceMyNextCar.i_click_on_Car_Values()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Audi\" and \"A4\" of the car",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceMyNextCar.i_select_and_of_the_car(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Price My Next Car",
  "keyword": "And "
});
formatter.match({
  "location": "PriceMyNextCar.i_click_on_Price_My_Next_Car()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose \"2018\"",
  "keyword": "And "
});
formatter.match({
  "location": "PriceMyNextCar.i_choose(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Price of new car",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PriceCar"
    }
  ]
});
formatter.step({
  "name": "I am on KBB Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "KBBMenuBarSteps.i_am_on_KBB_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Car Values",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceMyNextCar.i_click_on_Car_Values()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"BMW\" and \"M5\" of the car",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceMyNextCar.i_select_and_of_the_car(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Price My Next Car",
  "keyword": "And "
});
formatter.match({
  "location": "PriceMyNextCar.i_click_on_Price_My_Next_Car()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose \"2019\"",
  "keyword": "And "
});
formatter.match({
  "location": "PriceMyNextCar.i_choose(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using partial link text\u003d2018\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Nijats-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:10d5:14c9:3620:5e48%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.3\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByPartialLinkText(RemoteWebDriver.java:388)\n\tat org.openqa.selenium.By$ByPartialLinkText.findElement(By.java:250)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat pages.KBBCarValues.selectYear(KBBCarValues.java:36)\n\tat stepDefinitions.PriceMyNextCar.i_choose(PriceMyNextCar.java:32)\n\tat ✽.I choose \"2019\"(file:src/test/resources/functionaltests/kbb_next_car.feature:10)\n",
  "status": "failed"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dMac OS X 10.14.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Nijats-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:10d5:14c9:3620:5e48%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.3\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: /var/folders/xw/v5z1hhqn4vv...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:50284}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 7b3df15edf669e903c9dd99e0e975371\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:442)\n\tat utils.Driver.closeDriver(Driver.java:33)\n\tat stepDefinitions.Hooks.tearDown(Hooks.java:16)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\n",
  "status": "failed"
});
});