package Pages;


import PageModels.NavBarObjects;
import PageModels.NotificationResults;
import Utilities.ParentClass;
import org.openqa.selenium.By;

import java.util.Map;

public class SalayModifiersPage extends ParentClass {

    public  void getPage(){
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.SalaryModifiers);
    }
    public void clickAdd()
    {
        clickTo(PageButtonAdd);
    }

    public boolean add(Map<String ,String> salaryModifiers){
        String description=salaryModifiers.get("description");
        String variable=salaryModifiers.get("variable");
        String addition=salaryModifiers.get("addition");
        String integrationCode=salaryModifiers.get("integrationCode");
        String valueType   =salaryModifiers.get("valueType");
        String priority=salaryModifiers.get("priority");
        String amount=salaryModifiers.get("amount");
        String formula=salaryModifiers.get("formula");
        String name=salaryModifiers.get("name");
        String formulaVariable =salaryModifiers.get("formulaVariable");
        String modifierVariableType=salaryModifiers.get("modifierVariableType");

        sendKeysTo(PageFormDescriptionInput,description);
        sendKeysTo(PageFormVariableInput,variable);
        selectOption(PageFormModifierTypeSelect,addition);
        sendKeysTo(PageFormIntegrationCodeInput,integrationCode);
        selectOption(PageFormValueTypeSelect,valueType);

        sendKeysTo(PageFormPriorityIntInput,priority);
       // sendKeysTo(PageFormAmountIntInput,amount);
        sendKeysTo(PageFormFormulaInput,formula);
        clickTo(PageButtonAdd);
        sendKeysTo(SalaryModifiersNewFormNameInput1,name);
        sendKeysTo(DialogFormFormulaVariableInput,formulaVariable);
        selectOption(DialogFormModifierVariableTypeSelect,modifierVariableType);
        clickTo(DialogButtonApplyWithText);
        clickTo(SalaryModifiersFormSaveButton);


        return notificationResult(NotificationResults.Created);


    }
    public  void backPage(){
        clickTo(salaryModifiersBackArrowButton);
    }

    public void clickEdit(String salaryModifiers){
       sendKeysTo(DescriptionSearch,salaryModifiers);
    clickTo(DescriptionSearchButton);
    clickTo(TableButtonEdit);
    }



        public void salaryModifiersFormNewButton(){
        clickTo( SalaryModifiersFormNewButton);

        }

        public boolean editAdd(Map<String ,String> newSalaryModifiers){
        String description=newSalaryModifiers.get("description");
        String variable=newSalaryModifiers.get("variable");
        String addition=newSalaryModifiers.get("addition");
        String integrationCode=newSalaryModifiers.get("integrationCode");
        String valueType   =newSalaryModifiers.get("valueType");
        String priority=newSalaryModifiers.get("priority");
        String amount=newSalaryModifiers.get("amount");
        String formula=newSalaryModifiers.get("formula");
        String name=newSalaryModifiers.get("name");
        String formulaVariable =newSalaryModifiers.get("formulaVariable");
        String modifierVariableType=newSalaryModifiers.get("modifierVariableType");

        sendKeysTo(PageFormDescriptionInput,description);
        sendKeysTo(PageFormVariableInput,variable);
        selectOption(PageFormModifierTypeSelect,addition);
        sendKeysTo(PageFormIntegrationCodeInput,integrationCode);
        selectOption(PageFormValueTypeSelect,valueType);

        sendKeysTo(PageFormPriorityIntInput,priority);
        // sendKeysTo(PageFormAmountIntInput,amount);
        sendKeysTo(PageFormFormulaInput,formula);
        clickTo(PageButtonAdd);
        sendKeysTo(SalaryModifiersNewFormNameInput2,name);
        sendKeysTo(DialogFormFormulaVariableInput,formulaVariable);
        selectOption(DialogFormModifierVariableTypeSelect,modifierVariableType);
        clickTo(DialogButtonApplyWithText);
        clickTo(SalaryModifiersFormSaveButton);

        return notificationResult(NotificationResults.Updated);


    }
    public  void backPage2(){
        clickTo(salaryModifiersBackArrowButton2);
    }


    public boolean delete(String salaryModifiers)
    {
        return deleteTheTableData(salaryModifiers);
    }



}
