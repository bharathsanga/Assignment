package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class ConnectToDatabase {
	 @SuppressWarnings("finally")
	public int DataConnection(Deatils details) {

	        Calendar calendar = Calendar.getInstance();
	        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());


	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        int count = 0;

	        try {
	            String sql = "insert into details_tbl(cid,firstname,lastname,street,city,state,zipcode,product_name,created_on,created_by) values(?,?,?,?,?,?,?,?,?,?)";
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "Bharath");
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, details.getCid());
	            preparedStatement.setString(2, details.getFirstname());
	            preparedStatement.setString(3, details.getLastname());
	            preparedStatement.setString(4, details.getStreet());
	            preparedStatement.setString(5, details.getCity());
	            preparedStatement.setString(6, details.getState());
	            preparedStatement.setInt(7, details.getZipcode());
	            preparedStatement.setString(8, details.getProduct_name());
	            preparedStatement.setDate(9, ourJavaDateObject);
	            preparedStatement.setString(10, details.getCreated_by());

	            count = preparedStatement.executeUpdate();
	            System.out.println(count);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                preparedStatement.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            try {
	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }

	            return count;
	        }
	    }


}
