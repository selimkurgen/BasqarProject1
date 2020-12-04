$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/1_Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "login page",
  "description": "",
  "id": "login;login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logged in to basqar",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_on_home_page()"
});
formatter.result({
  "duration": 10078619200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_logged_in_to_basqar()"
});
formatter.result({
  "duration": 1064634300,
  "status": "passed"
});
formatter.uri("src/test/java/Features/3.1_Country.feature");
formatter.feature({
  "line": 1,
  "name": "In this feature Country processes are proceeds",
  "description": "",
  "id": "ın-this-feature-country-processes-are-proceeds",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user logged in to basqar",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_on_home_page()"
});
formatter.result({
  "duration": 13654094300,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.partialLinkText: Got it (tried for 10 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat Utilities.ParentClass.waitToBeExistFor(ParentClass.java:160)\r\n\tat Utilities.ParentClass.waitToBeVisibleFor(ParentClass.java:164)\r\n\tat Utilities.ParentClass.waitToBeEnableFor(ParentClass.java:170)\r\n\tat Utilities.ParentClass.clickTo(ParentClass.java:111)\r\n\tat Pages.HomePage.prepareLogin(HomePage.java:27)\r\n\tat StepDefinitions.LoginSteps.user_on_home_page(LoginSteps.java:29)\r\n\tat ✽.Given user on home page(src/test/java/Features/3.1_Country.feature:6)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"partial link text\",\"selector\":\"Got it\"}\n  (Session info: chrome\u003d87.0.4280.66)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SELIM\u0027, ip: \u0027192.168.178.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.66, chrome: {chromedriverVersion: 87.0.4280.20 (c99e81631faa0..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:55769}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d47ff95dabc719337902ba56f6f69bf3\n*** Element info: {Using\u003dpartial link text, value\u003dGot it}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByPartialLinkText(RemoteWebDriver.java:388)\r\n\tat org.openqa.selenium.By$ByPartialLinkText.findElement(By.java:250)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:182)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:179)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat Utilities.ParentClass.waitToBeExistFor(ParentClass.java:160)\r\n\tat Utilities.ParentClass.waitToBeVisibleFor(ParentClass.java:164)\r\n\tat Utilities.ParentClass.waitToBeEnableFor(ParentClass.java:170)\r\n\tat Utilities.ParentClass.clickTo(ParentClass.java:111)\r\n\tat Pages.HomePage.prepareLogin(HomePage.java:27)\r\n\tat StepDefinitions.LoginSteps.user_on_home_page(LoginSteps.java:29)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.runBackground(CucumberScenario.java:59)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:42)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:134)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:597)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:816)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1510)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:766)\r\n\tat org.testng.TestRunner.run(TestRunner.java:587)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:384)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:286)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1187)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1109)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1039)\r\n\tat org.testng.TestNG.run(TestNG.java:1007)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:110)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.user_logged_in_to_basqar()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 9,
  "name": "country",
  "description": "",
  "id": "ın-this-feature-country-processes-are-proceeds;country",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user navigate to country page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user create a country as \"countryName11\" and code as \"countryCode11\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "country should be created",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user delete the name as \"countryName11\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "country should be deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "CountrySteps.userNavigateToCountryPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "countryName11",
      "offset": 26
    },
    {
      "val": "countryCode11",
      "offset": 54
    }
  ],
  "location": "CountrySteps.userCreateACountryAsAndCodeAs(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CountrySteps.countryShouldBeCreated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "countryName11",
      "offset": 25
    }
  ],
  "location": "CountrySteps.user_delete_the_name_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CountrySteps.countryShouldBeDeleted()"
});
formatter.result({
  "status": "skipped"
});
});