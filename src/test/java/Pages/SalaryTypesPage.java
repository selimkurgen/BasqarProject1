
package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;

import static PageModels.Buttons.Save;

public class SalaryTypesPage extends ParentClass {

    public  void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.SalaryTypes);
    }

    public boolean add(String name, String userType){
        clickTo(PageButtonAdd);
        sendKeysTo(PageFormNameInput,name);
        selectOption(DialogFormExpenseAccoutMultiSelect,userType);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);

    }
    public boolean update(String oldName,  String newName,String oldUserType, String newUserType){

             editTheTableData(oldName);

            clear(PageFormNameInput);
            sendKeysTo(PageFormNameInput, newName);


            clickTo(MultiSelectOptionDelete);
            selectOption(DialogFormUserTypeMultiSelect,newUserType);

            clickToDialogButton(Save);

          return notificationResult(NotificationResults.Updated);
    }


    public boolean delete(String newName){
        return deleteTheTableData(newName);
    }

}



