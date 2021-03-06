package com.cucumber.steps;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cucumber.businesslogic.CommonMethod;
import com.cucumber.pages.*;

import com.cucumber.utility.BrowserFactory;
import com.cucumber.utility.ExcelReade;
import com.cucumber.steps.ParentStep;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ASISA_RegressionPack {

	private static final Object Sheet1 = null;
	BrowserFactory bf = new BrowserFactory();
	String strDataFile,strDataSheet;
	Map<String, String> strDataSheets;
	Map<String, String> testData;

	public static List<String> reqData = null;
	CommonMethod commonMethod = new CommonMethod();

	@Before
	public void setUp() {
	}
	
	
	
	@Given("^CEB Number Created \"([^\"]*)\" & \"([^\"]*)\"$")
	public void ceb_Number_Created(String arg1, String arg2) throws Throwable {
		
		strDataFile = arg1;
		strDataSheets = ExcelReade.getSheet(arg2);
		strDataSheet=strDataSheets.get("CEBSearch");
		CEBNumber Ceb =new CEBNumber();
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		
		ExcelReade.writeToSheet(strDataFile, strDataSheet, System.getProperty("TestID"), Ceb.getCEBnumber(testData.get("GCS ID")));
	}
	//TC_10
	@Given("^Bizagi Login screen is launched\"([^\"]*)\" & Data Set \"([^\"]*)\"$")
	public void bizagi_Login_screen_is_launched_Data_Set(String arg1, String arg2) throws Throwable {
		strDataFile = arg1;
		strDataSheets = ExcelReade.getSheet(arg2);
		BrowserFactory.openBrowser(ParentStep.getProperty("Browser"), ParentStep.getProperty("Url"));
		commonMethod.takeScreenShot();
	}
	
	@Given("^Test Bench screen is launched\"([^\"]*)\" & Data Set \"([^\"]*)\"$")
	public void test_Bench_screen_is_launched_Data_Set(String arg1, String arg2) throws Throwable {
		strDataFile = arg1;
		strDataSheets = ExcelReade.getSheet(arg2);
		strDataSheet=strDataSheets.get("TestBench");
		testData = ExcelReade.readDataFromSheet(strDataFile, strDataSheet, System.getProperty("TestID"));
		BrowserFactory.openBrowser(ParentStep.getProperty("Browser"),testData.get("URL"));
		commonMethod.takeScreenShot();
		
	}


	
//	@Given("^Test Bench screen is launched\"([^\"]*)\" & Data Set \"([^\"]*)\"$")
//	public void test_Bench_screen_is_launched_Data_Set(String arg1, String arg2) throws Throwable {
//		strDataFile = arg1;
//		strDataSheets = ExcelReade.getSheet(arg2);
//		BrowserFactory.HealthCheckUrl(ParentStep.getProperty("Browser"), strDataFile, strDataSheets.get("Url"));
//		BrowserFactory.openBrowser(ParentStep.getProperty("Browser"), ParentStep.getProperty(""));
//		System.out.println("data file name :" + strDataFile);
//		System.out.println("  sheer name :" + strDataSheets.get("TestBench"));
//		System.out.println("Browser :" + ParentStep.getProperty("Browser"));
//		
//		BrowserFactory.HealthCheckUrl(ParentStep.getProperty("Browser"), strDataFile, strDataSheets.get("TestBench"));
//		commonMethod.takeScreenShot();
//		HealthCheck check = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
//		check.OpenUrl();
		
//	}
	@Then("^NextButton$")
	public void nextbutton() throws Throwable {
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.NextButton();
	}
	 @Then("^OMEM_CST$")
		public void omem_cst() throws Throwable {
		System.out.println("strDataFile" + strDataFile);
		System.out.println("strDataSheets" +  strDataSheets.get("LoginData"));
			BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
			bizagiLogin.OMEM_CST();
		}
	
	@Then("^Enter Username$")
	public void enter_Username() throws Throwable {
		
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.UserName();
	}
	
	@Then("^Select_Domain$")
	public void select_domain() throws Throwable {
		
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.Select_Domain();
	}
	
	@Then("^Password$")
	public void password() throws Throwable {
		
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.Password();
	}

	@Then("^Click Login Button$")
	public void click_Login_Button() throws Throwable {
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.Login();
	}
	
	@Then("^SelectSurrender$")
	public void selectsurrender() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectSurrender();
	}
	
	@Then("^SelcBoxtShortTerm$")
	public void selctboxshortterm() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelcBoxtShortTerm();
	}
	
	@Then("^TakeMoneyFromShortTermLoanLink$")
	public void takemoneyfromshorttermloanlink() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.TakeMoneyFromShortTermLoanLink();
	}
	
	@Then("^SelectPremiumBridging$")
	public void selectpremiumbridging() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectPremiumBridging();
	}
	
	@Then("^CreateNewBankRadioBtn$")
	public void createnewbankradiobtn() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.CreateNewBankRadioBtn();
	}

	
	@Then("^DateEffective$")
	public void dateeffective() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.DateEffective();
	}
	
	@Then("^MonthsNeeded$")
	public void monthsneeded() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.MonthsNeeded();
	}

	@Then("^SelectStopPayingPremiumPaidUp$")
	public void selectstoppayingpremiumpaidup() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectStopPayingPremiumPaidUp();
	}
	
	@Then("^SelectPlanCancellation$")
	public void selectplancancellation() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectPlanCancellation();
	}
	@Then("^TakeAllMoneyCapture$")
	public void takeallmoneycapture() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.TakeAllMoneyCapture();
	}
	
	@Then("^NewBankDetails$")
	public void newbankdetails() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.NewBankDetails();
	}
	
	@Then("^AccHolder_Surrender$")
	public void cccholder_surrender() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.AccHolder_Surrender();
	}

	@Then("^AccNo_Surrender$")
	public void AccNo_Surrender() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.AccNo_Surrender();
	}
	
	@Then("^AccountType_Surrender$")
	public void accounttype_surrender() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.AccountType_Surrender();
	}
	@Then("^SelectBoxSurrender$")
	public void selectboxsurrender() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectBoxSurrender();
	}
	
	@Then("^I_Need_Money$")
	public void i_need_money() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.I_Need_Money();
	}
	@Then("^IntermediaryNotToContactYou$")
	public void intermediarynottocontactyou() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.IntermediaryNotToContactYou();
	}
	@Then("^VerifyOldMutualText$")
	public void verifyoldmutualtext() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.VerifyOldMutualText();
	}
	@Then("^EnterComments$")
	public void entercomments() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.EnterComments();
	}
	
	
	@Then("^PFFAdvisor$")
	public void pffdvisor() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.PFFAdvisor();
	}
	
	
	@Then("^IntermediaryToContactYou$")
	public void intermediarytocontactyou() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.IntermediaryToContactYou();
	}
	
	@Then("^WillContactText$")
	public void willcontacttext() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.WillContactText();
	}
	
	@Then("^SelectDecreaseMyPremium$")
	public void selectdecreasemypremium() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectDecreaseMyPremium();
	}
	
	@Then("^AccountNum$")
	public void accountnum() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.AccountNum();
	}
	
	@Then("^AccountHolderDetail$")
	public void accountholderdetail() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.AccountHolderDetail();
	}
	
	@Then("^ZIL_BankName$")
	public void zil_bankname() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.ZIL_BankName();
	}
	
	
	@Then("^ZIL_AcountType$")
	public void zil_acounttype() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.ZIL_AcountType();
	}
	
	@Then("^ZIL_AcountNo$")
	public void zil_acountno() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.ZIL_AcountNo();
	}
	
	
	@Then("^ZIL_AcountHolder$")
	public void zil_acountholder() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.ZIL_AcountHolder();
	}
	
	
	@Then("^ZIL_SaveButton$")
	public void zil_savebutton() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.ZIL_SaveButton();
	}

	@When("^SelectCancelPlan_Checkbox$")
	public void selectcancelplan_checkbox() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectCancelPlan_Checkbox();
	}
	
	@Then("^CancelPlan_EffectiveDate$")
	public void cancelplan_effectivedate() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.CancelPlan_EffectiveDate();
	}
	
	@Then("^CancelPlan_SaveButton$")
	public void cancelplan_savebutton() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.CancelPlan_SaveButton();
	}
	
	
	
	
	@Then("^NameOfBank$")
	public void nameofbank() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.NameOfBank();
	}
	@Then("^TypeOfAccount$")
	public void typeofaccount() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.TypeOfAccount();
	}
	
	
	@Then("^ScheduledDisinvestment$")
	public void scheduleddisinvestment() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.ScheduledDisinvestment();
	}
	
	@Then("^CaptureScreen$")
	public void capturescreen() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.CaptureScreen();
	}

	@Then("^CreateANewBank$")
	public void createanewbank() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.CreateANewBank();
	}
	
	
	@Then("^CancellationReasons$")
	public void cancellationreasons() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.CancellationReasons();
	}
	
	@Then("^EffectiveDate$")
	public void effectivedate() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.EffectiveDate();
	}
	
	
	@Then("^CancelPlan$")
	public void cancelplan() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.CancelPlan();
	}
	
	
	
	@Then("^Verify_UpdateCustomerDetails$")
	public void verify_updatecustomerdetails() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.Verify_UpdateCustomerDetails();
	}
	 
	 @Then("^Verify_TransactionScreen$")
		public void verify_transactionscreen() throws Throwable {
			Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
			money.Verify_TransactionScreen();
		}
	 
	
	@Then("^ZIL$")
	public void zil() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.ZIL();
	}
	
    @Then("^SignZero$")
    public void signzero() throws Throwable {
	Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
	money.SignZero();
}


     @Then("^SaveButton$")
     public void savebutton() throws Throwable {
	Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
	money.SaveButton();
}
	
	@Then("^ZILSelect$")
	public void zilselect() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.ZILSelect();
	}
	
	@Then("^Validate_Button$")
	public void validate_button() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Validate_Button();
	}
	@Then("^Regular_ZIL$")
	public void regular_zil() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Regular_ZIL();
	}
	@Then("^Acount_Type_ZIL_Regular$")
	public void acount_type_zil_regular() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Acount_Type_ZIL_Regular();
	}
	
	@Then("^Acount_No_ZIL_Regular$")
	public void acount_no_zil_regular() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Acount_No_ZIL_Regular();
	}
	@Then("^Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment$")
	public void take_some_money_and_continue_paying_premiums_disinvestment() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Take_Some_Money_and_Continue_Paying_Premiums_Disinvestment();
	}

	@Then("^Take_Regular_Payments_Regular_Disinvestment$")
	public void take_regular_payments_regular_disinvestment() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Take_Regular_Payments_Regular_Disinvestment();
	}
	@Then("^Acount_Holder_ZIL_Regular$")
	public void acount_holder_zil_regular() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Acount_Holder_ZIL_Regular();
	}

	@Then("^Create_New_Bank$")
	public void create_new_bank() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Create_New_Bank();
	}
	@Then("^Frequency_Drp$")
	public void frequency_drp() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Frequency_Drp();
	}
	
	@Then("^Bank_Name_ZIL_Regular$")
	public void bank_name_zil_regular() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Bank_Name_ZIL_Regular();
	}
	
	@Then("^Day$")
	public void day() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Day();
	}
	
	@Then("^End_Day$")
	public void end_day() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.End_Day();
	}
	
	@Then("^Start_Day$")
	public void start_day() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Start_Day();
	}

	
	@Then("^Bank_Name$")
	public void bank_name() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Bank_Name();
	}
	
	@Then("^Acount_Holder$")
	public void acount_holder() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Acount_Holder();
	}
	@Then("^Acount_No$")
	public void acount_no() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Acount_No();
	}
	
	@Then("^Acount_Type$")
	public void acount_type() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.Acount_Type();
	}
	@Then("^RequiredValue$")
	public void requiredvalue() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("MoneyOut"));
		money.RequiredValue();
	}
	@Then("^SelectBank$")
	public void selectbank() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectBank();
	}
	
