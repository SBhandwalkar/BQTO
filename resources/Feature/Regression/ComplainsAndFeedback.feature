

Feature: ComplainsAndFeedback

@TC_Test_01_Complaints_and_Feedback_I_Want_To_Complain
@Counter
 Scenario Outline: User should be able to click on I_Want_To_Complain process
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
 #Then ManageTransactionLandingPgae 
  Then I_Want_To_Complain
      Then Click ButtonNext
     #Then CaptureFeedBackScreen
   Then Enter Complain_FeedBack
   Then Enter Outcome
   Then Select_Agreement
   Then CopyOfFeedBackButton 
   And FormLinkCustomer
   And CorrespondanceToCustomer
   #Then View_Add_documents_Link
   #Then Click ConfirmCheckBox
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
    | BizagiLoginTestData| LoginData,AdviceAndSales,CEBSearch,ComplainsAndFeedback|
    
    
    
    @TC_02_Complaints_and_Feedback_I_Want_To_Compliment
@Counter
 Scenario Outline: User should be able to click on I_Want_To_Compliment process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>" 
     #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase    
   #Then GatherDocumentslandingPage
   And ConfirmCheckBox
   Then Click ButtonNext
   Then ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 #Then ManageTransactionLandingPgae
Then I_Want_To_Compliment
    Then Click ButtonNext 
   Then Enter Complain_FeedBack
   #Then Select_Agreement
   #Then View_Add_documents_Link
   #Then CloseButton
   And ProceedButtonSelected
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
    | BizagiLoginTestData| LoginData,CEBSearch,AdviceAndSales,ComplainsAndFeedback|     
      
      
    @TC_03_Complaints_and_Feedback_I_Want_To_Report_Fraud
@Counter
 Scenario Outline: User should be able to click on I_Want_To_Report_Fraud process
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
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
   #When ManageTransactionLandingPgae
Then I_Want_To_Report_Fraud
   Then Click ButtonNext
   Then Enter Complain_FeedBack
   And Enter Outcome
   And Select_Agreement
   Then Copy_Feedback_Button
   And FormLinkCustomer
   And PrintedCorrespondanceToCustomer
   And CustomerInformedAbove
   
   And ProceedButtonSelected  
   #Then Click ConfirmCheckBox
    #Then Customer_Informed_Box
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
    | BizagiLoginTestData| LoginData,CEBSearch,AdviceAndSales,ComplainsAndFeedback|
    
    


    
      