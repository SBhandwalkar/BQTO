

Feature: ADHOC
 
     @TC_AdviseAndSales_IWantToBuy
@Counter
 Scenario Outline: User should be able to click on AdviseAndSales_IWantToBuy process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #When VerifyHomePage 
   Then NewButton
   And Select_CEBADHOC
   When WorkClasifyScreen
   And RequestCountryDrp
   And ChannelDrp
   And OperationsDrp
   Then NewComment
   And Add
   Then CommentHistory
   And ProceedSelected
     Then ADHOC_ButtonNext
     When IdentifyPartyScreen
     Then RequestFromCustomer
     And PartyType
     And SearchCriteria
     Then RequestFromIntermediary
     And SearchIntermediary
     Then RequestFromExternalContact
     And ContactInformation
     Then RequestFromInternalContact
     And EmailSearch
     And ConsumerSearch
     Then RequestFromCustomer
     And VerifySearchCriteria
     Then EnterIDNo
     And Search
     #And SearchResults
     And SelectCustomer
    Then Click ButtonNext
      When ManageTransactionLandingPgae
      Then ViewTabs
      And I_Need_Advice
          Then ADHOC_ButtonNext 
       #When CaptureLeadLandingPage
       Then CommentsToRedirectDepartment
       And OtherEmail
       And ServiceDeliveryUnit
       Then SDU 
       Then ADHOC_ButtonNext 
       When ManageTransactionLandingPgae
       Then GatherEvidenceRadioButton
        Then ADHOC_ButtonNext 
        When GatherEvidenceLandingPage
         Then Click ButtonNext 
          When ResolutionLandingPage
          #Then UploadDocument
          #And ClosesButton
          Then Body
          And PreviewEmail
          And ClosesButton
          Then Click ButtonNext 
          When SummaryForADHOCScreen
  
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,AdviceAndSales,ADHOC|
    
    
    
    
      @TC_CancellAllTransactions
@Counter
 Scenario Outline: User should be able to click on TC_CancellAllTransactions process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #When VerifyHomePage 
   Then NewButton
   And Select_CEBADHOC
   When WorkClasifyScreen
   And RequestCountryDrp
   And ChannelDrp
   And OperationsDrp
   Then NewComment
   And Add
   And ProceedSelected
     Then ADHOC_ButtonNext
     When IdentifyPartyScreen
     Then RequestFromCustomer
     And PartyType
     And SearchCriteria
     Then RequestFromIntermediary
     And SearchIntermediary
     Then RequestFromExternalContact
     And ContactInformation
     Then RequestFromInternalContact
     And EmailSearch
     And ConsumerSearch
     Then RequestFromCustomer
    And VerifySearchCriteria
     Then EnterIDNo
     And Search
     #And SearchResults
     And SelectCustomer
    Then Click ButtonNext
      When ManageTransactionLandingPgae
      Then ViewTabs
      And DecisionCancel
      Then Click ButtonNext 
       When SummaryForADHOCScreen
  
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,AdviceAndSales,ADHOC|
    
    
    
    
     @EnquiryAndInformation
@Counter
 Scenario Outline: User should be able to click on EnquiryAndInformation process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
  #When VerifyHomePage 
   Then NewButton
   And Select_CEBADHOC
   When WorkClasifyScreen
   And RequestCountryDrp
   And ChannelDrp
   And OperationsDrp
   Then NewComment
   And Add
   And ProceedSelected
     Then ADHOC_ButtonNext
     When IdentifyPartyScreen
     Then RequestFromCustomer
     And PartyType
     And SearchCriteria
     Then RequestFromIntermediary
     And SearchIntermediary
     Then RequestFromExternalContact
     And ContactInformation
     Then RequestFromInternalContact
     And EmailSearch
     And ConsumerSearch
     Then RequestFromCustomer
    And VerifySearchCriteria
     Then EnterIDNo
     And Search
     #And SearchResults
     And SelectCustomer
    Then Click ButtonNext
      When ManageTransactionLandingPgae
      Then ViewTabs
      And I_Need_General_Information
   Then ADHOC_ButtonNext
   When GeneralInfoLandingScreen
   Then TransactionType
   And AdditionalInfo
   And TransactionComplete
      Then ADHOC_ButtonNext   
 When ManageTransactionLandingPgae
 And CommunicateResolution
 Then NextButtonADHOC 
 When ResolutionLandingPage
 #Then ResolutionEmail
  Then NextButtonADHOC  
When SummaryForADHOCScreen
  
  
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,EnquiryAndInformation,ADHOC|
    
    
    
     @ReferanceLibrary
@Counter
 Scenario Outline: User should be able to click on ReferanceLibrary process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
  #When VerifyHomePage 
   Then NewButton
   And Select_CEBADHOC
   When WorkClasifyScreen
Then ReferanceLibrary
And Tabs
Then Cancell
When WorkClasifyScreen
  
  
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,AdviceAndSales,ADHOC|
      
    
     @TC_INeedToClaim
