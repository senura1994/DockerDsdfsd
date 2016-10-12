package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

import java.sql.Date;
import java.util.List;

/**
 * Created by DDEZOYSA on 8/28/2016.
 */
public class Organization {

    @Expose
    private int party_id;
    @Expose
    private int org_id;
    @Expose
    private String party_type;
    @Expose
    private String organisation_name;
    @Expose
    private String type;
    @Expose
    private int parent_organisation;
    @Expose
    private String regid;
    @Expose
    private String active;
    @Expose
    private Date alter_date;
    @Expose
    private Address address;
    @Expose
    private List<PhoneNumber> primaryPhoneNumbers;
    @Expose
    private List<PhoneNumber> secondaryPhoneNumbers;
    @Expose
    private EMail eMail;

    public int getParty_id() {
        return party_id;
    }

    public void setParty_id(int party_id) {
        this.party_id = party_id;
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }

    public String getParty_type() {
        return party_type;
    }

    public void setParty_type(String party_type) {
        this.party_type = party_type;
    }

    public String getOrganisation_name() {
        return organisation_name;
    }

    public void setOrganisation_name(String organisation_name) {
        this.organisation_name = organisation_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParent_organisation() {
        return parent_organisation;
    }

    public void setParent_organisation(int parent_organisation) {
        this.parent_organisation = parent_organisation;
    }

    public String getRegid() {
        return regid;
    }

    public void setRegid(String regid) {
        this.regid = regid;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Date getAlter_date() {
        return alter_date;
    }

    public void setAlter_date(Date alter_date) {
        this.alter_date = alter_date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PhoneNumber> getPrimaryPhoneNumbers() {
        return primaryPhoneNumbers;
    }

    public void setPrimaryPhoneNumbers(List<PhoneNumber> primaryPhoneNumbers) {
        this.primaryPhoneNumbers = primaryPhoneNumbers;
    }

    public List<PhoneNumber> getSecondaryPhoneNumbers() {
        return secondaryPhoneNumbers;
    }

    public void setSecondaryPhoneNumbers(List<PhoneNumber> secondaryPhoneNumbers) {
        this.secondaryPhoneNumbers = secondaryPhoneNumbers;
    }

    public EMail geteMail() {
        return eMail;
    }

    public void seteMail(EMail eMail) {
        this.eMail = eMail;
    }
}
