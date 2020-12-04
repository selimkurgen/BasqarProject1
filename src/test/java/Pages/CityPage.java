package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;

import static PageModels.Buttons.Save;

public class CityPage extends ParentClass {

    public void getPage() {
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Cities);
    }

    public boolean add(String country, String newCity) {
        clickTo(PageButtonAdd);
        selectOption(DialogFormCountrySelect, country);
        sendKeysTo(DialogFormNameInput, newCity);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }


    public boolean delete(String city) {
        return deleteTheTableData(city);
    }

}
