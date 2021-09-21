

Feature: AdviceAndSales

 @TC_Test_01_Advice_and_Sales_I_Want_to_Buy
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
   Then ProceedButtonSelected
   And ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then EmploymentPositionDropDown
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 Then ManageTransactionLandingPgae
   Then I_Want_To_Buy
   And IwantToBuyAddedToTransactionList
   And CaptureTransactionDefaultSelection
  Then Click NextButton
   When CaptureLeadLandingPage   
   Then Click SolutionType
   And IntermediaryContact
   #And ResultText
   And ProceedButtonSelected
   Then Click ButtonNext
   When SummitLandingPage
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
    | BizagiLoginTestData| LoginData,CEBSearch,AdviceAndSales|   
    
    
    
    @TC_Test_02_Advice_and_Sales_I_Need_Advice
@Counter
 Scenario Outline: User should be able to click on I_Need_Advice process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   When GatherDocumentslandingScreen  
   And ProceedButtonSelected
   Then ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   #Then EmploymentPositionDropDown
   #Then SelectEmail
   #And SelectMobile
   #And SelectAdress
   Then Click ButtonNext
   When ManageTransactionLandingPgae
   Then I_Need_Advice
   And TransactionAddedToServiceList
   And CaptureTransactionDefaultSelection
   Then Click NextButton
   When CaptureLeadLandingPage
   Then Click Type
   #And ResultText
   
   And ProceedButtonSelected
  Then Click ButtonNext
   When SummitLandingPage
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
    | BizagiLoginTestData| LoginData,CEBSearch,AdviceAndSales|
    
   
 