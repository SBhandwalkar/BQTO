package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class AdviceAndSales_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;

	public static String I_Want_To_Buy;
	public static String NextButton;
	public static String SolutionType;
	public static String SelectValue;
	public static String IntermediaryContact;
	public static String NextButton_2;
	public static String NextButton_3;
	
	public static String MoneyOutOptionsLandingScreen;
	
	public static String VerifyHomePage;
	public static String EmploymentPositionType;
	public static String EmploymentPositionValue;
	
	public static String GatherDocumentslandingScreen;
	
	public static String Type;
	public static String IwantToBuyAddedToTransactionList;
	public static String TransactionAddedToServiceList;
	public static String  ProceedButtonSelected;
	public static String Customer_Supply_Documents_Select;
	public static String Default_Selected_Proceed;
	public static String I_Need_Advice;
	public static String GatherDocumentslandingPage;

	public static String Complete;
	public static String ResultText;
	
	public static String IWantToBuyService;

	public static String ConfirmAndUpdateCustomerlandingScreen;
	public static String ManageTransactionLandingPgae;
	public static String CaptureTransactionDefaultSelection;
	public static String CaptureLeadLandingPage;
	
	
	public static String SummitLandingPage;
	public static String GatherEvidenceLandingPage;
	public static String ResolutionLandingPage;
	public static String TransactionSummaryReportIsAvailable;
	public static String IncidentCompleteLandingPage;
	public static String MoneyOutReviewLandingScreen;
	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	I_Want_To_Buy = LocatorData.get("I_Want_To_Buy");
	EmploymentPositionType= LocatorData.get("EmploymentPositionType");
	EmploymentPositionValue= LocatorData.get("EmploymentPositionValue");
	MoneyOutReviewLandingScreen= LocatorData.get("MoneyOutReviewLandingScreen");
	
	MoneyOutOptionsLandingScreen= LocatorData.get("MoneyOutOptionsLandingScreen");
	NextButton = LocatorData.get("NextButton");
	TransactionSummaryReportIsAvailable= LocatorData.get("TransactionSummaryReportIsAvailable");
	ResolutionLandingPage= LocatorData.get("ResolutionLandingPage");
	SolutionType = LocatorData.get("SolutionType");
	IntermediaryContact= LocatorData.get("IntermediaryContact");
	SelectValue = LocatorData.get("SelectValue");
	IncidentCompleteLandingPage= LocatorData.get("IncidentCompleteLandingPage");
	TransactionAddedToServiceList= LocatorData.get("TransactionAddedToServiceList");
	NextButton_2 = LocatorData.get("NextButton_2");
	NextButton_2 = LocatorData.get("NextButton_3");
	SummitLandingPage= LocatorData.get("SummitLandingPage");
	GatherEvidenceLandingPage= LocatorData.get("GatherEvidenceLandingPage");
	CaptureLeadLandingPage= LocatorData.get("CaptureLeadLandingPage");
	CaptureTransactionDefaultSelection= LocatorData.get("CaptureTransactionDefaultSelection");
	Type = LocatorData.get("Type");
	GatherDocumentslandingPage= LocatorData.get("GatherDocumentslandingPage");
	Customer_Supply_Documents_Select = LocatorData.get("Customer_Supply_Documents_Select");
	Default_Selected_Proceed = LocatorData.get("Default_Selected_Proceed");
	I_Need_Advice = LocatorData.get("I_Need_Advice");
	IWantToBuyService= LocatorData.get("IWantToBuyService"); 
	Complete= LocatorData.get("Complete");
	VerifyHomePage= LocatorData.get("VerifyHomePage");
	
	
	GatherDocumentslandingScreen= LocatorData.get("GatherDocumentslandingScreen");
	
	ResultText= LocatorData.get("ResultText");
	IwantToBuyAddedToTransactionList= LocatorData.get("IwantToBuyAddedToTransactionList");
	ManageTransactionLandingPgae= LocatorData.get("ManageTransactionLandingPgae");
	ProceedButtonSelected= LocatorData.get("ProceedButtonSelected");
	ConfirmAndUpdateCustomerlandingScreen= LocatorData.get("ConfirmAndUpdateCustomerlandingScreen");
} catch (Exception e) {
	e.printStackTrace();
	System.out.println("File Not Found " + locatorFile);
}
}

@Override
public String toString() {
return "AdviceAndSales Locators  [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
		+ super.toString() + "]";
		
		
	}
}
