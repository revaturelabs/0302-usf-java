package com.revygit;

import java.util.List;

import com.revygit.model.Giraffe;
import com.revygit.statement.PreparedStatementExample;


public class MainDriver {

	public static void main(String[] args) {
//		SimpleStatementExample sse = new SimpleStatementExample();
//		List<Giraffe> list = sse.getAllGiraffes();
//		Giraffe g = list.get(0);
////		g.setName("g name hey' where id = 1; drop table giraffes;--");
////		sse.updateRecord(g);
//		System.out.println(sse.getAllGiraffes());
		
		
		
		PreparedStatementExample pse = new PreparedStatementExample();
		List<Giraffe> list = pse.getAllGiraffes();
		Giraffe g = list.get(2);
		g.setName("another g name' where id =3; drop table giraffes;--");
		g.setExists(true);
		pse.updateRecord(g);
		System.out.println(pse.getAllGiraffes());
	}
}
