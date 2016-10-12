package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

/**
 * Created by DDEZOYSA on 8/26/2016.
 */
public class BusinessUnits {

    @Expose
    private int businessunit_id;
    @Expose
    private int bank_id;
    @Expose
    private String unit_number;
    @Expose
    private String unit_name;
    @Expose
    private String unit_type;
    @Expose
    private String unit_location;
    @Expose
    private int parent_unit;
    @Expose
    private String address;
    @Expose
    private String postcode;

    public int getBusinessunit_id() {
        return businessunit_id;
    }

    public void setBusinessunit_id(int businessunit_id) {
        this.businessunit_id = businessunit_id;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getUnit_number() {
        return unit_number;
    }

    public void setUnit_number(String unit_number) {
        this.unit_number = unit_number;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getUnit_type() {
        return unit_type;
    }

    public void setUnit_type(String unit_type) {
        this.unit_type = unit_type;
    }

    public String getUnit_location() {
        return unit_location;
    }

    public void setUnit_location(String unit_location) {
        this.unit_location = unit_location;
    }

    public int getParent_unit() {
        return parent_unit;
    }

    public void setParent_unit(int parent_unit) {
        this.parent_unit = parent_unit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
