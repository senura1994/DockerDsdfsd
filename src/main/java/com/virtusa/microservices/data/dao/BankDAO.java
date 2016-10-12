package com.virtusa.microservices.data.dao;

import com.virtusa.microservices.data.connection.ConnectionFactory;
import com.virtusa.microservices.data.model.Bank;
import com.virtusa.microservices.data.model.BusinessUnits;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BankDAO {

    public List<Bank> getAllBanks() {
        List<Bank> banks = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.Banks;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Bank bank = new Bank();
                bank.setBank_id(resultSet.getInt("bank_id"));
                bank.setBank_reg_number(resultSet.getString("bank_reg_number"));
                bank.setBank_name(resultSet.getString("bank_name"));
                bank.setCountry(resultSet.getString("country"));
                bank.setRegistered_address(resultSet.getString("registered_address"));
                banks.add(bank);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return banks;
    }


    public Bank getBankByBankId(int bank_id){
        Bank bank = null;
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.Banks where bank_id=" + bank_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                bank = new Bank();
                bank.setBank_id(resultSet.getInt("bank_id"));
                bank.setBank_reg_number(resultSet.getString("bank_reg_number"));
                bank.setBank_name(resultSet.getString("bank_name"));
                bank.setCountry(resultSet.getString("country"));
                bank.setRegistered_address(resultSet.getString("registered_address"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bank;
    }

    public List<BusinessUnits> getBranchesByBankId(int bank_id){
        List<BusinessUnits> businessUnits = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.BusinessUnits where bank_id=" + bank_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BusinessUnits businessUnit = new BusinessUnits();
                businessUnit.setBusinessunit_id(resultSet.getInt("businessunit_id"));
                businessUnit.setBank_id(resultSet.getInt("bank_id"));
                businessUnit.setUnit_number(resultSet.getString("unit_number"));
                businessUnit.setUnit_name(resultSet.getString("unit_name"));
                businessUnit.setUnit_type(resultSet.getString("unit_type"));
                businessUnit.setUnit_location(resultSet.getString("unit_location"));
                businessUnit.setParent_unit(resultSet.getInt("parent_unit"));
                businessUnit.setAddress(resultSet.getString("address"));
                businessUnit.setPostcode(resultSet.getString("postcode"));
                businessUnits.add(businessUnit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return businessUnits;
    }

}
