

Feature: Sanity   
    
     #@TC_10
#@Counter
 #Scenario Outline: User should be able to click on Hub_Change_Status process
   #Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"  
   #Then Enter Case
   #Then Enter StartCase
   #Then ConfirmCheckBox
   #Then Click ButtonNext
   #Then SelectEmail
   #Then SelectMobile
   #Then Click NextButton_2
#
   #
   #Then Click Change_Payment_Detail
     #Then Click Next
   #Then Click NextButon
   #Then Click Change_Premium_From_Stop_Oder_To_Debit_Oder
   #The Select_Option
   #Then Select_Option
   #Then Deduct_Day
   #Then Select_Bank
   #Then Save_Button
   #Then Click NextButon
   #Then ManuallySignDocument
   #Then Click NextButon
   #Then DecissionButton
   #Then Click NextButon
   #Then Customer_Supply_Documents_CheckBox
   #Then Click NextButon
   #Then Click NextButon
   #Then Click NextButon
   #Then Complete_Button
   #
   #Then Admin_Drp
   #Then User_Management_Drp
   #Then Users_Drp
   #Then Search_User
    #Then SearchCEB
    #Then Edit_Icon
    #Then User_Configuration_Tab
    #Then HubMoneyOutRAFNGP
    #Then AddSkill
   #Then SavesButton
    #Then CloseButton
    #
   #
   #Then New_Case_Tab
   #Then Case_Administration_Drp
   #Then CEB_Number
   #Then Reassign_Case_Button
   #Then Search_Button
   #Then Search_Button
   #Then Select_CEB
   #Then Me_Button
   #Then Reason_text
   #Then Click NextButon
    #
    #Then Inbox_Tab
    #Then Service_Transaction
    #Then Manual_Servicing
    #
    #Then Register_Call
    #Then Select_Phone
    #Then Call_Reason
    #Then Call_Outcome_Drp
    #Then Comment_Text
    #Then SavesButton
    #Then CloseButton
     #Then CloseButton
    #
    #Then Send_SMS
    #Then SMS_Template
    #Then Select_Phone
    #Then New_SMS_Text
    #Then Save_Button
    #
    #Then Send_Email
    #Then Select_Email
    #Then Email_Body
    #Then Save_Button
    #
   #Then Related_Reference_Tab
   #Then ReferenceNumber
   #Then Reference_Type
   #Then Add_Info
   #Then Add_Reference
   #Then Complete_Radio_Button
   #Then Complete_Reason
   #Then Click NextButon
#
#Examples: 
    #| TestDataFile | DataSetSheet |
    #| SanityPackTestData| LoginData,CEBSearch,ComplainsAndFeedback|
    


 @TC_CE_Branch_Search      
@Counter
 Scenario Outline: User should be able to click on CE_Branch_and_Telephony_Search process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
    #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   Then VerifyHomePage 
Then Queries_Drp
   Then Appication
    And OMEM_CST
   And Branch_Search
    When CEBranchAndTelephonyScreen
   And ReferanceNumber
   Then SearchCEB
 Then CloseButton
 Then CloseSearch
 

   
    #Then Bizagi_Inbox
   When Queries_Drp
   Then Appication
    Then OMEM_CST
   And Branch_Search
    When CEBranchAndTelephonyScreen
   Then Agreement
   And SearchCEB
  Then CloseSearch
    
     #Then Bizagi_Inbox
    When Queries_Drp
   Then Appication
    Then OMEM_CST
   And Branch_Search
   
   And GCS_ID
   Then SearchCEB
    Then CloseSearch
   
    #Then Bizagi_Inbox
   When Queries_Drp
   Then Appication
    Then OMEM_CST
   And Branch_Search
   And ID_No
   Then SearchCEB
    Then CloseButton
 Then CloseSearch
    #Then Bizagi_Inbox

 Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,Queries|

    
    
     @TC_I_Need_Money
@Counter
 Scenario Outline: User should be able to click on I_Need_Money process
  Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
    #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   Then GatherDocumentslandingScreen
   Then ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   Then SelectAdress
   Then SelectMobile
   Then Click ButtonNext
    When ManageTransactionLandingPgae
   Then I_Need_Money
   Then Click ButtonNext
   When MoneyOutOptionsLandingScreen
   Then ZIL
   Then ZILSelect
   Then RequiredValue
   Then SelectBank
   And ZIL_SaveButton
  Then Click ButtonNext
  When MoneyOutReviewLandingScreen
   Then SignZero
   Then Click ButtonNext
 
 Examples: 
    | TestDataFile | DataSetSheet |
    | SanityPackTestData| LoginData,CEBSearch,MoneyOut|
    
    
       
 @TC_I_Need_General_Information
@Counter
 Scenario Outline: User should be able to click on I_Need_General_Information process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   Then GatherDocumentslandingScreen
   Then ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   Then SelectAdress
   Then SelectMobile
   Then Click ButtonNext
    When ManageTransactionLandingPgae
   Then I_Need_General_Information
   Then GeneralNextButon
   Then TransactionType
   Then AdditionalInfo
   Then ReasonRadioButton
    Then GeneralNextButon

Examples: 
    | TestDataFile | DataSetSheet |
    | SanityPackTestData| LoginData,CEBSearch,EnquiryAndInformation|
   
   
       
