package com.revygit.statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revygit.connection.ConnectionUtil;
import com.revygit.model.Giraffe;

/**
 * 
 * @author Revature
 *
 *A prepared statement will pre compile the sql script and then send it over,
 *		this guards against sql injection.
 *
 *
 */
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
			String sql = "update giraffes set name = ?, exists = ? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, g.getName());
			ps.setBoolean(2, g.isExists());
			ps.setInt(3, g.getId());
			int updated = ps.executeUpdate();
			ps.close();
			return updated;
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		return -1;
	}
	
	public void insertGiraffe(Giraffe g) {
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "insert into giraffes (name, exists) values (?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, g.getName());
			ps.setBoolean(2, g.isExists());
			boolean b=ps.execute();
			ps.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int callMult(int x, int y) {
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "select * from mult(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, x);
			ps.setInt(2, y);
			ResultSet rs = ps.executeQuery();
			int a = 0;
			while(rs.next()) {
				a=rs.getInt(1);
			}
			rs.close();
			ps.close();
			return a;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public void callProc(Giraffe g) {
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "call insertGiraffe(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, g.getName());
			ps.setBoolean(2, g.isExists());
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
