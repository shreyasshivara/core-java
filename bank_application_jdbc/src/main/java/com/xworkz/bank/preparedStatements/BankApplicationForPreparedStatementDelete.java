package com.xworkz.bank.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankApplicationForPreparedStatementDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl = "jdbc:mysql://localhost:3306/bank_application";
        String userName = "root";
        String password = "Xworkzodc@123";
        String deleteQuery = "Delete from bank_info where location=? And branch=?   ";
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection=DriverManager.getConnection(jdbcUrl,userName,password);
             preparedStatement =connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1,"Hassan");
            preparedStatement.setString(2,"kuvempu nagar");
            int result=preparedStatement.executeUpdate();
            System.out.println(result);
            preparedStatement.setString(1,"m shivra");
            preparedStatement.setString(2,"channarayapatna");
            preparedStatement.execute();
            System.out.println("prepared statement executed successfully!!!!!!!!!!!!!!!!!!!");
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
