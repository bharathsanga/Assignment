package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class DataUpdation {
	 @SuppressWarnings("finally")
	public int UpdateData(DetailsDataUpdate detailsDataUpdate){

	        Calendar calendar = Calendar.getInstance();
	        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());


	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        int count = 0;

	        try {
	            String sql = "update details_tbl set street = ?,city = ?,state = ?,zipcode = ?,product_name = ?,updated_on = ?,updated_by = ? where cid = ?";
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "Bharath");
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, detailsDataUpdate.getStreet());
	            preparedStatement.setString(2, detailsDataUpdate.getCity());
	            preparedStatement.setString(3, detailsDataUpdate.getState());
	            preparedStatement.setInt(4, detailsDataUpdate.getZipcode());
	            preparedStatement.setString(5, detailsDataUpdate.getProduct_name());
	            preparedStatement.setDate(6, ourJavaDateObject);
	            preparedStatement.setString(7, detailsDataUpdate.getUpdated_by());
	            preparedStatement.setInt(8, detailsDataUpdate.getCid());


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
