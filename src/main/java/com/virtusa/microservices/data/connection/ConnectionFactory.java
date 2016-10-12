package com.virtusa.microservices.data.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

    private static Connection con;

    public static Connection getConnection(){
        try {
            if (con == null) {
                String connectionURL = "jdbc:mysql://pcslatg.c32qjmxkdtko.eu-west-1.rds.amazonaws.com:3306/SmartBankDb?zeroDateTimeBehavior=convertToNull";
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(connectionURL, "atg", "Polaris8012");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
        }
        return con;
    }

}
