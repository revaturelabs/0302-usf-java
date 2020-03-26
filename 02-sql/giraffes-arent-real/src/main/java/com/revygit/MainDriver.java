package com.revygit;

import java.util.List;

import com.revygit.model.Giraffe;
import com.revygit.statement.SimpleStatementExample;

public class MainDriver {

	public static void main(String[] args) {
		SimpleStatementExample sse = new SimpleStatementExample();
		List<Giraffe> list = sse.getAllGiraffes();
		Giraffe g = list.get(0);
		g.setName("g name hey' where id = 1; drop table giraffes;--");
		sse.updateRecord(g);
		System.out.println(sse.getAllGiraffes());
	}
}
