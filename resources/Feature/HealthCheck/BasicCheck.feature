Feature: BasicCheck

@HealthCheck
@UrlCheck
Scenario Outline: URL Check
   Given Verify URL "<TestDataFile>" & Data Set "<DataSetSheet>" Working Fine
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiHealthCheck| URL|

    
@HealthCheck
@SQLCheck
Scenario Outline: SQL Check
   Given Verify SQL "<TestDataFile>" & Data Set "<DataSetSheet>" Working Fine
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiHealthCheck| SQL|
    
    
    
@HealthCheck
@LogsFilesChecks
Scenario Outline: LogFiles Check
   Given Verify Logs "<TestDataFile>" & Data Set "<DataSetSheet>" Working Fine
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiHealthCheck| Logs|
    
    
    
    
@HealthCheck
@StoredProcedureCheck
Scenario Outline: Procedures Check
   Given Verify StoredProcedures "<TestDataFile>" & Data Set "<DataSetSheet>" Working Fine
Examples: 
    | TestDataFile | DataSetSheet |
    | BizagiHealthCheck| SSP|
      
    