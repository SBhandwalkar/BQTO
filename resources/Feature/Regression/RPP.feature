

Feature: RPP
  
            
@TC_Change_My_Agreement_Change_My_Security_Cession_Details_RPP
@Counter
 Scenario Outline: User should be able to click on Change_My_Agreement_Change_My_Securit_Cession_Details_RPP process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
    
   #Then GatherDocumentslandingPage
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   Then ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 Then ManageTransactionLandingPgae  
   Then Change_My_Agreement
   Then Click ButtonNext
   Then Change_My_Security_Cession_Details_NGP
   And Security_Cession_Select_Box
   And Add_Person_Btn
   And Add_Person_Link
   And Select_Title
   And Surname_Box
   And Name_Box
   Then Add_Identification_Btn
   And SelectID_RPP
   And IDNumber_RPP
   And IDCountry_RPP
   And ExpiryDate_RPP
    Then SaveButton
    And SaveButton_RPP
   Then Click ButtonNext 
   Then SignDocument 
   Then FormLink
   Then Click ButtonNext 
    When ManageTransactionLandingPgae
   Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
    And ProceedButtonSelected
     Then Click ButtonNext
     When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,ChangeStatus,Money,RPP|
 

 @TC_Change_My_Agreement_Change_Replacement_Policy_Owner_Details_RPP
@Counter
 Scenario Outline: User should be able to click on Change_My_Agreement_Change_Replacement_Policy_Owner_Details_RPP process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
    
   #Then GatherDocumentslandingPage
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   Then ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 Then ManageTransactionLandingPgae 
   Then ChangeMyagreement
   Then Click ButtonNext
   Then RPOCapatureLink
   Then SelectBoxRPO
   Then AddRPO
   And UpdateDetail  
   And Select_Title
   And EnterFirstName 
   And SelectedGender
   And DOB_RPP
    Then EnterSurname
Then COB
Then SelectRelationship
And RelationToPolicyOwnerType
Then Add_Identification_Btn
And ID_RPP
And EnterID_RPP
And Country_RPP
And AddEmail
And Email
And EnterMail
And AddPhone
And Phone
And SelectedCountry
And Number
Then PreferedNo
Then SaveButton
Then Shares
Then SaveButton_RPP

Then Click ButtonNext 
  Then ManualySigned 
   Then Click ButtonNext
   When ManageTransactionLandingPgae
   Then DecissionButton
   Then ButtonNext

   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
    And ProceedButtonSelected
     Then Click ButtonNext
     When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
   
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,ChangeStatus,Money,RPP,Claims|
    
     
       @TC_10_I_Need_Money_Cancel_My_Plan_RPP
@Counter
 Scenario Outline: User should be able to click on I_Need_Money_Cancel_My_Plan_RPP process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
    
   #Then GatherDocumentslandingPage
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   Then ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 Then ManageTransactionLandingPgae
   Then I_Need_Money
    Then Click ButtonNext 
    Then CancelMyPlan_Capture
    #And SelectCaptureHyperlink
    Then SelectedCheckBox
    And EffectiveDte
    And CancellationReason
    #And SelectedBank
Then CreteNewBankDetails
And SelectBankName
And SelectAccount
And AccountHolder
And AccountNo
Then ValidateButton
  Then SaveButton_RPP
Then Click ButtonNext
Then PolicyOwner
Then CancelButton
Then CancellationDeclaration
  Then SignDocument
#Then Click NextButton_2
Then Click ButtonNext
   When ManageTransactionLandingPgae
   Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
    And ProceedButtonSelected
     Then Click ButtonNext
     When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button

 Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,RPP|
    
    
     @TC_Change_My_Agreement_Change_Beneficiary_Details_RPP
@Counter
 Scenario Outline: User should be able to click on Change_My_Agreement_Change_Beneficiary_Details_RPP process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
    
   #Then GatherDocumentslandingPage
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   Then ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 Then ManageTransactionLandingPgae
   Then Change_My_Agreement
   Then Click ButtonNext
   
   #When ChangeMyAgreementScreen  
   Then Change_My_Beneficiary_Detail_Link_RPP
   And Select_Change_My_Beneficiary_Detail_Checkbox
   Then Add_Beneficiary_Person_Button
   Then Update_Details_RPP  
 Then Capture_FirstName
And Capture_LastName  
   #Then Verify_RelationType  
   And CaptureDateOfBirth
And SelectGender
And Initial
And Country
And BirthCountry


And Select_Title
And IDType
 And IdentityNo

And RelationToPolicyOwner
And SelectRelationshipType
 
 And SharePercentage_RPP
 And AddPhone
   And PhoneType
   And PhoneCountry
   And PhoneNumber
   And SelectPreferred 
   And Capture_New_Bank_Details   
   And BankName_RPP
  And Account_RPP
  And AccountNumber_RPP
  And AccountHolder_RPP
   Then ValidateButton
       #And SaveButton_RPP
      And SaveButton
       And SaveButton
   Then Click ButtonNext
    Then FormLink
   Then Click ButtonNext 
      When ManageTransactionLandingPgae
   Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
    And ProceedButtonSelected
     Then Click ButtonNext
     When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
   
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,ChangeStatus,RPP|
    
    
    
     @TC_Change_My_Agreement_Change_Beneficiary_on_an_Accelerator_RPP
@Counter
 Scenario Outline: User should be able to click on Change_My_Agreement_Change_Beneficiary_Details_RPP process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
    
   #Then GatherDocumentslandingPage
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   Then ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 Then ManageTransactionLandingPgae   
   Then Change_My_Agreement
    Then Click ButtonNext
   Then Change_My_Beneficiary_Detail_Link_RPP
   And Select_Change_My_Beneficiary_Detail_Checkbox
   
   And SelectedPerson
   Then Attach_Existing_Person
   Then Update_Details_RPP
   Then AdditionalNamez
   And SelectCountryOfBirth
   And PercentageShare
   Then Relationships
   And RelationshipType
   And Line3
   And ChangedEmail
   And PhoneChange
    #Then SaveButton_RPP
    
     Then SaveButton_RPP
    Then Click ButtonNext 
    Then ManualySigned 
   Then Click ButtonNext 
      When ManageTransactionLandingPgae
   Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
    And ProceedButtonSelected
     Then Click ButtonNext
     When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
   
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,ChangeStatus,RPP|
    
   
     @TC_Change_My_Agreement_Change_Dependant_Life_assured_Details
@Counter
 Scenario Outline: User should be able to click on Change_My_Agreement_Change_Dependant/Life_assured_Details process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
    
   #Then GatherDocumentslandingPage
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   #Then ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 Then ManageTransactionLandingPgae  
   Then Change_My_Agreement
   Then Click ButtonNext
   Then ChangeDependentLifeAssuredDetail
   And RoleUpDateScreen
    When SelectCheckBox
    And UpdateDetailHyperLink
    When UpdatePartyDetailsScreen
    
     
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,ChangeStatus,RPP|
    
