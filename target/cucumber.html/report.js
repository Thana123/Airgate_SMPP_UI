$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestDefinition/test.feature");
formatter.feature({
  "name": "test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create connection in Air Gateway system",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "SelChromeDriver.getdriver()"
});
formatter.result({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\HaridasT\\Desktop\\Automation\\CuCumberAutomation\\Airgate_SMPP\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:116)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$0(ChromeDriverService.java:1)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:296)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:148)\r\n\tat Browser.SelChromeDriver.getdriver(SelChromeDriver.java:21)\r\n\tat ✽.launch Chrome browser(TestDefinition/test.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Open AG URL and login",
  "keyword": "When "
});
formatter.match({
  "location": "Login.loginmavenir(WebDriver)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify that the page displays createconnection",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the page displays AG createconnection button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});