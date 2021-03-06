package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class Money_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;
	public static String I_Need_Money;
	public static String RequiredValue;
	public static String ZIL;
	public static String SelectCancelPlan_Checkbox;
	public static String VerifyOldMutualText;
	public static String IntermediaryNotToContactYou;
	public static String SelectDecreaseMyPremium;
	public static String ScheduleDay;
	public static String EndDateType;
	public static String StartDateType;
	public static String FrequenctType;
	public static String Frequenct;
	public static String StartDate;
	public static String	EndDate;
	public static String ZILSelect;
	public static String SelectBank;
	public static String SaveButton;
	public static String SignZero;
	public static String UpdateCustomerDetails;
	public static String Create_New_Bank;
	public static String Type;
	public static String CaptureScreen;
	public static String Value;
	public static String Value_Selected;
	public static String Type_Selected;
	public static String  Acount_Holder;
	public static String  Acount_No;
	public static String Validate_Button;
	public static String Regular_ZIL;
	public static String Selected_Value;
	 public static String Selected_Type;
	 public static String Day;
	 public static String Start_Day;
	 public static String Selected_ValueDrp;
	 public static String Selected_Date;
	 public static String End_Day;
	 public static String End_Day_Type;
	 public static String End_Day_Value;
	 public static String CancelPlan;
	 public static String ZIL_Type;
	 public static String CancellationReasonValue;
	 public static String CancellationReasonType;
	 public static String ZIL_Value;
	 public static String ZIL_Regular_Type;
	 public static String ZIL_Regular_Value;
	 public static String Acount_Holder_ZIL_Regular;
	 public static String Acount_No_ZIL_Regular;
	 public static String Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment;
	 public static String Take_Regular_Payments_Regular_Disinvestment;

	 public static String TransactionsButton;

	 public static String AccountHolderDetail;
	 public static String EffectiveDateValue;
	 public static String EffectiveDateType;
	 
	 public static String NameOfBankType;
	 public static String  NameOfBankValue;
	 public static String IntermediaryToContactYou;
	 public static String WillContactText;
	 public static String AccountNum;
	 public static String TypeOfAccountType;
	 public static String TypeOfAccountValue;
	 
	 public static String Other;
	 public static String Affordability;
	 public static String PoorService;
	 public static String Replacement;
	 public static String ProductNotRequired;
	 public static String DuplicatePolicy;
	 
	 public static String CancelPlan_EffectiveDate;
	 public static String CreateANewBank;
	 public static String EnterComments;
	 public static String CancelPlan_SaveButton;
	 
	 public static String PFFAdvisor;
	 public static String ZIL_AcountHolder;
	 public static String ZIL_AcountNo;
	 public static String ZIL_AcountType;
	 public static String ZIL_AcountTypeValue;
	 public static String ZIL_BankNameType;
	 public static String ZIL_BankNameValue;
	 public static String AccountType_Surrender;
	 public static String ZIL_SaveButton;
	 public static String SelectSurrender;
	 public static String SelectBoxSurrender;
	 public static String NewBankDetails;
	 public static String AccNo_Surrender;
	 public static String AccHolder_Surrender;
	 public static String TakeAllMoneyCapture;
	 public static String SelectPlanCancellation;
	 public static String SelectStopPayingPremiumPaidUp;
	 public static String SelectPremiumBridging;
	 public static String MonthsNeeded;
	 public static String DateEffective;
	 public static String CreateNewBankRadioBtn;
	 public static String SelectBankDetails;
	 public static String EnterAccountNo;
	 public static String EnterAccHolder;
	 public static String SelectPolictSecuredLoan;
	 public static String ProcessSummitMessage;
	 public static String SelectPartSurrender;
	 public static String TakeMoneyFromShortTermLoanLink;
	 public static String EnterRequiredValue;
	 public static String AccNo_PartSurrender;
	 public static String SelectPremiumHoliday;
	 public static String SelcBoxtShortTerm;
	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	I_Need_Money = LocatorData.get("I_Need_Money");
	RequiredValue = LocatorData.get("RequiredValue");
	ZIL = LocatorData.get("ZIL");
	SelectPremiumHoliday= LocatorData.get("SelectPremiumHoliday");
	AccNo_PartSurrender= LocatorData.get("AccNo_PartSurrender");
	EnterRequiredValue= LocatorData.get("EnterRequiredValue");
	SelectPartSurrender= LocatorData.get("SelectPartSurrender");
	ProcessSummitMessage= LocatorData.get("ProcessSummitMessage");
	SelectPolictSecuredLoan= LocatorData.get("SelectPolictSecuredLoan");
	EnterAccHolder= LocatorData.get("EnterAccHolder");
	MonthsNeeded= LocatorData.get("MonthsNeeded");
	SelectPremiumBridging= LocatorData.get("SelectPremiumBridging");
	SelectStopPayingPremiumPaidUp= LocatorData.get("SelectStopPayingPremiumPaidUp");
	SelectPlanCancellation= LocatorData.get("SelectPlanCancellation");
	TakeAllMoneyCapture= LocatorData.get("TakeAllMoneyCapture");
	AccHolder_Surrender= LocatorData.get("AccHolder_Surrender");
	AccNo_Surrender= LocatorData.get("AccNo_Surrender");
	AccountType_Surrender= LocatorData.get("AccountType_Surrender");
	SelectBoxSurrender= LocatorData.get("SelectBoxSurrender");
	IntermediaryToContactYou= LocatorData.get("IntermediaryToContactYou");
	ZIL_SaveButton= LocatorData.get("ZIL_SaveButton");
	NewBankDetails= LocatorData.get("NewBankDetails");
	SelectDecreaseMyPremium= LocatorData.get("SelectDecreaseMyPremium");
	ZIL_AcountHolder= LocatorData.get("ZIL_AcountHolder");
	 ZIL_AcountNo= LocatorData.get("ZIL_AcountNo");
	 ZIL_AcountType= LocatorData.get("ZIL_AcountType");
	 ZIL_AcountTypeValue= LocatorData.get("ZIL_AcountTypeValue");
	 ZIL_BankNameType= LocatorData.get("ZIL_BankNameType");
	 ZIL_BankNameValue= LocatorData.get("ZIL_BankNameValue");
	 PFFAdvisor= LocatorData.get("PFFAdvisor");
	
	 VerifyOldMutualText= LocatorData.get("VerifyOldMutualText");
	 CreateNewBankRadioBtn= LocatorData.get("CreateNewBankRadioBtn");
	
	CancelPlan_SaveButton= LocatorData.get("CancelPlan_SaveButton");
	
	
	CancelPlan_EffectiveDate= LocatorData.get("CancelPlan_EffectiveDate");
	
	SelectCancelPlan_Checkbox= LocatorData.get("SelectCancelPlan_Checkbox");
	
	EnterAccountNo= LocatorData.get("EnterAccountNo");
	 Other= LocatorData.get("Other");
	 SelectBankDetails= LocatorData.get("SelectBankDetails");
	 CreateANewBank= LocatorData.get("CreateANewBank");
	 Affordability= LocatorData.get("Affordability");
	 PoorService= LocatorData.get("PoorService");
	 DateEffective= LocatorData.get("DateEffective");
	 Replacement= LocatorData.get("Replacement");
	 ProductNotRequired= LocatorData.get("ProductNotRequired");
	 DuplicatePolicy= LocatorData.get("DuplicatePolicy");
	EffectiveDateValue= LocatorData.get("EffectiveDateValue");
	EffectiveDateType= LocatorData.get("EffectiveDateType");
	CancellationReasonType= LocatorData.get("CancellationReasonType");
	CancellationReasonValue= LocatorData.get("CancellationReasonValue");
	Frequenct= LocatorData.get("Frequenct");
	StartDate= LocatorData.get("StartDate");
	
	NameOfBankType= LocatorData.get("NameOfBankType");
	 NameOfBankValue= LocatorData.get("NameOfBankValue");
	
	EndDate= LocatorData.get("EndDate");
	ZILSelect = LocatorData.get("ZILSelect");
	SelectBank = LocatorData.get("SelectBank");
	SaveButton = LocatorData.get("SaveButton");
	SignZero = LocatorData.get("SignZero");
	Create_New_Bank = LocatorData.get("Create_New_Bank");
	Type = LocatorData.get("Type");
	ScheduleDay= LocatorData.get("ScheduleDay");
	EndDateType= LocatorData.get("EndDateType");
	StartDateType= LocatorData.get("StartDateType");
	FrequenctType= LocatorData.get("FrequenctType");
	Value = LocatorData.get("Value");
	SelectSurrender= LocatorData.get("SelectSurrender");
	TypeOfAccountType= LocatorData.get("TypeOfAccountType");
	 TypeOfAccountValue= LocatorData.get("TypeOfAccountValue");
	 EnterComments= LocatorData.get("EnterComments");
	CancelPlan= LocatorData.get("CancelPlan");
	UpdateCustomerDetails = LocatorData.get("UpdateCustomerDetails");;
	Value_Selected = LocatorData.get("Value_Selected");
	Type_Selected= LocatorData.get("Type_Selected");
	Acount_No = LocatorData.get("Acount_No");
	Acount_Holder = LocatorData.get("Acount_Holder");
	Validate_Button = LocatorData.get("Validate_Button");
	Regular_ZIL = LocatorData.get("Regular_ZIL");
	Selected_Type = LocatorData.get("Selected_Type");
	Selected_Value = LocatorData.get("Selected_Value");
	Day = LocatorData.get("Day");
	
	WillContactText= LocatorData.get("WillContactText");
	IntermediaryNotToContactYou= LocatorData.get("IntermediaryNotToContactYou");
	AccountNum= LocatorData.get("AccountNum");
	AccountHolderDetail= LocatorData.get("AccountHolderDetail");
	CaptureScreen= LocatorData.get("CaptureScreen");
	Start_Day = LocatorData.get("Start_Day");
	Selected_Date = LocatorData.get("Selected_Date");
	Selected_ValueDrp = LocatorData.get("Selected_ValueDrp");
	End_Day = LocatorData.get("End_Day");
	End_Day_Value = LocatorData.get("End_Day_Value");
	End_Day_Type = LocatorData.get("End_Day_Type");
	ZIL_Type  = LocatorData.get("ZIL_Type");
	 ZIL_Value  = LocatorData.get("ZIL_Value");
	 ZIL_Regular_Type = LocatorData.get("ZIL_Regular_Type");
	 ZIL_Regular_Value = LocatorData.get("ZIL_Regular_Value");
	 Acount_Holder_ZIL_Regular = LocatorData.get("Acount_Holder_ZIL_Regular");
	 Acount_No_ZIL_Regular = LocatorData.get("Acount_No_ZIL_Regular");
	 Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment = LocatorData.get("Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment");
	 TakeMoneyFromShortTermLoanLink= LocatorData.get("TakeMoneyFromShortTermLoanLink");
	 Take_Regular_Payments_Regular_Disinvestment = LocatorData.get("Take_Regular_Payments_Regular_Disinvestment");
	 TransactionsButton = LocatorData.get("TransactionsButton"); 
	 SelcBoxtShortTerm= LocatorData.get("SelcBoxtShortTerm"); 

} catch (Exception e) {
	e.printStackTrace();
	System.out.println("File Not Found " + locatorFile);
}
}

@Override
public String toString() {
return "Bizagi login Locators  [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
		+ super.toString() + "]";
		
		
	}
}
