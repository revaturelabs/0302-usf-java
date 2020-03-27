package com.revygit.statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.revygit.connection.ConnectionUtil;

/**
 * 
 * @author Revature
 *
 *callable statements are meant to call stored functions in sql. We can use them to call
 *		aggregate or scalar functions, as well as user defined stored functions.
 *
 */
public class CallableStatementExample {

	public int calMult(int x, int y) {
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "{ ? = call mult(?,?) }";
			CallableStatement cs = conn.prepareCall(sql);
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setInt(2, x);
			cs.setInt(3, y);
			cs.execute();
			int a = cs.getInt(1);
			cs.close();
			return a;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
