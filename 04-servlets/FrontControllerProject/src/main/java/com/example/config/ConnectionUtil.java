package com.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	//the important part about jdbc in war projects, is the normal flow of
	//	of the program is taken out of mavens hands. Tomcat is going to 
	//	control the application, so the driver will not be loaded as normal
	//we can allow tomcat to control, but we need to configure tomcat to do
	//	so. this is easier.
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection connect() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:postgresql://postgresql-class.cks98gmxels6.us-west-1.rds.amazonaws.com"+
						":5432/jdbcdb?currentSchema=fullstack",
				"jdbc_usr",
				"p4ssw0rd"
				);
	}
}
