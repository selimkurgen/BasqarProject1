package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;

import static PageModels.Buttons.Save;

public class SomeCountryPage extends ParentClass {

    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Countries);
    }

    public boolean add(String newCountryName, String newCountryCode){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, newCountryName);
        sendKeysTo(DialogFormCodeInput, newCountryCode);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }

    public void getPageForCity(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Cities);
    }

    public boolean addCity(String selectCountry, String newCity){

        selectOption(citiesCountryCombobox,selectCountry);
        clickTo(forSearchClick);

        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, newCity);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }
    public void getPageForCountry(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Countries);
    }

    public boolean delete(String newCountryName){
        return deleteTheTableData(newCountryName);
    }

    public boolean deleteCity(String newCity){
        return deleteTheTableData(newCity);
    }


}















