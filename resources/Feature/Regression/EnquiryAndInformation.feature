

Feature: EnquiryAndInformation

 @TC_01_I_Need_General_Information_Death_Claim
@Counter
 Scenario Outline: User should be able to click on I_Need_General_Information_Death_Claim process
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
   When ManageTransactionLandingPgae  
   And I_Need_General_Information
   Then Click ButtonNext
   When GeneralInfoLandingScreen  
   Then TransactionType
   And AdditionalInfo
   And ReasonRadioButton
    Then GeneralNextButon
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
    When Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|

 @TC_03__I_Need_General_Information_OM_Enquiry
@Counter
 Scenario Outline: User should be able to click on I_Need_General_Information_OM_Enquiry process
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
   When ManageTransactionLandingPgae 
   Then I_Need_General_Information
  Then Click ButtonNext
   When GeneralInfoLandingScreen
   Then Transaction_Type
   And AdditionalInfo
   And ReasonRadioButton
    Then GeneralNextButon
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
    When Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
      
 
 @TC_04_I_Need_General_Information_OverPayment_Recovery
@Counter
 Scenario Outline: User should be able to click on I_Need_General_Information_OverPayment_Recovery process
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
   When ManageTransactionLandingPgae  
   Then I_Need_General_Information
  Then Click ButtonNext
  When EnquiryGeneralInfoLandingScreen
   Then Transaction
   And AdditionalInfo
    Then M65Report
   #Then Generate_Document_Button
   And ProceedButtonSelected
   And ReasonRadioButton
    Then GeneralNextButon
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
      Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
        
     
 @TC_07_I_Need_Agreement_Information_Policy_Values
@Counter
 Scenario Outline: User should be able to click on I_Need_Agreement_Information_Policy_Values process
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
   When ManageTransactionLandingPgae
   Then I_Need_Agreement_Information
     Then Click ButtonNext 
      When EnquiryAgreementInformation 
   Then TransactionTypes
   And AdditionalInfo
   Then _360_View_Tab
    Then Generate_Document_Button
    And ProceedButtonSelected
   And ReasonRadioButton
    Then GeneralNextButon
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
      Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
       
        
 @TC_10_I_Need_To_Follow_Up
@Counter
 Scenario Outline: User should be able to click on I_Need_To_Follow_Up process
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
   When ManageTransactionLandingPgae  
   Then I_Need_To_Follow_Up
   Then Click ButtonNext
   When EnquiryFollowUpLandingScreen
   Then Reason_For_FollowUp 
   And Select_Transaction_Checkbox   
   And AdditionalInfo     
    And ProceedButtonSelected
   And ReasonRadioButton
    Then GeneralNextButon
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
      Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
    
   
   @TC_11_I_Need_My_Document
@Counter
 Scenario Outline: User should be able to click on TC_I_Need_My_Document process
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
   When ManageTransactionLandingPgae 
   Then I_Need_My_Document
  Then Click ButtonNext 
  When EnquiryDocumentsLandingScreen
   #Then AdditionalInfo
     Then No_Further_Process_Needed_Button
    Then GeneralNextButon
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
      Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
    
    
    
    
     @TC_I_Need_Specific_Service
@Counter
 Scenario Outline: User should be able to click on TC_I_Need_Specific_Service process
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
   When ManageTransactionLandingPgae  
   Then I_Need_Specific_Service_Button
   Then Click ButtonNext
   When SpecificServiceLandingScreen
    Then Reason_TextBox
    And Service_Group_Type
    And Service_Catalog_Drp    
   And AdditionalInfo
    Then GeneralNextButon
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
      Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
    
       
        
 @TC_07_I_Need_Agreement_Information_Refund_Information
@Counter
 Scenario Outline: User should be able to click on _Need_Agreement_Information_Refund_Information process
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
   When ManageTransactionLandingPgae
   Then I_Need_Agreement_Information
   Then Click ButtonNext
   When EnquiryAgreementInformation 
   Then TransactionTypeDropDown
   And AdditionalInfo
    And ProceedButtonSelected
   #Then Select_Proceed_Button
   And ReasonRadioButton
    Then GeneralNextButon
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
     Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
           
       
 @TC_02_I_Need_General_Information_ErrorsAndIssues
@Counter
 Scenario Outline: User should be able to click on I_Need_General_Information_Death_Claim process
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
   When ManageTransactionLandingPgae  
   And I_Need_General_Information
   Then Click ButtonNext
   When GeneralInfoLandingScreen  
   Then SelectErrorsAndIssuesDrpDwn
   And AdditionalInfo
   And ReasonRadioButton
    Then GeneralNextButon
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
    When Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
            
 @TC_05_I_Need_Agreement_Information_PaymentInformation
@Counter
 Scenario Outline: User should be able to click on _Need_Agreement_Information_Refund_Information process
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
   When ManageTransactionLandingPgae
   Then I_Need_Agreement_Information
   Then Click ButtonNext
   When EnquiryAgreementInformation 
   Then PaymentInformation
   And AdditionalInfo
    And ProceedButtonSelected
   #Then Select_Proceed_Button
   And ReasonRadioButton
    Then GeneralNextButon
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
     Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
       
       
       
       
                     
 @TC_06_I_Need_Agreement_Information_PolicyInformation
@Counter
 Scenario Outline: User should be able to click on _Need_Agreement_Information_Refund_Information process
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
   When ManageTransactionLandingPgae
   Then I_Need_Agreement_Information
   Then Click ButtonNext
   When EnquiryAgreementInformation 
   Then PolicyInformationDrpDwn
   And AdditionalInfo
    And ProceedButtonSelected
   #Then Select_Proceed_Button
   And ReasonRadioButton
    Then GeneralNextButon
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
     Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
       
                      
 @TC_08_I_Need_Agreement_Information_PremiumInformation
@Counter
 Scenario Outline: User should be able to click on TC_08_I_Need_Agreement_Information_PremiumInformation process
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
   When ManageTransactionLandingPgae
   Then I_Need_Agreement_Information
   Then Click ButtonNext
   When EnquiryAgreementInformation 
   Then PremiumInformationDrpDwn
   And AdditionalInfo
    And ProceedButtonSelected
   #Then Select_Proceed_Button
   And ReasonRadioButton
    Then GeneralNextButon
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
     Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
    
                           
 @TC_12_INeedToSubmitDcuments
@Counter
 Scenario Outline: User should be able to click on TC_12_INeedToSubmitDcuments process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   When GatherDocumentslandingScreen  
   #And ProceedButtonSelected
   Then ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
   When ManageTransactionLandingPgae
   Then INeedToSubmitDcuments
   Then Click ButtonNext
   When VerifyEnquirySubmitDocuments
    #And ProceedButtonSelected
    Then Click ButtonNext
   When ManageTransactionLandingPgae
   Then DecissionButton
   Then Click ButtonNext
       When IncidentCompleteLandingPage
    Then Complete_Button
     Then Enter Case

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,EnquiryAndInformation|
    
       