@Then("^EnterRequiredValue$")
public void enterrequiredvalue() throws Throwable {
	Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
	money.EnterRequiredValue();
}
	


@Then("^SelectPremiumHoliday$")
public void selectpremiumholiday() throws Throwable {
Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
money.SelectPremiumHoliday();
}

@Then("^AccNo_PartSurrender$")
public void AccNo_PartSurrender() throws Throwable {
Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
money.AccNo_PartSurrender();
}

	@Then("^SelectPartSurrender$")
	public void selectpartsurrender() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectPartSurrender();
	}
	
	@Then("^SelectPolictSecuredLoan$")
	public void selectpolictsecuredloan() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectPolictSecuredLoan();
	}
	@Then("^ProcessSummitMessage$")
	public void processsummitmessage() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.ProcessSummitMessage();
	}
	
	
	@Then("^EnterAccHolder$")
	public void enteraccholder() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.EnterAccHolder();
	}
	
	@Then("^EnterAccountNo$")
	public void enteraccountno() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.EnterAccountNo();
	}
	
	@Then("^SelectBankDetails$")
	public void selectbankdetails() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelectBankDetails();
	}
	@Then("^SelctAccountType$")
	public void selctaccounttype() throws Throwable {
		Money money = new Money(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		money.SelctAccountType();
	}
	
	
	@Then("^Bizagi_Inbox$")
	public void bizagi_inbox() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.Bizagi_Inbox();
	}
	
	
	@Then("^CEBranchAndTelephonyScreen$")
	public void cebranchandtelephonyscreen() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.CEBranchAndTelephonyScreen();
	}
	
	
	@Then("^OMEM_CST_Drp$")
	public void omem_cst_drp() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.OMEM_CST_Drp();
	}
	
	
	@Then("^Queries_Drp$")
	public void queries_drp() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.Queries_Drp();
	}
	
	@Then("^Appication$")
	public void appication() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.Appication();
	}
	
	@Then("^Tier_2_Search$")
	public void tier_2_search() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.Tier_2_Search();
	}
	
	@Then("^CaseNo$")
	public void caseno() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.CaseNo();
	}
	
	@Then("^Branch_Search$")
	public void branch_search() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.Branch_Search();
	}
	
	@Then("^ReferanceNo$")
	public void referanceno() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.ReferanceNo();
	}
	

	@Then("^ReferanceNumber$")
	public void referancenumber() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.ReferanceNumber();
	}
	
	@Then("^CloseSearch$")
	public void closesearch() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.CloseSearch();
	}
	

	@Then("^EmailFrom$")
	public void emailfrom() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.EmailFrom();
	}
	
	
	@Then("^SearchCEB$")
	public void searchceb() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.SearchCEB();
	}
	
	@Then("^CloseButton$")
	public void closebutton() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.CloseButton();
	}
	
	@Then("^AgreementNo$")
	public void agreementNo() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.AgreementNo();
	}
	
	@Then("^Agreement$")
	public void agreement() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.Agreement();
	}
	
	@Then("^GCS$")
	public void gcs() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.GCS();
	}
	
	@Then("^GCS_ID$")
	public void gcs_id() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.GCS_ID();
	}
	
	@Then("^IDNumber$")
	public void idnumber() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.IDNumber();
	}
	
	@Then("^ID_No$")
	public void id_no() throws Throwable {
		Queries queries = new Queries(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Queries"));
		queries.ID_No();
	}
	
	@Then("^Enter Case$")
	public void enter_Case() throws Throwable {
//		System.out.println("strDataFile"+ strDataFile);
//		System.out.println("strDataSheets"+  strDataSheets.get("LoginData"));
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("CEBSearch"));
		bizagiLogin.Case();
	}
	
	
	@Then("^Click StartCase$")
	public void click_StartCase() throws Throwable {
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.StartCase();
	}
	
	@Then("^ConfirmCheckBox$")
	public void confirmcheckbox() throws Throwable {
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.ConfirmCheckBox();
	}
	
	@Then("^Click ButtonNext$")
	public void click_ButtonNext() throws Throwable {
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.NextButton();
	}
	
	@Then("^SelectEmail$")
	public void selectemail() throws Throwable {
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.SelectEmail();
	}
	
	@Then("^SelectAdress$")
	public void selectadress() throws Throwable {
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.SelectAdress();
	}
	
	@Then("^SelectMobile$")
	public void selectmobile() throws Throwable {
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.SelectMobile();
	}
	
	
	
	@Then("^Click NextButton_(\\d+)$")
	public void click_NextButton_(int arg1) throws Throwable {
		BizagiLogin bizagiLogin = new BizagiLogin(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		bizagiLogin.NextButton_2();
	}
	
//	@Then("^UnknownCustomerLanguage$")
//	public void unknowncustomerlanguage() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.UnknownCustomerLanguage();
//	}
//	@And("^UnknownCustomerGender$")
//	public void unknowncustomergender() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.UnknownCustomerGender();
//	}
//	@And("^UnknownCustomerID$")
//	public void unknowncustomerid() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.UnknownCustomerID();
//	}
//	@And("^UnknownCustomerIDCountry$")
//	public void unknowncustomeridcountry() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.UnknownCustomerIDCountry();
//	}
//	@And("^UnknownCustomerAdress1$")
//	public void unknowncustomeradress1() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.UnknownCustomerAdress1();
//	}
//	@And("^UnknownCustomerAdress2$")
//	public void unknowncustomeradress2() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.UnknownCustomerAdress2();
//	}
//	@And("^UnknownCustomerAdressCountry$")
//	public void unknowncustomeradresscountry() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.UnknownCustomerAdressCountry();
//	}
//	@And("^UnknownCustomerAddPhone1$")
//	public void unknowncustomeraddphone1() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.UnknownCustomerAddPhone1();
//	}  
//	@And("^UnknownCustomerAddPhone2$")
//	public void unknowncustomeraddphone2() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.UnknownCustomerAddPhone2();
//	} 
//	@Then("^BuyButton$")
//	public void BuyButton() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.I_Want_To_Buy();
//	}
	
	@Then("^EmploymentPositionDropDown$")
	public void employmentpositiondropdown() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.EmploymentPositionDropDown();
	}
	
	@Then("^GatherDocumentslandingScreen$")
	public void gatherdocumentslandingscreen() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.GatherDocumentslandingScreen();
	}
	
	@Then("^VerifyHomePage$")
	public void verifyhomepage() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.VerifyHomePage();
	}
	

	@Then("^IntermediaryContact$")
	public void intermediarycontact() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.IntermediaryContact();
	}
	
	@Then("^I_Want_To_Buy$")
	public void i_want_to_buy() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.I_Want_To_Buy();
	}
	@Then("^TransactionAddedToServiceList$")
	public void transactionaddedtoservicelist() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.TransactionAddedToServiceList();
	}
	
	@Then("^ProceedButtonSelected$")
	public void proceedbuttonselected() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.ProceedButtonSelected();
	}
	
	@Then("^CaptureTransactionDefaultSelection$")
	public void capturetransactiondefaultselection() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.CaptureTransactionDefaultSelection();
	}
	@Then("^CaptureLeadLandingPage$")
	public void captureleadlandingpage() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.CaptureLeadLandingPage();
	}
	
	@Then("^GatherEvidenceLandingPage$")
	public void gatherevidencelandingpage() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.GatherEvidenceLandingPage();
	}
	
	@Then("^SummitLandingPage$")
	public void summitlandingpage() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.SummitLandingPage();
	}
	
	@Then("^ConfirmAndUpdateCustomerlandingScreen$")
	public void confirmAndupdatecustomerlandingscreen() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.ConfirmAndUpdateCustomerlandingScreen();
	}
	
	@Then("^MoneyOutReviewLandingScreen$")
	public void moneyoutreviewlandingscreen() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.MoneyOutReviewLandingScreen();
	}
	
	
	@Then("^MoneyOutOptionsLandingScreen$")
	public void moneyoutoptionslandingscreen() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.MoneyOutOptionsLandingScreen();
	}
	
	@Then("^ManageTransactionLandingPgae$")
	public void managetransactionlandingpgae() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.ManageTransactionLandingPgae();
	}
	@Then("^TransactionSummaryReportIsAvailable$")
	public void transactionsummaryreportisavailable() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.TransactionSummaryReportIsAvailable();
	}
	
	
	
	@Then("^IncidentCompleteLandingPage$")
	public void incidentcompletelandingpage() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.IncidentCompleteLandingPage();
	}
	@Then("^IwantToBuyAddedToTransactionList$")
	public void iwanttobuyaddedtotransactionlist() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.IwantToBuyAddedToTransactionList();
	}
	
	@Then("^ResultText$")
	public void resulttext() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.ResultText();
	}
	
	@Then("^ResolutionLandingPage$")
	public void resolutionlandingpage() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.ResolutionLandingPage();
	}
	
	@Then("^GatherDocumentslandingPage$")
	public void gatherdocumentslandingpage() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.GatherDocumentslandingPage();
	}
	
