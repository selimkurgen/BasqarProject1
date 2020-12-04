package PageModels;

import org.openqa.selenium.By;

public interface DialogObjects {

    By DialogForm = By.cssSelector("ms-dialog-content");
    By DialogFormNameInput = By.cssSelector("ms-text-field[formcontrolname='name']>input");
    By DialogFormName2Input = By.cssSelector("//ms-text-field[@ name='name']");
    By DialogFormCodeInput = By.cssSelector("ms-text-field[formcontrolname='code']>input");
    By DialogFormCountryInput = By.cssSelector("ms-text-field[formcontrolname='country']>input");
    By DialogFormCountrySelect = By.cssSelector("mat-select[formcontrolname='id']");
    By DialogFormFirstNameInput = By.cssSelector("ms-text-field[formcontrolname='firstName']>input");
    By DialogFormMiddleNameInput = By.cssSelector("ms-text-field[formcontrolname='middleName']>input");
    By DialogFormLastNameInput = By.cssSelector("ms-text-field[formcontrolname='lastName']>input");
    By DialogFormShortNameInput = By.cssSelector("ms-text-field[formcontrolname='shortName']>input");
    By DialogFormCitySelect = By.cssSelector("mat-form-field[formgroupname='city'] mat-select");
    By DialogFormSubjectCategorySelect = By.cssSelector("mat-select[formcontrolname='id']");
    By DialogFormStyleSelect = By.cssSelector("mat-select[formcontrolname='value']");
    By DialogFormUserTypeMultiSelect = By.cssSelector("mat-chip-list input");
    By DialogFormExpenseAccoutMultiSelect = By.cssSelector("mat-chip-list input");
    By DialogFormValidFormInput = By.cssSelector("input[name='datePickerControl'] + input");
    By DialogFormKeyInput = By.cssSelector("ms-text-field[formcontrolname='key']>input");
    By DialogFormValueIntInput = By.cssSelector("ms-integer-field[formcontrolname='value']>input"); // in Salary
    By DialogFormPeriodCountInput = By.cssSelector("ms-integer-field[formcontrolname='periodCount']>input");
    By DialogFormRowSizeCountInput = By.cssSelector("ms-integer-field[formcontrolname='rowSize']>input");
    By DialogFormColumnSizeCountInput = By.cssSelector("ms-integer-field[formcontrolname='columnSize']>input");
    By DialogFormTypeSelect = By.cssSelector("mat-select[formcontrolname='type']");
    By DialogFormOrderInput = By.cssSelector("ms-text-field[formcontrolname='orderNo']>input");
    By DialogFormValueTextInput = By.cssSelector("ms-text-field[formcontrolname='value'] > input");  // in Cost Centers

    By DialogFormFormulaVariableInput = By.cssSelector("input[data-placeholder='Formula Variable']");
    By DialogFormModifierVariableTypeSelect = By.cssSelector("mat-select[formcontrolname='type']");
    By MultiSelectOptionDelete = By.cssSelector("mat-chip mat-icon");

    // others locators
    By SalaryModifiersNewFormNameInput1= By.xpath("//input[@name='name']");
    By SalaryModifiersNewFormNameInput2= By.xpath("//input[@name='name']");
    By SalaryModifiersFormSaveButton= By.cssSelector("ms-save-button>button");
    By salaryModifiersBackArrowButton=By.xpath("//*[@id=\"container-2\"]/toolbar/mat-toolbar/div/div[1]/div[2]/button");
    By salaryModifiersBackArrowButton2=By.cssSelector(" By salaryModifiersBackArrowButton");
    By SalaryModifiersFormNewButton= By.xpath("//*[@id=\"container-2\"]/footer/modifier-form-buttons/button-bar/div/div[1]/ms-button/button");
    By salaryConstantsFormNameInput=By.xpath("//input[@ name='name']");
    By salaryConstantsForSearchNameInput=By.cssSelector("ms-browse-search input");
    By salaryConstantsForSearchClick=By.cssSelector("ms-browse-search button");
    By ExpenseAccoutCodePrefixes=By.xpath("//input[@matchipinputaddonblur ='false']");
    By ExpenseAccoutCodePrefixesDelete=By.xpath("//*[@id=\"mat-chip-list-1\"]/div/mat-chip/mat-icon");
    By NewPositionSalaryNameInput=By.cssSelector("ms-text-field[formcontrolname='title']>input");
    By citiesCountryCombobox=By.cssSelector("mat-select[role=combobox]");
    By forSearchClick=By.cssSelector("ms-browse-search button");
    By DescriptionSearch=By.cssSelector("mat-form-field>div>div>div>input");
    By DescriptionSearchButton=By.xpath("//*[@id=\"container-3\"]/content/salary-modifier/mat-card/div/div/button");
}
