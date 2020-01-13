package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/admin?verifyServerCertificate=false&useSSL=true";
		String name="admin";
		String pass="admin"; 
		String query="select * from employee;";
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,name,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()){
		int output1=rs.getInt(1);
		String output2=rs.getString(2);
		String output3=rs.getString(3);
		System.out.println(output1+" "+output2+" "+output3);
		}
		st.close();
		con.close();

	}

}