//	@Then("^Verify_TransactionInServiceList$")
//	public void verify_transactioninservicelist() throws Throwable {
//		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		adviceAndSales.Verify_TransactionInServiceList();
//	}
	
	@Then("^Customer_Supply_Documents_Select$")
	public void customer_supply_documents_select() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.Customer_Supply_Documents_Select();
	}
	

	@Then("^Complete$")
	public void complete() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.Complete();
	}

	@Then("^I_Need_Advice$")
	public void i_need_advice() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.I_Need_Advice();
	}
	@Then("^Default_Selected_Proceed$")
	public void default_selected_proceed() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.Default_Selected_Proceed();
	}
	
	
	@Then("^Click NextButton$")
	public void click_NextButton() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.NextButton();
	}
	@Then("^SelectValue$")
	public void selectvalue() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.SelectValue();
	}
	
	
	@Then("^Click SolutionType$")
	public void click_SolutionType() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.SolutionType();
	}
	
	
	@Then("^Click Type$")
	public void type() throws Throwable {
		AdviceAndSales adviceAndSales = new AdviceAndSales(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		adviceAndSales.Type();
	}
	@Then("^I_Want_To_Complain$")
	public void i_want_to_complain() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.I_Want_To_Complain();
	}
	
	@And("^CorrespondanceToCustomer$")
	public void correspondancetocustomer() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.CorrespondanceToCustomer();
	}
	
	@And("^PrintedCorrespondanceToCustomer$")
	public void printedcorrespondancetocustomer() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.PrintedCorrespondanceToCustomer();
	}
	
	@And("^FormLinkCustomer$")
	public void formlinkcustomer() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.FormLinkCustomer();
	}
	
	
	@And("^CustomerInformedAbove$")
	public void customerinformedabove() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.CustomerInformedAbove();
	}
	
	
	
	@Then("^Complain_Next$")
	public void complain_next() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.Complain_Next();
	}
	
	@Then("^CustomerCorrespondance$")
	public void customercorrespondance() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.CustomerCorrespondance();
	}
	@Then("^CustomerInformed$")
	public void customerinformed() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.CustomerInformed();
	}
	  
	 @Then("^FormLinkForCustomer$")
		public void formlinkforcustomer() throws Throwable {
			ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
			complaintsAndFeedBack.FormLinkForCustomer();
		}
	    
	   @Then("^PrintedCorespondanceForCustomer$")
		public void printedcorespondanceforcustomer() throws Throwable {
			ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
			complaintsAndFeedBack.PrintedCorespondanceForCustomer();
		}
	   
	   @Then("^ConfirmCustomerIsInformed$")
		public void confirmcustomerisinformed() throws Throwable {
			ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
			complaintsAndFeedBack.ConfirmCustomerIsInformed();
		}
	

	
	@Then("^CaptureFeedBackScreen$")
	public void capturefeedbackscreen() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.CaptureFeedBackScreen();
	}
	
	@Then("^PrintedCorrespondance$")
	public void printedcorrespondance() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.PrintedCorrespondance();
	}
	
	@Then("^InformedCustomer$")
	public void informedcustomer() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.InformedCustomer();
	}
	
	@Then("^I_Want_To_Report_Fraud$")
	public void i_want_to_report_fraud() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.I_Want_To_Report_Fraud();
	}
	
	
	@Then("^Enter Complain_FeedBack$")
	public void enter_Complain_FeedBack() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ComplainsAndFeedback"));
		complaintsAndFeedBack.Complain_FeedBack();
	}
	@Then("^Select_Agreement$")
	public void select_agreement() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ComplainsAndFeedback"));
		complaintsAndFeedBack.Select_Agreement();
	}
	@Then("^Copy_Feedback_Button$")
	public void copy_feedback_button() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ComplainsAndFeedback"));
		complaintsAndFeedBack.Copy_Feedback_Button();
	}
	@Then("^View_Add_documents_Link$")
	public void view_add_documents_link() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ComplainsAndFeedback"));
		complaintsAndFeedBack.View_Add_documents_Link();
	}
	@Then("^I_Want_To_Compliment$")
	public void i_want_to_compliment() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ComplainsAndFeedback"));
		complaintsAndFeedBack.I_Want_To_Compliment();
	}
	
	
	@Then("^Enter Outcome$")
	public void enter_Outcome() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ComplainsAndFeedback"));
		complaintsAndFeedBack.Outcome();
	}
	@Then("^Customer_Informed_Box$")
	public void customer_informed_box() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ComplainsAndFeedback"));
		complaintsAndFeedBack.Customer_Informed_Box();
	}
	
	
	@Then("^Click Correspondance$")
	public void click_Correspondance() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.Correspondance();
	}
	
	@Then("^Click ConfirmCheckBox$")
	public void click_ConfirmCheckBox() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.ConfirmCheckBox();
	}

	@Then("^Click Button$")
	public void click_Button() throws Throwable {
		ComplaintsAndFeedBack complaintsAndFeedBack = new ComplaintsAndFeedBack(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		complaintsAndFeedBack.Button();
	}
	
	@And("^Documets$")
	public void documets() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Documets();
	}
	
	@And("^VerifyVCArequest$")
	public void verifyvcarequest() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.VerifyVCArequest();
	}
	@And("^DeductionDay$")
	public void deductionday() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.DeductionDay();
	}
	
	
	@And("^SelectChangeFromStopOrderToDebitLink$")
	public void selectchangefromstopordertodebitlink() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectChangeFromStopOrderToDebitLink();
	}
	
	@And("^SelectBooleanStopOrderToDebit$")
	public void selectbooleanstopordertodebit() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectBooleanStopOrderToDebit();
	} 
	@And("^NewPremium$")
	public void newpremium() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.NewPremium();
	} 
	
	@And("^AdressSelect$")
	public void adressselect() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AdressSelect();
	}
	
	@And("^MobileSelect$")
	public void mobileselect() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.MobileSelect();
	}
	@And("^PayOfficeName$")
	public void payofficename() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PayOfficeName();
	}
 
	  @And("^PayOfficeAdress$")
		public void payofficeadress() throws Throwable {
			ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
			changeStatus.PayOfficeAdress();
		}
	  @And("^PayOfficePostalCode$")
		public void payofficepostalcode() throws Throwable {
			ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
			changeStatus.PayOfficePostalCode();
		}
	@And("^PayOfficeCode$")
	public void payofficecode() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PayOfficeCode();
	}

	@And("^SalaryReferanceNo$")
	public void salaryreferanceno() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SalaryReferanceNo();
	}
	@And("^SelectMethodOfPayment$")
	public void selectmethodofpayment() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectMethodOfPayment();
	}
	@And("^ExpandTaxSection$")
	public void expandtaxsection() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ExpandTaxSection();
	}
	@And("^DeleteTaxDetails$")
	public void deletetaxdetails() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.DeleteTaxDetails();
	}
	
	@And("^SelectDebitOrder$")
	public void selectdebitorder() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectDebitOrder();
	}
	
	@And("^DecreasePremiumDetailsLink$")
	public void decreasepremiumdetailslink() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.DecreasePremiumDetailsLink();
	}
	
	@And("^VerifyAnnualIncreaseRequest$")
	public void verifyannualincreaserequest() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.VerifyAnnualIncreaseRequest();
	}
	
	
	@And("^ViewRequirement$")
	public void viewrequirement() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ViewRequirement();
	}
	
	@And("^Descriptions$")
	public void descriptions() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Descriptions();
	}
	
	@And("^ViewRequirements$")
	public void viewrequirements() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ViewRequirements();
	}
	

	@And("^VerifyPaymentDetailsChangeRequest$")
	public void verifypaymentdetailschangerequest() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.VerifyPaymentDetailsChangeRequest();
	}

	@And("^InputDetails$")
	public void inputdetails() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.InputDetails();
	}
	
	
	@And("^VerifyPleaseCapure$")
	public void verifypleasecapure() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.VerifyPleaseCapure();
	}
	
	
	@Then("^PaidUprequest$")
	public void paiduprequest() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PaidUprequest();
	}
	
	@Then("^ChangeMyAnnualIncreaseTickBox$")
	public void changemyannualincreasetickbox() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyAnnualIncreaseTickBox();
	}
	
	@Then("^StopPayingPremiumsPaidUp$")
	public void stoppayingpremiumspaidup() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.StopPayingPremiumsPaidUp();
	}
	
	@Then("^ResolutionsEmail$")
	public void resolutionsemail() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ResolutionsEmail();
	}
	
	@And("^CaptureInstruction$")
	public void captureinstruction() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.CaptureInstruction();
	}
	
	@Then("^MandatoryRequirements$")
	public void mandatoryrequirements() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.MandatoryRequirements();
	}
	

	@Then("^VerifyCaptureBox$")
	public void verifycapturebox() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.VerifyCaptureBox();
	}
	
	
	@Then("^SelectDeferMyPremium$")
	public void selectdefermypremium() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectDeferMyPremium();
	}
	
	@Then("^SwitchMyFundsCheckBox$")
	public void switchmyfundscheckbox() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SwitchMyFundsCheckBox();
	}

	@Then("^SelectCorrespondent$")
	public void selectcorrespondent() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectCorrespondent();
	}
	
	
	@Then("^PassportID$")
	public void passportid() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PassportID();
	}
	@Then("^ChangeMyPolicyOwnerLink$")
	public void changemypolicyownerlink() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyPolicyOwnerLink();
	}
	@Then("^SelectCorrespondanceBox$")
	public void selectcorrespondancebox() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectCorrespondanceBox();
	}
	
	
	@Then("^ChangeMyCorrespondanceLink$")
	public void changemycorrespondancelink() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyCorrespondanceLink();
	}
	
	
	@Then("^CessionChangeRequest$")
	public void cessionchangerequest() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.CessionChangeRequest();
	}
	
	@Then("^AgreementReviewScreen$")
	public void agreementreviewscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AgreementReviewScreen();
	}
	
	@Then("^TextVerify$")
	public void textverify() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.TextVerify();
	}
	
	@Then("^ChangeMyPolicyOwnerSelectBox$")
	public void changemypolicyownerselectbox() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyPolicyOwnerSelectBox();
	}
	

	@Then("^CaptureFullDetails$")
	public void capturefulldetails() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.CaptureFullDetails();
	}
	
	@Then("^VerifyText$")
	public void verifytext() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.VerifyText();
	}
	
	
//	@Then("^Click Change_My_Income_Detail$")
//	public void change_my_income_detail() throws Throwable {
//		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
//		changeStatus.Change_My_Income_Detail();
//	}
	
	@Then("^ChangeMyPaymentDetailsLandingScreen$")
	public void changemypaymentdetailslandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyPaymentDetailsLandingScreen();
	}
	@Then("^ChangeBankingDetailsLink$")
	public void changebankingdetailslink() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeBankingDetailsLink();
	}

@Then("^Banks$")
public void banks() throws Throwable {
	ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
	changeStatus.Banks();
}

	
	@Then("^ChangePersonalDetaiils$")
	public void changepersonaldetaiils() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangePersonalDetaiils();
	}

	@Then("^ChangePhoneNo$")
	public void changephoneno() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangePhoneNo();
	}
	
	@Then("^ChangePersonalDetaiilsScreen$")
	public void changepersonaldetaiilsscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangePersonalDetaiilsScreen();
	}
	
	@Then("^ChangeMyAgreementReviewLandingScreen$")
	public void changemyagreementreviewlandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyAgreementReviewLandingScreen();
	}
	
	@Then("^ChangeMyPaymentReviewLandingScreen$")
	public void changemypaymentreviewlandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyPaymentReviewLandingScreen();
	}
	
	@Then("^ChangeMyAgreementLandingScreen$")
	public void changemyagreementlandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyAgreementLandingScreen();
	}
	
	
	
	@Then("^ChangeIncomeReviewLandingScreen$")
	public void changeincomereviewlandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeIncomeReviewLandingScreen();
	}
	
	
	@Then("^ChangeIncomeDetailLandingScreen$")
	public void changeincomedetaillandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeIncomeDetailLandingScreen();
	}
	
	
	@Then("^ChangeAgreementReviewLandingScreen$")
	public void changeagreementreviewlandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeAgreementReviewLandingScreen();
	}
	
	
	@Then("^ChangeAgreementLandingPage$")
	public void changeagreementlandingpage() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeAgreementLandingPage();
	}
	
	
	@Then("^ChangePremiumReviewLandingScreen$")
	public void changepremiumreviewlandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangePremiumReviewLandingScreen();
	}
	
	@Then("^SaveBtn$")
	public void savebtn() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SaveBtn();
	}
	
	@Then("^VerifyPaidUpRequest$")
	public void verifypaiduprequest() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.VerifyPaidUpRequest();
	}

	@Then("^ChangePremiumDetailLandingScreen$")
	public void changepremiumdetaillandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangePremiumDetailLandingScreen();
	}
	
	@Then("^SelectPaidUpBoolean$")
	public void selectpaidupboolean() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectPaidUpBoolean();
	}
	
	@Then("^ChangePaymentDetailReiewLandingScreen$")
	public void changepaymentdetailreiewlandingscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangePaymentDetailReiewLandingScreen();
	}
	
	
	
	@Then("^EMailType$")
	public void emailtype() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.EMailType();
	}
	
	@Then("^Line1_Adress$")
	public void line1_adress() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Line1_Adress();
	}
	@Then("^SelectedAgreement$")
	public void selectedagreement() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectedAgreement();
	}
	
	
	
	@Then("^Change_My_Income_Detail$")
	public void change_my_income_detail() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Change_My_Income_Detail();
	}
	
	
	@Then("^AdressCountry$")
	public void adresscountry() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AdressCountry();
	}
	
	
	@Then("^PostalCode$")
	public void postalcode() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PostalCode();
	}
	
	
	
	@Then("^EmailAdress$")
	public void emailadress() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.EmailAdress();
	}
	
	@Then("^Add_AddressBtn$")
	public void Add_AddressBtn() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Add_AddressBtn();
	}
	
	@Then("^AddressType$")
	public void addresstype() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AddressType();
	}
	
	
	@Then("^Person_Number$")
	public void person_number() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Person_Number();
	}
	
	
	
	@Then("^Person_Type$")
	public void person_type() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Person_Type();
	}
	
	@Then("^Person_Country$")
	public void person_country() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Person_Country();
	}
	

	@Then("^Reinstate_AccountNumber$")
	public void reinstate_accountnumber() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Reinstate_AccountNumber();
	}
	
	
	@Then("^Reinstate_AcountHolder$")
	public void reinstate_acountholder() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Reinstate_AcountHolder();
	}
	
	
	
	@Then("^Cession_IDNumber$")
	public void cession_idnumber() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Cession_IDNumber();
	}
	
	

	@Then("^Cession_IDCountry$")
	public void cession_idcountry() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Cession_IDCountry();
	}
	
	

	@Then("^Cession_ExpiryDate$")
	public void cession_expirydate() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Cession_ExpiryDate();
	}
	
	
	

	@Then("^Cession_SelectID$")
	public void cession_selectid() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Cession_SelectID();
	}
	
	
	@Then("^Reinstate_AccountType$")
	public void reinstate_accounttype() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Reinstate_AccountType();
	}
	
	@Then("^SelectAccountType$")
	public void selectaccounttype() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectAccountType();
	}
	
	

	@Then("^ChangeStatus_NextButon$")
	public void changestatus_nextButon() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeStatus_NextButon();
	}
	
	
	@Then("^ChangeStatus_SaveButton$")
	public void changestatus_saveButton() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeStatus_SaveButton();
	}
	
	@Then("^ClickSaveBtn$")
	public void clicksavebtn() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ClickSaveBtn();
	}
	@Then("^SelectDecreaseMtPremiumDetailsLink$")
	public void selectdecreasemtpremiumdetailslink() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectDecreaseMtPremiumDetailsLink();
	}
	
	@Then("^SelectDebitOrderBoolean$")
	public void selectdebitorderboolean() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectDebitOrderBoolean();
	}
	
	@Then("^Change_My_Beneficiary_Detail_Link$")
	public void change_my_beneficiary_detail_link() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Change_My_Beneficiary_Detail_Link();
	}
	
	@Then("^Capture_LastName$")
	public void capture_lastname() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Capture_LastName();
	}
	@Then("^Verify_RelationType$")
	public void verify_relationtype() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Verify_RelationType();
	}
	
	@Then("^Account_Belong_To_Policy_Owner$")
	public void account_belong_to_policy_owner() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Account_Belong_To_Policy_Owner();
	}
	@Then("^Person_Surname$")
	public void person_surname() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Person_Surname();
	}
	@Then("^PersonGender$")
	public void persongender() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PersonGender();
	}
	@Then("^Relationship$")
	public void relationship() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Relationship();
	}
	
	@Then("^Attach_Existing_Person$")
	public void attach_existing_person() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Attach_Existing_Person();
	}
	
	@Then("^PhoneType$")
	public void phonetype() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.PhoneType();
	}
	
	@And("^UpdateDetailHyperLink$")
	public void updatedetailhyperlink() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.UpdateDetailHyperLink();
	}
	
	
	
	@When("^UpdatePartyDetailsScreen$")
	public void updatepartydetailsscreen() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.UpdatePartyDetailsScreen();
	}
	
	@When("^SelectCheckBox$")
	public void selectcheckbox() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectCheckBox();
	}
	
	@When("^RoleUpDateScreen$")
	public void roleupdatescreen() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.RoleUpDateScreen();
	}
	
	
	
	@And("^DOB_RPP$")
	public void dob_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.DOB_RPP();
	}
	
