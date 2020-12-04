package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;

import static PageModels.Buttons.Save;

public class SubjectsPage  extends ParentClass {
    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Subjects);
    }
    public boolean add(String newSubjectName, String newSubjectCode){
        clickTo(PageButtonAdd);
         sendKeysTo(DialogFormNameInput, newSubjectName);
         sendKeysTo(DialogFormCodeInput, newSubjectCode);
        selectOption(DialogFormSubjectCategorySelect,1);
        selectOption(DialogFormStyleSelect,1);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }



    public boolean delete(String newSubjectName)
    {
        return deleteTheTableData(newSubjectName);

    }

}

