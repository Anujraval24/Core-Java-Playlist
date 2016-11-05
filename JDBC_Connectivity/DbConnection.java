package com.pak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static Connection getconnection(){
			
			Connection con=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/test","root","root");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return con; 
		} 
	
	public static void main(String[] args) {
		Connection conn = DbConnection.getconnection();
		try {
			//Statement st = conn.createStatement();
			Statement st1 = conn.createStatement();
		//	ResultSet rs = st.executeQuery("Select * from Student");
			int rs1 = st1.executeUpdate("Insert into Student(`firstname`,`lastname`) Values ('abg1','abuaf')");
			System.out.println("insertion done");
			/*while(rs1.next()){
				System.out.println("Id:"+rs1.getString("id")+",fName:"+rs1.getString("firstname")+",lName:"+rs1.getString("lastname"));
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
