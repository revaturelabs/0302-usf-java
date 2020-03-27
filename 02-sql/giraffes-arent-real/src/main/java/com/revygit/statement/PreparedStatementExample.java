package com.revygit.statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revygit.connection.ConnectionUtil;
import com.revygit.model.Giraffe;

public class PreparedStatementExample {

	public List<Giraffe> getAllGiraffes(){
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "select * from giraffes order by id";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Giraffe> list = new ArrayList<>();
			while (rs.next()) {
				//rs.get... can take in the column number or column name
				list.add(new Giraffe(rs.getInt(1), rs.getString("name"), rs.getBoolean(3)));
			}
			rs.close();
			ps.close();
			return list;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int updateRecord(Giraffe g) {
		try (Connection conn = ConnectionUtil.connect()) {
			String sql = "update giraffes set name = '" + g.getName() + "', exists = " 
					+ g.isExists() + " where id = " + g.getId();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			int updated = ps.executeUpdate();
			ps.close();
			return updated;
			
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		return -1;
	}
}
