package runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/Features/1_Login.feature","src/test/java/Features/3.1_Country.feature","src/test/java/Features/3.2_City.feature"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/Login_City_Country_Test.html"


//        "html:target/basqar-report",
//       "json:target/basqar.json"
}
)
public class Login_City_Country_Test extends AbstractTestNGCucumberTests {



//    @AfterClass
//    public static void afterClass() {
//
//        Reporter.loadXMLConfig("src/test/java/XMLfiles/AllTest.xml");
//        Reporter.setSystemInfo("User Name", "selim");
//        Reporter.setSystemInfo("Application Name", "Basqar");
//        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
//        Reporter.setSystemInfo("Department", "QA");
//        Reporter.setSystemInfo("Department", "QA");
//        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");
//
//    }
}