//	@And("^RelationToPolicyOwnerType$")
//	public void relationTopolicyownertype() throws Throwable {
//		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
//		rpp.RelationToPolicyOwnerType();
//	}
//	
	
	@Then("^SharePercentage_RPP$")
	public void sharepercentage_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SharePercentage_RPP();
	}
	
	
	
	@And("^SelectPreferred$")
	public void selectpreferred() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectPreferred();
	}
	
	
	@And("^PhoneCountry$")
	public void phonecountry() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.PhoneCountry();
	}
	
	@And("^PhoneNumber$")
	public void phonenumber() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.PhoneNumber();
	}
	
	
	
	@And("^IdentityNo$")
	public void IdentityNo() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.IdentityNo();
	}
	
	@And("^BirthCountry$")
	public void BirthCountry() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.BirthCountry();
	}
	
	
	@And("^AccountHolder_RPP$")
	public void accountholder_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.AccountHolder_RPP();
	}
	
	@And("^AccountNumber_RPP$")
	public void accountnumber_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.AccountNumber_RPP();
	}
	
	
	@And("^Account_RPP$")
	public void account_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Account_RPP();
	}
	
	
	@And("^BankName_RPP$")
	public void bankname_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.BankName_RPP();
	}
	
	
	@And("^IDType$")
	public void idtype() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.IDType();
	}
	
	
	
	@And("^ChangedEmail$")
	public void changedemail() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.ChangedEmail();
	}
	@Then("^PercentageShare$")
	public void PercentageShare() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.PercentageShare();
	}
	
	
	@And("^IdentityNumber$")
	public void Identitynumber() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.IdentityNumber();
	}
	
	@And("^SelectedPerson$")
	public void selectedperson() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectedPerson();
	}
	
	
	@And("^Line3$")
	public void line3() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Line3();
	}
	
	
	
	@And("^PhoneChange$")
	public void phonechange() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.PhoneChange();
	}
	
	
	@And("^RelationToPolicyOwner$")
	public void relationtopolicyowner() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.RelationToPolicyOwner();
	}
	
	

	@And("^RelationToPolicyOwnerType$")
	public void RelationToPolicyOwnerType() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.RelationToPolicyOwnerType();
	}
	
	
	@And("^RelationshipType$")
	public void RelationshipType() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.RelationshipType();
	}
	
	@Then("^Relationships$")
	public void relationships() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Relationships();
	}
	
	
	@Then("^ExpiryDate_RPP$")
	public void expirydate_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.ExpiryDate_RPP();
	}
	
	

	@Then("^AdditionalNamez$")
	public void additionalnamez() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.AdditionalNamez();
	}
	

	@Then("^SelectCountryOfBirth$")
	public void selectcountryOfbirth() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectCountryOfBirth();
	}
	
	

	@Then("^IDCountry_RPP$")
	public void idcountry_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.IDCountry_RPP();
	}
	
	@And("^Country_RPP$")
	public void country_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Country_RPP();
	}
	
	

	@Then("^IDNumber_RPP$")
	public void idnumber_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.IDNumber_RPP();
	}
	
	@Then("^SelectID_RPP$")
	public void selectid_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectID_RPP();
	}
	
	
	
	@Then("^RelationType$")
	public void relationtype() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.RelationType();
	}
	
	
	@Then("^SelectRelationship$")
	public void selectrelationship() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectRelationship();
	}
	
	
	@Then("^Change_My_Beneficiary_Detail_Link_RPP$")
	public void change_my_beneficiary_detail_link_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Change_My_Beneficiary_Detail_Link_RPP();
	}
	
	@Then("^Select_Change_My_Beneficiary_Detail_Checkbox$")
	public void select_change_my_beneficiary_detail_checkbox() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Select_Change_My_Beneficiary_Detail_Checkbox();
	}
	
	@Then("^Update_Details_RPP$")
	public void update_details_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Update_Details_RPP();
	}
	
	
	
	
	@Then("^SaveButton_RPP$")
	public void SaveButton_RPP() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SaveButton_RPP();
	}
	
	
	@Then("^SelectedCheckBox$")
	public void selectedcheckbox() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectedCheckBox();
	}
	

@Then("^Number$")
public void number() throws Throwable {
	RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
	rpp.Number();
}
	@Then("^PreferedNo$")
	public void preferedno() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.PreferedNo();
	}
	
	@Then("^SelectedCountry$")
	public void selectedcountry() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectedCountry();
	}
	
	@Then("^Email$")
	public void email() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Email();
	}
	@Then("^Phone$")
	public void phone() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Phone();
	}
@Then("^EnterMail$")
public void entermail() throws Throwable {
	RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
	rpp.EnterMail();
}
	
