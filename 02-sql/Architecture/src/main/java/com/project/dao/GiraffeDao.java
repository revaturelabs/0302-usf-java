package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.config.ConnectionUtil;
import com.project.model.Giraffe;

public class GiraffeDao implements DaoContract<Giraffe, Integer>{

	@Override
	public List<Giraffe> findAll() {
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "select * from giraffes order by id";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Giraffe> list = new ArrayList<>();
			while(rs.next()) {
				list.add(new Giraffe(rs.getInt(1), rs.getString(2), rs.getBoolean(3)));
			}
			return list;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Giraffe findById(Integer id) {
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "select * from giraffes where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			return new Giraffe(rs.getInt(1), rs.getString(2), rs.getBoolean(3));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Giraffe findByBoolean(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Giraffe findByString(String s) {
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "select * from giraffes where name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return new Giraffe(rs.getInt(1), rs.getString(2), rs.getBoolean(3));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Giraffe insert(Giraffe t) {
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "insert into giraffes (name, exists) values (?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getName());
			ps.setBoolean(2, t.isExists());
			ps.execute();
			return findByString(t.getName());
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Giraffe update(Giraffe t) {
		// TODO Auto-generated method stub
		return null;
	}

}
