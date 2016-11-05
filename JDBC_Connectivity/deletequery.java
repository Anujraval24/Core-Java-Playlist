package com.pak;
import java.sql.*;

public class deletequery {
	
	public void delete() throws SQLException{
		Connection conn= DbConnection.getconnection();
		Statement stmt=conn.createStatement();
		System.out.println("Deleting statement...");
		stmt = conn.createStatement();
		String sql = "DELETE FROM student " +
                  "WHERE id = 1";
		stmt.executeUpdate(sql);
		sql = "SELECT id, firstname, lastname, id FROM student";
		ResultSet rs = stmt.executeQuery(sql);
	}	
}