@Then("^EnterID$")
public void enterid() throws Throwable {
	RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
	rpp.EnterID();
}

	@Then("^IDCountry$")
	public void idcountry() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.IDCountry();
	}

	@Then("^ID$")
	public void id() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.ID();
	}
	
	
	@Then("^RPOCapatureLink$")
	public void rpocapaturelink() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.RPOCapatureLink();
	}
	@Then("^SelectedGender$")
	public void selectedgender() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectedGender();
	}
	@Then("^COB$")
	public void cob() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.COB();
	}
	
	@Then("^CancelMyPlan_Capture$")
	public void CancelMyPlan_Capture() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.CancelMyPlan_Capture();
	}
	@Then("^EnterFirstName$")
	public void enterfirstname() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.EnterFirstName();
	}
	

	@Then("^EnterSurname$")
	public void EnterSurname() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.EnterSurname();
	}
	
	@Then("^AddRPO$")
	public void addrpo() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.AddRPO();
	}
	@Then("^UpdateDetailsRPO$")
	public void updatedetailsrpo() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.UpdateDetailsRPO();
	}
	
	
	@And("^UpdateDetail$")
	public void updatedetail() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.UpdateDetail();
	}
	
	@And("^ID_RPP$")
	public void id_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.ID_RPP();
	}
	
	
	
	@And("^EnterID_RPP$")
	public void enterid_rpp() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.EnterID_RPP();
	}
	
	
	@Then("^SelectBoxRPO$")
	public void selectboxrpo() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectBoxRPO();
	}
	
	@Then("^AccountNo$")
	public void accountno() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.AccountNo();
	}
	@Then("^ChangeMyagreement$")
	public void changemyagreement() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.ChangeMyagreement();
	}
	
	
	@Then("^ManualySigned$")
	public void manualysigned() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.ManualySigned();
	}
	@Then("^Cancel$")
	public void cancel() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Cancel();
	}
	@Then("^SharePercentage$")
	public void sharepercentage() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SharePercentage();
	}
	@Then("^UpdateDetails$")
	public void updatedetails() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.UpdateDetails();
	}
	
	@Then("^Shares$")
	public void shares() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.Shares();
	}
	
	@Then("^SelectedBeneficiary$")
	public void selectedbeneficiary() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectedBeneficiary();
	}
	@Then("^I_Need_To_Claim$")
	public void I_Need_To_Claim() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.I_Need_To_Claim();
	}
	
	@Then("^CovidRelatedText$")
	public void covidrelatedtext() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.CovidRelatedText();
	}
	
	@Then("^LandingPage$")
	public void landingpage() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.LandingPage();
	}
	
	@Then("^ClaimFormDetailLandingPage$")
	public void claimformdetaillandingpage() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ClaimFormDetailLandingPage();
	}
	
	

	@Then("^ClaimantBankDetailPage$")
	public void claimantbankdetailpage() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ClaimantBankDetailPage();
	}
	
	
	@Then("^UpdateLifeCoverScreen$")
	public void updatelifecoverscreen() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.UpdateLifeCoverScreen();
	}
	
	@Then("^SelectClaimToIllness$")
	public void selectclaimtoillness() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.SelectClaimToIllness();
	}
	
	@Then("^SelectClaimTypeAndLifeCoveredScreen$")
	public void selectclaimtypeAndlifecoveredScreen() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.SelectClaimTypeAndLifeCoveredScreen();
	}
	@Then("^ReviewAndCorrespondance$")
	public void reviewandcorrespondance() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ReviewAndCorrespondance();
	}
	
	
	@Then("^ButtonNext$")
	public void buttonnext() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ButtonNext();
	}
	
	
	@Then("^SelectSignDocument$")
	public void selectsigndocument() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.SelectSignDocument();
	}
	
	@Then("^ResolutionEmailRequired$")
	public void resolutionemailrequired() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ResolutionEmailRequired();
	}
	
	@Then("^EnterAccountHolder$")
	public void enteraccountholder() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.EnterAccountHolder();
	}
	@Then("^EnterAccountNumber$")
	public void enteraccountnumber() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.EnterAccountNumber();
	}
	@Then("^SelectedAccount$")
	public void selectedaccount() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.SelectedAccount();
	}
	
	
	@Then("^DeceasedIDNumber$")
	public void deceasedidnumber() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DeceasedIDNumber();
	}
	
	@Then("^DeceasedPlaceOfDeath$")
	public void deceasedplaceofdeath() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DeceasedPlaceOfDeath();
	}
	
	@Then("^DeceasedDOB$")
	public void deceaseddob() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DeceasedDOB();
	}
	
	@Then("^DeceasedFirstName$")
	public void deceasedfirstname() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DeceasedFirstName();
	}
	@Then("^BankSelected$")
	public void bankselected() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.BankSelected();
	}
	@Then("^ReasonForDeath$")
	public void reasonfordeath() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ReasonForDeath();
	}
	@Then("^CountryOfDeath$")
	public void countryofdeath() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.CountryOfDeath();
	}
	
	@Then("^ConfirmRelationshipToPolicyHolder$")
	public void confirmrelationshiptopolicyholder() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ConfirmRelationshipToPolicyHolder();
	}
	
	@Then("^SelectLifeCoveredNotInList$")
	public void selectlifecoverednotinlist() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.SelectLifeCoveredNotInList();
	}
	
	@Then("^ParentChildRelationship$")
	public void parentchildrelationship() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ParentChildRelationship();
	}
	
	@Then("^IsDeceasedDisabled$")
	public void isdeceaseddisabled() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.IsDeceasedDisabled();
	}

	
	@Then("^ReasonForDifferance$")
	public void reasonfordifferance() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ReasonForDifferance();
	}
	
	@Then("^CreatNewBank$")
	public void creatnewbank() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.CreatNewBank();
	}
	@Then("^Bank$")
	public void bank() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.Bank();
	}
	
	
	@Then("^CreateNewBankDetails$")
	public void createnewbankdetails() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.CreateNewBankDetails();
	}
	@Then("^CreateNewBank$")
	public void createnewbank() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.CreateNewBank();
	}
	
	
	@Then("^IConfirmCheckbox$")
	public void iconfirmcheckbox() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.IConfirmCheckbox();
	}
	

	@Then("^DetailsOfDeath$")
	public void detailsofdeath() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DetailsOfDeath();
	}
	
	@Then("^DateOfFuneral$")
	public void dateoffuneral() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DateOfFuneral();
	}
	
	@Then("^RelationshipTopolicyHolder$")
	public void relationshiptopolicyholder() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.RelationshipTopolicyHolder();
	}
	
	@Then("^DeceasedGender$")
	public void deceasedgender() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DeceasedGender();
	}
	
	@Then("^IsDeathCertificateHandwritten$")
	public void ssdeathcertificatehandwritten() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.IsDeathCertificateHandwritten();
	}
	
	@Then("^DeceasedMaritualStatus$")
	public void deceasedmaritualstatus() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DeceasedMaritualStatus();
	}
	
	@Then("^DateOfDeath$")
	public void dateofdeath() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DateOfDeath();
	}

	@Then("^CauseOfDeath$")
	public void causeofdeath() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.CauseOfDeath();
	}

	@Then("^DeceasedSurname$")
	public void deceasedsurname() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DeceasedSurname();
	}
	@Then("^ClaimType_Drp$")
	public void claimtype_drp() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ClaimType_Drp();
	}
	
	@Then("^SelectLifeCovered$")
	public void selectlifecovered() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.SelectLifeCovered();
	}

	@Then("^DeathCertificateAvailable$")
	public void deathcertificateavailable() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DeathCertificateAvailable();
	}
	
	@Then("^DateOfDisability$")
	public void dateOfdisability() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DateOfDisability();
	}
	@Then("^DetailsOfDisability$")
	public void detailsofdisability() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.DetailsOfDisability();
	}
	
	@Then("^ManuallySigned$")
	public void manuallysigned() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.ManuallySigned();
	}
	@Then("^LifeCoveredSelected$")
	public void lifecoveredselected() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.LifeCoveredSelected();
	}
	
	@Then("^SelectClaim$")
	public void selectclaim() throws Throwable {
		Claims claims = new Claims(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Claims"));
		claims.SelectClaim();
	}
	@Then("^CancellationDeclaration$")
	public void cancellationdeclaration() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.CancellationDeclaration();
	}
	
	@And("^SelectRelationshipType$")
	public void selectrelationshiptype() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectRelationshipType();
	}
	
	
	
	
	@Then("^ChangeMyAgreementScreen$")
	public void changemyagreementscreen() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.ChangeMyAgreementScreen();
	}
	

	@Then("^ChangeDependentLifeAssuredDetail$")
	public void changedependentlifeassureddetail() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.ChangeDependentLifeAssuredDetail();
	}
	
	
	@Then("^CancelButton$")
	public void cancelbutton() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.CancelButton();
	}
	
	@Then("^AccountHolder$")
	public void accountholder() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.AccountHolder();
	}
	
	@Then("^PolicyOwner$")
	public void policyowner() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.PolicyOwner();
	}
	
	@Then("^SelectBankName$")
	public void selectBankName() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectBankName();
	}
	
	@Then("^CreteNewBankDetails$")
	public void creteNewBankDetails() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.CreteNewBankDetails();
	}
	
	@Then("^SelectAccount$")
	public void SelectAccount() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectAccount();
	}
	
	@Then("^SelectCaptureHyperlink$")
	public void selectcapturehyperlink() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectCaptureHyperlink();
	}
	
	@Then("^SelectedBank$")
	public void selectedBank() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.SelectedBank();
	}
	
	@Then("^EffectiveDte$")
	public void effectiveDte() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.EffectiveDte();
	}
	
	@Then("^CancellationReason$")
	public void cancellationreason() throws Throwable {
		RPP rpp = new RPP(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("RPP"));
		rpp.CancellationReason();
	}
	
	@Then("^SelectBox$")
	public void selectbox() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectBox();
	}
	
	@Then("^DeductDay$")
	public void deductday() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.DeductDay();
	}
	
	
	@Then("^AccountTypeDrpDwn$")
	public void accounttypedrpdwn() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AccountTypeDrpDwn();
	}
	
	
	@Then("^AddEmail$")
	public void addEmail() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AddEmail();
	}
	
	
	@Then("^ChangeMyPaymentDetailScreen$")
	public void changemypaymentdetailscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyPaymentDetailScreen();
	}
	
	@And("^UpdateDetailLink$")
	public void updateDetaillink() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.UpdateDetailLink();
	}
	@And("^NewBankName$")
	public void newbankname() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.NewBankName();
	}
	
	@And("^NewAccount$")
	public void newaccount() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.NewAccount();
	}
	
	@And("^NewAccountNumber$")
	public void newaccountnumber() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.NewAccountNumber();
	}
	
	@And("^NewAccount_Holder$")
	public void newaccount_holder() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.NewAccount_Holder();
	}
	
	
	@Then("^PersonSourceOfIncome$")
	public void personsourceofincome() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PersonSourceOfIncome();
	}
	
	@Then("^PersonCountry$")
	public void personcountry() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PersonCountry();
	}
	
	@Then("^Person_FirstName$")
	public void person_firstname() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Person_FirstName();
	}
	@Then("^AddPremiumPayerPerson_Button$")
	public void addpremiumpayerperson_button() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AddPremiumPayerPerson_Button();
	}
	
	@Then("^PersonTitle$")
	public void persontitle() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PersonTitle();
	}
	
	@Then("^Account$")
	public void account() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Account();
	}
	@Then("^NewAccountType$")
	public void newaccounttype() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.NewAccountType();
	}
	
	
	@Then("^Account_Holder$")
	public void Account_Holder() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Account_Holder();
	}
	
	@Then("^SelectCountry$")
	public void selectcountry() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectCountry();
	}
	@Then("^AccountNumber$")
	public void accountnumber() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AccountNumber();
	}
	@Then("^Capture_New_Bank_Details$")
	public void capture_new_bank_details() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Capture_New_Bank_Details();
	}
	@Then("^AccountNumbers$")
	public void accountnumbers() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AccountNumbers();
	}
	
	@Then("^AccountHolders$")
	public void accountholders() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AccountHolders();
	}
	
	
	@Then("^AddPhone$")
	public void addphone() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.AddPhone();
	}
	
	@Then("^BankName$")
	public void bankname() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.BankName();
	}
	
	@Then("^PreferredSelected$")
	public void preferredselected() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.PreferredSelected();
	}
	
	@Then("^EnterNumber$")
	public void enternumber() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.EnterNumber();
	}
	
	@Then("^SelectPhone$")
	public void selectphone() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectPhone();
	}
	@Then("^Country$")
	public void Country() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Country();
	}
	@Then("^Initial$")
	public void Initial() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Initial();
	}
	@Then("^Capture_FirstName$")
	public void capture_firstname() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Capture_FirstName();
	}
	@Then("^CaptureDateOfBirth$")
	public void capturedateOfbirth() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.CaptureDateOfBirth();
	}
	
	
	
	@Then("^SelectGender$")
	public void selectgender() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectGender();
	}
	
	@Then("^Capture_SharePercentage$")
	public void capture_sharepercentage() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Capture_SharePercentage();
	}
	
	@Then("^Select_Change_My_Beneficiary_Detail$")
	public void select_change_my_beneficiary_detail() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Select_Change_My_Beneficiary_Detail();
	}
	@Then("^Add_Beneficiary_Person_Button$")
	public void add_beneficiary_person_button() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Add_Beneficiary_Person_Button();
	}
	
	@Then("^Click_Update_Details$")
	public void Click_Update_Details() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Click_Update_Details();
	}
	@Then("^Change_My_Security_Cession_Details_NGP$")
	public void change_my_security_cession_details_ngp() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Change_My_Security_Cession_Details_NGP();
	}
	@Then("^Add_Person_Btn$")
	public void Add_person_btn() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Add_Person_Btn();
	}
	@Then("^Add_Person_Link$")
	public void add_person_link() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Add_Person_Link();
	}
	@Then("^Select_ID$")
	public void select_id() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Select_ID();
	}
	@Then("^ID_Country$")
	public void id_country() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ID_Country();
	}
	
	@Then("^Expiry_Date$")
	public void expiry_date() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Expiry_Date();
	}
	@Then("^Name_Box$")
	public void name_box() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Name_Box();
	}
	@Then("^ID_Number$")
	public void id_number() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ID_Number();
	}
	
	
	
	
	@Then("^Surname_Box$")
	public void surname_box() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Surname_Box();
	}
	
	@Then("^Add_Identification_Btn$")
	public void add_identification_btn() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Add_Identification_Btn();
	}
	
	
	
	
	
	
	@Then("^Select_Title$")
	public void select_title() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Select_Title();
	}
	
	@Then("^Security_Cession_Select_Box$")
	public void security_cession_select_box() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Security_Cession_Select_Box();
	}
	
	@Then("^Click Change_Payment_Detail$")
	public void click_Change_Payment_Detail() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Change_Payment_Detail();
	}
	@Then("^Arrear_Premium_Collection$")
	public void arrear_premium_collection() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Arrear_Premium_Collection();
	}

	
	@Then("^Click NextButon$")
	public void click_NextButon() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.NextButon();
	}
	@Then("^Select_Account_Type$")
	public void select_account_type() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Select_Account_Type();
	}
	@Then("^Account_Number$")
	public void account_number() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Account_Number();
	}
	
	@Then("^Payment_Method$")
	public void payment_method() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Payment_Method();
	}
	
	@Then("^Select_Reinstate_Box$")
	public void select_reinstate_Box() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Select_Reinstate_Box();
	}
	@Then("^ValidateButton$")
	public void validatebutton() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ValidateButton();
	}
	
	@Then("^Deduction_Day$")
	public void deduction_day() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Deduction_Day();
	}
	
	@Then("^Reinstate_My_Contract$")
	public void reinstate_my_contract() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Reinstate_My_Contract();
	}
	
	@Then("^Selected_Agreement$")
	public void selected_agreement() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Selected_Agreement();
	}
	
	@Then("^Details_Ragarding_Change$")
	public void details_ragarding_change() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Details_Ragarding_Change();
	}
	
	@Then("^VerifyOtherPaymentsChangeRequest$")
	public void verifyotherpaymentschangerequest() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.VerifyOtherPaymentsChangeRequest();
	}
	@Then("^Change_Shown_Button$")
	public void change_shown_button() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Change_Shown_Button();
	}
	
	@Then("^RequireChangeNotShownAbove$")
	public void requirechangenotshownabove() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.RequireChangeNotShownAbove();
	}
	
	@Then("^SelctOtherAgreement$")
	public void selctotheragreement() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.SelctOtherAgreement();
	}
	
	@Then("^Change_Shown$")
	public void change_shown() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Change_Shown();
	}
	
	@Then("^AcountHolder$")
	public void acountholder() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.AcountHolder();
	}
	
	@Then("^Change_My_Agreement$")
	public void change_my_agreement() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ChangeStatus"));
		changeStatus.Change_My_Agreement();
	}
	
	
	
	@Then("^Selected_Bank$")
	public void selected_bank() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Selected_Bank();
	}

	
	@Then("^Create_Bank$")
	public void create_bank() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Create_Bank();
	}
	@Then("^Select_Premium$")
	public void select_premium() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Select_Premium();
	}
	@Then("^How_To_Pay_Arrears$")
	public void how_to_pay_arrears() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.How_To_Pay_Arrears();
	}
	
	@Then("^Account_Belong_To_Policy$")
	public void account_belong_to_policy() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Account_Belong_To_Policy();
	}

	
	@Then("^When_To_Pay_Arrears$")
	public void when_to_pay_arrears() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.When_To_Pay_Arrears();
	}
	
	@Then("^Select Stop_Order$")
	public void select_Stop_Order() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Stop_Order();
	}

	
	@Then("^Enter Details_Change$")
	public void enter_Details_Change() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Details_Change();
	}
	
	@Then("^Click Next$")
	public void click_Next() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Next();
	}
	
	@Then("^SignDocument$")
	public void signdocument() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SignDocument();
	}
	
	@Then("^FormLink$")
	public void formlink() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.FormLink();
	}
	
	@And("^FormLinks$")
	public void formlinks() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.FormLinks();
	}
	
	@Then("^Requirement$")
	public void requirement() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Requirement();
	}
	
	@Then("^SelectChangeMyStopOrder$")
	public void selectchangemystoporder() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.SelectChangeMyStopOrder();
	}
	
	
	@Then("^VerifyRequirements$")
	public void verifyrequirements() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.VerifyRequirements();
	}
	
	@Then("^ChangeMyIntermediary$")
	public void changemyintermediary() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyIntermediary();
	}
	
	@Then("^ChangeMyIntermediaryScreen$")
	public void changemyintermediaryscreen() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeMyIntermediaryScreen();
	}
	
	@Then("^CorrespondanceText$")
	public void correspondancetext() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.CorrespondanceText();
	}
	
	
	@Then("^IntermediaryLink$")
	public void intermediarylink() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.IntermediaryLink();
	}
	
	@Then("^IntermediaryNext$")
	public void intermediarynext() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.IntermediaryNext();
	}
	
	@Then("^Change_Premium_Detail$")
	public void change_premium_detail() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.Change_Premium_Detail();
	}
	
	
	@Then("^DeferPaymentSelect$")
	public void deferpaymentselect() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.DeferPaymentSelect();
	}
	
	@Then("^ChangeDetail$")
	public void changedetail() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ChangeDetail();
	}
	
	@Then("^ManuallySign$")
	public void manuallysign() throws Throwable {
		ChangeStatus changeStatus = new ChangeStatus(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		changeStatus.ManuallySign();
	}
	
	@Then("^I_Need_General_Information$")
	public void i_need_general_information() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.I_Need_General_Information();
	}
	
	@Then("^VerifyEnquirySubmitDocuments$")
	public void verifyenquirysubmitdocuments() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.VerifyEnquirySubmitDocuments();
	}
	@Then("^SelectErrorsAndIssuesDrpDwn$")
	public void selecterrorsandissuesdrpdwn() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.SelectErrorsAndIssuesDrpDwn();
	}
	
	@Then("^INeedToSubmitDcuments$")
	public void ineedtosubmitdcuments() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.INeedToSubmitDcuments();
	}

	@Then("^PremiumInformationDrpDwn$")
	public void premiuminformationdrpdwn() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.PremiumInformationDrpDwn();
	}

	@Then("^PolicyInformationDrpDwn$")
	public void policyinformationdrpdwn() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.PolicyInformationDrpDwn();
	}
	
	@Then("^PaymentInformation$")
	public void paymentinformation() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.PaymentInformation();
	}
	
	@Then("^I_Need_My_Document$")
	public void i_need_my_document() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.I_Need_My_Document();
	}
	@Then("^No_Further_Process_Needed_Button$")
	public void no_further_process_needed_button() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.No_Further_Process_Needed_Button();
	}
	
	@Then("^EnquiryAgreementInformation$")
	public void enquiryagreementinformation() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.EnquiryAgreementInformation();
	}
	
	@Then("^EnquiryGeneralInfoLandingScreen$")
	public void enquirygeneralinfolandingscreen() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.EnquiryGeneralInfoLandingScreen();
	}
	
	
	@Then("^SpecificServiceLandingScreen$")
	public void specificservicelandingscreen() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.SpecificServiceLandingScreen();
	}
	
	@Then("^EnquiryFollowUpLandingScreen$")
	public void enquiryfollowuplandingscreen() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.EnquiryFollowUpLandingScreen();
	}
	

	
	@Then("^EnquiryDocumentsLandingScreen$")
	public void enquirydocumentslandingscreen() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.EnquiryDocumentsLandingScreen();
	}
	
	
	@Then("^I_Need_Specific_Service_Button$")
	public void i_need_specific_service_button() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.I_Need_Specific_Service_Button();
	}
	@Then("^Reason_TextBox$")
	public void reason_textbox() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.Reason_TextBox();
	}
	
	@Then("^TransactionTypeDropDown$")
	public void transactiontypedropdown() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.TransactionTypeDropDown();
	}

	
	@Then("^Service_Group_Type$")
	public void service_group_type() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.Service_Group_Type();
	}
	@Then("^Service_Catalog_Drp$")
	public void service_catalog_drp() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.Service_Catalog_Drp();
	}
	

	@Then("^GeneralNextButon$")
	public void generalnextbuton() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.GeneralNextButon();
	}
	
	@Then("^TransactionType$")
	public void transactiontype() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.TransactionType();
	}
	
	@Then("^Transaction_Type$")
	public void transaction_type() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.Transaction_Type();
	}
	
	@Then("^Transaction$")
	public void transaction() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.Transaction();
	}
	@Then("^Generate_Document_Button$")
	public void generate_document_Button() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.Generate_Document_Button();
	}
	@Then("^Select_Proceed_Button$")
	public void select_proceed_button() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.Select_Proceed_Button();
	}
	@Then("^TransactionTypes$")
	public void transactionTypes() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.TransactionTypes();
	}
	
	
	
	@Then("^GeneralInfoLandingScreen$")
	public void generalinfoslandingcreen() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.GeneralInfoLandingScreen();
	}
	
	@Then("^M65Report$")
	public void m65report() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.M65Report();
	}
	
	
	@Then("^Select_Transaction_Checkbox$")
	public void select_transaction_checkbox() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.Select_Transaction_Checkbox();
	}
	
	@Then("^I_Need_To_Follow_Up$")
	public void i_need_to_follow_up() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.I_Need_To_Follow_Up();
	}
	
	@Then("^Reason_For_FollowUp$")
	public void reason_for_followUp() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.Reason_For_FollowUp();
	}
	@Then("^I_Need_Agreement_Information$")
	public void i_need_agreement_information() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.I_Need_Agreement_Information();
	}
	
	@Then("^_360_View_Tab$")
	public void _360_view_tab() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation._360_View_Tab();
	}
	
	@Then("^AdditionalInfo$")
	public void additionalinfo() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.AdditionalInfo();
	}
	
	@Then("^ReasonRadioButton$")
	public void reasonradiobutton() throws Throwable {
		EnquiryAndInformation enquiryandinformation = new EnquiryAndInformation(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("EnquiryAndInformation"));
		enquiryandinformation.ReasonRadioButton();
	}

	
	@Then("^Click Change_Premium_From_Stop_Oder_To_Debit_Oder$")
	public void click_Change_Premium_From_Stop_Oder_To_Debit_Oder() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Change_Premium_From_Stop_Oder_To_Debit_Oder();
	}
	

	@Then("^Select_Option$")
	public void select_option() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Select_Option();
	}
	
	@Then("^Deduct_Day$")
	public void deduct_day() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Deduct_Day();
	}
	@Then("^Select_Bank$")
	public void select_bank() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Select_Bank();
	}
	
	@Then("^Save_Button$")
	public void save_button() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Save_Button();
	}
	
	@Then("^ManuallySignDocument$")
	public void manuallysigndocument() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.ManuallySignDocument();
	}
	
	@Then("^DecissionButton$")
	public void decissionbutton() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.DecissionButton();
	}
	
	@Then("^Customer_Supply_Documents_CheckBox$")
	public void customer_supply_documents_checkBox() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Customer_Supply_Documents_CheckBox();
	}
	
	@Then("^Complete_Button$")
	public void complete_button() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Complete_Button();
	}
	
	@Then("^Admin_Drp$")
	public void admin_drp() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Admin_Drp();
	}
	
	@Then("^User_Management_Drp$")
	public void user_management_drp() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.User_Management_Drp();
	}
	
	@Then("^Users_Drp$")
	public void users_drp() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Users_Drp();
	}
	
	@Then("^Search_User$")
	public void search_user() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Search_User();
	}
	@Then("^Edit_Icon$")
	public void edit_icon() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Edit_Icon();
	}
	
	@Then("^User_Configuration_Tab$")
	public void user_configuration_tab() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.User_Configuration_Tab();
	}
	
	@Then("^New_Case_Tab$")
	public void new_case_tab() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.New_Case_Tab();
	}
	
	@Then("^Case_Administration_Drp$")
	public void case_administration_drp() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Case_Administration_Drp();
	}
	
	@Then("^Reassign_Case_Button$")
	public void reassign_case_button() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Reassign_Case_Button();
	}
	
	@Then("^Search_Button$")
	public void search_button() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Search_Button();
	}
	
	@Then("^Select_CEB$")
	public void select_ceb() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Select_CEB();
	}
	
	@Then("^Me_Button$")
	public void me_button() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Me_Button();
	}
	
	@Then("^Reason_text$")
	public void reason_text() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Reason_text();
	}
	@Then("^CEB_Number$")
	public void ceb_number() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.CEB_Number();
	}
	
	@Then("^SavesButton$")
	public void savesbutton() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.SavesButton();
	}
	
	@Then("^Inbox_Tab$")
	public void inbox_tab() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Inbox_Tab();
	}
	
	@Then("^Service_Transaction$")
	public void service_transaction() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Service_Transaction();
	}
	@Then("^Manual_Servicing$")
	public void manual_servicing() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Manual_Servicing();
	}
	
	@Then("^Register_Call$")
	public void register_call() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Register_Call();
	}
	
	@Then("^Call_Reason$")
	public void call_reason() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Call_Reason();
	}
	
	@Then("^Call_Outcome_Drp$")
	public void call_outcome_drp() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Call_Outcome_Drp();
	}
	
	@Then("^Comment_Text$")
	public void comment_text() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Comment_Text();
	}
	
	@Then("^Select_Phone$")
	public void select_phone() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Select_Phone();
	}
	
	@Then("^Send_SMS$")
	public void send_sms() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Send_SMS();
	}
	
	@Then("^SMS_Template$")
	public void sms_template() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.SMS_Template();
	}
	
	@Then("^New_SMS_Text$")
	public void new_sms_Text() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.New_SMS_Text();
	}
	
	@Then("^Send_Email$")
	public void send_email() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Send_Email();
	}
	
	@Then("^Select_Email$")
	public void select_email() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Select_Email();
	}
	
	@Then("^Email_Body$")
	public void email_body() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Email_Body();
	}
	
	@Then("^Related_Reference_Tab$")
	public void related_reference_tab() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Related_Reference_Tab();
	}
	
	@Then("^ReferenceNumber$")
	public void referencenumber() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.ReferenceNumber();
	}
	
	@Then("^Reference_Type$")
	public void reference_type() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Reference_Type();
	}
	@Then("^Add_Info$")
	public void add_info() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Add_Info();
	}
	
	@Then("^Add_Reference$")
	public void add_reference() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Add_Reference();
	}
	
	@Then("^Complete_Radio_Button$")
	public void complete_radio_button() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Complete_Radio_Button();
	}
	
	@Then("^Complete_Reason$")
	public void complete_reason() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Complete_Reason();
	}
	
	@Then("^Service_Transaction_Tab$")
	public void service_transaction_tab() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.Service_Transaction_Tab();
	}
	@Then("^HubMoneyOutRAFNGP$")
	public void hubmoneyoutrafngp() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.HubMoneyOutRAFNGP();
	}
	@Then("^AddSkill$")
	public void addskill() throws Throwable {
		HUB hub = new HUB(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		hub.AddSkill();
	}
	@Then("^General_Enquiry_Only_Button$")
	public void general_enquiry_only_button() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.General_Enquiry_Only_Button();
	}
	@Then("^NoAuth_Button$")
	public void noauth_button() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.NoAuth_Button();
	}
	
	@Then("^IInformedCustomer$")
	public void iinformedcustomer() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.IInformedCustomer();
	}
	
	
	@Then("^SummaryReport$")
	public void summaryreport() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.SummaryReport();
	}
	
	
	@Then("^NoAuthButton$")
	public void noAuthbutton() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.NoAuthButton();
	}
	
	
	@Then("^GeneralInfoScreen$")
	public void generalinfoscreen() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.GeneralInfoScreen();
	}
	
	@Then("^CheckIfContinueScreen$")
	public void checkifcontinuescreen() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.CheckIfContinueScreen();
	}
	
	@Then("^Authenticate_ComplainOnly$")
	public void authenticate_complainonly() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.Authenticate_ComplainOnly();
	}
	@Then("^DetailOfCircumstanceFeedback$")
	public void detailpofcircumstancefeedback() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.DetailOfCircumstanceFeedback();
	}
	@Then("^DesiredOutcome$")
	public void desiredoutcome() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.DesiredOutcome();
	}
	
	@Then("^CopyOfFeedBackButton$")
	public void copyoffeedbackbutton() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.CopyOfFeedBackButton();
	}
	
	@Then("^IConfirmInformedCustomer$")
	public void iconfirminformedcustomer() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.IConfirmInformedCustomer();
	}
	
	@Then("^CorrespondanceForCustomer$")
	public void correspondanceforcustomer() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.CorrespondanceForCustomer();
	}

	@Then("^DoYouWantOtherTransactions$")
	public void doyouwantothertransactions() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.DoYouWantOtherTransactions();
	}
	
	@Then("^NoAuthh_Button$")
	public void noauthh_button() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.NoAuth_Button();
	}
	
	@Then("^More_Info$")
	public void more_info() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.More_Info();
	}
	@Then("^TransactionTypez$")
	public void transactiontypez() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("NoAuthTransactons"));
		noauthtransactions.TransactionTypez();
	}

	
	@Then("^Additional_Processing_Button$")
	public void additional_processing_button() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.Additional_Processing_Button();
	}
	@Then("^Other_Transaction_Button$")
	public void other_transaction_button() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.Other_Transaction_Button();
	}
	@Then("^Authentication_Result_Cancel$")
	public void authentication_result_cancel() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.Authentication_Result_Cancel();
	}
	@Then("^Cancel_Observation$")
	public void cancel_observation() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("NoAuthTransactons"));
		noauthtransactions.Cancel_Observation();
	}
	@Then("^Cancel_Reason$")
	public void cancel_reason() throws Throwable {
		NOAuthTransactions noauthtransactions = new NOAuthTransactions(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		noauthtransactions.Cancel_Reason();
	}
	
	
	@Then("^Verify_Identifications$")
	public void verify_identifications() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Verify_Identifications();
	}
	@Then("^Verify_TaxRegistration$")
	public void verify_TaxRrgistration() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Verify_TaxRegistration();
	}
	
	
	@Then("^Verify_Nationality$")
	public void verify_nationality() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Verify_Nationality();
	}
	@Then("^Verify_Permits$")
	public void verify_permits() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Verify_Permits();
	}
	
	
	@Then("^Verify_AddressType$")
	public void verify_addresstype() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Verify_AddressType();
	}
	@Then("^Verify_Address$")
	public void verify_address() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Verify_Address();
	}
	@Then("^Verify_EmailType$")
	public void verify_emailType() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Verify_EmailType();
	}
	
	@Then("^Verify_Tabs$")
	public void verify_tabs() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Verify_Tabs();
	}
	@Then("^Verify_Phone$")
	public void verify_phone() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Verify_Phone();
	}
	@Then("^Title$")
	public void title() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Title();
	}
	@Then("^CountryOfBirth$")
	public void countryOfbirth() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.CountryOfBirth();
	}
	@Then("^AdditionalNames$")
	public void sdditionalnames() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("PersonalDetails"));
		personalDetails.AdditionalNames();
	}
	
	
	
	
	
	
	@Then("^Initials$")
	public void itials() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("PersonalDetails"));
		personalDetails.Initials();
	}
	
	@Then("^DateOfBirth$")
	public void DateOfBirth() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("PersonalDetails"));
		personalDetails.DateOfBirth();
	}
	
	
	
	@Then("^Surname$")
	public void surname() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("PersonalDetails"));
		personalDetails.Surname();
	}
	@Then("^FirstName$")
	public void firstname() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("PersonalDetails"));
		personalDetails.FirstName();
	}
	
	
	@Then("^MaritualStatus$")
	public void maritualstatus() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.MaritualStatus();
	}
	@Then("^SourceOfIncome$")
	public void sourceOfincome() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.SourceOfIncome();
	}
	@Then("^EmploymentPosition$")
	public void employmentposition() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.EmploymentPosition();
	}
	@Then("^MaritualContract$")
	public void maritualcontract() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.MaritualContract();
	}
	@Then("^Industry$")
	public void industry() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Industry();
	}
	
	
	@Then("^Gender$")
	public void gender() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.Gender();
	}
	
	@Then("^CorrespondaneLanguage$")
	public void correspondanelanguage() throws Throwable {
		PersonalDetails personalDetails = new PersonalDetails(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("LoginData"));
		personalDetails.CorrespondaneLanguage();
	}
	
	@Then("^BeneficiarySelected$")
	public void beneficiaryselected() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.BeneficiarySelected();
	}
	@Then("^ExistingPersonSelected$")
	public void existingpersonselected() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.ExistingPersonSelected();
	}
	@Then("^SaveButtonAccelerator$")
	public void savebuttonaccelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SaveButtonAccelerator();
	}
	
	
	@Then("^SignDocument_RPP$")
	public void signdocument_rpp() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SignDocument_RPP();
	}
	
	@Then("^Select_Change_My_Beneficiary_Checkbox$")
	public void select_change_my_beneficiary_checkbox() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Select_Change_My_Beneficiary_Checkbox();
	}
	
	
	@Then("^Change_My_Beneficiary_Detail$")
	public void change_my_beneficiary_detail() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Change_My_Beneficiary_Detail();
	}
	
	@Then("^IdType$")
	public void IdType() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.IdType();
	}
	
	
	
	@Then("^Accelerator_Relationship_Type$")
	public void accelerator_relationship_type() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Accelerator_Relationship_Type();
	}
	

	
	@Then("^Accelerator_SharePercentage$")
	public void accelerator_sharepercentage() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Accelerator_SharePercentage();
	}
	
	@Then("^Accelerator_Relationship$")
	public void accelerator_relationship() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Accelerator_Relationship();
	}
	
	
	
	@Then("^Accelerator_ButtonNext$")
	public void accelerator_buttonNext() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Accelerator_ButtonNext();
	}
	
	
	
	@Then("^AttachExistingPersonButton$")
	public void attachexistingpersonbutton() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.AttachExistingPersonButton();
	}
	@Then("^UpdateLink$")
	public void updatelink() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.UpdateLink();
	}
	@Then("^Percentage$")
	public void Percentage() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Percentage();
	}
	@Then("^Relation$")
	public void Relation() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Relation();
	}
	
	@Then("^EditPercentage$")
	public void editpercentage() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.EditPercentage();
	}
	
	@Then("^PreferedEmail$")
	public void preferedemail() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.PreferedEmail();
	}
	@Then("^PreferedPhone$")
	public void preferedphone() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.PreferedPhone();
	}
	@Then("^PreferedAdres$")
	public void preferedadres() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.PreferedAdres();
	}
	
	@Then("^AddBeneficiaryPerson_Btn$")
	public void addbeneficiaryperson_btn() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.AddBeneficiaryPerson_Btn();
	}
	
	@Then("^AddBeneficiaryOrganization_Btn$")
	public void addbeneficiaryorganization_btn() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.AddBeneficiaryOrganization_Btn();
	}
	@Then("^Organisation$")
	public void organisation() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Organisation();
	}
	
	@Then("^RegistrationNo$")
	public void registrationno() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.RegistrationNo();
	}
	@Then("^RegistrationDate$")
	public void registrationdate() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.RegistrationDate();
	}
	@Then("^CountryOfIncorp$")
	public void countryofincorp() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.CountryOfIncorp();
	}
	
	@Then("^SaveButton_Accelerator$")
	public void savebutton_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SaveButton_Accelerator();
	}
	
	@Then("^Name_Accelerator$")
	public void name_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Name_Accelerator();
	}
	
	@Then("^Surname_Accelerator$")
	public void surname_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Surname_Accelerator();
	}
	

	@Then("^AdditionalName_Accelerator$")
	public void additionalname_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.AdditionalName_Accelerator();
	}
	
	@Then("^SelectCOB_Accelerator$")
	public void selectcob_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SelectCOB_Accelerator();
	}
	
	@Then("^EnterInitials_Accelerator$")
	public void enterinitials_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.EnterInitials_Accelerator();
	}
	
	
	@Then("^DOB_Accelerator$")
	public void dob_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.DOB_Accelerator();
	}
	

	@Then("^SelectID_Accelerator$")
	public void selectid_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SelectID_Accelerator();
	}
	

	@Then("^IDNumber_Accelerator$")
	public void idnumber_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.IDNumber_Accelerator();
	}
	
	
	@Then("^SelectedGender_Accelerator$")
	public void selectedgender_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SelectedGender_Accelerator();
	}
	
	
	
	@Then("^CountryID_Accelerator$")
	public void countryid_accelerator() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.CountryID_Accelerator();
	}
	
	
	
	
	@Then("^UpdateLink_Person$")
	public void updatelink_person() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.UpdateLink_Person();
	}
	
	
	@Then("^Share_Percentage$")
	public void share_percentage() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Share_Percentage();
	}
	@Then("^AddName_Btn$")
	public void addname_btn() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.AddName_Btn();
	}
	@Then("^LegalName$")
	public void legalname() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.LegalName();
	}
	
	@Then("^NameField$")
	public void namefield() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.NameField();
	}
	@Then("^Language$")
	public void language() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Language();
	}
	@Then("^Verify_Delete$")
	public void verify_delete() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Verify_Delete();
	}
	
	@Then("^SelectHomePhone$")
	public void selecthomephone() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SelectHomePhone();
	}

	@Then("^CountrySelected$")
	public void countryselected() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.CountrySelected();
	}
	
	@Then("^HomeNumber$")
	public void homenumber() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.HomeNumber();
	}
	
	@Then("^Name$")
	public void name() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Name();
	}
	

	@Then("^Enter_Surname$")
	public void enter_surname() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Enter_Surname();
	}
	

	@Then("^AdditionalName$")
	public void additionalname() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.AdditionalName();
	}
	@Then("^SelectCOB$")
	public void selectcob() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SelectCOB();
	}
	@Then("^EnterInitials$")
	public void enterinitials() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.EnterInitials();
	}
	@Then("^DOB$")
	public void dob() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.DOB();
	}
	
	@Then("^SelectID$")
	public void selectid() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SelectID();
	}
	
	@Then("^EnterIDNumber$")
	public void enteridnumber() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.EnterIDNumber();
	}
	@Then("^Selected_Gender$")
	public void selected_gender() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Selected_Gender();
	}
	@Then("^CountryID$")
	public void countryid() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.CountryID();
	}
	
	@Then("^EnterSharePercentage$")
	public void entersharepercentage() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.EnterSharePercentage();
	}
	
	@Then("^SelectRelation$")
	public void selectrelation() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SelectRelation();
	}
	
	@Then("^SelectId$")
	public void selectiD() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SelectId();
	}
	
	@Then("^IDNo$")
	public void idno() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.IDNo();
	}
	
	@Then("^Select_Country$")
	public void Select_Country() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.Select_Country();
	}
	@Then("^DateOfExpiry$")
	public void dateofexpiry() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.DateOfExpiry();
	}

	@Then("^AddEmails$")
	public void addemails() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.AddEmails();
	}
	
	@Then("^EnterEMail$")
	public void enteremail() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.EnterEMail();
	}

	@Then("^PreferedEmailSelect$")
	public void preferedemailselect() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.PreferedEmailSelect();
	}

	@Then("^SelectPhoneType$")
	public void selectphonetype() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.SelectPhoneType();
	}

	@Then("^CountryOfPhone$")
	public void countryofphone() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.CountryOfPhone();
	}

	@Then("^PhoneNo$")
	public void phoneno() throws Throwable {
		AcceleratorRoleUpdate acceleratorRoleUpdate = new AcceleratorRoleUpdate(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("AcceleratorRoleUpdate"));
		acceleratorRoleUpdate.PhoneNo();
	}
	
	
	@Then("^NewDropDownButton$")
	public void newdropdownbutton() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.NewDropDownButton();
	}
	
	@Then("^SelectTestBench$")
	public void selecttestbench() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.SelectTestBench();
	}
	@Then("^Select360$")
	public void select360() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.Select360();
	}
	@Then("^GCSID$")
	public void gcsid_id() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.GCSID();
	}
	@Then("^NextButon$")
	public void nextbuton() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.NextButon();
	}
	@Then("^VerifyCaseNo$")
	public void verifycaseno() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.VerifyCaseNo();
	}
	@Then("^Get360ViewSearchBar$")
	public void get360viewsearchbar() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.Get360ViewSearchBar();
	}
	@Then("^View360LandingPage$")
	public void view360landingpage() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.View360LandingPage();
	}
	@Then("^WorkOnItButton$")
	public void workonitbutton() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.WorkOnItButton();
	}
	@Then("^ActiveAgreements$")
	public void activeagreements() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.ActiveAgreements();
	}
	@Then("^LoopBackAndTestAgain$")
	public void loopbackandtestagain() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.LoopBackAndTestAgain();
	}
	@Then("^RunGCSValidationService$")
	public void rungcsvalidationservice() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.RunGCSValidationService();
	}
	@Then("^NoGCSValidationErrors$")
	public void nogcsvalidationerrors() throws Throwable {
		HealthCheck healthCheck = new HealthCheck(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("TestBench"));
		healthCheck.NoGCSValidationErrors();
	}
	
	@And("^ADHOC_BankName$")
	public void adhoc_bankname() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.ADHOC_BankName();
	}
	

	@And("^NextButtonADHOC$")
	public void nextbuttonadhoc() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.NextButtonADHOC();
	}
	@And("^ValueRequired$")
	public void valuerequired() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.ValueRequired();
	}
	
	@And("^MessageBody$")
	public void messagebody() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.MessageBody();
	}
	
	@And("^ADHOC_AccountType$")
	public void adhoc_accounttype() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.ADHOC_AccountType();
	}
	
	@And("^ADHOC_AccountNumber$")
	public void adhoc_accountnumber() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.ADHOC_AccountNumber();
	}
	
	@And("^ADHOC_AccountHolder$")
	public void adhoc_accountolder() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.ADHOC_AccountHolder();
	}
	
	
	@Then("^VerifyRequiredValue$")
	public void verifyrequiredvalue() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.VerifyRequiredValue();
	}
	
	@Then("^NewBank$")
	public void newbank() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.NewBank();
	}
	
	
	@Then("^NextActions$")
	public void nextactions() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.NextActions();
	}
	
	@Then("^NextAction$")
	public void nextaction() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.NextAction();
	}
	
	@Then("^LifeCoveredDetail$")
	public void lifecoveredetail() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.LifeCoveredDetail();
	}
	
	
	@Then("^SelectGenerateForm$")
	public void selectenerateform() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.SelectGenerateForm();
	}
	
	
	@Then("^SelectBoolean$")
	public void selectboolean() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.SelectBoolean();
	}
	
	
	@Then("^FlexiText$")
	public void flexitext() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.FlexiText();
	}

	
	@Then("^SelectCapture$")
	public void selectcapture() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.SelectCapture();
	}
	
	@Then("^GenerateForm$")
	public void generateform() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.GenerateForm();
	}
	
	@Then("^SelecTickBox$")
	public void selectickbox() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.SelecTickBox();
	}
	
	
	@Then("^AccountBelongToPolicy$")
	public void accountbelongtopolicy() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.AccountBelongToPolicy();
	}
	
	@Then("^ADHOC_SaveButton$")
	public void adhoc_savebutton() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.ADHOC_SaveButton();
	}

