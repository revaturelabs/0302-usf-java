package com.revygit.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revygit.connection.ConnectionUtil;
import com.revygit.model.Giraffe;

/**
 * 
 * @author Revature
 *
 *	simple statements will take everything put in and send it to sql for it
 *		to take care of. this does not prevent sql injection.
 *
 */
public class SimpleStatementExample {

	public List<Giraffe> getAllGiraffes(){
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "select * from giraffes order by id";
			Statement s = conn.createStatement();
			List<Giraffe> gs = new ArrayList<>();
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				gs.add(new Giraffe(rs.getInt("id"), rs.getString(2), rs.getBoolean(3)));
			}
			s.close();
			rs.close();
			return gs;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int updateRecord(Giraffe g) {
		try(Connection conn = ConnectionUtil.connect()){
			Statement s = conn.createStatement();
			String sql = "update giraffes set name = '"+g.getName()+"' where id = "+g.getId();
			int updated = s.executeUpdate(sql);
			s.close();
			return updated;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
