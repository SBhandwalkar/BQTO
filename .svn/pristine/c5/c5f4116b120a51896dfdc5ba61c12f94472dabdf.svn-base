package com.cucumber.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.businesslogic.ProjectAccessors;
import com.cucumber.steps.ParentStep;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@SuppressWarnings("unused")
@CucumberOptions
	(
//		tags = {"@TC_ZAOMPWWWCITV01" },

//		tags = { " @TC_I_Need_Money,@TC_06_Change_My_Payment_Detail_Change_Premium_Detail,@TC_I_Want_To_Complain, @TC_I_Want_To_Buy, @TC_I_Need_General_Information,@TC_CE_Branch_Search ,@TC_Tier_2_Search,@TC_06_Change_My_Payment_Detail_ChangeMyIntermediary, @TC_06_Change_My_Payment_Detail_Change_Payment_Detail,"},
//			tags = {"@TC_01_I_need_to_Claim_Claim_due_to_Death, @TC_03_I_need_to_Claim_Claim_due_to_Death_Funeral_Claim_(RMM)_Add_Life_covered"},
//			tags = {"@TC_Add_beneficiary_Person, @TC_Add_beneficiary_Organization, @TC_Attach_existing_person, @TC_Change_My_Agreement_Change_My_Security_Cession_Details_RPP,  @TC_Change_My_Agreement_Change_Replacement_Policy_Owner_Details_RPP, @TC_10_I_Need_Money_Cancel_My_Plan_RPP, @TC_Change_My_Agreement_Change_Beneficiary_Details_RPP, @TC_Change_My_Agreement_Change_Beneficiary_on_an_Accelerator_RPP, @TC_CE_Branch_Search, @TC_CE_Hub_Search,  @TC_CONFIRM_UPDATE_CUSTOMER_DETAILS_Individual,  @TC_01_General_Enquiry_Only_Death_Claim_Enquriy,  @TC_02_Cancel,  @TC_08_I_need_money_Take_a_Zero_Interest_Loan_(ZIL), @TC_09_I_need_money_Take_a_Regular_Zero_Interest_Loan_(Regular_ZIL), @TC_10_I_need_money_Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment,  @TC_11_I_need_money_Take_Regular_Payments_Regular_Disinvestment,  @TC_01_I_Need_General_Information_Death_Claim,  @TC_03__I_Need_General_Information_OM_Enquiry, @TC_04_I_Need_General_Information_OverPayment_Recovery,  @TC_07_I_Need_Agreement_Information_Policy_Values,  @TC_10_I_Need_To_Follow_Up,  @TC_11_I_Need_My_Document, @TC_I_Need_Specific_Service, @TC_Test_01_Complaints_and_Feedback_I_Want_To_Complain, @TC_02_Complaints_and_Feedback_I_Want_To_Compliment, @TC_03_Complaints_and_Feedback_I_Want_To_Report_Fraud, @TC_Test_01_Advice_and_Sales_I_Want_to_Buy, @TC_Test_02_Advice_and_Sales_I_Need_Advice, @TC_Attach_existing_person, @TC_Add_beneficiary_Person, @TC_Add_beneficiary_Organization, @TC_06_Change_My_Payment_Detail_Change_Banking_Details_RMM, @TC_27_Change_My_Premium_Detail_Any_Other_Premium_Detail_Change, @TC_28_Change_My_Agreement_Detail_Any_Other_Premium_Detail_Change,  @TC_30_Change_My_Income_Detail_Any_Other_Income_Detail_Change, @TC_32_Change_My_Premium_Detail_Increase_My_Premium_Debit_Order, @TC_12_Change_My_Payment_Detail_Arrear_Premium_Collection_And_Reinstate_My_Contract_NGP, @TC_17_Change_My_Agreement_Change_My_Security_Cession_Details_NGP,  @TC_14_Change_My_Agreement_Change_Beneficiary_Details_Multiple_Beneficiary_Test, @TC_19_Change_My_Payment_Detail_Arrear_Premium_Collection_RMM  "},
//	tags = {"  @TC_08_I_need_money_Take_a_Zero_Interest_Loan_(ZIL), @TC_09_I_need_money_Take_a_Regular_Zero_Interest_Loan_(Regular_ZIL), @TC_10_I_need_money_Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment,  @TC_11_I_need_money_Take_Regular_Payments_Regular_Disinvestment"},
	//features = "C:/AsisaFramework/resources/Feature/ClaimsAssessor.feature", glue = { "com.cucumber.steps" }, plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:" }, strict = true, dryRun = false, monochrome = true)
	//features = "C:/AsisaFramework/resources/Feature/ClaimsAssessor_Auth.feature", glue = { "com.cucumber.steps" }, plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:" }, strict = true, dryRun = false, monochrome = true)
	//features = "C:/AsisaFramework/resources/Feature/Underwriter.feature", glue = { "com.cucumber.steps" }, plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:" }, strict = true, dryRun = false, monochrome = true)
	features = "resources/Feature/HealthCheck/BasicCheck.feature", glue = { "com.cucumber.steps" }, plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:" }, strict = true, dryRun = false, monochrome = true)

	public class HealthCheckRunnerTest extends AbstractTestNGCucumberTests {

	// static ExtentProperties extentProperties;
	ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	public static Properties testProperties;
	public static String Tag;
	ProjectAccessors pAccessor = new ProjectAccessors();

	@AfterClass
	public void writeExtentReport() throws IOException {

		Reporter.loadXMLConfig(new File("src/test/resources/extentReportConfig/extentConfig.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", InetAddress.getLocalHost().getHostName());

		Properties properties = new Properties();
		properties.load(new FileInputStream(
				new File((System.getProperty("user.dir") + "/src/test/resources/propertiesFile/maven.properties"))));

		Reporter.setSystemInfo("Maven", properties.getProperty("maven.compiler.version"));
		Reporter.setSystemInfo("Java Version", properties.getProperty("java.version"));
		Reporter.setSystemInfo("Selenium Version", properties.getProperty("selenium.version"));
		Reporter.setSystemInfo("Cucumber Version", properties.getProperty("cucumber.version"));

	}

	@BeforeClass
	public void setup() {

		Properties properties = new Properties();
		try {
			properties.load(
					new FileInputStream(new File(System.getProperty("user.dir") + "/CurrentExecution.properties")));

		} catch (FileNotFoundException e) {
			System.out.println("CurrentExecution.properties file is not found. " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception in file handling. " + e.getMessage());
			e.printStackTrace();
		}

		ParentStep.environment = properties.getProperty("Environment");
		
		System.setProperty("ResourcesBaseFolder", properties.getProperty("ResourcesBaseFolder"));
		System.setProperty("FeaturesLocation", properties.getProperty("FeaturesLocation"));
		System.setProperty("LocatorsBaseFolder", properties.getProperty("LocatorsBaseFolder"));
		System.setProperty("TestDataFolder", properties.getProperty("TestDataFolder"));
		System.setProperty("EnvironmentProps", properties.getProperty("EnvironmentProps"));
		String sTimeStamp = new SimpleDateFormat("ddMMyyHHmmss").format(new Date());
		
		String sReportPath = properties.getProperty("ReportBaseFolder") + "\\Run_" + sTimeStamp;
		File reportDir = new File(sReportPath);
		System.setProperty("ReportPath", sReportPath);
		System.setProperty("logfile.name", sReportPath + "\\Logger.log");
		if (!reportDir.exists()) {
			reportDir.mkdir();
		}

		pAccessor.setApplicationName(properties.getProperty("ApplicationName"));
		pAccessor.setRelease(properties.getProperty("Release"));
		extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath(reportDir + "\\Run_" + sTimeStamp + ".html");
		extentProperties.setProjectName(pAccessor.getApplicationName());

	}

}