//@Then("^Then Click Change_Payment_Detail$")
//public void then_Click_Change_Payment_Detail() throws Throwable {
//	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
//	adhoc.GenerateForm();
//}
	
	
	@Then("^NewButton$")
	public void newbutton() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.NewButton();
	}
	
	@And("^Select_CEBADHOC$")
	public void select_cebadhoc() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.Select_CEBADHOC();
	}
	
	@When("^WorkClasifyScreen$")
	public void workclasifyscreen() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.WorkClasifyScreen();
	}
	
	
	@And("^RequestCountryDrp$")
	public void requestcountrydrp() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.RequestCountryDrp();
	}
	@And("^ChannelDrp$")
	public void channeldrp() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.ChannelDrp();
	}
	@And("^OperationsDrp$")
	public void operationsdrp() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.OperationsDrp();
	}
	
	@Then("^NewComment$")
	public void newcomment() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.NewComment();
	}
	
	@And("^Add$")
	public void add() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.Add();
	}
	
	@Then("^CommentHistory$")
	public void commenthistory() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.CommentHistory();
	}
	
	@Then("^RequestFromCustomer$")
	public void requestfromcustomer() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.RequestFromCustomer();
	}
	

	@And("^SearchCriteria$")
	public void searchcriteria() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.SearchCriteria();
	}
	
	@And("^PartyType$")
	public void partytype() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.PartyType();
	}

	
	@When("^IdentifyPartyScreen$")
	public void identifypartyscreen() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.IdentifyPartyScreen();
	}
	
	@When("^RequestFromIntermediary$")
	public void requestfromintermediary() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.RequestFromIntermediary();
	}
	@And("^SearchIntermediary$")
	public void searchintermediary() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.SearchIntermediary();
	}
	
	
	@Then("^RequestFromExternalContact$")
	public void requestfromexternalcontact() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.RequestFromExternalContact();
	}
	
	
	@And("^ContactInformation$")
	public void contactinformation() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.ContactInformation();
	}
	
	@Then("^RequestFromInternalContact$")
	public void requestfrominternalContact() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.RequestFromInternalContact();
	}
	
	@And("^EmailSearch$")
	public void EmailSearch() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.EmailSearch();
	}
	
	@And("^ConsumerSearch$")
	public void consumersearch() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.ConsumerSearch();
	}
	@And("^VerifySearchCriteria$")
	public void verifysearchcriteria() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.VerifySearchCriteria();
	}
	@And("^EnterIDNo$")
	public void enteridno() throws Throwable {
		ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
		adhoc.EnterIDNo();
	}

