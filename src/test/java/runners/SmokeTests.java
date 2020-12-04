package runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

@CucumberOptions(
        tags = {"@Smoke"},
        features = {"src\\test\\java\\Features"},
        glue = {"StepDefinitions"},
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:" +
                        "target/ExtentReport/SmokeTest.html"
        }
)

public class SmokeTests extends AbstractTestNGCucumberTests {

//    @BeforeTest
//    @Parameters("browser")
//    public static void beforeTest(String browser){
//        Driver.browsers.set(browser);
//    }

//    @AfterClass
//    public static void afterClass() {
//
//        Reporter.loadXMLConfig("src/test/java/XMLfiles/SmokeTest.xml");
//        Reporter.setSystemInfo("User Name", "Grup-4");
//        Reporter.setSystemInfo("Application Name", "Basqar");
//        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
//        Reporter.setSystemInfo("Department", "QA-4");
//        Reporter.setSystemInfo("Project Name", "Proficiency Project");
//        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");
//
//    }

//    @AfterTest
//    public void tearDown(){
//        Driver.quitDriver();
//    }

}
