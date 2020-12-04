$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/1_Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginControl"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "deneme",
  "description": "",
  "id": "login;deneme",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationSteps.userOnHomePage()"
});
formatter.result({
  "duration": 10289642100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "",
  "description": "",
  "id": "login;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "the users in the excel file \"userPass.xls\" in the order \u003cuserRow\u003e try to login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login should not be successfull",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login;;",
  "rows": [
    {
      "cells": [
        "userRow"
      ],
      "line": 13,
      "id": "login;;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 14,
      "id": "login;;;2"
    },
    {
      "cells": [
        "2"
      ],
      "line": 15,
      "id": "login;;;3"
    },
    {
      "cells": [
        "5"
      ],
      "line": 16,
      "id": "login;;;4"
    },
    {
      "cells": [
        "8"
      ],
      "line": 17,
      "id": "login;;;5"
    },
    {
      "cells": [
        "10"
      ],
      "line": 18,
      "id": "login;;;6"
    },
    {
      "cells": [
        "13"
      ],
      "line": 19,
      "id": "login;;;7"
    },
    {
      "cells": [
        "35"
      ],
      "line": 20,
      "id": "login;;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginControl"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the users in the excel file \"userPass.xls\" in the order 1 try to login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login should not be successfull",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "userPass.xls",
      "offset": 29
    },
    {
      "val": "1",
      "offset": 56
    }
  ],
  "location": "LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(String,int)"
});
formatter.result({
  "duration": 33761700,
  "error_message": "java.lang.NullPointerException\r\n\tat org.apache.poi.poifs.filesystem.FileMagic.prepareToCheckMagic(FileMagic.java:184)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:224)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:198)\r\n\tat Utilities.MyUtils.getExcelData(MyUtils.java:71)\r\n\tat StepDefinitions.LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(LoginSteps.java:18)\r\n\tat ✽.When the users in the excel file \"userPass.xls\" in the order 1 try to login(src/test/java/Features/1_Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.loginShouldNotBeSuccessfull()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "login;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginControl"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the users in the excel file \"userPass.xls\" in the order 2 try to login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login should not be successfull",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "userPass.xls",
      "offset": 29
    },
    {
      "val": "2",
      "offset": 56
    }
  ],
  "location": "LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(String,int)"
});
formatter.result({
  "duration": 9619100,
  "error_message": "java.lang.NullPointerException\r\n\tat org.apache.poi.poifs.filesystem.FileMagic.prepareToCheckMagic(FileMagic.java:184)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:224)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:198)\r\n\tat Utilities.MyUtils.getExcelData(MyUtils.java:71)\r\n\tat StepDefinitions.LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(LoginSteps.java:18)\r\n\tat ✽.When the users in the excel file \"userPass.xls\" in the order 2 try to login(src/test/java/Features/1_Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.loginShouldNotBeSuccessfull()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginControl"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the users in the excel file \"userPass.xls\" in the order 5 try to login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login should not be successfull",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "userPass.xls",
      "offset": 29
    },
    {
      "val": "5",
      "offset": 56
    }
  ],
  "location": "LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(String,int)"
});
formatter.result({
  "duration": 8418200,
  "error_message": "java.lang.NullPointerException\r\n\tat org.apache.poi.poifs.filesystem.FileMagic.prepareToCheckMagic(FileMagic.java:184)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:224)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:198)\r\n\tat Utilities.MyUtils.getExcelData(MyUtils.java:71)\r\n\tat StepDefinitions.LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(LoginSteps.java:18)\r\n\tat ✽.When the users in the excel file \"userPass.xls\" in the order 5 try to login(src/test/java/Features/1_Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.loginShouldNotBeSuccessfull()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "login;;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginControl"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the users in the excel file \"userPass.xls\" in the order 8 try to login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login should not be successfull",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "userPass.xls",
      "offset": 29
    },
    {
      "val": "8",
      "offset": 56
    }
  ],
  "location": "LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(String,int)"
});
formatter.result({
  "duration": 6957100,
  "error_message": "java.lang.NullPointerException\r\n\tat org.apache.poi.poifs.filesystem.FileMagic.prepareToCheckMagic(FileMagic.java:184)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:224)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:198)\r\n\tat Utilities.MyUtils.getExcelData(MyUtils.java:71)\r\n\tat StepDefinitions.LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(LoginSteps.java:18)\r\n\tat ✽.When the users in the excel file \"userPass.xls\" in the order 8 try to login(src/test/java/Features/1_Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.loginShouldNotBeSuccessfull()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "login;;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginControl"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the users in the excel file \"userPass.xls\" in the order 10 try to login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login should not be successfull",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "userPass.xls",
      "offset": 29
    },
    {
      "val": "10",
      "offset": 56
    }
  ],
  "location": "LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(String,int)"
});
formatter.result({
  "duration": 7213300,
  "error_message": "java.lang.NullPointerException\r\n\tat org.apache.poi.poifs.filesystem.FileMagic.prepareToCheckMagic(FileMagic.java:184)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:224)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:198)\r\n\tat Utilities.MyUtils.getExcelData(MyUtils.java:71)\r\n\tat StepDefinitions.LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(LoginSteps.java:18)\r\n\tat ✽.When the users in the excel file \"userPass.xls\" in the order 10 try to login(src/test/java/Features/1_Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.loginShouldNotBeSuccessfull()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": "login;;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginControl"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the users in the excel file \"userPass.xls\" in the order 13 try to login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login should not be successfull",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "userPass.xls",
      "offset": 29
    },
    {
      "val": "13",
      "offset": 56
    }
  ],
  "location": "LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(String,int)"
});
formatter.result({
  "duration": 9673800,
  "error_message": "java.lang.NullPointerException\r\n\tat org.apache.poi.poifs.filesystem.FileMagic.prepareToCheckMagic(FileMagic.java:184)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:224)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:198)\r\n\tat Utilities.MyUtils.getExcelData(MyUtils.java:71)\r\n\tat StepDefinitions.LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(LoginSteps.java:18)\r\n\tat ✽.When the users in the excel file \"userPass.xls\" in the order 13 try to login(src/test/java/Features/1_Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.loginShouldNotBeSuccessfull()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "login;;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginControl"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the users in the excel file \"userPass.xls\" in the order 35 try to login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "login should not be successfull",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "userPass.xls",
      "offset": 29
    },
    {
      "val": "35",
      "offset": 56
    }
  ],
  "location": "LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(String,int)"
});
formatter.result({
  "duration": 9220200,
  "error_message": "java.lang.NullPointerException\r\n\tat org.apache.poi.poifs.filesystem.FileMagic.prepareToCheckMagic(FileMagic.java:184)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:224)\r\n\tat org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:198)\r\n\tat Utilities.MyUtils.getExcelData(MyUtils.java:71)\r\n\tat StepDefinitions.LoginSteps.theUsersInTheExcelFileInTheOrderTryToLogin(LoginSteps.java:18)\r\n\tat ✽.When the users in the excel file \"userPass.xls\" in the order 35 try to login(src/test/java/Features/1_Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.loginShouldNotBeSuccessfull()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/java/Features/2_Navigation.feature");
formatter.feature({
  "line": 2,
  "name": "Navigation functionality in different window status",
  "description": "",
  "id": "navigation-functionality-in-different-window-status",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@Navigation"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Navigation on menu in maximized window",
  "description": "",
  "id": "navigation-functionality-in-different-window-status;navigation-on-menu-in-maximized-window",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user logged in to basqar",
  "keyword": "And "
});
formatter.match({
  "location": "NavigationSteps.userOnHomePage()"
});
formatter.result({
  "duration": 310330100,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.userLoggedInToBasqar()"
});
formatter.result({
  "duration": 1089419100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "navigate on menu with different browser size",
  "description": "",
  "id": "navigation-functionality-in-different-window-status;navigate-on-menu-with-different-browser-size",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "the browser is \"\u003cbrowserSize\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should navigate to the following links on menu",
  "rows": [
    {
      "cells": [
        "Countries"
      ],
      "line": 14
    },
    {
      "cells": [
        "SalaryConstants"
      ],
      "line": 15
    },
    {
      "cells": [
        "SubjectCategories"
      ],
      "line": 16
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 17
    },
    {
      "cells": [
        "Subjects"
      ],
      "line": 18
    },
    {
      "cells": [
        "PositionSalary"
      ],
      "line": 19
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 20
    },
    {
      "cells": [
        "ExcelTemplate"
      ],
      "line": 21
    },
    {
      "cells": [
        "SalaryTypes"
      ],
      "line": 22
    },
    {
      "cells": [
        "CostCenters"
      ],
      "line": 23
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "navigation-functionality-in-different-window-status;navigate-on-menu-with-different-browser-size;",
  "rows": [
    {
      "cells": [
        "browserSize"
      ],
      "line": 27,
      "id": "navigation-functionality-in-different-window-status;navigate-on-menu-with-different-browser-size;;1"
    },
    {
      "cells": [
        "big"
      ],
      "line": 28,
      "id": "navigation-functionality-in-different-window-status;navigate-on-menu-with-different-browser-size;;2"
    },
    {
      "cells": [
        "max"
      ],
      "line": 29,
      "id": "navigation-functionality-in-different-window-status;navigate-on-menu-with-different-browser-size;;3"
    },
    {
      "cells": [
        "half"
      ],
      "line": 30,
      "id": "navigation-functionality-in-different-window-status;navigate-on-menu-with-different-browser-size;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "navigate on menu with different browser size",
  "description": "",
  "id": "navigation-functionality-in-different-window-status;navigate-on-menu-with-different-browser-size;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Navigation"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the browser is \"big\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should navigate to the following links on menu",
  "rows": [
    {
      "cells": [
        "Countries"
      ],
      "line": 14
    },
    {
      "cells": [
        "SalaryConstants"
      ],
      "line": 15
    },
    {
      "cells": [
        "SubjectCategories"
      ],
      "line": 16
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 17
    },
    {
      "cells": [
        "Subjects"
      ],
      "line": 18
    },
    {
      "cells": [
        "PositionSalary"
      ],
      "line": 19
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 20
    },
    {
      "cells": [
        "ExcelTemplate"
      ],
      "line": 21
    },
    {
      "cells": [
        "SalaryTypes"
      ],
      "line": 22
    },
    {
      "cells": [
        "CostCenters"
      ],
      "line": 23
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "big",
      "offset": 16
    }
  ],
  "location": "NavigationSteps.theBrowserIs(String)"
});
formatter.result({
  "duration": 587624500,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.userNavigateToTheFollowingLinksOnMenu(DataTable)"
});
formatter.result({
  "duration": 17344699000,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "navigate on menu with different browser size",
  "description": "",
  "id": "navigation-functionality-in-different-window-status;navigate-on-menu-with-different-browser-size;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Navigation"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the browser is \"max\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should navigate to the following links on menu",
  "rows": [
    {
      "cells": [
        "Countries"
      ],
      "line": 14
    },
    {
      "cells": [
        "SalaryConstants"
      ],
      "line": 15
    },
    {
      "cells": [
        "SubjectCategories"
      ],
      "line": 16
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 17
    },
    {
      "cells": [
        "Subjects"
      ],
      "line": 18
    },
    {
      "cells": [
        "PositionSalary"
      ],
      "line": 19
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 20
    },
    {
      "cells": [
        "ExcelTemplate"
      ],
      "line": 21
    },
    {
      "cells": [
        "SalaryTypes"
      ],
      "line": 22
    },
    {
      "cells": [
        "CostCenters"
      ],
      "line": 23
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "max",
      "offset": 16
    }
  ],
  "location": "NavigationSteps.theBrowserIs(String)"
});
formatter.result({
  "duration": 136725400,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.userNavigateToTheFollowingLinksOnMenu(DataTable)"
});
formatter.result({
  "duration": 12873917300,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "navigate on menu with different browser size",
  "description": "",
  "id": "navigation-functionality-in-different-window-status;navigate-on-menu-with-different-browser-size;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Navigation"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the browser is \"half\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should navigate to the following links on menu",
  "rows": [
    {
      "cells": [
        "Countries"
      ],
      "line": 14
    },
    {
      "cells": [
        "SalaryConstants"
      ],
      "line": 15
    },
    {
      "cells": [
        "SubjectCategories"
      ],
      "line": 16
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 17
    },
    {
      "cells": [
        "Subjects"
      ],
      "line": 18
    },
    {
      "cells": [
        "PositionSalary"
      ],
      "line": 19
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 20
    },
    {
      "cells": [
        "ExcelTemplate"
      ],
      "line": 21
    },
    {
      "cells": [
        "SalaryTypes"
      ],
      "line": 22
    },
    {
      "cells": [
        "CostCenters"
      ],
      "line": 23
    },
    {
      "cells": [
        "Dashboard"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "half",
      "offset": 16
    }
  ],
  "location": "NavigationSteps.theBrowserIs(String)"
});
formatter.result({
  "duration": 584539000,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.userNavigateToTheFollowingLinksOnMenu(DataTable)"
});
formatter.result({
  "duration": 17686962900,
  "status": "passed"
});
});