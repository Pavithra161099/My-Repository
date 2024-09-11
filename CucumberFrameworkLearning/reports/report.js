$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\features\\AddToCartInAmazon.feature");
formatter.feature({
  "name": "Add product to cart in amazon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add product to cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Search product \"\u003cbook\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Add to cart",
  "keyword": "And "
});
formatter.step({
  "name": "Cart badge should be updated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "book"
      ]
    },
    {
      "cells": [
        "Start Living Again"
      ]
    },
    {
      "cells": [
        "Rich Dad Poor Dad : What the Rich Teach Their Kids About Money"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User should navigate to the amazon application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginToAmazon.userShouldNavigateToTheAmazonApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add product to cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Search product \"Start Living Again\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginToAmazon.searchProduct(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cdiv role\u003d\"button\" aria-label\u003d\"Watch now\" tabindex\u003d\"-1\" title\u003d\"Watch now\" class\u003d\"adsOverlayClick--1eVwk persistent--Pt2B3\" data-testid\u003d\"OverlayClick\" data-csa-c-action\u003d\"ingress\" data-csa-c-type\u003d\"action\" data-csa-c-channel\u003d\"Sonali\u0027s Recipes\" data-csa-c-title\u003d\"Space Saving Home Storage \u0026amp; Organizers Under ₹500\" data-csa-c-id\u003d\"v32p0-cup7u2-mgw6x2-nqm9nb\"\u003e\u003c/div\u003e is not clickable at point (247, 376). Other element would receive the click: \u003cspan\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d128.0.6613.120)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BLLT-5CD112M01J\u0027, ip: \u0027192.168.16.67\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 128.0.6613.120, chrome: {chromedriverVersion: 128.0.6613.84 (606aa55c7d68..., userDataDir: C:\\Users\\RBCF3~1.PAV\\AppDat...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:56288}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: dceecbe103d4307f310ec06866fa9cb7\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat steps.LoginToAmazon.searchProduct(LoginToAmazon.java:39)\r\n\tat ✽.Search product \"Start Living Again\"(src\\test\\java\\features\\AddToCartInAmazon.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "LoginToAmazon.addToCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Cart badge should be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginToAmazon.cartBadgeShouldBeUpdated()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User should navigate to the amazon application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginToAmazon.userShouldNavigateToTheAmazonApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add product to cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Search product \"Rich Dad Poor Dad : What the Rich Teach Their Kids About Money\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginToAmazon.searchProduct(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cdiv role\u003d\"button\" aria-label\u003d\"Watch now\" tabindex\u003d\"-1\" title\u003d\"Watch now\" class\u003d\"adsOverlayClick--1eVwk persistent--Pt2B3\" data-testid\u003d\"OverlayClick\" data-csa-c-action\u003d\"ingress\" data-csa-c-type\u003d\"action\" data-csa-c-channel\u003d\"Sonali\u0027s Recipes\" data-csa-c-title\u003d\"Space Saving Home Storage \u0026amp; Organizers Under ₹500\" data-csa-c-id\u003d\"s2ylzf-b0liz0-b05zxx-cfksij\"\u003e\u003c/div\u003e is not clickable at point (247, 375). Other element would receive the click: \u003cspan\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d128.0.6613.120)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BLLT-5CD112M01J\u0027, ip: \u0027192.168.16.67\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 128.0.6613.120, chrome: {chromedriverVersion: 128.0.6613.84 (606aa55c7d68..., userDataDir: C:\\Users\\RBCF3~1.PAV\\AppDat...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:56453}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 92bc7385e8a7b08c83d65d847aa26bb4\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat steps.LoginToAmazon.searchProduct(LoginToAmazon.java:39)\r\n\tat ✽.Search product \"Rich Dad Poor Dad : What the Rich Teach Their Kids About Money\"(src\\test\\java\\features\\AddToCartInAmazon.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "LoginToAmazon.addToCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Cart badge should be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginToAmazon.cartBadgeShouldBeUpdated()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src\\test\\java\\features\\login.feature");
formatter.feature({
  "name": "letcode application demo",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.userShouldNavigate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.clickOnLoginLink()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should be success",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter the username as \"preethi161099@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.userEnterTheUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password as \"PaVi@161099\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.userEnterThePasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.userClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.loginShouldBeSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.userShouldNavigate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.clickOnLoginLink()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should be fail",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter the username as \"pavithraraman2@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.userEnterTheUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password as \"PaVi\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.userEnterThePasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.userClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should fail",
  "keyword": "But "
});
formatter.match({
  "location": "LoginStep.loginShouldFail()"
});
formatter.result({
  "status": "passed"
});
});