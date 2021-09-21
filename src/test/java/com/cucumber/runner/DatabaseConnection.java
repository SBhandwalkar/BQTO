package com.cucumber.runner;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	String connectionstr="jdbc:sqlserver://BIZAGIHAPRODLST.omlams.net;databaseName=CIT_Investigations;integratedsecurity=true;";
	String user="OMCORE\\x473215";
	String password="Lesedi@2021";

	//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	// Get connection to DB
	Connection con=DriverManager.getConnection(connectionstr,user,password);
	//Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSW



	System.out.println("Database Login");


	//Statement sqlStatement = con.createStatement();
	String sqlQuery = "{call OMSP_getSQLAgentJobStatus()}";
	CallableStatement stmt = con.prepareCall(sqlQuery);
	boolean resSet = stmt.execute();
	stmt.close();

	System.out.println("Stored procedure called successfully!");
	if(resSet) {

	System.out.println("This is Folder Check For Folder:");
	//testLogger.pass("All Folders Working Fine");


	}


	con.close();
	}
}
