package com.cucumber.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.ReadLocators.Money_Locators;
import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.ExcelReade;

public class Money extends CommonMethod{
	
	private WebDriver driver;

	Map<String, String> testData;
	Money_Locators locators;
	String error = "";
	
	public Money(WebDriver driver, String strDataFile, String strDataSheet) throws IOException
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		locators = new Money_Locators();
	}

	/*=================================TC_10========================================*/
	
	
	public void I_Need_Money() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.I_Need_Money);
		waitForElementToAppear(locators.I_Need_Money);
	}
	public void SelectPolictSecuredLoan() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.SelectPolictSecuredLoan);
	}
	
	public void SelectBankDetails() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.SelectBankDetails);
	}
	public void CreateNewBankRadioBtn() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.CreateNewBankRadioBtn);
	}
	
	public void NewBankDetails() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.NewBankDetails);
	}
	
	public void SelectBoxSurrender() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.SelectBoxSurrender);
	}
	
	
	public void SelectPremiumHoliday() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.SelectPremiumHoliday);
	}
	
	public void SelectSurrender() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.SelectSurrender);
	}
	
	public void IntermediaryNotToContactYou() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.IntermediaryNotToContactYou);
	}
	
	public void IntermediaryToContactYou() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.IntermediaryToContactYou);
	}
	public void PFFAdvisor() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.PFFAdvisor);
	}
	
	public void SelectPartSurrender() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.SelectPartSurrender);
	}
	
	public void SelectDecreaseMyPremium() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.SelectDecreaseMyPremium);
	}
	
	public void ZIL() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.ZIL);
	}
	
	public void ZILSelect() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.ZILSelect);
	}
	
	public void SelectBank() throws InterruptedException 
	{
		Thread.sleep(3000);;
		clickOnElement(locators.SelectBank);
	}
	
	public void SignZero() throws InterruptedException 
	{
		
		Thread.sleep(7000);
		clickOnElement(locators.SignZero);
	}
	
	public void SelectCancelPlan_Checkbox() throws InterruptedException 
	{
		
		Thread.sleep(5000);
		clickOnElement(locators.SelectCancelPlan_Checkbox);
	}
	
	

	
	
	public void SaveButton() throws InterruptedException 
	{
		Thread.sleep(5000);
		clickOnElement(locators.SaveButton);
	}
	
	public void RequiredValue() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("RequiredValue - " + testData.get("RequiredValue"));
		enterText(locators.RequiredValue, testData.get("RequiredValue"), "Enter RequiredValue");	
	}
	public void EnterRequiredValue() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("EnterRequiredValue - " + testData.get("EnterRequiredValue"));
		enterText(locators.EnterRequiredValue, testData.get("EnterRequiredValue"), "Enter EnterRequiredValue");	
	}
	
	
	public void EnterComments() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("EnterComments - " + testData.get("EnterComments"));
		enterText(locators.EnterComments, testData.get("EnterComments"), "Enter EnterComments");
		
	}
	
	public void Create_New_Bank() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Create_New_Bank);
	}
	public void Bank_Name() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Type);
		Thread.sleep(3000);
		clickOnElement(locators.Value);
		
	}
	public void ScheduledDisinvestment() throws InterruptedException 
	{
	
		clickOnElement(locators.FrequenctType);
		clickOnElement(locators.Frequenct);
		Thread.sleep(3000);
		clickOnElement(locators.StartDateType);
		clickOnElement(locators.StartDate);
		Thread.sleep(3000);
		clickOnElement(locators.Day);
		Thread.sleep(3000);
		enterText(locators.ScheduleDay, testData.get("ScheduleDay"), "Enter ScheduleDay");
		Thread.sleep(3000);
		clickOnElement(locators.EndDateType);
		clickOnElement(locators.EndDate);
		
	}
	
	
	
	public void Acount_Type() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Type_Selected);
		Thread.sleep(3000);
		clickOnElement(locators.Value_Selected);
		
	}
	public void Acount_Holder() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Acount_Holder - " + testData.get("Acount_Holder"));
//		enterText(locators.Acount_Holder, testData.get("Acount_Holder"), "Enter Acount_Holder");
		enterValidationText(locators.Acount_Holder, "C Test", "Enter Acount_Holder");
	}
	
	public void Acount_No() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Acount_No - " + testData.get("Acount_No"));
//		enterText(locators.Acount_No, testData.get("Acount_No"), "Enter Acount_No");
		enterValidationText(locators.Acount_No, "123456789", "Enter Acount_No");
	}
	public void Validate_Button() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Validate_Button);
	}
	
	public void SelectPremiumBridging() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.SelectPremiumBridging);
	}
	
	public void TakeAllMoneyCapture() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.TakeAllMoneyCapture);
	}
	
	public void SelectPlanCancellation() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.SelectPlanCancellation);
	}
	public void SelectStopPayingPremiumPaidUp() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.SelectStopPayingPremiumPaidUp);
	}
	
	
	public void Regular_ZIL() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Regular_ZIL);
	}
	
	public void Frequency_Drp() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Selected_Value);
		Thread.sleep(3000);
		clickOnElement(locators.Selected_Type);
		
	}
	public void Day() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Day - " + testData.get("Day"));
		enterText(locators.Day, testData.get("Day"), "Enter Day");
