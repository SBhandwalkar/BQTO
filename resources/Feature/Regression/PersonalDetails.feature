

Feature: PersonalDetails


 @TC_CONFIRM_UPDATE_CUSTOMER_DETAILS_Individual
@Counter
 Scenario Outline: User should be able to click on I_Want_To_Buy process
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
    And ConfirmAndUpdateCustomerlandingScreen
    And Verify_Address
  And Verify_EmailType
  Then Verify_Phone
   Then DateOfBirth
   And AdditionalNames
   Then FirstName
   And Surname
   Then Initials
   And Verify_Phone
     Then Verify_AddressType
      And Verify_EmailType   
   Then CorrespondaneLanguage
   And SourceOfIncome
   Then EmploymentPosition
   And MaritualContract
   #Then CorrespondaneLanguage
   Then Industry
   And Gender
    Then MaritualStatus
   And CountryOfBirth
   Then Title
   And Verify_Tabs
  Then Verify_Identifications
  And Verify_TaxRegistration
  Then Verify_Permits
  
  #And Verify_AddressType
  
 Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click NextButton_2
   Then ManageTransactionLandingPgae
  
   
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,AdviceAndSales,PersonalDetails|
    
    


    
    
  
      
