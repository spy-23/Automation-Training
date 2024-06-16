package com.ui.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateJobPage extends BrowserUtil {
	public CreateJobPage(WebDriver wd) {
		super(wd);
		// TODO Auto-generated constructor stub
	}

	private static final By OEM_Dropdown_Locator = By.xpath("//mat-select[@placeholder='Select OEM']/..");
	private static final By Product_Name_Dropdown_Locator = By
			.xpath("//span[contains(text(),'Select Product name')]/../../../..");// dropdown path
	private static final By Model_Name_Dropdown_Locator = By
			.xpath("//span[contains(text(),'Select Model name')]/../../../../..");
	private static final By IMEI_NO1_TEXTBOX_LOCATOR = By.id("mat-input-3");
	private static final By PURCHASE_DATE_DROPDOWN_LOCATOR = By.xpath("//input[@data-placeholder='dd/mm/yyyy']");
	private static final By WARRANTY_DROPDOWN_LOCATOR = By
			.xpath("//mat-select[@placeholder='Select Warranty Status']//..//..");
	private static final By PROBLEM_DROPDOWN_LOCATOR = By.xpath("//mat-select[@placeholder='Select Problem']");
	private static final By REMARK_TEXT_BOX_LOCATOR = By.xpath("//input[@placeholder='Remarks']");
	private static final By FIRST_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='First Name']");
	private static final By LAST_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Last Name']");
	private static final By CONTACT_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Contact No.']");
	private static final By EMAIL_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Email Id.']");
	private static final By FLAT_NUMBER_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Flat/Society No.']");
	private static final By APARTMENT_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Apartment Name']");
	private static final By LANDMARK_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Choose a Landmark']");
	private static final By STREET_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Street Name.']");
	private static final By AREA_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Area']");
	private static final By STATE_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Select State']");
	private static final By PIN_CODE_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Pincode']");
	private static final By SUBMIT_BUTTON_LOCATOR = By.xpath("//span[contains(text(),'Submit')]/..");
	private static final By JOB_TOAST_LOCATOR = By.xpath("	//span[contains(text(),\"Job created successfully\")]");

	public void createJob(String oemName, String productName, String modelName, String imeiNo1, String datePurchase,
			 String problem,String remarkText, String firstName, String lastName, String contactNo,
			 String emailId, String flatNo, String apartmentNo, String landmarkName,
			String streetName, String areaName, String stateName, String pincodeNo, String warrantyStatus) {
		selectFromDropdown(OEM_Dropdown_Locator, oemName);
		selectFromDropdown(Product_Name_Dropdown_Locator, productName);
		selectFromDropdown(Model_Name_Dropdown_Locator, modelName);
		enterTextInto(IMEI_NO1_TEXTBOX_LOCATOR, imeiNo1);
		enterTextInto(PURCHASE_DATE_DROPDOWN_LOCATOR, datePurchase);
		selectFromDropdown(WARRANTY_DROPDOWN_LOCATOR, warrantyStatus);
		selectFromDropdown(PROBLEM_DROPDOWN_LOCATOR, problem);
		enterTextInto(REMARK_TEXT_BOX_LOCATOR, remarkText);
		enterTextInto(FIRST_NAME_TEXT_BOX_LOCATOR, firstName);
		enterTextInto(LAST_NAME_TEXT_BOX_LOCATOR, lastName);
		enterTextInto(CONTACT_TEXT_BOX_LOCATOR, contactNo);
		enterTextInto(EMAIL_TEXT_BOX_LOCATOR, emailId);
		enterTextInto(FLAT_NUMBER_TEXT_BOX_LOCATOR, flatNo);
		enterTextInto(APARTMENT_NAME_TEXT_BOX_LOCATOR, apartmentNo);
		enterTextInto(LANDMARK_TEXT_BOX_LOCATOR, landmarkName);
		enterTextInto(STREET_NAME_TEXT_BOX_LOCATOR, streetName);
		enterTextInto(AREA_NAME_TEXT_BOX_LOCATOR, areaName);
		selectFromDropdown(STATE_NAME_TEXT_BOX_LOCATOR, stateName);
		enterTextInto(PIN_CODE_TEXT_BOX_LOCATOR, pincodeNo);
		clickOn(SUBMIT_BUTTON_LOCATOR);

	}

}