//		enterText(locators.Day, "1", "Enter Day");
	}
	
	public void MonthsNeeded() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("MonthsNeeded - " + testData.get("MonthsNeeded"));
		enterText(locators.MonthsNeeded, testData.get("MonthsNeeded"), "Enter MonthsNeeded");
//		enterText(locators.Day, "1", "Enter Day");
	}
	public void DateEffective() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("DateEffective - " + testData.get("DateEffective"));
		enterText(locators.DateEffective, testData.get("DateEffective"), "Enter DateEffective");
//		enterText(locators.Day, "1", "Enter Day");
	}
	
	
	public void Start_Day() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Selected_ValueDrp);
		Thread.sleep(3000);
		clickOnElement(locators.Selected_Date);
		
	}
	public void End_Day() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.End_Day_Value);
		Thread.sleep(3000);
		clickOnElement(locators.Selected_Date);
		
	}
	public void Bank_Name_ZIL_Regular() throws InterruptedException 
	{

		Thread.sleep(3000);
		clickOnElement(locators.ZIL_Type);
		Thread.sleep(3000);
		clickOnElement(locators.ZIL_Value);
		
	}
	
	
	public void SelctAccountType() throws InterruptedException 
	{

		Thread.sleep(3000);
		clickOnElement(locators.ZIL_Type);
		Thread.sleep(3000);
		clickOnElement(locators.TypeOfAccountValue);
		
	}
	public void Acount_Type_ZIL_Regular() throws InterruptedException 
	{

		Thread.sleep(3000);
		clickOnElement(locators.ZIL_Regular_Type);
		Thread.sleep(3000);
		clickOnElement(locators.ZIL_Regular_Value);
		
	}
	public void Acount_Holder_ZIL_Regular() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Acount_Holder_ZIL_Regular - " + testData.get("Acount_Holder_ZIL_Regular"));
		enterValidationText(locators.Acount_Holder_ZIL_Regular, testData.get("Acount_Holder_ZIL_Regular"), "Enter Acount_Holder_ZIL_Regular");
//		enterText(locators.Acount_Holder, "C Test", "Enter Acount_Holder");
	}
	
	
	public void EnterAccountNo() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("EnterAccountNo - " + testData.get("EnterAccountNo"));
		enterValidationText(locators.EnterAccountNo, testData.get("EnterAccountNo"), "Enter EnterAccountNo");
//		enterText(locators.Acount_Holder, "C Test", "Enter Acount_Holder");
	}
	
	public void EnterAccHolder() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("EnterAccHolder - " + testData.get("EnterAccHolder"));
		enterValidationText(locators.EnterAccHolder, testData.get("EnterAccHolder"), "Enter EnterAccHolder");
//		enterText(locators.Acount_Holder, "C Test", "Enter Acount_Holder");
	}
	public void Acount_No_ZIL_Regular() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("Acount_No_ZIL_Regular - " + testData.get("Acount_No_ZIL_Regular"));
		enterValidationText(locators.Acount_No_ZIL_Regular, testData.get("Acount_No_ZIL_Regular"), "Enter Acount_No_ZIL_Regular");