@And("^Search$")
public void search() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.Search();
}

@And("^SearchResults$")
public void searchresults() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.SearchResults();
}
@And("^SelectCustomer$")
public void selectcustomer() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.SelectCustomer();
}
@And("^ViewTabs$")
public void viewtabs() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.ViewTabs();
}

@And("^CommentsToRedirectDepartment$")
public void commentstoredirectdepartment() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.CommentsToRedirectDepartment();
}


@And("^OtherEmail$")
public void otheremail() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.OtherEmail();
}
@And("^ServiceDeliveryUnit$")
public void servicedeliveryunit() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.ServiceDeliveryUnit();
}
@Then("^SDU$")
public void sdu() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.SDU();
}

@Then("^GatherEvidenceRadioButton$")
public void gatherevidenceradiobutton() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.GatherEvidenceRadioButton();
}

@Then("^UploadDocument$")
public void uploaddocument() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.UploadDocument();
}

@And("^ClosesButton$")
public void closesButton() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.ClosesButton();
}

@Then("^Body$")
public void body() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.Body();
}


@Then("^SummaryForADHOCScreen$")
public void summaryforadhocscreen() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.SummaryForADHOCScreen();
}

@And("^PreviewEmail$")
public void previewemail() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.PreviewEmail();
}

@And("^ProceedSelected$")
public void proceedselected() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.ProceedSelected();
}


