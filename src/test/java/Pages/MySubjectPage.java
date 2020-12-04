package Pages;

import PageModels.NotificationResults;
import Utilities.ParentClass;

import static PageModels.Buttons.Save;

public class MySubjectPage extends ParentClass {

    public boolean addForMySubject(String newSubjectName, String newSubjectCode, String newSubjectCategoryName){
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, newSubjectName);
        sendKeysTo(DialogFormCodeInput, newSubjectCode);
        selectOption(DialogFormSubjectCategorySelect,newSubjectCategoryName);
        selectOption(DialogFormStyleSelect,1);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }

}
