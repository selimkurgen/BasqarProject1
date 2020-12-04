package StepDefinitions;

import cucumber.api.java.en.Then;
import org.testng.Assert;
import PageModels.NotificationResults;
import Pages.PositionsPage;

public class PositionsSteps {
    PositionsPage positionsPage=new PositionsPage();

    @Then("^user navigate to Positions page$")
    public void user_navigate_to_Positions_page()  {
       positionsPage.getPage();
    }



    @Then("^Create a Positions name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void create_a_Positions_name_as_short_name_as(String positionName, String positionShortName)  {
       positionsPage.add(positionName,positionShortName);
    }

    @Then("^Positions  should be created$")
    public void positions_should_be_created()  {
     Assert.assertTrue(positionsPage.notificationResult(NotificationResults.Created));
    }

    @Then("^User edit the name as \"([^\"]*)\" to \"([^\"]*)\" and short name as \"([^\"]*)\" to \"([^\"]*)\"$")
    public void user_edit_the_name_as_to_and_short_name_as_to(String positionName, String newPositionName, String oldPositionShortName, String newPositionShortName)  {
       positionsPage.update(positionName,newPositionName,oldPositionShortName,newPositionShortName);
    }

    @Then("^Positions should be updated$")
    public void positions_should_be_updated() {
        Assert.assertTrue(positionsPage.notificationResult(NotificationResults.Updated));
    }

    @Then("^User delete the name as \"([^\"]*)\"$")
    public void user_delete_the_name_as(String newPositionName)  {
       positionsPage.delete(newPositionName);
    }

    @Then("^Positions should be deleted$")
    public void positions_should_be_deleted()  {
        positionsPage.notificationResult(NotificationResults.Deleted);
    }

}
