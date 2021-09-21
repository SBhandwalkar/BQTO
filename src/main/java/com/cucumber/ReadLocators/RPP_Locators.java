package com.cucumber.ReadLocators;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.utility.ExcelReade;

public class RPP_Locators {
	Map<String, String> LocatorData;
	
	private WebDriver driver;
	Map<String, String> testData;
	public static String ChangeDependentLifeAssuredDetail;
	public static String CancelMyPlan_Capture;
	public static String SelectCaptureHyperlink;
	public static String CancellationReason_Value;
	public static String CancellationReason_Type;
	public static String SelectedBank;
	public static String CreteNewBankDetails;
	public static String EffectiveDte_Value;
	public static String EffectiveDte_Type;
	public static String SelectBankName_Type;
	public static String SelectBankName_Value;
	public static String SelectAccount_Value;
	public static String SelectAccount_Type;
	public static String SelectedCheckBox;
	public static String AccountNo;
	public static String AccountHolder;
	public static String SaveButton_RPP;
	
	public static String SelectCheckBox;
	
	public static String SelectID_RPP;
	public static String IDNumber_RPP;
	public static String IDCountry_RPP;
	public static String ExpiryDate_RPP;
	public static String ExpiryDate_RPPValue;
	
	
	public static String ChangeMyAgreementScreen;
	public static String PolicyOwner;
	public static String CancelButton;
	public static String CancellationDeclaration;
	public static String SelectedBeneficiary;
	public static String UpdateDetails;
	public static String Cancel;
	public static String ManualySigned;
	public static String RPOCapatureLink;
	public static String ChangeMyagreement;
	public static String SharePercentage;
	public static String UpdateDetailsRPO;
	public static String AddRPO;
	public static String EnterSurname;
	
	

	
	public static String AdditionalNamez;
	public static String SelectCountryOfBirth;
	public static String SelectCountryOfBirth_Value;
	public static String SelectedGender_Type;
	public static String SelectGender_Value;
	
	public static String Relationship_Type;
	public static String Relationship_Value;
	
	
	public static String PercentageShare;
	public static String COB_Type;
	public static String COB_Value;
	public static String SelectBoxRPO;
	
	public static String Change_My_Beneficiary_Detail_Link_RPP;
	public static String Select_Change_My_Beneficiary_Detail_Checkbox;
	public static String EnterFirstName;
	
	
	public static String ID_Type;
	public static String ID_Value;
	
	
	public static String EnterID;
	
	public static String IDCountry_Type;
	public static String IDCountry_Value;
	
	
	public static String PhoneType;
	public static String Phone_Valued;
	
	public static String Email_Types;
	public static String Email_Valued;
	
	public static String EnterMail;
	
	
	
	public static String SelectedCountry_Types;
	public static String SelectedCountry_Valued;
	public static String Number;
	
	public static String PreferedNo;
	public static String Attach_Existing_Person;
	
	
	public static String Update_Details_RPP;
	public static String RelationType;
	
	public static String RelationValue;
	
	public static String Relationships;
	
	public static String RelationshipType;
	
	public static String IdentityNumber;
	
	public static String Line3;
	
	public static String ChangedEmail;
	
	public static String PhoneChange;
	
	public static String RelationToPolicyOwner;
	
	public static String SelectedPerson;
	public static String IDType;	
	
	public static String IdentityNo;
	public static String BirthCountry;
	
	public static String RelationToPolicyOwnerType;
	
	public static String PhoneTypez;
	
	public static String PhoneCountry;
	
	public static String PhoneNumber;
	
	public static String SharePercentage_RPP;
	
	public static String SelectPreferred;
	
	
	public static String Country_RPP;
	public static String ID_RPP;
	public static String EnterID_RPP;
	
	public static String Shares;
	
	public static String AccountHolder_RPP;
	public static String AccountNumber_RPP;
	public static String Account_RPP;
	public static String BankName_RPP;
	
	public static String UpdateDetail;
	
	public static String DOB_RPP;
	public static String DOBType_RPP;
	
