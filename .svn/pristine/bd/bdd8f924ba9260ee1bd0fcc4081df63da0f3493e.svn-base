

Feature: MoneyOut

  
 @TC_01_I_need_money_Cancel_My_Plan_NGP
@Counter
 Scenario Outline: User should be able to click on I_need_money_Cancel_My_Plan_NGP process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
   Then CancelPlan   
   When CaptureScreen
   And SelectCancelPlan_Checkbox
   Then CancelPlan_EffectiveDate
   And CancellationReasons
  
   Then CreateANewBank
   And NameOfBank
   And TypeOfAccount
   And AccountNum
   And AccountHolderDetail
   Then Validate_Button
   And CancelPlan_SaveButton
   When MoneyOutOptionsLandingScreen
    Then ProceedButtonSelected
   Then Click ButtonNext
  When MoneyOutReviewLandingScreen
    And SignZero
    Then ProceedButtonSelected
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
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|

  
 @TC_08_I_need_money_Take_a_Zero_Interest_Loan_(ZIL)
@Counter
 Scenario Outline: User should be able to click on I_need_money_Take_a_Zero_Interest_Loan_(ZIL) process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
  
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
  And Click ButtonNext
  When MoneyOutOptionsLandingScreen
   Then ZIL
   When CaptureScreen
   And ZILSelect
   Then RequiredValue    
   And Create_New_Bank
   Then ZIL_BankName
   And ZIL_AcountType
   Then ZIL_AcountNo
   And ZIL_AcountHolder
   Then Validate_Button
   And ZIL_SaveButton
   When MoneyOutOptionsLandingScreen
    Then ProceedButtonSelected
   Then Click ButtonNext
  When MoneyOutReviewLandingScreen
    And SignZero
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
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|

      
      
      
@TC_09_I_need_money_Take_a_Regular_Zero_Interest_Loan_(Regular_ZIL)
@Counter
 Scenario Outline: User should be able to click on I_need_money_Take_a_Regular_Zero_Interest_Loan_(Regular_ZIL) process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 Then ManageTransactionLandingPgae
   Then I_Need_Money
  Then Click ButtonNext
  When MoneyOutOptionsLandingScreen
   Then Regular_ZIL
   When CaptureScreen 
   And ZILSelect
   Then RequiredValue
   And Frequency_Drp
   Then Day
   And Start_Day
   Then End_Day 
   And Create_New_Bank
   Then Bank_Name_ZIL_Regular
   And Acount_Type_ZIL_Regular
   Then Acount_No_ZIL_Regular
   And Acount_Holder_ZIL_Regular
   Then Validate_Button
   And ZIL_SaveButton
   When MoneyOutOptionsLandingScreen  
   Then ProceedButtonSelected
   Then Click ButtonNext   
    When MoneyOutReviewLandingScreen
    Then SignZero
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
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
         
            
@TC_10_I_need_money_Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment
@Counter
 Scenario Outline: User should be able to click on I_need_money_Take_Some_Money_and_Continue_Paying_Premiums_(Disinvestment)process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
 #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
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
   When MoneyOutOptionsLandingScreen
   Then Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment
   When CaptureScreen
   And ZILSelect
   Then RequiredValue  
   And Create_New_Bank
   Then Bank_Name
   And Acount_Type
   Then Acount_No
   And Acount_Holder
   Then Validate_Button
   And ZIL_SaveButton
   When MoneyOutOptionsLandingScreen
  Then ProceedButtonSelected
   Then Click ButtonNext
   When MoneyOutReviewLandingScreen
    And SignZero
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
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    
    
  @TC_11_I_need_money_Take_Regular_Payments_Regular_Disinvestment
