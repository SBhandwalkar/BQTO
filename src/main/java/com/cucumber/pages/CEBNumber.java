package com.cucumber.pages;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;



import io.restassured.RestAssured;

import io.restassured.path.xml.XmlPath;


public class CEBNumber {
	
	public static String getCEBnumber(String GCSID)
	{
		RestAssured.baseURI ="http://cit.qa.intranet/cit_bizagi/";
		 Map<String, String> authhdrs = new HashMap<String, String>();
		    authhdrs.put("SOAPAction", "http://tempuri.org/createCases");
		    authhdrs.put("Content-Type", "text/xml");
		    //authhdrs.put("charset", "UTF-8");
		
		    String response =given().auth()
				  .ntlm("x473215", "Lesedi@2022", "", "OMCORE").relaxedHTTPSValidation().headers(authhdrs).body(CreateCases.CreateCasesAPI(GCSID)).log().all().
				when().post("WebServices/WorkflowEngineSOA.asmx").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		 
		
		    
		    XmlPath jsXpath= new XmlPath(response);//Converting string into xml path to assert
	
        
		
		String rate=jsXpath.get("processRadNumber").toString();
		String TempCR=rate.substring(0, 20);
		String CENumber =TempCR.substring(9, 20);
		
		
		
		 System.out.println("rate returned is: " + CENumber );
	      
	        
        
       return CENumber;
       
        
        
        
		
	}

}
