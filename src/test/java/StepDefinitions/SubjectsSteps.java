package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import PageModels.NotificationResults;
import Pages.SubjectsPage;

public class SubjectsSteps {

    SubjectsPage subjectsPage=new SubjectsPage();

    @Given("^user navigate to Subjects page$")
    public void user_navigate_to_Subjects_page()  {
subjectsPage.getPage();
    }


    @When("^user create a Subjects name as \"([^\"]*)\" and code as \"([^\"]*)\" and save$")
    public void user_create_a_Subjects_name_as_and_code_as_and_save(String newSubjectName, String newSubjectCode) {
    subjectsPage.add(newSubjectName,newSubjectCode);
    }

    @Then("^Subject Categories should successfully be created$")
    public void subject_Categories_should_successfully_be_created() {
        Assert.assertTrue(subjectsPage.notificationResult(NotificationResults.Created));

    }

    @Then("^delete subject name as \"([^\"]*)\"$")
    public void delete_subject_name_as(String newSubjectName)  {
        subjectsPage.delete(newSubjectName);

    }

    @Then("^Subject should successfully be deleted$")
    public void subjectShouldSuccessfullyBeDeleted()  {
      Assert.assertTrue(subjectsPage.notificationResult(NotificationResults.Deleted));
    }


}
