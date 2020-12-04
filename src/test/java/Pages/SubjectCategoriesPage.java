package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;

import static PageModels.Buttons.Save;

public class SubjectCategoriesPage extends ParentClass {

    public void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.SubjectCategories);
    }
    public boolean add(String newSubjectCategoryName, String newSubjectCategoryCode){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, newSubjectCategoryName);
        sendKeysTo(DialogFormCodeInput, newSubjectCategoryCode);

        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }
    public boolean delete(String newSubjectName){
        return deleteTheTableData(newSubjectName);
    }



    }


