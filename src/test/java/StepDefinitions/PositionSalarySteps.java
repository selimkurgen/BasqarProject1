package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import PageModels.NotificationResults;
import Pages.PositionSalaryPage;
import Utilities.MyUtils;

public class PositionSalarySteps  {
    PositionSalaryPage positionSalaryPage=new PositionSalaryPage();

    @Given("^user navigate to Position Salary page$")
    public void user_navigate_to_Position_Salary_page() {
        positionSalaryPage.getPage(); }

    @Then("^Create a Position Salary name as \"([^\"]*)\"$")
    public void create_a_Position_Salary_name_as(String name) {
        positionSalaryPage.add(name); }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed()  {
        Assert.assertTrue(positionSalaryPage.notificationResult(NotificationResults.Created));

    }

    @Then("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void user_edit_the_to(String oldName, String newName) {
        positionSalaryPage.editTheTableData(oldName);
        positionSalaryPage.update(oldName,newName);

    }
    @Then("^Success message should be updated$")
    public void success_message_should_be_updated()  {
        Assert.assertTrue(positionSalaryPage.notificationResult(NotificationResults.Created));

    }

    @Then("^User delete the \"([^\"]*)\"$")
    public void user_delete_the(String newName){
        positionSalaryPage.delete(newName);

    }
    @Then("^Success message should be deleted$")
    public void success_message_should_be_deleted()  {
        positionSalaryPage.notificationResult(NotificationResults.Created);

    }


}
