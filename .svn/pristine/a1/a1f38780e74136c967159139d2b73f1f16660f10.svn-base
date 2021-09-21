

Feature: Queries

 @TC_Tier_2_Search   
@Counter
 Scenario Outline: User should be able to click on TC_Tier_2_Search_process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
    #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage  
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
    | BizagiLoginTestData| LoginData,Queries|


 @TC_CE_Branch_Search      
@Counter
 Scenario Outline: User should be able to click on CE_Branch_and_Telephony_Search process
   Given Bizagi Login screen is launched"<TestDataFile>" & Data Set "<DataSetSheet>"
    #When Enter Username
   #And Password
   #And Select_Domain
   #And Click Login Button 
   #Then VerifyHomePage 
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
