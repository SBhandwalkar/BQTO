package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class PersonalDetails_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;

	public static String IDYType;
	public static String IDNumber;
	public static String AddIdentification;
	public static String Delete;
	public static String IssueDate;
	public static String IDCountry;
	public static String ExpiryDate;
	public static String RegistrationNumber;
	public static String RegistrationCountry;
	public static String Resident;
	public static String AddTaxRegistration;
	public static String DeleteTab;
	public static String Country;
	public static String Registrations;
	public static String AddNationality;
	public static String DeleteNationality;
	public static String PermitType;
	public static String PermitCountry;
	public static String PermitNumber;
	public static String PermitIssueDate;
	public static String PermitExpiryDateNumber;
	public static String PermitDelete;
	public static String AddPermit;
	public static String Residential;
	public static String HomePostal;
	public static String BussinesPostal;
	public static String BussinessResidential;
	public static String SecondOrAlternate;
	public static String Drp_List;
	public static String Line1;
	public static String AddressType;
	public static String Line2;
	public static String Line3;
	public static String Line4;
	public static String Address_Country;
	public static String PostalCode;
	public static String PostalCodeSearch;
	public static String AddressDelete;
	public static String AddressPreferred;
	public static String EmailBusiness;
	public static String EmailPersonal;
	public static String EmailDrp_List;
	public static String Email;
	public static String EmailDelete;
	public static String EmailPreferred;
	public static String PhoneType;
	public static String Phone_Business;
	public static String Phone_Mobile;
	public static String Phone_BusinessFax;
	public static String Phone_BusinessMobile;
	public static String Phone_HomeFax;
	public static String Phone_Country;
	public static String Dialing_Code;
	public static String Number;
	public static String Phone_Delete;
	public static String Phone_Preferred;
	public static String CaseDetail_Tab;
	public static String OriginalCustomerDetails_Tab;
	public static String UpdateCustomerDetails_Tab;
	public static String Title_Value;
	public static String Title_Type;
	public static String  CountryOfBirth_Type;
	public static String  CountryOfBirth_Value;
	public static String  MaritualStatus_Type;
	public static String  MaritualStatus_Value;
	public static String SourceOfIncome_Type;
	public static String SourceOfIncome_Value;
	public static String EmploymentPosition_Type;
	public static String EmploymentPosition_Value;
	public static String MaritualContract_Type;
	public static String MaritualContract_Value;
	public static String CorrespondaneLanguage_Type;
	public static String CorrespondaneLanguage_Value;
	public static String Industry_Type;
	public static String Industry_Value;
	public static String Gender_Type;
	public static String Gender_Value;
	public static String AdditionalNames;
	public static String FirstName;
	public static String Surname;
	public static String Initials;
	public static String DateOfBirth_Type;
	public static String Permits;
	public static String DateOfBirth_Value;
	
	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	IDYType = LocatorData.get("IDYType");
	AdditionalNames = LocatorData.get("AdditionalNames");
	IDNumber = LocatorData.get("IDNumber");
	IssueDate = LocatorData.get("IssueDate");
	
	DateOfBirth_Type= LocatorData.get("DateOfBirth_Type");
	DateOfBirth_Value= LocatorData.get("DateOfBirth_Value");
	
	FirstName= LocatorData.get("FirstName");
	Surname= LocatorData.get("Surname");
	Initials= LocatorData.get("Initials");
	
	IDCountry= LocatorData.get("IDCountry");
	Delete= LocatorData.get("Delete");
	AddIdentification= LocatorData.get("AddIdentification");
	ExpiryDate= LocatorData.get("ExpiryDate");
	RegistrationNumber= LocatorData.get("RegistrationNumber");
	RegistrationCountry= LocatorData.get("RegistrationCountry");
	Resident= LocatorData.get("Resident");
	AddressType= LocatorData.get("AddressType");
	AddTaxRegistration= LocatorData.get("AddTaxRegistration");
	DeleteTab= LocatorData.get("DeleteTab");
	Country= LocatorData.get("Country");
	AddNationality= LocatorData.get("AddNationality");
	DeleteNationality= LocatorData.get("DeleteNationality");
	PermitType= LocatorData.get("PermitType");
	PermitCountry= LocatorData.get("PermitCountry");
	PermitNumber= LocatorData.get("PermitNumber");
	PermitIssueDate= LocatorData.get("PermitIssueDate");
	PermitExpiryDateNumber= LocatorData.get("PermitExpiryDateNumber");
	PermitDelete= LocatorData.get("PermitDelete");
	AddPermit= LocatorData.get("AddPermit");
	Residential= LocatorData.get("Residential");
	HomePostal= LocatorData.get("HomePostal");
	BussinesPostal= LocatorData.get("BussinesPostal");
	BussinessResidential= LocatorData.get("BussinessResidential");
	SecondOrAlternate= LocatorData.get("SecondOrAlternate");
	Drp_List= LocatorData.get("Drp_List");
	Line1= LocatorData.get("Line1");
	Permits= LocatorData.get("Permits");
	Line2= LocatorData.get("Line2");
	Registrations= LocatorData.get("Registrations");
	Line3= LocatorData.get("Line3");
	Line4= LocatorData.get("Line4");
	Address_Country= LocatorData.get("Address_Country");
	PostalCode= LocatorData.get("PostalCode");
	PostalCodeSearch= LocatorData.get("PostalCodeSearch");
	AddressDelete= LocatorData.get("AddressDelete");
	AddressPreferred= LocatorData.get("AddressPreferred");
	EmailBusiness= LocatorData.get("EmailBusiness");
	EmailPersonal= LocatorData.get("EmailPersonal");
	EmailDrp_List= LocatorData.get("EmailDrp_List");
	Email= LocatorData.get("Email");
	EmailDelete= LocatorData.get("EmailDelete");
	EmailPreferred= LocatorData.get("EmailPreferred");
	PhoneType= LocatorData.get("PhoneType");
	Phone_Business= LocatorData.get("Phone_Business");
	Phone_Mobile= LocatorData.get("Phone_Mobile");
	Phone_BusinessFax= LocatorData.get("Phone_BusinessFax");
	Phone_BusinessMobile= LocatorData.get("Phone_BusinessMobile");
	Dialing_Code= LocatorData.get("Dialing_Code");
	Phone_HomeFax= LocatorData.get("Phone_HomeFax");
	
	Phone_Country = LocatorData.get("Phone_Country");
	Phone_Country= LocatorData.get("Phone_Country");
	Number= LocatorData.get("Number");
	Phone_Delete= LocatorData.get("Phone_Delete");
	Phone_Preferred = LocatorData.get("Phone_Preferred");
	
	CaseDetail_Tab= LocatorData.get("CaseDetail_Tab");
	OriginalCustomerDetails_Tab= LocatorData.get("OriginalCustomerDetails_Tab");
	UpdateCustomerDetails_Tab= LocatorData.get("UpdateCustomerDetails_Tab");
	
	Title_Type = LocatorData.get("Title_Type");
	Title_Value= LocatorData.get("Title_Value");
	
	CountryOfBirth_Type= LocatorData.get("CountryOfBirth_Type");
	CountryOfBirth_Value= LocatorData.get("CountryOfBirth_Value");
	
	MaritualStatus_Value= LocatorData.get("MaritualStatus_Value");
	MaritualStatus_Type= LocatorData.get("MaritualStatus_Type");

	
	SourceOfIncome_Type= LocatorData.get("SourceOfIncome_Type");
	SourceOfIncome_Value= LocatorData.get("SourceOfIncome_Value");
	
	
	EmploymentPosition_Type= LocatorData.get("EmploymentPosition_Type");
	EmploymentPosition_Value= LocatorData.get("EmploymentPosition_Value");
	
	MaritualContract_Type= LocatorData.get("MaritualContract_Type");
	MaritualContract_Value= LocatorData.get("MaritualContract_Value");
	
	CorrespondaneLanguage_Type= LocatorData.get("CorrespondaneLanguage_Type");
	CorrespondaneLanguage_Value= LocatorData.get("CorrespondaneLanguage_Value");
	
	Industry_Type= LocatorData.get("Industry_Type");
	Industry_Value= LocatorData.get("Industry_Value");
	
	
	Gender_Type= LocatorData.get("Gender_Type");
	Gender_Value= LocatorData.get("Gender_Value");
	
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
