

Feature: AcceleratorRoleUpdate
 
     @TC_Attach_existing_person
@Counter
 Scenario Outline: User should be able to click on Attach_existing_person process
   Given CEB Number Created "<TestDataFile>" & "<DataSetSheet>"
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #When VerifyHomePage 
   Then Enter Case
   And Click StartCase
   
   When GatherDocumentslandingScreen
    
   #Then GatherDocumentslandingPage
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then Change_My_Agreement
  Then Click ButtonNext
   Then Change_My_Beneficiary_Detail_Link_RPP
   And Select_Change_My_Beneficiary_Detail_Checkbox
   And BeneficiarySelected
   Then Attach_Existing_Person
   And UpdateLink
   #Then Percentage
   Then SaveButton
   Then Percentage
   Then EditPercentage
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
    | BizagiLoginTestData| LoginData,CEBSearch,ChangeStatus,RPP,AcceleratorRoleUpdate|
    
    
     
    
     @TC_Add_beneficiary_Person
@Counter
 Scenario Outline: User should be able to click on Add_beneficiary_Person process
  Given CEB Number Created "<TestDataFile>" & "<DataSetSheet>"
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
   #Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   Then ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 #Then ManageTransactionLandingPgae 
   
   Then Change_My_Agreement
   Then Accelerator_ButtonNext
   Then Change_My_Beneficiary_Detail
   And Select_Change_My_Beneficiary_Checkbox
   
   Then AddBeneficiaryPerson_Btn
   And UpdateLink_Person
   
   
   And Name_Accelerator
   
   And AdditionalName_Accelerator
   And SelectCOB_Accelerator
   Then EnterInitials_Accelerator
   And DOB_Accelerator
   Then SelectID_Accelerator
   And IDNumber_Accelerator
   Then SelectedGender_Accelerator
   And CountryID_Accelerator
   Then Select_Title
   And Surname_Accelerator
   
   Then Accelerator_SharePercentage
And Accelerator_Relationship
#And Accelerator_Relationship_Type
   Then Add_Identification_Btn
   
   And IdType
   Then IDNo
   And Select_Country
   Then DateOfExpiry
   And AddEmail
   Then AddEmails
   And EnterEMail
   Then PreferedEmailSelect
   And AddPhone
   Then SelectPhoneType
   And CountryOfPhone
   Then PhoneNo
   And SaveButton_Accelerator

   Then SaveButton
   
   
  Then Click ButtonNext
   #
   #Then PolicyOwner 
    #Then Cancel
    #Then Click NextButton_2
   #
   #
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
    | BizagiLoginTestData|LoginData,CEBSearch,AdviceAndSales,ChangeStatus,RPP,AcceleratorRoleUpdate|
    
    
    
    
     @TC_Add_beneficiary_Organization
@Counter
 Scenario Outline: User should be able to click on Add_beneficiary_Organization process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   #Then GatherDocumentslandingScreen
   
   #Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   Then ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae 
   
   Then Change_My_Agreement
  Then Click ButtonNext
   Then Change_My_Beneficiary_Detail_Link_RPP
   And Select_Change_My_Beneficiary_Detail_Checkbox
   
   Then AddBeneficiaryOrganization_Btn
   And UpdateLink
   Then Organisation
   And RegistrationNo
   And RegistrationDate
   Then CountryOfIncorp
  
   And AddName_Btn
   #And LegalName
   And NameField
   And Language
   Then Verify_Delete
    And Share_Percentage
   And AddPhone
   Then SelectHomePhone
   And CountrySelected
   Then HomeNumber
   Then SaveButton_Accelerator
  Then EditPercentage 
   Then SaveButtonAccelerator
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
    | BizagiLoginTestData| LoginData,CEBSearch,ChangeStatus,RPP,AcceleratorRoleUpdate|
    
    