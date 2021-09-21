

Feature: NoAuthTransactons

 @TC_01_General_Enquiry_Only_Death_Claim_Enquriy
@Counter
 Scenario Outline: User should be able to click on General_Enquiry_Only_Death_Claim_Enquriy process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
    #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   When GatherDocumentslandingPage
   Then General_Enquiry_Only_Button
   Then NextButton
   When GeneralInfoScreen
   Then TransactionTypez
   And More_Info
   And ProceedButtonSelected 
   Then Additional_Processing_Button
 Then NextButton
 When CheckIfContinueScreen
   Then Other_Transaction_Button
   Then NextButton
     Then Customer_Supply_Documents_Select
 Then NextButton
And SummaryReport
 #When ResolutionLandingPage
    Then NextButton

       When IncidentCompleteLandingPage
    Then Complete_Button
     
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,NoAuthTransactons|
 
 
 
 @TC_02_Cancel
@Counter
 Scenario Outline: User should be able to Click_On_Cancel process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   When GatherDocumentslandingPage
  Then Authentication_Result_Cancel
  And Cancel_Reason
  And Cancel_Observation
  Then Click NextButton_2
  Then Complete_Button
  

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,NoAuthTransactons|
    
      
    
 @TC_03_ComplainOnly
@Counter
 Scenario Outline: User should be able to Click_On_ComplainOnly process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
  #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   When GatherDocumentslandingPage
   Then Authenticate_ComplainOnly
   Then Click ButtonNext
   Then DetailOfCircumstanceFeedback
   And DesiredOutcome
   Then CopyOfFeedBackButton
   
    Then CustomerCorrespondance
   And IInformedCustomer
    #And CorrespondanceForCustomer
   #And IConfirmInformedCustomer
   
   And ProceedButtonSelected 
   Then Click ButtonNext
   When CheckIfContinueScreen
   Then DoYouWantOtherTransactions
   Then Click ButtonNext
   When GatherEvidenceLandingPage
  
Then Customer_Supply_Documents_Select
     Then Click ButtonNext
     When ResolutionLandingPage
     And TransactionSummaryReportIsAvailable
   Then Click ButtonNext
   When IncidentCompleteLandingPage
    Then Complete_Button
  

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,NoAuthTransactons|
 