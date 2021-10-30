package com.greycampus;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertInto {

	public static void main(String[] args) {

		Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "Bharath");
			preparedStatement = connection.prepareStatement("insert into details_tbl values(?,?,?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "bharath");
			preparedStatement.setString(3, "sanga");
			preparedStatement.setString(4, "lakkaram");
			preparedStatement.setString(5, "utnur");
			preparedStatement.setString(6, "telangana");
			preparedStatement.setInt(7, 504311);
			preparedStatement.setString(8, "laptop");
			preparedStatement.setDate(9, SimpleDateFormat());
			preparedStatement.setString(10, "mahesh");
			preparedStatement.setDate(11, SimpleDateFormat());
			preparedStatement.setString(12, "nikhil");
		} catch (SQLException e) {
			e.printStackTrace();
		}
        finally {
        	try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        	try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }
        
	}

	private static Date SimpleDateFormat() {
		long millis=System.currentTimeMillis();
		java.sql.Date date= new java.sql.Date(millis);
		System.out.println(date);
		return date;
	}

}
