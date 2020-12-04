package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;

import static PageModels.Buttons.Save;

public class PositionsPage extends ParentClass {
    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Positions);
    }


    public boolean add(String positionName, String positionShortName){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, positionName);
        sendKeysTo(DialogFormShortNameInput, positionShortName);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }

    public boolean update(String positionName, String newPositionName, String oldPositionShortName, String newPositionShortName){
        editTheTableData(positionName);
        if (positionName.length()>0){
            clear(DialogFormNameInput);
            sendKeysTo(DialogFormNameInput, newPositionName);
        }
        if (oldPositionShortName.length()>0) {
            clear(DialogFormShortNameInput);
            sendKeysTo(DialogFormShortNameInput, newPositionShortName);
        }
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Updated);
    }

    public boolean delete(String newPositionName){
        return deleteTheTableData(newPositionName);
    }

}
