

Feature: Claims

@TC_I_need_to_claim_Disability_Claim_(RMM)_and_(RPP)
@Counter
 Scenario Outline: User should be able to click on I_need_to_claim_Disability_Claim_(RMM)_and_(RPP) process
   
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
 #When ManageTransactionLandingPgae
   Then I_Need_To_Claim
   Then Click ButtonNext
   Then SelectClaimTypeAndLifeCoveredScreen
   And SelectClaim
   Then DateOfDisability
   And DetailsOfDisability
   Then LifeCoveredSelected
   #Then LifeCoveredSelected
   Then ProceedButtonSelected
   Then Click ButtonNext
   Then ReviewAndCorrespondance 
   Then ProceedButtonSelected
   Then Click ButtonNext
   And ManuallySigned
   Then Click ButtonNext
    When ManageTransactionLandingPgae
    Then DecissionButton
    Then Click ButtonNext
    
Then Customer_Supply_Documents_Select
    Then ProceedButtonSelected
     Then Click ButtonNext
     Then ResolutionLandingPage
     Then TransactionSummaryReportIsAvailable
     Then ProceedButtonSelected
     Then Click ButtonNext
       Then IncidentCompleteLandingPage
    Then Complete_Button
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,AdviceAndSales,Claims|
      

    @TC_01_I_need_to_Claim_Claim_due_to_Death
@Counter
 Scenario Outline: User should be able to click on I_need_to_Claim_Claim_due_to_Death process
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
   When ConfirmAndUpdateCustomerlandingScreen
   Then SelectEmail
   And SelectMobile
   And SelectAdress
   Then Click ButtonNext
 #Then ManageTransactionLandingPgae
   Then I_Need_To_Claim
   Then Click ButtonNext
   Then ClaimType_Drp
   And DeathCertificateAvailable
   #Then SelectLifeCovered
   Then Click ButtonNext 
   Then DeceasedDOB
    And DateOfDeath   
   #Then DeceasedIDNumber
   Then DeceasedIDNumber
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
   When LandingPage
     #Then IsDeceasedDisabled
   #And Click NextButton_2
   Then Click ButtonNext
   When ClaimFormDetailLandingPage
   And ReasonForDifferance
   Then IConfirmCheckbox
   Then Click ButtonNext 
   #When ClaimantBankDetailPage
   Then Bank
     #Then CreateNewBank
   #Then CreatNewBank
   Then BankSelected
   And SelectedAccount
   Then EnterAccountNumber
   And EnterAccountHolder
   Then Validate_Button
   #Then SaveButton
   #Then Select_Proceed_Button
   Then Click ButtonNext
    And SelectSignDocument
   Then Click ButtonNext
   When ManageTransactionLandingPgae
   Then DecissionButton
   Then Click ButtonNext
   When GatherEvidenceLandingPage
   Then Customer_Supply_Documents_Select
    And ProceedButtonSelected
     Then Click ButtonNext
     When ResolutionLandingPage
     #And TransactionSummaryReportIsAvailable
     And ProceedButtonSelected
     Then Click NextButton_2
       When IncidentCompleteLandingPage
    Then Complete_Button
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,AdviceAndSales,CEBSearch,Claims,MoneyOut|
    
     
    @TC_03_I_need_to_Claim_Claim_due_to_Death_Funeral_Claim_(RMM)_Add_Life_covered
@Counter
 Scenario Outline: User should be able to click on TC_03_I_need_to_Claim_Claim_due_to_Death_Funeral_Claim_(RMM)_Add_Life_covered process
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
 #Then ManageTransactionLandingPgae
   Then I_Need_To_Claim
   Then Click ButtonNext
   Then ClaimType_Drp
   And DeathCertificateAvailable
   #Then SelectLifeCoveredNotInList
   Then SelectLifeCovered
   Then Click ButtonNext
     Then DeceasedDOB
     And DateOfDeath
   Then DeceasedIDNumber
   And DeceasedSurname
   Then DeceasedFirstName
   And DeceasedPlaceOfDeath
    Then DeceasedGender
   And CauseOfDeath
   Then DeceasedMaritualStatus
   And IsDeathCertificateHandwritten
   Then CountryOfDeath
   And ConfirmRelationshipToPolicyHolder
   Then DateOfFuneral
   And DetailsOfDeath
   Then ReasonForDeath
   Then Click ButtonNext
   #Then ParentChildRelationship
   #And IsDeceasedDisabled
   When LandingPage
   Then Click ButtonNext
    #And Click NextButton_2
    And ReasonForDifferance
   Then IConfirmCheckbox
    Then Click ButtonNext
    Then Bank
     #Then CreateNewBank
   #Then CreatNewBank
   Then BankSelected
   And SelectedAccount
   Then EnterAccountNumber
   And EnterAccountHolder
   Then Validate_Button
   #Then SaveButton
   #Then Select_Proceed_Button
   Then Click ButtonNext
    And SelectSignDocument
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
    | BizagiLoginTestData| LoginData,CEBSearch,Claims,MoneyOut|
      
    
   @TC_02_I_need_to_Claim_DeathClaimRAF
