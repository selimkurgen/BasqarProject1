package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;

import static PageModels.Buttons.Save;

public class CountryPage extends ParentClass {


    public void getPage() {

        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Countries);
    }


    public boolean add(String newCountryName, String newCountryCode) {
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, newCountryName);
        sendKeysTo(DialogFormCodeInput, newCountryCode);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);

    }


    public boolean delete(String newCountryName) {

        return deleteTheTableData(newCountryName);
    }


}
