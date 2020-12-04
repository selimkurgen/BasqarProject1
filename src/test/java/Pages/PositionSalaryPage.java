package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;
import static PageModels.Buttons.Save;

public class PositionSalaryPage extends ParentClass {

    public  void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.PositionSalary);
    }

    public boolean add(String name){
        clickTo(PageButtonAdd);
        sendKeysTo(NewPositionSalaryNameInput,name);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);

    }
    public boolean update(String oldName,  String newName){

        if (oldName.length()>0){
            clear(NewPositionSalaryNameInput);
            sendKeysTo(NewPositionSalaryNameInput, newName);
        }

        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Updated);
    }

    public boolean delete(String newName){
        deleteTheTableData(newName);

        return notificationResult(NotificationResults.Created);
    }

}