@TC_I_Want_To_Complain
@Counter
 Scenario Outline: User should be able to click on I_Want_To_Complain process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>" 
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   Then GatherDocumentslandingScreen
   Then ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   Then SelectAdress
   Then SelectMobile
   Then Click ButtonNext
    When ManageTransactionLandingPgae
  Then I_Want_To_Complain
 Then Click ButtonNext
   Then Enter Complain_FeedBack
   Then Enter Outcome
   Then Click Correspondance
   Then Click ConfirmCheckBox
   Then Click Button

Examples: 
    | TestDataFile | DataSetSheet |
    | SanityPackTestData| LoginData,CEBSearch,ComplainsAndFeedback|
    
    
       
 @TC_Test_01_Advice_and_Sales_I_Want_to_Buy
@Counter
 Scenario Outline: User should be able to click on I_Want_To_Buy process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   Then VerifyHomePage 
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
     #When ManageTransactionLandingPgae   

Examples: 
    | TestDataFile | DataSetSheet |
    | SanityPackTestData| LoginData,CEBSearch,AdviceAndSales|   
    
    
     @TC_06_Change_My_Payment_Detail_ChangeMyIntermediary
@Counter
 Scenario Outline: User should be able to click on ChangeMyIntermediary process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>" 
    #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   Then GatherDocumentslandingScreen
   Then ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   Then SelectAdress
   Then SelectMobile
   Then Click ButtonNext
    When ManageTransactionLandingPgae
    Then ChangeMyIntermediary
   Then Click ButtonNext
   Then IntermediaryLink
   Then ChangeStatus_NextButon 

Examples: 
    | TestDataFile | DataSetSheet |
    | SanityPackTestData| LoginData,CEBSearch,ChangeStatus|

       
	 @TC_06_Change_My_Payment_Detail_Change_Payment_Detail
@Counter
 Scenario Outline: User should be able to click on Change_Payment_Detail process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"  
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   Then GatherDocumentslandingScreen
   Then ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   Then SelectAdress
   Then SelectMobile
   Then Click ButtonNext
    When ManageTransactionLandingPgae
   Then Click Change_Payment_Detail
     #Then Click Next
   Then Click NextButon
   Then Select Stop_Order
   Then Enter Details_Change
   Then Click ButtonNext
   When ChangePaymentDetailReiewLandingScreen
   Then SignDocument
   Then FormLink
  Then Click ButtonNext

Examples: 
    | TestDataFile | DataSetSheet |
    | SanityPackTestData| LoginData,CEBSearch,ChangeStatus|
          
    
    
 @TC_20_Change_My_Payment_Detail_Change_Premium_Detail
@Counter
 Scenario Outline: User should be able to click on Change_Premium_Detail process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
     #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   Then VerifyHomePage 
   When Enter Case
   Then Click StartCase
   Then GatherDocumentslandingScreen
   Then ConfirmCheckBox
   Then Click ButtonNext
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   Then SelectAdress
   Then SelectMobile
   Then Click ButtonNext
    When ManageTransactionLandingPgae
   Then Change_Premium_Detail
   Then Click NextButon
     When ChangePremiumDetailLandingScreen
   Then SelectDeferMyPremium
   #Then ChangeDetail
   Then Click ButtonNext
   When ChangePremiumReviewLandingScreen
   Then ManuallySign
   Then Click ButtonNext

   

Examples: 
    | TestDataFile | DataSetSheet |
    | SanityPackTestData| LoginData,CEBSearch,ChangeStatus|
    
    @TC_Tier_2_Search   
@Counter
 Scenario Outline: User should be able to click on TC_Tier_2_Search_process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
    #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   Then VerifyHomePage  
    When Queries_Drp
   Then Appication
   And OMEM_CST
   Then Tier_2_Search
  
   And ReferanceNo
   Then SearchCEB
  #And CloseSearch
    Then CloseButton
 Then CloseSearch
     
   #Then Bizagi_Inbox
   When Queries_Drp
   Then Appication
    And OMEM_CST
    And Tier_2_Search
   And IDNumber
   And SearchCEB
     Then CloseButton
      Then CloseSearch
   #Then Bizagi_Inbox
    When Queries_Drp
   Then Appication
    Then OMEM_CST
    And Tier_2_Search
   And GCS_ID
   Then SearchCEB
    Then CloseSearch
      
   #Then Bizagi_Inbox
   When Queries_Drp
   Then Appication
    Then OMEM_CST
    And Tier_2_Search
   And AgreementNo
   Then SearchCEB
    Then CloseSearch
    
   #Then Bizagi_Inbox
    When Queries_Drp
   Then Appication
    Then OMEM_CST
    And Tier_2_Search
   And CaseNo
   Then SearchCEB
  Then CloseButton
 Then CloseSearch
    #Then Bizagi_Inbox
    
     #Then Bizagi_Inbox
    #When Queries_Drp
   #Then Appication
    #Then OMEM_CST
    #And Tier_2_Search
   #And EmailFrom
   #Then SearchCEB
     #Then CloseButton
 #Then CloseSearch
    #Then Bizagi_Inbox
    
    
    
 Examples: 
    | TestDataFile | DataSetSheet |
    | SanityPackTestData| LoginData,Queries|

    
    
   