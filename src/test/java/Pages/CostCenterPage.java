package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;

import java.sql.Savepoint;
import java.util.Map;

public class CostCenterPage extends ParentClass {
    public void getPage() {
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.CostCenters);
    }

    public void clickAdd() {
        clickTo(PageButtonAdd);
    }


    public boolean add(Map<String, String> costCenters) {
        String name = costCenters.get("name");
        String code = costCenters.get("code");
        String type = costCenters.get("type");
        String orderNo = costCenters.get("orderNo");
        String expenseAccoutCodePrefixes = costCenters.get("expenseAccoutCodePrefixes");

        sendKeysTo(DialogFormNameInput, name);
        sendKeysTo(DialogFormCodeInput, code);
        selectOption(DialogFormTypeSelect, type);
        sendKeysTo(DialogFormOrderInput, orderNo);
        selectOption(ExpenseAccoutCodePrefixes, 0);
        clickTo(DialogContainerButtonSave);


        return notificationResult(NotificationResults.Created);


    }


    public void clickEdit(String editButton) {

        clickTo(TableButtonEdit);
    }


    public boolean editAdd(Map<String, String> newCostCenters) {

//        if (newCostCenters.size()>0){
//
//        }

        String name = newCostCenters.get("name");
        String code = newCostCenters.get("code");
        String type = newCostCenters.get("type");
        String orderNo = newCostCenters.get("orderNo");
        String expenseAccoutCodePrefixes = newCostCenters.get("expenseAccoutCodePrefixes");


        clear(DialogFormNameInput);
        sendKeysTo(DialogFormNameInput, name);
        clear(DialogFormCodeInput);
        sendKeysTo(DialogFormCodeInput, code);
        scrollTo(DialogFormTypeSelect);
        selectOption(DialogFormTypeSelect, type);

        clear(DialogFormOrderInput);
        sendKeysTo(DialogFormOrderInput, orderNo);
        clickTo(ExpenseAccoutCodePrefixesDelete);
        selectOption(ExpenseAccoutCodePrefixes, 5);
        clickTo(DialogContainerButtonSave);


        return notificationResult(NotificationResults.Updated);

    }


    public boolean delete(String newCostCenters) {
        return deleteTheTableData(newCostCenters);
    }


}
