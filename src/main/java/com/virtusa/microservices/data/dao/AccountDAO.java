package com.virtusa.microservices.data.dao;

import com.virtusa.microservices.data.connection.ConnectionFactory;
import com.virtusa.microservices.data.model.Account;
import com.virtusa.microservices.data.model._AccountByPartyIDCorporate;
import com.virtusa.microservices.data.model._AccountByPartyIDRetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by DDEZOYSA on 8/26/2016.
 */
public class AccountDAO {

    public Account getAccountById(int account_id){
        Account account = null;
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.Account where account_id=" + account_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                account = new Account();
                account.setAccount_id(resultSet.getInt("account_id"));
                account.setBusinessunit_id(resultSet.getInt("businessunit_id"));
                account.setAccount_opening_date(resultSet.getDate("account_opening_date"));
                account.setAccount_closing_date(resultSet.getDate("account_closing_date"));
                account.setAccount_type_id(resultSet.getInt("account_type_id"));
                account.setAccountRefNumber(resultSet.getString("AccountRefNumber"));
                account.setIsOnlineAccessEnabled(resultSet.getString("IsOnlineAccessEnabled"));
                account.setBalance(resultSet.getBigDecimal("balance"));
                account.setStatus(resultSet.getString("status"));
                account.setBank_id(resultSet.getInt("bank_id"));
                account.setAlter_date(resultSet.getDate("alter_date"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }

    public List<_AccountByPartyIDRetail> getAccountsbyPartyIdRetail(int party_id){
        List<_AccountByPartyIDRetail> accountByPartyIDs = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT ao.account_id,p.FORENAMES,p.MIDDLENAME,p.Lastname,a.bank_id,act.account_type,a.balance FROM SmartBankDb.AccountOwners as ao INNER JOIN SmartBankDb.Account as a INNER JOIN SmartBankDb.person as p INNER JOIN AccountType as act ON a.account_id=ao.account_id and ao.party_id=p.party_id and act.account_type_id=a.account_type_id and ao.party_id=" + party_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                _AccountByPartyIDRetail accountByPartyID = new _AccountByPartyIDRetail();
                accountByPartyID.setAccount_id(resultSet.getInt("account_id"));
                accountByPartyID.setFORENAMES(resultSet.getString("FORENAMES"));
                accountByPartyID.setMIDDLENAME(resultSet.getString("MIDDLENAME"));
                accountByPartyID.setLastname(resultSet.getString("Lastname"));
                accountByPartyID.setBank_id(resultSet.getInt("bank_id"));
                accountByPartyID.setAccount_type(resultSet.getString("account_type"));
                accountByPartyID.setBalance(resultSet.getDouble("balance"));
                accountByPartyIDs.add(accountByPartyID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountByPartyIDs;
    }

    public List<_AccountByPartyIDCorporate> getAccountsbyPartyIdCorporate(int party_id){
        List<_AccountByPartyIDCorporate> accountByPartyIDs = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT ao.account_id,o.organisation_name,a.bank_id,act.account_type,a.balance FROM SmartBankDb.AccountOwners as ao INNER JOIN SmartBankDb.Account as a INNER JOIN SmartBankDb.organization as o INNER JOIN AccountType as act ON a.account_id=ao.account_id and ao.party_id=o.party_id and act.account_type_id=a.account_type_id and ao.party_id=" + party_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                _AccountByPartyIDCorporate accountByPartyID = new _AccountByPartyIDCorporate();
                accountByPartyID.setAccount_id(resultSet.getInt("account_id"));
                accountByPartyID.setOrganisation_name(resultSet.getString("organisation_name"));
                accountByPartyID.setBank_id(resultSet.getInt("bank_id"));
                accountByPartyID.setAccount_type(resultSet.getString("account_type"));
                accountByPartyID.setBalance(resultSet.getDouble("balance"));
                accountByPartyIDs.add(accountByPartyID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountByPartyIDs;
    }
}