	public static String UpdateDetailHyperLink;
	
	public static String RoleUpDateScreen;
	
	public static String UpdatePartyDetailsScreen;
	
	public static String SelectRelationshipType;
	{
		
		String locatorFile = System.getProperty("ResourcesBaseFolder") + System.getProperty("LocatorsBaseFolder")
		+ this.getClass().getSimpleName() + ".xlsx";
ExcelReade readData = new ExcelReade();
try {
	LocatorData = readData.getLocatorData(locatorFile, "Locators");
	PhoneType= LocatorData.get("PhoneType");
	UpdateDetailHyperLink= LocatorData.get("UpdateDetailHyperLink");
	
	UpdatePartyDetailsScreen= LocatorData.get("UpdatePartyDetailsScreen");
	
	SelectRelationshipType= LocatorData.get("SelectRelationshipType");
	
	SelectCheckBox= LocatorData.get("SelectCheckBox");
	
	DOB_RPP= LocatorData.get("DOB_RPP");
	DOBType_RPP= LocatorData.get("DOBType_RPP");


	RoleUpDateScreen= LocatorData.get("RoleUpDateScreen");
	
	AccountHolder_RPP= LocatorData.get("AccountHolder_RPP");
	AccountNumber_RPP= LocatorData.get("AccountNumber_RPP");
	Account_RPP= LocatorData.get("Account_RPP");
	BankName_RPP= LocatorData.get("BankName_RPP");
	
	
	
	SharePercentage_RPP= LocatorData.get("SharePercentage_RPP");
	
	SelectPreferred= LocatorData.get("SelectPreferred");
	
	PhoneNumber= LocatorData.get("PhoneNumber");
	
	PhoneTypez= LocatorData.get("PhoneTypez");
	
	PhoneCountry= LocatorData.get("PhoneCountry");
	
	BirthCountry= LocatorData.get("BirthCountry");
	IdentityNo= LocatorData.get("IdentityNo");
	
	SelectedPerson= LocatorData.get("SelectedPerson");
	
	
	IDType= LocatorData.get("IDType");
	RelationToPolicyOwner= LocatorData.get("RelationToPolicyOwner");
	
	RelationToPolicyOwnerType= LocatorData.get("RelationToPolicyOwnerType");

	
	
	PhoneChange= LocatorData.get("PhoneChange");
	
	Shares= LocatorData.get("Shares");
	Line3= LocatorData.get("Line3");
	ChangedEmail= LocatorData.get("ChangedEmail");
	
	
	PercentageShare= LocatorData.get("PercentageShare");
	
	IdentityNumber= LocatorData.get("IdentityNumber");
	
	
	RelationshipType= LocatorData.get("RelationshipType");
	Relationships= LocatorData.get("Relationships");
	
	RelationValue= LocatorData.get("RelationValue");
	RelationType= LocatorData.get("RelationType");
	Attach_Existing_Person= LocatorData.get("Attach_Existing_Person");
	
	Update_Details_RPP= LocatorData.get("Update_Details_RPP");
	
	SelectedCheckBox= LocatorData.get("SelectedCheckBox");
	
	Select_Change_My_Beneficiary_Detail_Checkbox= LocatorData.get("Select_Change_My_Beneficiary_Detail_Checkbox");
	
	PreferedNo= LocatorData.get("PreferedNo");
	
	AdditionalNamez= LocatorData.get("AdditionalNamez");
	SelectCountryOfBirth= LocatorData.get("SelectCountryOfBirth");
	SelectCountryOfBirth_Value= LocatorData.get("SelectCountryOfBirth_Value");
	
	
	SaveButton_RPP = LocatorData.get("SaveButton_RPP");
	Change_My_Beneficiary_Detail_Link_RPP= LocatorData.get("Change_My_Beneficiary_Detail_Link_RPP");
	
	Number= LocatorData.get("Number");
	SelectedCountry_Types= LocatorData.get("SelectedCountry_Types");
	SelectedCountry_Valued= LocatorData.get("SelectedCountry_Valued");
	
	Phone_Valued= LocatorData.get("Phone_Valued");
	CancelMyPlan_Capture = LocatorData.get("CancelMyPlan_Capture");
	SelectCaptureHyperlink= LocatorData.get("SelectCaptureHyperlink");
	CancellationReason_Value= LocatorData.get("CancellationReason_Value");
	CancellationReason_Type= LocatorData.get("CancellationReason_Type");
	CreteNewBankDetails= LocatorData.get("CreteNewBankDetails");
	CancelButton= LocatorData.get("CancelButton");
	AccountNo= LocatorData.get("AccountNo");
	SelectBoxRPO= LocatorData.get("SelectBoxRPO");
	EnterSurname= LocatorData.get("EnterSurname");
	EnterFirstName= LocatorData.get("EnterFirstName");
	
	IDCountry_Type= LocatorData.get("IDCountry_Type");
	IDCountry_Value= LocatorData.get("IDCountry_Value");
	ID_Type= LocatorData.get("ID_Type");
	ID_Value= LocatorData.get("ID_Value");
	
	ChangeDependentLifeAssuredDetail= LocatorData.get("ChangeDependentLifeAssuredDetail");
	
	EnterMail= LocatorData.get("EnterMail");
	
	Email_Valued= LocatorData.get("Email_Valued");

	ChangeMyAgreementScreen= LocatorData.get("ChangeMyAgreementScreen");
	
	Email_Types= LocatorData.get("Email_Types");
	
	Relationship_Type= LocatorData.get("Relationship_Type");
	Relationship_Value= LocatorData.get("Relationship_Value");
	
	EnterID= LocatorData.get("EnterID");
	
	
	

	Country_RPP= LocatorData.get("Country_RPP");
	ID_RPP= LocatorData.get("ID_RPP");
	EnterID_RPP= LocatorData.get("EnterID_RPP");
	
	
	
	
	
	SelectID_RPP= LocatorData.get("SelectID_RPP");
	IDNumber_RPP= LocatorData.get("IDNumber_RPP");
	IDCountry_RPP= LocatorData.get("IDCountry_RPP");
	ExpiryDate_RPP= LocatorData.get("ExpiryDate_RPP");
	ExpiryDate_RPPValue= LocatorData.get("ExpiryDate_RPPValue");
	
	
	
	
	COB_Type= LocatorData.get("COB_Type");
	COB_Value = LocatorData.get("COB_Value");
	SelectGender_Value= LocatorData.get("SelectGender_Value");
	SelectedGender_Type= LocatorData.get("SelectedGender_Type");
	
	UpdateDetailsRPO= LocatorData.get("UpdateDetailsRPO");
	AddRPO= LocatorData.get("AddRPO");
	
	UpdateDetail= LocatorData.get("UpdateDetail");
	
	UpdateDetails= LocatorData.get("UpdateDetails");
	CancellationDeclaration= LocatorData.get("CancellationDeclaration");
	SharePercentage= LocatorData.get("SharePercentage");
	AccountHolder= LocatorData.get("AccountHolder");
	SelectedBeneficiary= LocatorData.get("SelectedBeneficiary");
	SelectAccount_Type= LocatorData.get("SelectAccount_Type");
	SelectAccount_Value= LocatorData.get("SelectAccount_Value");
	RPOCapatureLink= LocatorData.get("RPOCapatureLink");
	Cancel= LocatorData.get("Cancel");
	ManualySigned= LocatorData.get("ManualySigned");
	
	ChangeMyagreement= LocatorData.get("ChangeMyagreement");
	
	SelectBankName_Value= LocatorData.get("SelectBankName_Value");
	SelectBankName_Type= LocatorData.get("SelectBankName_Type");
	
	PolicyOwner= LocatorData.get("PolicyOwner");
	
	SelectedBank= LocatorData.get("SelectedBank");
	EffectiveDte_Type= LocatorData.get("EffectiveDte_Type");
	EffectiveDte_Value= LocatorData.get("EffectiveDte_Value");
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
