package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import PageModels.NotificationResults;
import Pages.MySubjectPage;

public class MySubjectSteps {
    MySubjectPage mySubjectPage=new MySubjectPage();
    @When("^user create a new Subjects name as \"([^\"]*)\" and code as \"([^\"]*)\" and save and select name as \"([^\"]*)\" and style$")
    public void user_create_a_new_Subjects_name_as_and_code_as_and_save_and_select_name_as_and_style(String newSubjectName, String newSubjectCode, String newSubjectCategoryName)  {
        mySubjectPage.addForMySubject(newSubjectName, newSubjectCode,newSubjectCategoryName);
    }


    @Then("^Subject Categories should be error$")
    public void subject_Categories_should_be_error()  {
        mySubjectPage.notificationResult(NotificationResults.Error);
    }

    @Then("^Subject Categories should be successfully deleted$")
    public void subject_Categories_should_be_successfully_deleted() {
        Assert.assertTrue(mySubjectPage.notificationResult(NotificationResults.Deleted));
    }
}
