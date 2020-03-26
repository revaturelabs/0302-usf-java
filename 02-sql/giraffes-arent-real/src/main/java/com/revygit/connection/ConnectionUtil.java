package com.revygit.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.revygit.config.PlainTextConfig.*;

/**
 * 
 * @author Revature
 *
 *	JDBC
 *		JAVA DATABASE CONNECTIVITY
 *	In jdbc, we have a few things to do.
 *		1.	give it the driver for the db.
 *			in this case, with psql, we got the maven dependency.
 *		2. give it appropriate information. (url, username, password)
 *			2a. the url for jdbc is not just the endpoint of the location 
 *				of the db, it has a template to go by. for psql, it is the
 *				template located in PlainTextConfig.java
 *		3.	We need to make the connection. This is done by using the multiple
 *			interfaces in the api.
 *			interfaces:
 *				Connection
 *				Statement
 *				ResultSet
 *			class:
 *				DriverManager
 */
public class ConnectionUtil {

	public static Connection connect() throws SQLException {
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
	}
	
	
	
}
