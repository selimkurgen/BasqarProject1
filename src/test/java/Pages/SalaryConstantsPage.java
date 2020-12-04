package Pages;

import PageModels.Buttons;
import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;
import static PageModels.Buttons.Save;
import java.util.Map;

public class SalaryConstantsPage extends ParentClass {


    public void getPage() {
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.SalaryConstants);
    }

    public void clickAdd() {
        clickTo(PageButtonAdd);
    }

    public boolean add(String name, String validFrom, String key, int value) {


        waitToBeVisibleFor(salaryConstantsFormNameInput);
        sendKeysTo(salaryConstantsFormNameInput, name);
        clickTo(DialogFormValidFormInput);
        setCalenderDate(validFrom);
        sendKeysTo(DialogFormKeyInput, key);
        sendKeysTo(DialogFormValueIntInput, value + "");

        clickToDialogButton(Save);


        return notificationResult(NotificationResults.Created);


    }

    public void search(String name) {

        sendKeysTo(salaryConstantsForSearchNameInput, name);

        clickTo(salaryConstantsForSearchClick);
        editTheTableData(name);
    }


    public boolean editAdd(String newName, String newValidFrom, String newKey, int newValue) {




        if (newName.length() > 0) {
            clear(salaryConstantsFormNameInput);
            sendKeysTo(salaryConstantsFormNameInput, newName);
        }


        clickTo(DialogFormValidFormInput);
        setCalenderDate(newValidFrom);


        if (newKey.length() > 0) {
            clear(DialogFormKeyInput);
            sendKeysTo(DialogFormKeyInput, newKey);
        }

        clear(DialogFormValueIntInput);
        sendKeysTo(DialogFormValueIntInput, newValue + "");

        clickToDialogButton(Save);

        return notificationResult(NotificationResults.Updated);


    }
    public void search2(String newName) {
        if (newName.length()>0) {
            clear(salaryConstantsForSearchNameInput);
            sendKeysTo(salaryConstantsForSearchNameInput, newName);
        }
        clickTo(salaryConstantsForSearchClick);

    }

    public boolean delete(String newName) {


        return deleteTheTableData(newName);
    }

}


