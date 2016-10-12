package com.virtusa.microservices.data.dao;

import com.virtusa.microservices.data.connection.ConnectionFactory;
import com.virtusa.microservices.data.model.Address;
import com.virtusa.microservices.data.model.Person;
import com.virtusa.microservices.data.model.PhoneNumber;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PhoneNumberDAO {

    public List<PhoneNumber> getPhoneNumberByPartyId(int party_id) {
        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.PhoneNumbers where party_id=" + party_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                PhoneNumber phoneNumber = new PhoneNumber();
                phoneNumber.setParty_id(resultSet.getInt("party_id"));
                phoneNumber.setType(resultSet.getString("type"));
                phoneNumber.setPhone_number(resultSet.getString("phone_number"));
                phoneNumber.setActive(resultSet.getString("active"));
                phoneNumbers.add(phoneNumber);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return phoneNumbers;
    }

    public List<PhoneNumber> getPhoneNumberByPartyIdType(int party_id, String type) {
        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.PhoneNumbers where party_id=" + party_id + " AND type='"+ type + "';");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                PhoneNumber phoneNumber = new PhoneNumber();
                phoneNumber.setParty_id(resultSet.getInt("party_id"));
                phoneNumber.setType(resultSet.getString("type"));
                phoneNumber.setPhone_number(resultSet.getString("phone_number"));
                phoneNumber.setActive(resultSet.getString("active"));
                phoneNumbers.add(phoneNumber);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return phoneNumbers;
    }
}
