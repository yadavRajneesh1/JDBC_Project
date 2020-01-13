package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValueDemo {
	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/admin?verifyServerCertificate=false&useSSL=false";
		String name="admin";
		String pass="admin";
		String sql="insert into star(id,name) values(1,'Sita')";
		Connection con=DriverManager.getConnection(url,name, pass);
		Statement st=con.createStatement();
		st.executeUpdate(sql);
		System.out.println("Value insertd succesfully");
	}

}
