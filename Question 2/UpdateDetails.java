package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class UpdateDetails {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;
        try {
            String sql = "update details_tbl set firstname = ?,lastname = ?,street = ?,city = ?,state = ?,zipcode = ?,product_name = ?,created_on = ?,created_by = ?,updated_on = ?,updated_by = ? where cid = ? ";
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "Bharath");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"nithin");
            preparedStatement.setString(2,"sanga");
            preparedStatement.setString(3,"ameerpet");
            preparedStatement.setString(4,"hyderabad");
            preparedStatement.setString(5,"telangana");
            preparedStatement.setInt(6,500032);
            preparedStatement.setString(7,"mobile");
            preparedStatement.setDate(8,ourJavaDateObject);
            preparedStatement.setString(9,"bharath");
            preparedStatement.setDate(10,ourJavaDateObject);
            preparedStatement.setString(11,"sumanth");
            preparedStatement.setInt(12,1);
            count = preparedStatement.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
        }
	}

}
