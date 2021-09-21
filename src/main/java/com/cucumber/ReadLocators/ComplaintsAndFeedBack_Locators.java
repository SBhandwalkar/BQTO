package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class ComplaintsAndFeedBack_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;
	public static String I_Want_To_Complain;
	public static String NextButton_4;
	public static String Complain_FeedBack;
	public static String Outcome;
	public static String Correspondance; 
	public static String ConfirmCheckBox;
	public static String Button;
	
	public static String CustomerInformedAbove;
	public static String FormLinkCustomer;
	public static String Select_Agreement;
	public static String Copy_Feedback_Button;
	public static String  View_Add_documents_Link;
	public static String I_Want_To_Compliment;
	public static String I_Want_To_Report_Fraud;
	public static String CorrespondanceToCustomer;
	public static String Customer_Informed_Box;
	public static String Complain_Next;
	public static String CaptureFeedBackScreen;
	public static String CustomerCorrespondance;
	public static String InformedCustomer;
	public static String PrintedCorrespondance;
	public static String CustomerInformed;

	public static String FormLinkForCustomer;
	
	public static String PrintedCorespondanceForCustomer;
	
	public static String ConfirmCustomerIsInformed;
	
	public static String PrintedCorrespondanceToCustomer;


	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	I_Want_To_Complain = LocatorData.get("I_Want_To_Complain");
	NextButton_4 = LocatorData.get("NextButton_4");
	CustomerCorrespondance= LocatorData.get("CustomerCorrespondance");
	CustomerInformed= LocatorData.get("CustomerInformed");
	Complain_FeedBack = LocatorData.get("Complain_FeedBack");
	Outcome = LocatorData.get("Outcome");
	
	FormLinkCustomer= LocatorData.get("FormLinkCustomer");
	PrintedCorrespondanceToCustomer= LocatorData.get("PrintedCorrespondanceToCustomer");
	

	FormLinkForCustomer= LocatorData.get("FormLinkForCustomer");
	
	PrintedCorespondanceForCustomer= LocatorData.get("PrintedCorespondanceForCustomer");
	
	ConfirmCustomerIsInformed= LocatorData.get("ConfirmCustomerIsInformed");
	
	Correspondance = LocatorData.get("Correspondance");
	ConfirmCheckBox = LocatorData.get("ConfirmCheckBox");
	Button = LocatorData.get("Button");
	Select_Agreement = LocatorData.get("Select_Agreement");
	Copy_Feedback_Button = LocatorData.get("Copy_Feedback_Button");
	View_Add_documents_Link = LocatorData.get("View_Add_documents_Link");
	I_Want_To_Compliment = LocatorData.get("I_Want_To_Compliment");
	I_Want_To_Report_Fraud  = LocatorData.get("I_Want_To_Report_Fraud");
	Customer_Informed_Box = LocatorData.get("Customer_Informed_Box");
	Complain_Next = LocatorData.get("Customer_Informed_Box");
	CaptureFeedBackScreen= LocatorData.get("CaptureFeedBackScreen");
	
	CustomerInformedAbove= LocatorData.get("CustomerInformedAbove");
	
	CorrespondanceToCustomer= LocatorData.get("CorrespondanceToCustomer");
	InformedCustomer= LocatorData.get("InformedCustomer");
	PrintedCorrespondance= LocatorData.get("PrintedCorrespondance");

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
