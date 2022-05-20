$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("visaConfirmationTest.feature");
formatter.feature({
  "line": 1,
  "name": ": Home office visa check",
  "description": "As user I want to test Home office visa check functionality",
  "id": ":-home-office-visa-check",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3438948400,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify a columbian national coming to the uk to join a partner for a long stay they do have an article 10Or20 Card",
  "description": "",
  "id": ":-home-office-visa-check;verify-a-columbian-national-coming-to-the-uk-to-join-a-partner-for-a-long-stay-they-do-have-an-article-10or20-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I am in homepage of homeoffice website",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I Click on start button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I Select a Nationality colombia \"Colombia\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I Click on Continue button for Colombia",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I Select reason jpf\u0027Join partner or family for a long stay\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I Click on Continue button for Join partner or family for a long stay",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Select state My partner of family member have uk immigration status \"yes\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I Click on Continue button for immigration status",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I verify result \u0027You\u0027ll need a visa to join your family or partner in the Uk\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "visacheck.iAmInHomepageOfHomeofficeWebsite()"
});
formatter.result({
  "duration": 111736700,
  "status": "passed"
});
formatter.match({
  "location": "visacheck.iClickOnStartButton()"
});
formatter.result({
  "duration": 20259145800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Colombia",
      "offset": 33
    }
  ],
  "location": "visacheck.iSelectANationalityColombia(String)"
});
formatter.result({
  "duration": 108930700,
  "status": "passed"
});
formatter.match({
  "location": "visacheck.iClickOnContinueButtonForColombia()"
});
formatter.result({
  "duration": 194923300,
  "status": "passed"
});
formatter.match({
  "location": "visacheck.iSelectReasonJpfJoinPartnerOrFamilyForALongStay()"
});
formatter.result({
  "duration": 20035776600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027rTesponse4\u0027]\"}\n  (Session info: chrome\u003d101.0.4951.67)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027LAPTOP-UEJFETJP\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [f051cb0bb8cbf76c1ad6b431eeaa988f, findElement {using\u003dxpath, value\u003d//input[@id\u003d\u0027rTesponse4\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.67, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\surbh\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63081}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63081/devtoo..., se:cdpVersion: 101.0.4951.67, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f051cb0bb8cbf76c1ad6b431eeaa988f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat gov.uk.check.visa.utility.Utility.clickOnElement(Utility.java:49)\r\n\tat gov.uk.check.visa.pages.ReasonForTravelPage.reasonForTravelling1(ReasonForTravelPage.java:33)\r\n\tat gov.uk.check.visa.steps.visacheck.iSelectReasonJpfJoinPartnerOrFamilyForALongStay(visacheck.java:118)\r\n\tat ✽.And I Select reason jpf\u0027Join partner or family for a long stay\u0027(visaConfirmationTest.feature:31)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "visacheck.iClickOnContinueButtonForJoinPartnerOrFamilyForALongStay()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "yes",
      "offset": 71
    }
  ],
  "location": "visacheck.iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "visacheck.iClickOnContinueButtonForImmigrationStatus()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "visacheck.iVerifyResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUk()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 875424100,
  "status": "passed"
});
});