@And("^ADHOC_ButtonNext$")
public void adhoc_buttonnext() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.ADHOC_ButtonNext();
}

@And("^DecisionCancel$")
public void decisioncancel() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.DecisionCancel();
}


@And("^TransactionComplete$")
public void transactioncomplete() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.TransactionComplete();
}


@And("^CommunicateResolution$")
public void communicateresolution() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.CommunicateResolution();
}


@And("^ResolutionEmail$")
public void resolutionemail() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.ResolutionEmail();
}

@And("^SummaryForCustomer$")
public void summaryforcustomer() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.SummaryForCustomer();
}


@Then("^ReferanceLibrary$")
public void referancelibrary() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.ReferanceLibrary();
}


@Then("^Tabs$")
public void tabs() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.Tabs();
}

@Then("^Cancell$")
public void cancell() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.Cancell();
}


@Then("^INeedToClaim$")
public void iineedtoclaim() throws Throwable {
	ADHOC adhoc = new ADHOC(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("ADHOC"));
	adhoc.INeedToClaim();
}


@Then("^Select_CustomerEngagementTelephony$")
public void select_customerengagementtelephony() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.Select_CustomerEngagementTelephony();
}

@Then("^UpdateCustomerDetailTab$")
public void updatecustomerdetailtab() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.UpdateCustomerDetailTab();
}


@Then("^AuthenticateQuestionPass$")
public void authenticatequestionpass() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.AuthenticateQuestionPass();
}


@Then("^LandingScreen$")
public void landingscreen() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.LandingScreen();
}

@Then("^ReferanceLibraryLink$")
public void referancelibrarylink() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.ReferanceLibraryLink();
}
@Then("^ChangeStatusTab$")
public void changestatustab() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.ChangeStatusTab();
}

@Then("^EnquiriesTab$")
public void enquiriestab() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.EnquiriesTab();
}

@Then("^ComplaintsFeedbackTab$")
public void complaintsfeedbacktab() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.ComplaintsFeedbackTab();
}

@Then("^CloseReferanceLibraryScreen$")
public void closereferancelibraryscreen() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.CloseReferanceLibraryScreen();
}

@Then("^CreateStepOutTransaction$")
public void createstepouttransaction() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.CreateStepOutTransaction();
}

@Then("^ServiceGroup$")
public void servicegroup() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.ServiceGroup();
}

@And("^ServiceCatalog$")
public void servicecatalog() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.ServiceCatalog();
}
@And("^Note$")
public void note() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.Note();
}

@And("^SelectTransactionType$")
public void selecttransactiontype() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.SelectTransactionType();
}
@And("^SaveButon$")
public void savebuton() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.SaveButon();
}
@And("^RelatedCasesTab$")
public void relatedcasestab() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.RelatedCasesTab();
}

@And("^DecissionRadioBtn$")
public void decissionradiobtn() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.DecissionRadioBtn();
}
@And("^EmailPreview$")
public void emailpreview() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.EmailPreview();
}


@And("^Tier2Tab$")
public void Tier2Tab() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.Tier2Tab();
}

@And("^RelatedCasesBtn$")
public void relatedcasesbtn() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.RelatedCasesBtn();
}

@And("^EnterCommentsBox$")
public void entercommentsbox() throws Throwable {
	Concierge concierge = new Concierge(BrowserFactory.getDriver(), strDataFile, strDataSheets.get("Concierge"));
	concierge.EnterCommentsBox();
}

}