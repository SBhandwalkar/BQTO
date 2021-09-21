package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class AcceleratorRoleUpdate_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;

	public static String ExistingPersonSelected;
	
	public static String AttachExistingPersonButton;

	public static String UpdateLink;
	public static String LegalName;
	public static String Percentage;
	
	public static String SignDocument_RPP;
	public static String BeneficiarySelected;
	public static String Relation_Type;
	public static String Relation_Value;
	public static String Organisation_Type;
	public static String PreferedPhone;
	public static String PreferedEmail;
	public static String PreferedAdres;
	public static String AddBeneficiaryPerson_Btn;
	public static String AddBeneficiaryOrganization_Btn;
	public static String Organisation_Value;
	public static String RegistrationNo;
	public static String NameField;
	public static String RegistrationDate_Type;
	public static String RegistrationDate_Value;
	public static String CountryOfIncorp_Type;
	public static String CountryOfIncorp_Value;
	public static String Share_Percentage;
	public static String LanguageType;
	public static String LanguageValue;
	public static String AddName_Btn;
	public static String SelectCOB_Type;
	public static String SelectCOB_Value;

	
	public static String PhoneValue;
	public static String PhoneType;
	public static String HomeNumber;
	public static String CountrySelectedType;
	public static String CountrySelectedValue;
	public static String Verify_Delete;
	public static String Name;
	public static String DOB_Type;
	public static String DOB_Value;
	
	public static String SelectID_Type;
	public static String SelectID_Value;
	
	
	public static String Selected_Gender_Type;
	public static String Selected_Gender_Value;
	
	public static String CountryID_Type;
	public static String CountryID_Value;
	
	public static String EnterSharePercentage;
	public static String EnterIDNumber;
	
	public static String SelectId_Type;
	public static String SelectId_Value;
	public static String SelectRelation_Type;
	public static String SelectRelation_Value;
	
	public static String Select_Country_Type;
	public static String Select_Country_Value;
	
	public static String DateOfExpiry_Type;
	public static String DateOfExpiry_Value;
	public static String Change_My_Beneficiary_Detail;
	public static String PhoneNo;
	
	public static String CountryOfPhone_Type;
	public static String CountryOfPhone_Value;
	

	public static String EnterEMail;
	public static String AddEmails_Type;
	public static String AddEmails_Value;
	
	public static String SelectPhoneType_Type;
	public static String SelectPhoneType_Value;
	
	public static String PreferedEmailSelect;
	public static String IDNo;
	public static String EnterInitials;
	public static String Enter_Surname;
	public static String SaveButton_Accelerator;
	public static String  UpdateLink_Person;
	
	public static String AdditionalName;
	
	public static String Accelerator_ButtonNext;
	
	public static String Accelerator_SharePercentage;

	
	
	public static String Name_Accelerator;
	public static String Surname_Accelerator;
	public static String AdditionalName_Accelerator;
	public static String SelectCOB_Accelerator;
	public static String SelectCOB_Accelerator_Value;
	public static String EnterInitials_Accelerator;
	public static String DOB_Accelerator;
	public static String DOB_Accelerator_Value;
	public static String SelectID_Accelerator;
	public static String SelectID_Accelerator_Value;
	public static String IDNumber_Accelerator;
	public static String SelectedGender_Accelerator;
	public static String SelectedGender_Accelerator_Value;
	public static String CountryID_Accelerator;
	public static String CountryID_Accelerator_Value;
	
	public static String Accelerator_Relationship_Value;
	public static String Accelerator_Relationship;
	public static String Accelerator_Relationship_Type;
	public static String EditPercentage;
	public static String IdType;
	public static String SaveButtonAccelerator;
	public static String Select_Change_My_Beneficiary_Checkbox;
	
	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	ExistingPersonSelected = LocatorData.get("ExistingPersonSelected");
	AttachExistingPersonButton= LocatorData.get("AttachExistingPersonButton");
	UpdateLink= LocatorData.get("UpdateLink");
	SaveButtonAccelerator= LocatorData.get("SaveButtonAccelerator");
	UpdateLink_Person= LocatorData.get("UpdateLink_Person");
	EditPercentage= LocatorData.get("EditPercentage");
	BeneficiarySelected= LocatorData.get("BeneficiarySelected");
	IdType= LocatorData.get("IdType");
	
	
	Accelerator_Relationship_Type= LocatorData.get("Accelerator_Relationship_Type");
	
	Enter_Surname= LocatorData.get("Enter_Surname");
	Name= LocatorData.get("Name");
	SaveButton_Accelerator= LocatorData.get("SaveButton_Accelerator");
	
	SignDocument_RPP= LocatorData.get("SignDocument_RPP");
	
	Accelerator_ButtonNext= LocatorData.get("Accelerator_ButtonNext");
	
	Accelerator_SharePercentage= LocatorData.get("Accelerator_SharePercentage");
	
	
	Accelerator_Relationship_Value= LocatorData.get("Accelerator_Relationship_Value");
	Accelerator_Relationship= LocatorData.get("Accelerator_Relationship");
	
	
	Name_Accelerator= LocatorData.get("Name_Accelerator");
	Surname_Accelerator= LocatorData.get("Surname_Accelerator");
	AdditionalName_Accelerator= LocatorData.get("AdditionalName_Accelerator");
	SelectCOB_Accelerator= LocatorData.get("SelectCOB_Accelerator");
	SelectCOB_Accelerator_Value= LocatorData.get("SelectCOB_Accelerator_Value");
	EnterInitials_Accelerator= LocatorData.get("EnterInitials_Accelerator");
	DOB_Accelerator= LocatorData.get("DOB_Accelerator");
	DOB_Accelerator_Value= LocatorData.get("DOB_Accelerator_Value");
	SelectID_Accelerator= LocatorData.get("SelectID_Accelerator");
	SelectID_Accelerator_Value= LocatorData.get("SelectID_Accelerator_Value");
	IDNumber_Accelerator= LocatorData.get("IDNumber_Accelerator");
	SelectedGender_Accelerator= LocatorData.get("SelectedGender_Accelerator");
	SelectedGender_Accelerator_Value= LocatorData.get("SelectedGender_Accelerator_Value");
	CountryID_Accelerator= LocatorData.get("CountryID_Accelerator");
	CountryID_Accelerator_Value= LocatorData.get("CountryID_Accelerator_Value");
	Change_My_Beneficiary_Detail= LocatorData.get("Change_My_Beneficiary_Detail");
	
	Select_Change_My_Beneficiary_Checkbox= LocatorData.get("Select_Change_My_Beneficiary_Checkbox");
	PhoneNo= LocatorData.get("PhoneNo");
	
	CountryOfPhone_Value= LocatorData.get("CountryOfPhone_Value");
	CountryOfPhone_Type= LocatorData.get("CountryOfPhone_Type");
	
	SelectPhoneType_Type= LocatorData.get("SelectPhoneType_Type");
	SelectPhoneType_Value= LocatorData.get("SelectPhoneType_Value");
	PreferedEmailSelect= LocatorData.get("PreferedEmailSelect");
	
	EnterEMail= LocatorData.get("EnterEMail");
	AddEmails_Type= LocatorData.get("AddEmails_Type");
	AddEmails_Value= LocatorData.get("AddEmails_Value");
	
	SelectID_Type= LocatorData.get("SelectID_Type");
	SelectID_Value= LocatorData.get("SelectID_Value");
	Selected_Gender_Type= LocatorData.get("Selected_Gender_Type");
	Selected_Gender_Value= LocatorData.get("Selected_Gender_Value");
	
	
	DateOfExpiry_Type= LocatorData.get("DateOfExpiry_Type");
	DateOfExpiry_Value= LocatorData.get("DateOfExpiry_Value");
	
	SelectId_Type= LocatorData.get("SelectId_Type");
	Select_Country_Value= LocatorData.get("Select_Country_Value");
	SelectId_Value= LocatorData.get("SelectId_Value");
	
	IDNo= LocatorData.get("IDNo");
	Select_Country_Type= LocatorData.get("Select_Country_Type");
	
	SelectRelation_Value= LocatorData.get("SelectRelation_Value");
	SelectRelation_Type= LocatorData.get("SelectRelation_Type");
	
	EnterSharePercentage= LocatorData.get("EnterSharePercentage");
	
	CountryID_Type= LocatorData.get("CountryID_Type");
	CountryID_Value= LocatorData.get("CountryID_Value");
	EnterIDNumber= LocatorData.get("EnterIDNumber");
	DOB_Type= LocatorData.get("DOB_Type");
	DOB_Value= LocatorData.get("DOB_Value");
	
	EnterInitials= LocatorData.get("EnterInitials");
	SelectCOB_Type= LocatorData.get("SelectCOB_Type");
	SelectCOB_Value= LocatorData.get("SelectCOB_Value");
	AdditionalName= LocatorData.get("AdditionalName");
	CountrySelectedType= LocatorData.get("CountrySelectedType");
	CountrySelectedValue= LocatorData.get("CountrySelectedValue");
	PhoneType= LocatorData.get("PhoneType");
	PhoneValue= LocatorData.get("PhoneValue");
	HomeNumber= LocatorData.get("HomeNumber");
	Share_Percentage= LocatorData.get("Share_Percentage");
	NameField= LocatorData.get("NameField");
	LegalName= LocatorData.get("LegalName");
	
	LanguageValue= LocatorData.get("LanguageValue");
	
	LanguageType= LocatorData.get("LanguageType");
	
	Verify_Delete= LocatorData.get("Verify_Delete");
	CountryOfIncorp_Value= LocatorData.get("CountryOfIncorp_Value");
	CountryOfIncorp_Type= LocatorData.get("CountryOfIncorp_Type");
	
	AddName_Btn= LocatorData.get("AddName_Btn");
	
	RegistrationDate_Value= LocatorData.get("RegistrationDate_Value");
	RegistrationDate_Type= LocatorData.get("RegistrationDate_Type");
	Percentage= LocatorData.get("Percentage");
	Relation_Type= LocatorData.get("Relation_Type");
	Relation_Value= LocatorData.get("Relation_Value");
	AddBeneficiaryOrganization_Btn= LocatorData.get("AddBeneficiaryOrganization_Btn");
	AddBeneficiaryPerson_Btn= LocatorData.get("AddBeneficiaryPerson_Btn");
	PreferedPhone= LocatorData.get("PreferedPhone");
	PreferedEmail= LocatorData.get("PreferedEmail");
	PreferedAdres= LocatorData.get("PreferedAdres");
	Organisation_Type= LocatorData.get("Organisation_Type");
	Organisation_Value= LocatorData.get("Organisation_Value");
	RegistrationNo= LocatorData.get("RegistrationNo");

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
