package com.jt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProcedureTest {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {

        String firstName = "Srinivasa";
        String lastName = "Govada";

        try (Connection connection = DriverManager.getConnection(
                DB_URL, DB_USER, DB_PASSWORD)) {

            CallableStatement callableStatement =
                    connection.prepareCall("{CALL get_full_name(?, ?, ?)}");

            // Set IN parameters
            callableStatement.setString(1, firstName);
            callableStatement.setString(2, lastName);

            // Register OUT parameter
            callableStatement.registerOutParameter(3, Types.VARCHAR);

            // Execute stored procedure
            callableStatement.execute();

            // Get OUT parameter value
            String fullName = callableStatement.getString(3);

            System.out.println("Full Name from Stored Procedure: " + fullName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
