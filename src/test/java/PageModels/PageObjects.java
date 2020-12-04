package PageModels;

import org.openqa.selenium.By;

public interface PageObjects {

    // Page locators
    By PageButtonSearch = By.cssSelector("ms-search-button button");
    By PageButtonNewWithText = By.xpath("//button//*[contains(text(),'New')]");
    By PageButtonSaveWithText = By.xpath("//button//*[contains(text(),'Save')]");
    By PageButtonAdd = By.cssSelector("ms-add-button button");
    By DialogButtonAdd = By.cssSelector("ms-dialog-content ms-add-button button");
    By DialogButtonAddWithText = By.xpath("//ms-dialog-content//*[contains(text(),'Add')]");
    By DialogButtonApplyWithText = By.xpath("//*[contains(text(),'Apply')]");
    By DialogButtonDelete = By.cssSelector("ms-dialog-content ms-delete-button>button");
    By DialogButtonEdit = By.cssSelector("ms-dialog-content ms-edit-button>button");
    By DialogButtonAddVersion = By.xpath("//button[.//text()='Add Version']");
    By TabPageVersions = By.xpath("//div[contains(text(),'Versions')]");
    By TabPageBudgetTemplate = By.xpath("//div[contains(text(),'Budget Template')]");
    By TabPageConstants = By.xpath("//div[contains(text(),'Constants')]");
    By TabPageCostCenter = By.xpath("//div[contains(text(),'Cost Center')]");
    By UserMessageBell = By.tagName("user-message-bell");

    //By PageButtonAddWithText = By.xpath("//mat-dialog-actions//*[contains(text(),'Add')]");
    By PageButtonAddWithText = By.xpath("//button//*[text()='Add']");
    By PageButtonCloseWithText = By.xpath("//mat-dialog-actions//*[contains(text(),'Close')]");
    By PageButtonSave = By.cssSelector("ms-save-button button");

    // Tab elements
    By PageButtonRefresh = By.xpath("//button[./span[contains(text(),'Refresh')]]");
    By PopupMessageContainer = By.xpath("//div[@id='toast-container']");

    // Table Locators
    By TableButtonEdit = By.cssSelector("ms-edit-button>button");
    By TableButtonEdit2=By.xpath("//ms-edit-button[@class='ng-star-inserted']/button");
    By TableButtonDelete = By.cssSelector("ms-delete-button>button");
    By TableButtonDialogEditDeleteButton = By.cssSelector("button[aria-haspopup='true']");
    By TableButtonDialogEditDeleteDialog = By.cssSelector("div[role='menu']");

    // Dialog Container Locators
    By DialogContainer = By.tagName("mat-dialog-container");
    By DialogContainerButtonMaximize = By.className("button[aria-label='Maximizes']");
    By DialogContainerButtonClose = By.cssSelector("button[aria-label='Close dialog']");
    By DialogContainerButtonSave = By.cssSelector("mat-dialog-container ms-save-button");
    By DialogContainerButtonYes = By.xpath("//mat-dialog-container//*[contains(text(),'Yes')]");
    By DialogContainerButtonNo = By.xpath("//mat-dialog-container//*[contains(text(),'No')]");

    By Combobox  = By.cssSelector("ms-dialog-content mat-select[role='combobox']");
    By ComboboxMultiSelect  = By.cssSelector("mat-chip-list input");
    By ListOfOptions = By.cssSelector("div[role='listbox'] mat-option>span");
    //By ListOfOptions = By.xpath("//div[@role='listbox' and contains(@id, (mat-select[@id]))]//mat-option");
    By NewStudentBackButton = By.xpath("(//mat-toolbar//span[text()='New Student']//preceding::button)[last()]");


    By InputCalenderStartDate = By.cssSelector("ms-date[formcontrolname='startDate']");
    By InputCalenderEndDate = By.cssSelector("ms-date[formcontrolname='endDate']");
    By InputCalenderDateOfBirth = By.xpath("ms-date formcontrolname='dateOfBirth'");
    //By CalenderInput = By.xpath("//input[@data-placeholder='Date of Birth']");

    // Calander Locators
    By OverlayContainer = By.cssSelector(".cdk-overlay-container");
    By Calender = By.tagName("mat-calendar");    // By.tagName("mat-datepicker-content");
    By CalanderPreviousYear = By.xpath("(//mat-datepicker-content//ms-custom-header//button)[1]");
    By CalanderPreviousMonth = By.xpath("(//mat-datepicker-content//ms-custom-header//button)[2]");
    By CalanderNextMonth = By.xpath("(//mat-datepicker-content//ms-custom-header//button)[3]");
    By CalanderNextYear = By.xpath("(//mat-datepicker-content//ms-custom-header//button)[4]");
    By CalanderMonthTable = By.cssSelector("mat-datepicker-content table");
    By CalanderMonthYearText = By.xpath("//mat-datepicker-content//*[@class='example-header-label']");

    // page form objects
    By PageFormNameInput = By.cssSelector("ms-text-field[placeholder$='NAME']>input");
    By PageFormCodeInput = By.cssSelector("ms-text-field[placeholder$='CODE']>input");
    By PageFormCountryInput = By.cssSelector("ms-text-field[placeholder$='COUNTRY']>input");
    By PageFormFirstNameInput = By.cssSelector("ms-text-field[placeholder$='FIRST_NAME']>input");
    By PageFormLastNameInput = By.cssSelector("ms-text-field[placeholder$='LAST_NAME']>input");
    By PageFormShortNameInput = By.cssSelector("ms-text-field[placeholder$='SHORTNAME']>input");

    By PageFormDescriptionInput = By.cssSelector("input[formcontrolname='description']");
    By PageFormVariableInput = By.cssSelector("input[formcontrolname='variable']");
    By PageFormModifierTypeSelect = By.cssSelector("mat-select[formcontrolname='modifierType']");
    By PageFormIntegrationCodeInput = By.cssSelector("mat-form-field input[data-placeholder='Integration Code']");
    By PageFormValueTypeSelect = By.cssSelector("mat-select[formcontrolname='valueType']");
    By PageFormPriorityIntInput = By.cssSelector("input[formcontrolname='priority']");
    By PageFormAmountIntInput = By.cssSelector("ms-currency-field[formcontrolname='amount'] > input");
    By PageFormFormulaInput = By.cssSelector("input[formcontrolname='formula']");
    By PageFormCategorySelect = By.cssSelector("mat-select[formcontrolname='category']");

    By PageFormActiveCheckbox = By.cssSelector("mat-slide-toggle input");




}
