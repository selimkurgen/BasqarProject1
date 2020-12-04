package Pages;

import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;

import static PageModels.Buttons.Close;
import static PageModels.Buttons.Save;

public class ExcelTemplatePage extends ParentClass {

    public void getPage() {
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.ExcelTemplate);
    }


    public boolean add(String excelTemplateName, String periodCount) {
        clickTo(PageButtonAdd);
        sendKeysTo(DialogFormNameInput, excelTemplateName);
        sendKeysTo(DialogFormPeriodCountInput, periodCount);
        clickToDialogButton(Save);
        return notificationResult(NotificationResults.Created);
    }

    public boolean addVersion(String rowSize, String columnSize) {

        sendKeysTo(DialogFormRowSizeCountInput, rowSize);
        sendKeysTo(DialogFormColumnSizeCountInput, columnSize);
        clickToDialogButton(Save);
        clickToDialogButton(Close);
        return notificationResult(NotificationResults.Created);


    }


    public boolean update(String excelTemplateName, String newExcelTemplateName, String periodCount, String newPeriodCount) {
        editTheTableData(excelTemplateName);
        if (excelTemplateName.length() > 0) {
            clear(DialogFormNameInput);
            sendKeysTo(DialogFormNameInput, newExcelTemplateName);
        }
        if (periodCount.length() > 0) {
            clear(DialogFormPeriodCountInput);
            sendKeysTo(DialogFormPeriodCountInput, newPeriodCount);
        }
        clickToDialogButton(Save);
        clickToDialogButton(Close);
        return notificationResult(NotificationResults.Updated);
    }

    public boolean delete(String newExcelTemplateName) {

        return deleteTheTableData(newExcelTemplateName);
    }


}
