package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

/**
 * Created by DDEZOYSA on 8/26/2016.
 */
public class _AccountByPartyIDRetail {
    @Expose
    private int account_id;
    @Expose
    private String FORENAMES;
    @Expose
    private String MIDDLENAME;
    @Expose
    private String Lastname;
    @Expose
    private int bank_id;
    @Expose
    private String account_type;
    @Expose
    private double balance;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getFORENAMES() {
        return FORENAMES;
    }

    public void setFORENAMES(String FORENAMES) {
        this.FORENAMES = FORENAMES;
    }

    public String getMIDDLENAME() {
        return MIDDLENAME;
    }

    public void setMIDDLENAME(String MIDDLENAME) {
        this.MIDDLENAME = MIDDLENAME;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