@Counter
 Scenario Outline: User should be able to click on TC_02_I_need_to_Claim_DeathClaimRAF process
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
 #Then ManageTransactionLandingPgae
   Then I_Need_To_Claim
   Then Click ButtonNext
   Then ClaimType_Drp
   And DeathCertificateAvailable
   Then SelectLifeCovered
   And CovidRelatedText
   Then Click ButtonNext
   Then DeceasedIDNumber 
   Then DeceasedDOB
    And DateOfDeath   
   And DeceasedSurname
   Then DeceasedFirstName
   And DeceasedPlaceOfDeath
   Then DeceasedGender
   And CauseOfDeath
   Then DeceasedMaritualStatus
   And IsDeathCertificateHandwritten
   Then CountryOfDeath
   And RelationshipTopolicyHolder
   Then DateOfFuneral
   And DetailsOfDeath
   Then ReasonForDeath
   Then Click ButtonNext
   When LandingPage
     #Then IsDeceasedDisabled
   Then Click ButtonNext
   When ClaimFormDetailLandingPage
   And ReasonForDifferance
   Then IConfirmCheckbox
   Then Click ButtonNext 
   #When ClaimantBankDetailPage
   Then Bank
     #Then CreateNewBank
   #Then CreatNewBank
   Then BankSelected
   And SelectedAccount
   Then EnterAccountNumber
   And EnterAccountHolder
   Then Validate_Button
   #Then SaveButton
   #Then Select_Proceed_Button
   Then Click ButtonNext
    And SelectSignDocument
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
    | BizagiLoginTestData| LoginData,CEBSearch,Claims,MoneyOut|
     
     
 @TC_08_I_need_to_claim_Disability_Claim(RAF)
@Counter
 Scenario Outline: User should be able to click on TC_08_I_need_to_claim_Disability_Claim(RAF) process
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
 #When ManageTransactionLandingPgae
   Then I_Need_To_Claim
   Then Click ButtonNext
   Then SelectClaimTypeAndLifeCoveredScreen
   And SelectClaim
   Then DateOfDisability
   And DetailsOfDisability
   Then LifeCoveredSelected
   #Then LifeCoveredSelected
   Then ProceedButtonSelected
   Then Click ButtonNext
   When UpdateLifeCoverScreen
   Then Click ButtonNext
   Then ReviewAndCorrespondance  
   And ManuallySigned
   Then Click ButtonNext
    When ManageTransactionLandingPgae
    Then DecissionButton
    Then Click ButtonNext
    
Then Customer_Supply_Documents_Select
    Then ProceedButtonSelected
     Then Click ButtonNext
     Then ResolutionLandingPage
     Then TransactionSummaryReportIsAvailable
     Then ProceedButtonSelected
     Then Click ButtonNext
       Then IncidentCompleteLandingPage
    Then Complete_Button
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,Claims|
      

 @TC_08_I_need_to_claim_IllnessClaim(RAF)
@Counter
 Scenario Outline: User should be able to click on TC_08_I_need_to_claim_IllnessClaim(RAF) process
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
 #When ManageTransactionLandingPgae
   Then I_Need_To_Claim
   Then Click ButtonNext
   Then SelectClaimTypeAndLifeCoveredScreen
   And SelectClaimToIllness
   Then DateOfDisability
   And DetailsOfDisability
   Then LifeCoveredSelected
   #Then LifeCoveredSelected
   Then ProceedButtonSelected
   Then Click ButtonNext
   When UpdateLifeCoverScreen
   Then Click ButtonNext
   Then ReviewAndCorrespondance  
   And ManuallySigned
   Then Click ButtonNext
    When ManageTransactionLandingPgae
    Then DecissionButton
    Then Click ButtonNext
    
Then Customer_Supply_Documents_Select
    Then ProceedButtonSelected
     Then Click ButtonNext
     Then ResolutionLandingPage
     Then TransactionSummaryReportIsAvailable
     Then ProceedButtonSelected
     Then Click ButtonNext
       Then IncidentCompleteLandingPage
    Then Complete_Button
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiLoginTestData| LoginData,CEBSearch,Claims|
      
