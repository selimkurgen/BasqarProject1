package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import PageModels.NotificationResults;
import Pages.SalayModifiersPage;

import java.util.Map;

public class SalayModifiersSteps {
    SalayModifiersPage salaryModifiersPage=new SalayModifiersPage();

    @Given("^user navigate to Salary Modifiers page$")
    public void user_navigate_to_Salary_Modifiers_page() {
        salaryModifiersPage.getPage();
    }

    @Given("^Click to add button$")
    public void click_to_add_button() {
        salaryModifiersPage.clickAdd();
    }

    @Then("^create a Salary Modifiers$")
    public void create_a_Salary_Modifiers(DataTable modifiers)  {
        Map<String, String> salaryModifiers=modifiers.asMap(String.class,String.class);
        salaryModifiersPage.add(salaryModifiers);
    }

    @Then("^Salary Modifiers should be created$")
    public void salary_Modifiers_should_be_created() {
        Assert.assertTrue(salaryModifiersPage.notificationResult(NotificationResults.Created));
    }
    @Then("^navigate back page$")
    public void navigate_back_page()
    {
        salaryModifiersPage.backPage();

    }
    @Then("^user edit Salary Modifiers description name as \"([^\"]*)\"$")
    public void user_edit_Salary_Modifiers_description_name_as(String salaryModifiers)  {
        salaryModifiersPage.clickEdit(salaryModifiers);
    }

    @Then("^click to form New button$")
    public void click_to_form_New_button() {
        salaryModifiersPage.salaryModifiersFormNewButton();
    }

    @Then("^user create new form$")
    public void user_create_new_form(DataTable newModifiers)  {
        Map<String, String> newSalaryModifiers=newModifiers.asMap(String.class,String.class);
        salaryModifiersPage.editAdd(newSalaryModifiers);
    }
    @Then("^Salary Modifiers should be updated$")
    public void salary_Modifiers_should_be_updated(){
      salaryModifiersPage.notificationResult(NotificationResults.Updated);
    }

    @Then("^user navigate to back page$")
    public void user_navigate_to_back_page()  {
        salaryModifiersPage.backPage();
    }

    @Then("^user delete description name as \"([^\"]*)\"$")
    public void user_delete_description_name_as(String salaryModifiers)  {
      salaryModifiersPage.delete(salaryModifiers);
    }

    @Then("^Salary Modifiers should be deleted$")
    public void salary_Modifiers_should_be_deleted() {
        Assert.assertTrue(salaryModifiersPage.notificationResult(NotificationResults.Deleted));
    }

    @Then("^user delete  old description name as \"([^\"]*)\"$")
    public void userDeleteOldDescriptionNameAs(String oldDesc)  {
        salaryModifiersPage.delete(oldDesc);
    }

    @Then("^Old Salary Modifiers should be deleted$")
    public void oldSalaryModifiersShouldBeDeleted()
    {Assert.assertTrue(salaryModifiersPage.notificationResult(NotificationResults.Deleted));
    }
}
