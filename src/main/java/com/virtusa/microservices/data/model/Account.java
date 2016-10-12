package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

import java.math.BigDecimal;

/**
 * Created by DDEZOYSA on 8/26/2016.
 */
public class Account {


    @Expose
    private int account_id;
    @Expose
    private int businessunit_id;
    @Expose
    private java.sql.Date account_opening_date;
    @Expose
    private java.sql.Date account_closing_date;
    @Expose
    private int account_type_id;
    @Expose
    private String AccountRefNumber;
    @Expose
    private String IsJointAccount;
    @Expose
    private String IsOnlineAccessEnabled;
    @Expose
    private java.math.BigDecimal balance;
    @Expose
    private String status;
    @Expose
    private int bank_id;
    @Expose
    private java.sql.Date alter_date;


    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getBusinessunit_id() {
        return businessunit_id;
    }

    public void setBusinessunit_id(int businessunit_id) {
        this.businessunit_id = businessunit_id;
    }

    public java.sql.Date getAccount_opening_date() {
        return account_opening_date;
    }

    public void setAccount_opening_date(java.sql.Date account_opening_date) {
        this.account_opening_date = account_opening_date;
    }

    public java.sql.Date getAccount_closing_date() {
        return account_closing_date;
    }

    public void setAccount_closing_date(java.sql.Date account_closing_date) {
        this.account_closing_date = account_closing_date;
    }

    public int getAccount_type_id() {
        return account_type_id;
    }

    public void setAccount_type_id(int account_type_id) {
        this.account_type_id = account_type_id;
    }

    public String getAccountRefNumber() {
        return AccountRefNumber;
    }

    public void setAccountRefNumber(String accountRefNumber) {
        AccountRefNumber = accountRefNumber;
    }

    public String getIsJointAccount() {
        return IsJointAccount;
    }

    public void setIsJointAccount(String isJointAccount) {
        IsJointAccount = isJointAccount;
    }

    public String getIsOnlineAccessEnabled() {
        return IsOnlineAccessEnabled;
    }

    public void setIsOnlineAccessEnabled(String isOnlineAccessEnabled) {
        IsOnlineAccessEnabled = isOnlineAccessEnabled;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public java.sql.Date getAlter_date() {
        return alter_date;
    }

    public void setAlter_date(java.sql.Date alter_date) {
        this.alter_date = alter_date;
    }
}
