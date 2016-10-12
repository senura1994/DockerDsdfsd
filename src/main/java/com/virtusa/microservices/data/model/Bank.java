package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

/**
 * Created by DDEZOYSA on 8/12/2016.
 */
public class Bank {
    @Expose
    private int bank_id;
    @Expose
    private String bank_reg_number;
    @Expose
    private String bank_name;
    @Expose
    private String country;
    @Expose
    private String registered_address;

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_reg_number() {
        return bank_reg_number;
    }

    public void setBank_reg_number(String bank_reg_number) {
        this.bank_reg_number = bank_reg_number;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegistered_address() {
        return registered_address;
    }

    public void setRegistered_address(String registered_address) {
        this.registered_address = registered_address;
    }
}
