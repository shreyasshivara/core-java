package com.xworkz.bank.preparedStatements;

import java.sql.*;

public class BankApplicationforFetchPreparedStatements {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/bank_application";
        String userName="root";
        String password="Xworkzodc@123";
        String fetchquery="Select*from bank_info where name=? or location=?";
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
             connection=DriverManager.getConnection(jdbcUrl,userName,password);
             preparedStatement =connection.prepareStatement(fetchquery);
            preparedStatement.setString(1,"IDFC");
            preparedStatement.setString(2,"mysore");
            ResultSet resultSet =preparedStatement.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("branch"));
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("ifsc"));
                System.out.println(resultSet.getString("location"));
                System.out.println("========================");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
