package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	String url="jdbc:mysql://localhost:3306/admin?verifyServerCertificate=false&useSSL=false";
	String name="admin";
	String pass="admin";
	String sql="create table star(id int,name varchar(10));";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,name,pass);
	Statement st=con.createStatement();
	st.executeUpdate(sql);
	System.out.println("Table created successfully");
	}
}
