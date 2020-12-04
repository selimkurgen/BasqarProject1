package StepDefinitions;

import PageModels.NotificationResults;
import Pages.SalaryConstantsPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.Map;
public class SalaryConstantsSteps {

    SalaryConstantsPage salaryConstantsPage=new SalaryConstantsPage();

// throws Throwable
    @Given("^user navigate to Salary Constants page$")
    public void user_navigate_to_Salary_Constants_page(){
        salaryConstantsPage.getPage();
    }

    @Given("^Click to add button for  Salary Constants$")
    public void click_to_add_button_for_Salary_Constants()  {
        salaryConstantsPage.clickAdd();
    }

    @Then("^create a Salary Constants$")
    public void create_a_Salary_Constants(DataTable dataTable)  {
        Map<String, String> salaryCostants=dataTable.asMap(String.class,String.class);
        String name=salaryCostants.get("name");
        String validFrom=salaryCostants.get("validFrom");
        String key=salaryCostants.get("key");
        int value=Integer.parseInt(salaryCostants.get("value"));
        salaryConstantsPage.add(name,validFrom,key,value);

    }

    @Then("^Salary Constants should be created$")
    public void salary_Constants_should_be_created() {
        Assert.assertTrue(salaryConstantsPage.notificationResult(NotificationResults.Created));
    }

    @Then("^user search with name as \"([^\"]*)\"$")
    public void user_search_with_name_as(String name)  {
    salaryConstantsPage.search(name);
    }

//    @Then("^Click to edit button$")
//    public void click_to_edit_button()  {
//        salaryConstantsPage.clickEdit();
//
//    }

    @Then("^create a new Salary Constants$")
    public void create_a_new_Salary_Constants(DataTable newDataTable) {
    Map<String,String> newSalaryCostants=newDataTable.asMap(String.class,String.class);
        String name=newSalaryCostants.get("name");
        String validFrom=newSalaryCostants.get("validFrom");
        String key=newSalaryCostants.get("key");
        int value=Integer.parseInt(newSalaryCostants.get("value"));
        salaryConstantsPage.editAdd(name,validFrom,key,value);

    }

    @Then("^Salary Constants should be updated$")
    public void salary_Constants_should_be_updated()  {
        Assert.assertTrue(salaryConstantsPage.notificationResult(NotificationResults.Updated));

    }

    @Then("^user search with  new name as \"([^\"]*)\"$")
    public void user_search_with_new_name_as(String newName){
        salaryConstantsPage.search2(newName);
    }

    @Then("^user delete new name as \"([^\"]*)\"$")
    public void user_delete_new_name_as(String newName)  {

        salaryConstantsPage.delete(newName);
    }

    @Then("^Salary Constants should be deleted$")
    public void salary_Constants_should_be_deleted() {
        Assert.assertTrue(salaryConstantsPage.notificationResult(NotificationResults.Deleted));
    }
}
