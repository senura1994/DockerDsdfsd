package com.virtusa.microservices.data.dao;

import com.virtusa.microservices.data.connection.ConnectionFactory;
import com.virtusa.microservices.data.model.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TransactionDAO {

    public Transaction getTransactionById(int transaction_id){
        Transaction transaction = null;
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.Transaction where transaction_id=" + transaction_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                transaction = new Transaction();
                transaction.setTransaction_id(resultSet.getInt("transaction_id"));
                transaction.setTransaction_date(resultSet.getDate("transaction_date"));
                transaction.setTrans_time(resultSet.getTime("trans_time"));
                transaction.setSender_acct_id(resultSet.getInt("sender_acct_id"));
                transaction.setReceiver_acct_id(resultSet.getInt("receiver_acct_id"));
                transaction.setTransaction_amt(resultSet.getInt("transaction_amt"));
                transaction.setTransaction_type(resultSet.getString("Transaction_type"));
                transaction.setSender_acct_id(resultSet.getInt("sender_bank_id"));
                transaction.setReceiver_bank_id(resultSet.getInt("receiver_bank_id"));
                transaction.setFrom_bank_location(resultSet.getString("from_bank_location"));
                transaction.setTo_bank_location(resultSet.getString("to_bank_location"));
                transaction.setSwift_code(resultSet.getInt("swift_code"));
                transaction.setSwift_code_trace(resultSet.getString("swift_code_trace"));
                transaction.setPurpose(resultSet.getString("purpose"));
                transaction.setStatus(resultSet.getString("status"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transaction;
    }

    public List<Transaction> getTransactionByAccountID(int sender_acct_id, String fromDate, String toDate, int startIndex, int pageSize){
        List<Transaction> transactions = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.Transaction as t where t.sender_acct_id=12347 and (t.transaction_date BETWEEN \"" + fromDate  + "\" AND \"" + toDate + "\") LIMIT " + startIndex + "," + pageSize + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Transaction transaction = new Transaction();
                transaction.setTransaction_id(resultSet.getInt("transaction_id"));
                transaction.setTransaction_date(resultSet.getDate("transaction_date"));
                transaction.setTrans_time(resultSet.getTime("trans_time"));
                transaction.setSender_acct_id(resultSet.getInt("sender_acct_id"));
                transaction.setReceiver_acct_id(resultSet.getInt("receiver_acct_id"));
                transaction.setTransaction_amt(resultSet.getInt("transaction_amt"));
                transaction.setTransaction_type(resultSet.getString("Transaction_type"));
                transaction.setSender_acct_id(resultSet.getInt("sender_bank_id"));
                transaction.setReceiver_bank_id(resultSet.getInt("receiver_bank_id"));
                transaction.setFrom_bank_location(resultSet.getString("from_bank_location"));
                transaction.setTo_bank_location(resultSet.getString("to_bank_location"));
                transaction.setSwift_code(resultSet.getInt("swift_code"));
                transaction.setSwift_code_trace(resultSet.getString("swift_code_trace"));
                transaction.setPurpose(resultSet.getString("purpose"));
                transaction.setStatus(resultSet.getString("status"));
                transactions.add(transaction);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transactions;
    }

}
