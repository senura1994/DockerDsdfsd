package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

/**
 * Created by DDEZOYSA on 8/28/2016.
 */
public class PhoneNumber {

    private int party_id;
    @Expose
    private String type;
    @Expose
    private String phone_number;
    @Expose
    private String active;

    public int getParty_id() {
        return party_id;
    }

    public void setParty_id(int party_id) {
        this.party_id = party_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