@Counter
 Scenario Outline: User should be able to click on AdviseAndSales_IWantToBuy process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #When VerifyHomePage 
   Then NewButton
   And Select_CEBADHOC
   When WorkClasifyScreen
   And RequestCountryDrp
   And ChannelDrp
   And OperationsDrp
   Then NewComment
   And Add
   Then CommentHistory
   And ProceedSelected
     Then ADHOC_ButtonNext
     When IdentifyPartyScreen
     Then RequestFromCustomer
     And PartyType
     And SearchCriteria
     Then RequestFromIntermediary
     And SearchIntermediary
     Then RequestFromExternalContact
     And ContactInformation
     Then RequestFromInternalContact
     And EmailSearch
     And ConsumerSearch
     Then RequestFromCustomer
     And VerifySearchCriteria
     Then EnterIDNo
     And Search
     #And SearchResults
     And SelectCustomer
    Then Click ButtonNext
      When ManageTransactionLandingPgae
      Then ViewTabs
      And INeedToClaim
      Then Click ButtonNext
      
      Then ClaimType_Drp
      And DeathCertificateAvailable
      Then SelectLifeCovered
      Then Click ButtonNext
        Then DeceasedIDNumber 
   Then DeceasedDOB
    And DateOfDeath   
   #Then DeceasedIDNumber
   And DeceasedSurname
   Then DeceasedFirstName
   And DeceasedPlaceOfDeath
   #Then DeceasedDOB
   Then DeceasedGender
   And CauseOfDeath
   #Then DateOfDeath
   Then DeceasedMaritualStatus
   And IsDeathCertificateHandwritten
   Then CountryOfDeath
   And RelationshipTopolicyHolder
   Then DateOfFuneral
   And DetailsOfDeath
   Then ReasonForDeath
   Then Click ButtonNext
   When SummaryForADHOCScreen
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,AdviceAndSales,Claims,ADHOC|  
    
     @TC_ChangeMyPaymentDetailArrearPremiumCollection
@Counter
 Scenario Outline: User should be able to click on ChangeMyPaymentDetailArrearPremiumCollection process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #When VerifyHomePage 
   Then NewButton
   And Select_CEBADHOC
   When WorkClasifyScreen
   And RequestCountryDrp
   And ChannelDrp
   And OperationsDrp
   Then NewComment
   And Add
   #Then CommentHistory
   And ProceedSelected
     Then ADHOC_ButtonNext
     When IdentifyPartyScreen
     Then RequestFromCustomer
     And PartyType
     And SearchCriteria
     Then RequestFromIntermediary
     And SearchIntermediary
     Then RequestFromExternalContact
     And ContactInformation
     Then RequestFromInternalContact
     And EmailSearch
     And ConsumerSearch
     Then RequestFromCustomer
     And VerifySearchCriteria
     Then EnterIDNo
     And Search
     #And SearchResults
     And SelectCustomer
    Then Click ButtonNext
      When ManageTransactionLandingPgae
      Then ViewTabs
      Then Click Change_Payment_Detail
      Then ChangeStatus_NextButon
      When ChangeMyPaymentDetailsLandingScreen
      Then Arrear_Premium_Collection
       When CaptureScreen
       Then GenerateForm
   And SelecTickBox
Then How_To_Pay_Arrears
Then When_To_Pay_Arrears
Then Create_Bank
And AccountBelongToPolicy
Then Selected_Bank
And Select_Account_Type
And Account_Number
  And AcountHolder
   Then ValidateButton
  Then ADHOC_SaveButton
  When ChangeMyPaymentDetailsLandingScreen
  Then NextAction
  Then Click ButtonNext
  When ChangePaymentDetailReiewLandingScreen
   Then Click ButtonNext
   When ManageTransactionLandingPgae
   Then CommunicateResolution
 And Click ButtonNext 
 When ResolutionLandingPage
 Then ResolutionEmail
 And Click ButtonNext
 When SummaryForADHOCScreen

Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,AdviceAndSales,Claims,ADHOC,ChangeStatus|
       
    
         @TC_INeedMoney
@Counter
 Scenario Outline: User should be able to click on ChangeMyPaymentDetailArrearPremiumCollection process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
   #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #When VerifyHomePage 
   Then NewButton
   And Select_CEBADHOC
   When WorkClasifyScreen
   And RequestCountryDrp
   And ChannelDrp
   And OperationsDrp
   Then NewComment
   And Add
   #Then CommentHistory
   And ProceedSelected
     Then ADHOC_ButtonNext
     When IdentifyPartyScreen
     Then RequestFromCustomer
     And PartyType
     And SearchCriteria
     Then RequestFromIntermediary
     And SearchIntermediary
     Then RequestFromExternalContact
     And ContactInformation
     Then RequestFromInternalContact
     And EmailSearch
     And ConsumerSearch
     Then RequestFromCustomer
     And VerifySearchCriteria
     Then EnterIDNo
     And Search
     #And SearchResults
     And SelectCustomer
    Then Click ButtonNext
      When ManageTransactionLandingPgae
      Then ViewTabs
      Then I_Need_Money
   Then ChangeStatus_NextButon
   When MoneyOutOptionsLandingScreen
   Then SelectCapture
   When CaptureScreen
   #Then FlexiText
   #And LifeCoveredDetail
   And SelectBoolean
   And SelectGenerateForm
   And ValueRequired 
   Then NewBank
   And ADHOC_BankName
   And ADHOC_AccountType
   And ADHOC_AccountNumber
   And ADHOC_AccountHolder
   Then ValidateButton
  Then ADHOC_SaveButton
   When MoneyOutOptionsLandingScreen
   Then NextActions
   Then Click ButtonNext
   When MoneyOutReviewLandingScreen
   Then Click ButtonNext
   When ManageTransactionLandingPgae
   Then CommunicateResolution
  Then ADHOC_ButtonNext
 When ResolutionLandingPage
 Then Body
 #Then MessageBody
 And PreviewEmail
 And ClosesButton
 And Click ButtonNext
 When SummaryForADHOCScreen
  
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,AdviceAndSales,Claims,ADHOC,ChangeStatus|
    