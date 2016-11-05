package com.pak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prepared {

	public static Connection getconnection(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			return conn;
			}
		catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
				
		}
	return null;
	} 

	public static void main(String[] args) {
		Connection conn = prepared.getconnection();

		try{
		PreparedStatement sql =conn.prepareStatement("insert into student values(?,?,?)");
		PreparedStatement sql1=conn.prepareStatement("delete from student where values(?,?)");
		sql.setInt(1,1);
		sql.setString(2,"Anuj");
		sql.setString(3,"Raval");
		
		int i=sql.executeUpdate();
		System.out.println(i+"Records inserted");
		conn.close();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
}