@Counter
 Scenario Outline: User should be able to click on TC_11_I_need_money_Take_Regular_Payments_Regular_Disinvestment process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   Then GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
   Then Take_Regular_Payments_Regular_Disinvestment 
     When CaptureScreen
   And ZILSelect
   Then RequiredValue
   And Frequency_Drp
   Then Day
   And Start_Day
   Then End_Day  
   And Create_New_Bank
   Then Bank_Name_ZIL_Regular
   And Acount_Type_ZIL_Regular
   Then Acount_No_ZIL_Regular
   And Acount_Holder_ZIL_Regular
   Then Validate_Button
  And ZIL_SaveButton
  When MoneyOutOptionsLandingScreen
  Then ProceedButtonSelected
   Then Click ButtonNext
    When MoneyOutOptionsLandingScreen
    And SignZero
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
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    

    
     
 @TC_02_I_need_money_Cancel_My_Plan_AllBenefits
@Counter
 Scenario Outline: User should be able to click on TC_02_I_need_money_Cancel_My_Plan_AllBenefits process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
   Then CancelPlan   
   When CaptureScreen
   And SelectCancelPlan_Checkbox
   Then CancelPlan_EffectiveDate
   And CancellationReasons
  
   Then CreateANewBank
   And NameOfBank
   And TypeOfAccount
   And AccountNum
   And AccountHolderDetail
   Then Validate_Button
   And CancelPlan_SaveButton
   When MoneyOutOptionsLandingScreen
    Then ProceedButtonSelected
   Then Click ButtonNext
  When MoneyOutReviewLandingScreen
    And SignZero
    Then ProceedButtonSelected
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
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    
    
    
    
        
 @TC_03_I_need_money_DecreaseMyPremium
@Counter
 Scenario Outline: User should be able to click on TC_03_I_need_money_DecreaseMyPremium process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
  Then SelectDecreaseMyPremium
  Then Click ButtonNext
  When CaptureLeadLandingPage
  Then IntermediaryToContactYou
  And WillContactText
  Then IntermediaryNotToContactYou
  And VerifyOldMutualText
  Then PFFAdvisor
  And EnterComments
Then Click ButtonNext
When MoneyOutOptionsLandingScreen
Then Click ButtonNext
When MoneyOutReviewLandingScreen
Then ProceedButtonSelected
Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
Then ProceedButtonSelected
Then Click ButtonNext
 When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
 Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    
    
    
           
 @TC_07_I_need_money_Surrender
@Counter
 Scenario Outline: User should be able to click on TC_07_I_need_money_Surrender process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
  Then SelectSurrender
  When CaptureScreen
  Then SelectBoxSurrender
  Then NewBankDetails
  And ZIL_BankName
  And AccountType_Surrender
  And AccNo_Surrender
  And AccHolder_Surrender
  Then Validate_Button
   And CancelPlan_SaveButton
   When MoneyOutOptionsLandingScreen
   Then ProceedButtonSelected
Then Click ButtonNext
When MoneyOutReviewLandingScreen
And SignZero
Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
Then ProceedButtonSelected
Then Click ButtonNext
 When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
 Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    
           
 @TC_12_TakeAllMoneyDisinvestment
@Counter
 Scenario Outline: User should be able to click on TC_12_TakeAllMoneyDisinvestment process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
  Then TakeAllMoneyCapture
  When CaptureScreen
  Then SelectBoxSurrender
  Then NewBankDetails
   And ZIL_BankName
  And AccountType_Surrender
   And AccNo_Surrender
  And AccHolder_Surrender
  Then Validate_Button
   And CancelPlan_SaveButton
   When MoneyOutOptionsLandingScreen
    And ProceedButtonSelected
     Then Click ButtonNext
     When MoneyOutOptionsLandingScreen
     And SignZero
     Then Click ButtonNext
 When ManageTransactionLandingPgae
 Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
Then ProceedButtonSelected
Then Click ButtonNext
 When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
 Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    
    
    
                  
 @TC_13_TakeAllMoneyPlanCancellation
