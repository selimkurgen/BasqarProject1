package StepDefinitions;

import PageModels.NotificationResults;
import Pages.ExcelTemplatePage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ExcelTemplateSteps {

    ExcelTemplatePage excelTemplatePage=new ExcelTemplatePage();

    @Then("^user navigate to Excel Template page$")
    public void user_navigate_to_Excel_Template_page()  {
   excelTemplatePage.getPage();
    }

    @Then("^Create a Excel Template name as \"([^\"]*)\" period count as \"([^\"]*)\" and save$")
    public void create_a_Excel_Template_name_as_period_count_as_and_save(String excelTemplateName, String periodCount) {
    excelTemplatePage.add(excelTemplateName,periodCount);
    }

    @Then("^create versions row size as\"([^\"]*)\" and column size as \"([^\"]*)\" and save and close$")
    public void create_versions_row_size_as_and_column_size_as_and_save_and_close(String rowSize, String columnSize)
    {
    excelTemplatePage.addVersion(rowSize,columnSize);

    }

    @Then("^Excel Template  should be created$")
    public void excel_Template_should_be_created()  {
     Assert.assertTrue(excelTemplatePage.notificationResult(NotificationResults.Created));

    }

    @Then("^edit a Excel Template name as \"([^\"]*)\"  to \"([^\"]*)\" and period count as \"([^\"]*)\" to \"([^\"]*)\"and save$")
    public void edit_a_Excel_Template_name_as_to_and_period_count_as_to_and_save
    (String excelTemplateName, String newExcelTemplateName,String periodCount, String newPeriodCount)
    {
    excelTemplatePage.update(excelTemplateName,newExcelTemplateName,periodCount,newPeriodCount);
    }


    @Then("^Excel Template should be updated$")
    public void excel_Template_should_be_updated()  {
     Assert.assertTrue(excelTemplatePage.notificationResult(NotificationResults.Updated));
    }

    @Then("^User delete the Excel Template name as \"([^\"]*)\"$")
    public void user_delete_the_Excel_Template_name_as(String newExcelTemplateName) {
  excelTemplatePage.delete(newExcelTemplateName);
    }

    @Then("^Excel Template should be deleted$")
    public void excel_Template_should_be_deleted(){
     Assert.assertTrue(excelTemplatePage.notificationResult(NotificationResults.Deleted));
    }

    }

