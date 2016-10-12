package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

import java.sql.Date;
import java.util.List;

/**
 * Created by DDEZOYSA on 8/28/2016.
 */
public class Person {

    @Expose
    private int party_id;
    @Expose
    private String party_type;
    @Expose
    private String ssn;
    @Expose
    private String sex;
    @Expose
    private String FORENAMES;
    @Expose
    private String MIDDLENAME;
    @Expose
    private String LASTNAME;
    @Expose
    private String PREFERRED;
    @Expose
    private String INITIALS;
    @Expose
    private String TITLE;
    @Expose
    private String SALUTATION;
    @Expose
    private Date DOB;
    @Expose
    private String PROOF_OF_AGE;
    @Expose
    private String MARITAL_STATUS;
    @Expose
    private String TAX_REF_NO;
    @Expose
    private String DECEASED;
    @Expose
    private String DATE_OF_DEATH;
    @Expose
    private String MAIDEN_NAME;
    @Expose
    private String EMPLOYMENT_STATUS;
    @Expose
    private int COUPLE_ID;
    @Expose
    private String active;
    @Expose
    private Date alter_date;
    @Expose
    private Address address;
    @Expose
    private List<PhoneNumber> landPhoneNumbers;
    @Expose
    private List<PhoneNumber> mobilePhoneNumbers;
    @Expose
    private EMail eMail;

    public int getParty_id() {
        return party_id;
    }

    public void setParty_id(int party_id) {
        this.party_id = party_id;
    }

    public String getParty_type() {
        return party_type;
    }

    public void setParty_type(String party_type) {
        this.party_type = party_type;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public String getPREFERRED() {
        return PREFERRED;
    }

    public void setPREFERRED(String PREFERRED) {
        this.PREFERRED = PREFERRED;
    }

    public String getINITIALS() {
        return INITIALS;
    }

    public void setINITIALS(String INITIALS) {
        this.INITIALS = INITIALS;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getSALUTATION() {
        return SALUTATION;
    }

    public void setSALUTATION(String SALUTATION) {
        this.SALUTATION = SALUTATION;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPROOF_OF_AGE() {
        return PROOF_OF_AGE;
    }

    public void setPROOF_OF_AGE(String PROOF_OF_AGE) {
        this.PROOF_OF_AGE = PROOF_OF_AGE;
    }

    public String getMARITAL_STATUS() {
        return MARITAL_STATUS;
    }

    public void setMARITAL_STATUS(String MARITAL_STATUS) {
        this.MARITAL_STATUS = MARITAL_STATUS;
    }

    public String getTAX_REF_NO() {
        return TAX_REF_NO;
    }

    public void setTAX_REF_NO(String TAX_REF_NO) {
        this.TAX_REF_NO = TAX_REF_NO;
    }

    public String getDECEASED() {
        return DECEASED;
    }

    public void setDECEASED(String DECEASED) {
        this.DECEASED = DECEASED;
    }

    public String getDATE_OF_DEATH() {
        return DATE_OF_DEATH;
    }

    public void setDATE_OF_DEATH(String DATE_OF_DEATH) {
        this.DATE_OF_DEATH = DATE_OF_DEATH;
    }

    public String getMAIDEN_NAME() {
        return MAIDEN_NAME;
    }

    public void setMAIDEN_NAME(String MAIDEN_NAME) {
        this.MAIDEN_NAME = MAIDEN_NAME;
    }

    public String getEMPLOYMENT_STATUS() {
        return EMPLOYMENT_STATUS;
    }

    public void setEMPLOYMENT_STATUS(String EMPLOYMENT_STATUS) {
        this.EMPLOYMENT_STATUS = EMPLOYMENT_STATUS;
    }

    public int getCOUPLE_ID() {
        return COUPLE_ID;
    }

    public void setCOUPLE_ID(int COUPLE_ID) {
        this.COUPLE_ID = COUPLE_ID;
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

    public List<PhoneNumber> getLandPhoneNumbers() {
        return landPhoneNumbers;
    }

    public void setLandPhoneNumbers(List<PhoneNumber> landPhoneNumbers) {
        this.landPhoneNumbers = landPhoneNumbers;
    }

    public List<PhoneNumber> getMobilePhoneNumbers() {
        return mobilePhoneNumbers;
    }

    public void setMobilePhoneNumbers(List<PhoneNumber> mobilePhoneNumbers) {
        this.mobilePhoneNumbers = mobilePhoneNumbers;
    }

    public EMail geteMail() {
        return eMail;
    }

    public void seteMail(EMail eMail) {
        this.eMail = eMail;
    }
}
