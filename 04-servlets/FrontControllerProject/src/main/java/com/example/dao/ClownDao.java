package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.config.ConnectionUtil;
import com.example.model.Clown;

public class ClownDao implements DaoContract<Clown, Integer> {

	@Override
	public List<Clown> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clown findById(Integer i) {
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "select * from clown where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();
			Clown c = null;
			while(rs.next()) {
				c=new Clown(rs.getInt(1), rs.getString(2), rs.getBoolean(3));
			}
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Clown findByString(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
