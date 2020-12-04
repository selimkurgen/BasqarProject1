package StepDefinitions;

import PageModels.NotificationResults;
import Pages.CostCenterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.Map;

public class CostCenterSteps {

    CostCenterPage costCenterPage=new CostCenterPage();

    @Given("^user navigate to Salary Cost Center$")
    public void user_navigate_to_Salary_Cost_Center() {
        costCenterPage.getPage();

    }

    @Given("^Click to Cost Center add button$")
    public void click_to_Cost_Center_add_button() {
        costCenterPage.clickAdd();
    }

    @Then("^create a Cost Center$")
    public void create_a_Cost_Center(DataTable dataTable)  {
        Map<String,String> costCenters=dataTable.asMap(String.class,String.class);
        costCenterPage.add(costCenters);
    }

    @Then("^Cost Center should be created$")
    public void cost_Center_should_be_created() {
        Assert.assertTrue(costCenterPage.notificationResult(NotificationResults.Created));

    }

    @Then("^user edit Cost Center  name as \"([^\"]*)\"$")
    public void user_edit_Cost_Center_name_as(String editButton)  {
        costCenterPage.clickEdit(editButton);

    }

    @Then("^user  edit form$")
    public void user_edit_form(DataTable dataTable) {
        Map<String,String> newCostCenters=dataTable.asMap(String.class,String.class);
        costCenterPage.editAdd(newCostCenters);

    }

    @Then("^Cost Center  should be updated$")
    public void cost_Center_should_be_updated()  {
        Assert.assertTrue(costCenterPage.notificationResult(NotificationResults.Updated));
    }

    @Then("^user delete  name as \"([^\"]*)\"$")
    public void user_delete_name_as(String newCostCenters) {
        costCenterPage.delete(newCostCenters);


    }

    @Then("^Cost Center  should be deleted$")
    public void cost_Center_should_be_deleted(){
        costCenterPage.notificationResult(NotificationResults.Deleted);

    }
}