@Counter
 Scenario Outline: User should be able to click on TC_13_TakeAllMoneyPlanCancellation process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
  Then SelectPlanCancellation
  When CaptureScreen
  Then SelectBoxSurrender
  Then NewBankDetails
   And ZIL_BankName
 And AccountType_Surrender
   And AccNo_Surrender
  And AccHolder_Surrender
  Then Validate_Button
   And CancelPlan_SaveButton
   When MoneyOutOptionsLandingScreen
    And ProceedButtonSelected
     Then Click ButtonNext
     When MoneyOutOptionsLandingScreen
     And SignZero
     Then Click ButtonNext
 When ManageTransactionLandingPgae
 Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
Then ProceedButtonSelected
Then Click ButtonNext
 When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
  
 Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    
    
    
                     
 @TC_14_StopPayingPremiumPaidUp
@Counter
 Scenario Outline: User should be able to click on TC_14_StopPayingPremiumPaidUp process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
  Then SelectStopPayingPremiumPaidUp
   Then Click ButtonNext
     When MoneyOutOptionsLandingScreen
      And SignZero
     Then Click ButtonNext
         Then Click ButtonNext
 When ManageTransactionLandingPgae
 Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
Then ProceedButtonSelected
Then Click ButtonNext
 When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
 Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    
    
    
    
    
                         
 @TC_15_PremiumBridging
@Counter
 Scenario Outline: User should be able to click on TC_15_PremiumBridging process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
  Then SelectPremiumBridging
  When CaptureScreen
  Then SelectBoxSurrender
  And MonthsNeeded
  And DateEffective
  Then CreateNewBankRadioBtn
  And SelectBankDetails
  And SelctAccountType
  And EnterAccountNo
  And EnterAccHolder
   Then Validate_Button
   And CancelPlan_SaveButton
   When MoneyOutOptionsLandingScreen
    Then Click ButtonNext
  When MoneyOutReviewLandingScreen
   And SignZero
     Then Click ButtonNext
         Then Click ButtonNext
 When ManageTransactionLandingPgae
 Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
Then ProceedButtonSelected
Then Click ButtonNext
 When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
 Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    
    
    
    
    
     @TC_16_PolictSecuredLoan
@Counter
 Scenario Outline: User should be able to click on TC_16_PolictSecuredLoan process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
  Then SelectPolictSecuredLoan
  When CaptureScreen
  Then SelectBoxSurrender
  And ProcessSummitMessage
   And CancelPlan_SaveButton
   When MoneyOutOptionsLandingScreen
   Then Click ButtonNext
    When MoneyOutReviewLandingScreen
     And ProceedButtonSelected
     Then Click ButtonNext
     When ManageTransactionLandingPgae
 Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
Then ProceedButtonSelected
Then Click ButtonNext
 When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
 Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    
    
    
    
    
     @TC_19_PartSurrender
@Counter
 Scenario Outline: User should be able to click on TC_19_PartSurrender process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
  Then SelectPartSurrender
   When CaptureScreen
   Then SelectBoxSurrender
   And EnterRequiredValue
   Then Create_New_Bank
      Then ZIL_BankName
      And AccountType_Surrender
      And AccNo_PartSurrender
      And EnterAccHolder
       Then Validate_Button
   And CancelPlan_SaveButton
    When MoneyOutOptionsLandingScreen
    Then ProceedButtonSelected
   Then Click ButtonNext
    When MoneyOutReviewLandingScreen
     And SignZero
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
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    

     @TC_20_PremiumHoliday
@Counter
 Scenario Outline: User should be able to click on TC_20_PremiumHoliday process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   
   When GatherDocumentslandingScreen
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
  Then SelectPremiumHoliday
   When CaptureScreen
   Then SelectBoxSurrender
   And EnterRequiredValue
   Then Create_New_Bank
      Then ZIL_BankName
      And AccountType_Surrender
      And AccNo_PartSurrender
      And EnterAccHolder
       Then Validate_Button
   And CancelPlan_SaveButton
    When MoneyOutOptionsLandingScreen
    Then ProceedButtonSelected
   Then Click ButtonNext
    When MoneyOutReviewLandingScreen
     And SignZero
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
    | BizagiLoginTestData| LoginData,CEBSearch,MoneyOut|
    