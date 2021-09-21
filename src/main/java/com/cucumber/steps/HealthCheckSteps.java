package com.cucumber.steps;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;

import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.utility.BrowserFactory;
import com.cucumber.utility.ExcelHandler;

import cucumber.api.java.en.Given;
import io.restassured.response.Response;



public class HealthCheckSteps {

	public static String strDataFile,strDataSheet,sUrl,name,sPath;
	CommonMethod commonMethod = new CommonMethod();


	@Given("^Verify URL \"([^\"]*)\" & Data Set \"([^\"]*)\" Working Fine$")
	public void verify_Data_Set_Working_Fine(String arg1, String arg2) throws Exception {
		BrowserFactory.openBrowser(ParentStep.getProperty("Browser"), ParentStep.getProperty("Url"));


		strDataFile=arg1;
		strDataSheet=arg2;
		int counter=0;
		
		boolean status;
		//testLogger=extentReport.createTest("HealthCheck Urls");

		try
		{

			

			ExcelHandler.setExcelFile(strDataFile,strDataSheet);
			int iRowCount = ExcelHandler.getRowNum();
			for(int iRowCounter=1;iRowCounter<=iRowCount;iRowCounter++)
			{
				
				status=commonMethod.checkBrokenURL(iRowCounter);
				if(!status) 
				{
					counter++;
				}


			}
			
			

		}

		catch(Exception e)
		{
			
		}
		ExcelHandler.closeexcel(strDataFile);
		if(counter>0)
		{
			Assert.assertTrue(false, "There are one or more issues with Urls");
		}
		
	}

	@Given("^Verify SQL \"([^\"]*)\" & Data Set \"([^\"]*)\" Working Fine$")
	public void verify_SQL_Data_Set_Working_Fine(String arg1, String arg2) throws Exception {

		{
			boolean status;
			int counter=0;
			BrowserFactory.openBrowser(ParentStep.getProperty("Browser"), ParentStep.getProperty("Url"));
			//testLogger=extentReport.createTest("HealthCheck SQLDatabase Check");
			//sheetName="SQL";
			strDataFile=arg1;
			strDataSheet=arg2;
			
			ExcelHandler.setExcelFile(strDataFile,strDataSheet);
			int iRowCount = ExcelHandler.getRowNum();
			for(int iRowCounter=1;iRowCounter<=iRowCount;iRowCounter++)
			{

				status=commonMethod.checkSQLdatabase(iRowCounter);
				if(!status) 
				{
					counter++;
				}
				
			}
			ExcelHandler.closeexcel(strDataFile);
			if(counter>0)
			{
				Assert.assertTrue(false, "There are one or more issues with SQL Database");
			}
		}
	}

	@Given("^Verify Logs \"([^\"]*)\" & Data Set \"([^\"]*)\" Working Fine$")
	public void verify_Logs_Data_Set_Working_Fine(String arg1, String arg2) throws Exception {
		{
			BrowserFactory.openBrowser(ParentStep.getProperty("Browser"), ParentStep.getProperty("Url"));
			//testLogger=extentReport.createTest("HealthCheck Folders");
			//sheetName="Logs";
			strDataFile=arg1;
			strDataSheet=arg2;
			boolean status;
			int counter=0;
			ExcelHandler.setExcelFile(strDataFile,strDataSheet);
			int iRowCount = ExcelHandler.getRowNum();
			for(int iRowCounter=1;iRowCounter<=iRowCount;iRowCounter++)
			{
				status=commonMethod.checkLogs(iRowCounter);
				if(!status) 
				{
					counter++;
				}
			}
			
			System.out.println("This is Folder Check For Folder:");
			//testLogger.pass("All Folders Working Fine");
			ExcelHandler.closeexcel(strDataFile);
			if(counter>0)
			{
				Assert.assertTrue(false, "There are one or more issues with log folders");
			}
			
		}
	}

	@Given("^Verify StoredProcedures \"([^\"]*)\" & Data Set \"([^\"]*)\" Working Fine$")
	public void verify_StoredProcedures_Data_Set_Working_Fine(String arg1, String arg2) throws Throwable {
		{
			BrowserFactory.openBrowser(ParentStep.getProperty("Browser"), ParentStep.getProperty("Url"));
			//testLogger=extentReport.createTest("HealthCheck Folders");
			//sheetName="Logs";
			strDataFile=arg1;
			strDataSheet=arg2;
			boolean status;
			int counter=0;

			ExcelHandler.setExcelFile(strDataFile,strDataSheet);
			int iRowCount = ExcelHandler.getRowNum();
			for(int iRowCounter=1;iRowCounter<=iRowCount;iRowCounter++)
			{
				status=commonMethod.checkStoredProc(iRowCounter);
				if(!status) 
				{
					counter++;
				}
			}
			
			
			//testLogger.pass("All Folders Working Fine");
			ExcelHandler.closeexcel(strDataFile);
			if(counter>0)
			{
				Assert.assertTrue(false, "There are one or more issues with Stored Procedure");
			}
			
		}
		
	}



	@Given("^Verify StoredProcedureExtract \"([^\"]*)\" & Data Set \"([^\"]*)\" Working Fine$")
	public void verify_StoredProcedureExtract_Data_Set_Working_Fine(String arg1, String arg2) throws Throwable {
		BrowserFactory.openBrowser(ParentStep.getProperty("Browser"), ParentStep.getProperty("Url"));
		//testLogger=extentReport.createTest("HealthCheck Folders");
		//sheetName="Logs";
		strDataFile=arg1;
		strDataSheet=arg2;
		boolean status;
		int counter=0;

		ExcelHandler.setExcelFile(strDataFile,strDataSheet);
		int iRowCount = ExcelHandler.getRowNum();
		for(int iRowCounter=1;iRowCounter<=iRowCount;iRowCounter++)
		{
			status=commonMethod.StoredProcedureExtract(iRowCounter);
			if(!status) 
			{
				counter++;
			}
	    
	}

	}


}