//		enterText(locators.Acount_Holder, "C Test", "Enter Acount_Holder");
	}
	public void Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment);
	}
	public void Take_Regular_Payments_Regular_Disinvestment() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.Take_Regular_Payments_Regular_Disinvestment);
	}
	
	public void Verify_UpdateCustomerDetails() {		
		retrieveTextAttribute(locators.UpdateCustomerDetails);
		
	}
	public void ProcessSummitMessage() {		
		retrieveTextAttribute(locators.ProcessSummitMessage);
		
	}
	
	public void VerifyOldMutualText() {		
		retrieveTextAttribute(locators.VerifyOldMutualText);
		
	}
	
	
	public void WillContactText() {		
		retrieveTextAttribute(locators.WillContactText);
		
	}
	
	public void Verify_TransactionScreen() {		
		retrieveTextAttribute(locators.TransactionsButton);
		
	}
	
	public void CaptureScreen() {		
		retrieveTextAndCompare(locators.CaptureScreen,"Capture");
		
	}
	
	public void CancelPlan() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.CancelPlan);
	}
	
	
	public void EffectiveDate() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.EffectiveDateType);
		Thread.sleep(3000);
		clickOnElement(locators.EffectiveDateValue);
	}
	
	
	public void CancelPlan_EffectiveDate() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.EffectiveDateType);
		Thread.sleep(3000);
		clickOnElement(locators.CancelPlan_EffectiveDate);
	}
	
	
	
	
	
	public void CancelPlan_SaveButton() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.CancelPlan_SaveButton);
		
	}
	
	
	
	
	
	
	public void CreateANewBank() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.CreateANewBank);
	}
	

	public void CancellationReasons() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.CancellationReasonType);
		Thread.sleep(3000);
		retrieveTextAndCompare(locators.DuplicatePolicy,"Duplicate policy");
		retrieveTextAndCompare(locators.ProductNotRequired,"Product no longer required");
		retrieveTextAndCompare(locators.Replacement,"Replacement");
		retrieveTextAndCompare(locators.PoorService,"Poor service");
		retrieveTextAndCompare(locators.Affordability,"Affordability");
		retrieveTextAndCompare(locators.Other,"Other");
		clickOnElement(locators.CancellationReasonValue);
	}
	
	
	
	public void NameOfBank() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.NameOfBankType);
		Thread.sleep(3000);
		clickOnElement(locators.NameOfBankValue);
	}
	
	public void TypeOfAccount() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.TypeOfAccountType);
		Thread.sleep(3000);
		clickOnElement(locators.TypeOfAccountValue);
	}
	
	
	public void AccountNum() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("AccountNum - " + testData.get("AccountNum"));
//		enterText(locators.AccountNum, testData.get("AccountNum"), "Enter AccountNum");
		enterText(locators.AccountNum, "123456789", "Enter AccountNum");
	}
	
	public void AccountHolderDetail() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("AccountHolderDetail - " + testData.get("AccountHolderDetail"));
//		enterText(locators.AccountHolderDetail, testData.get("AccountHolderDetail"), "Enter AccountHolderDetail");
		enterText(locators.AccountHolderDetail, "C Test", "Enter AccountHolderDetail");
	}
	
	
	
	public void ZIL_BankName() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.ZIL_BankNameType);
		Thread.sleep(3000);
		clickOnElement(locators.ZIL_BankNameValue);
		
	}
	
	public void AccountType_Surrender() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.AccountType_Surrender);
		Thread.sleep(3000);
		clickOnElement(locators.ZIL_AcountTypeValue);
		
	}
	
	
	public void ZIL_AcountType() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.ZIL_AcountType);
		Thread.sleep(3000);
		clickOnElement(locators.ZIL_AcountTypeValue);
		
	}
	
	public void ZIL_SaveButton() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.ZIL_SaveButton);	
		
	}
	
	public void AccHolder_Surrender() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("AccHolder_Surrender - " + testData.get("AccHolder_Surrender"));
//		enterText(locators.AccountHolderDetail, testData.get("AccountHolderDetail"), "Enter AccountHolderDetail");
		enterText(locators.AccHolder_Surrender, "Test", "Enter AccHolder_Surrender");
	}
	
	
	public void AccNo_PartSurrender() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("AccNo_PartSurrender - " + testData.get("AccNo_PartSurrender"));
//		enterText(locators.AccountHolderDetail, testData.get("AccountHolderDetail"), "Enter AccountHolderDetail");
		enterText(locators.AccNo_PartSurrender, "0123456789", "Enter AccNo_PartSurrender");
	}
	
	public void ZIL_AcountNo() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("ZIL_AcountNo - " + testData.get("ZIL_AcountNo"));
//		enterText(locators.AccountHolderDetail, testData.get("AccountHolderDetail"), "Enter AccountHolderDetail");
		enterText(locators.ZIL_AcountNo, "0123456789", "Enter ZIL_AcountNo");
	}
	

	public void AccNo_Surrender() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("AccNo_Surrender - " + testData.get("AccNo_Surrender"));
//		enterText(locators.AccountHolderDetail, testData.get("AccountHolderDetail"), "Enter AccountHolderDetail");
		enterText(locators.AccNo_Surrender, "0123456789", "Enter AccNo_Surrender");
	}

	public void ZIL_AcountHolder() throws InterruptedException 
	{
		Thread.sleep(3000);
		System.out.println("ZIL_AcountHolder - " + testData.get("ZIL_AcountHolder"));
//		enterText(locators.AccountHolderDetail, testData.get("AccountHolderDetail"), "Enter AccountHolderDetail");
		enterText(locators.ZIL_AcountHolder, "T Test", "Enter ZIL_AcountHolder");
	}
	
	
	public void TakeMoneyFromShortTermLoanLink() throws InterruptedException 
	{
		Thread.sleep(3000);
		clickOnElement(locators.TakeMoneyFromShortTermLoanLink);		
	}
	
	public void SelcBoxtShortTerm() throws InterruptedException 
	{
		Thread.sleep(7000);
		clickOnElement(locators.SelcBoxtShortTerm);		
	}
	
}
