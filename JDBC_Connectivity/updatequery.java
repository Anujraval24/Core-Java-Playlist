package com.pak;

import java.sql.*;

public class updatequery {

		public static void main(String args[])
			{
			
			}
		public void update() throws SQLException{
			Connection conn = DbConnection.getconnection();
			Statement st1 = conn.createStatement();
			System.out.println("Creating statement...");
			st1 = conn.createStatement();
			ResultSet rs = st1.executeQuery( "UPDATE student SET `id` = 5 WHERE `firstname`=Anuj");
			String sql = "SELECT id, firstname, lastname, id FROM student";
			
		}
}
	
		