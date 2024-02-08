package com.xworkz.bank.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankApplicationForPreparedStatementUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl="jdbc:mysql://localhost:3306/bank_application";
        String userName="root";
        String password="Xworkzodc@123";
        String updateQuery="UPDATE Bank_info set branch=? where location=? AND ifsc=?";
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection=DriverManager.getConnection(jdbcUrl,userName,password);
             preparedStatement =connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,"hebbal");
            preparedStatement.setString(2,"BTM");
            preparedStatement.setString(3,"IDFC1234");
            int result=preparedStatement.executeUpdate();
            System.out.println(result);
            preparedStatement.setString(1,"banashankari");
            preparedStatement.setString(2,"Banglore");
            preparedStatement.setString(3,"axis000791");
            preparedStatement.execute();
            preparedStatement.setString(1,"nagarbavi");
            preparedStatement.setString(2,"mysore");
            preparedStatement.setString(3,"icici7911");
            preparedStatement.execute();

            System.out.println("prepared update statement updated successfully!!!!!!");

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
