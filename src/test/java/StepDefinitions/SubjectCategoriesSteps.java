package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import PageModels.NotificationResults;
import Pages.SubjectCategoriesPage;

public class SubjectCategoriesSteps {

    SubjectCategoriesPage subjectCategoriesPage=new SubjectCategoriesPage();

    @Given("^user navigate to Subject Categories page$")
    public void user_navigate_to_Subject_Categories_page()  {
      subjectCategoriesPage.getPage();
    }

    @When("^user create a Subject Categories name as \"([^\"]*)\" and code as \"([^\"]*)\" and save$")
    public void user_create_a_Subject_Categories_name_as_and_code_as_and_save(String newSubjectCategoryName, String newSubjectCategoryCode){
        subjectCategoriesPage.add(newSubjectCategoryName,newSubjectCategoryCode);
    }

    @Then("^Subject Categories should be created$")
    public void subject_Categories_should_be_created() {
        Assert.assertTrue(subjectCategoriesPage.notificationResult(NotificationResults.Created));

    }

    @Then("^delete Subject Categories name as \"([^\"]*)\"$")
    public void delete_Subject_Categories_name_as(String newSubjectCategoryName)  {
       subjectCategoriesPage.delete(newSubjectCategoryName);
    }

    @Then("^Subject Categories should be deleted$")
    public void subject_Categories_should_be_deleted(){
        subjectCategoriesPage.notificationResult(NotificationResults.Deleted);

    }

}
