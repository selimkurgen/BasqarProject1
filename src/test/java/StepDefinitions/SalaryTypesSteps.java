
package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import PageModels.NotificationResults;
import Pages.SalaryTypesPage;

public class SalaryTypesSteps  {
    SalaryTypesPage salaryTypesPage=new SalaryTypesPage();
    @Then("^user navigate to Salary Types  page$")
    public void user_navigate_to_Salary_Types_page()  {
       salaryTypesPage.getPage();
    }

    @When("^Create a Salary Type name as \"([^\"]*)\" and User Type as \"([^\"]*)\"$")
    public void create_a_Salary_Type_name_as_and_User_Type_as(String name, String userType)  {
       salaryTypesPage.add(name,userType);
    }

    @Then("^Salary Type message should be created$")
    public void salary_Type_message_should_be_created()  {
     Assert.assertTrue(salaryTypesPage.notificationResult(NotificationResults.Created));
    }

    @When("^Edit a Salary Type name as \"([^\"]*)\" to \"([^\"]*)\" and Edit User Type as \"([^\"]*)\" to \"([^\"]*)\"$")
    public void edit_a_Salary_Type_name_as_to_and_Edit_User_Type_as_to(String oldName, String newName, String oldUserType, String newUserType) {
        salaryTypesPage.update(oldName,newName,oldUserType,newUserType);

    }

    @Then("^Salary Type message should be updated$")
    public void salary_Type_message_should_be_updated() {
        Assert.assertTrue(salaryTypesPage.notificationResult(NotificationResults.Created));

    }

    @When("^Delete a Salary Type name as \"([^\"]*)\"$")
    public void delete_a_Salary_Type_name_as(String newName)  {
        salaryTypesPage.delete(newName);

    }

    @Then("^Salary Type message should be deleted$")
    public void salary_Type_message_should_be_deleted()  {
        salaryTypesPage.notificationResult(NotificationResults.Created);

    }



}

