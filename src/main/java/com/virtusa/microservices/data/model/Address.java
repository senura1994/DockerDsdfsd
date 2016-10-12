package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

/**
 * Created by DDEZOYSA on 8/28/2016.
 */
public class Address {

    private int party_id;
    @Expose
    private String address_type;
    @Expose
    private String ADDRESSLINE1;
    @Expose
    private String ADDRESSLINE2;
    @Expose
    private String ADDRESSLINE3;
    @Expose
    private String ADDRESS_LINE4;
    @Expose
    private String ADDRESS_LINE5;
    @Expose
    private String ADDRESS_LINE6;
    @Expose
    private int postcode;
    @Expose
    private String GONEAWAY;
    @Expose
    private String PC_DAY;
    @Expose
    private String PC_TIME;

    public int getParty_id() {
        return party_id;
    }

    public void setParty_id(int party_id) {
        this.party_id = party_id;
    }

    public String getAddress_type() {
        return address_type;
    }

    public void setAddress_type(String address_type) {
        this.address_type = address_type;
    }

    public String getADDRESSLINE1() {
        return ADDRESSLINE1;
    }

    public void setADDRESSLINE1(String ADDRESSLINE1) {
        this.ADDRESSLINE1 = ADDRESSLINE1;
    }

    public String getADDRESSLINE2() {
        return ADDRESSLINE2;
    }

    public void setADDRESSLINE2(String ADDRESSLINE2) {
        this.ADDRESSLINE2 = ADDRESSLINE2;
    }

    public String getADDRESSLINE3() {
        return ADDRESSLINE3;
    }

    public void setADDRESSLINE3(String ADDRESSLINE3) {
        this.ADDRESSLINE3 = ADDRESSLINE3;
    }

    public String getADDRESS_LINE4() {
        return ADDRESS_LINE4;
    }

    public void setADDRESS_LINE4(String ADDRESS_LINE4) {
        this.ADDRESS_LINE4 = ADDRESS_LINE4;
    }

    public String getADDRESS_LINE5() {
        return ADDRESS_LINE5;
    }

    public void setADDRESS_LINE5(String ADDRESS_LINE5) {
        this.ADDRESS_LINE5 = ADDRESS_LINE5;
    }

    public String getADDRESS_LINE6() {
        return ADDRESS_LINE6;
    }

    public void setADDRESS_LINE6(String ADDRESS_LINE6) {
        this.ADDRESS_LINE6 = ADDRESS_LINE6;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getGONEAWAY() {
        return GONEAWAY;
    }

    public void setGONEAWAY(String GONEAWAY) {
        this.GONEAWAY = GONEAWAY;
    }

    public String getPC_DAY() {
        return PC_DAY;
    }

    public void setPC_DAY(String PC_DAY) {
        this.PC_DAY = PC_DAY;
    }

    public String getPC_TIME() {
        return PC_TIME;
    }

    public void setPC_TIME(String PC_TIME) {
        this.PC_TIME = PC_TIME;
    }
}
