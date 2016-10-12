package com.virtusa.microservices.data.dao;

import com.virtusa.microservices.data.connection.ConnectionFactory;
import com.virtusa.microservices.data.model.Address;
import com.virtusa.microservices.data.model.EMail;
import com.virtusa.microservices.data.model.Organization;
import com.virtusa.microservices.data.model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OrganizationDAO {

    public Organization getOrganizationByPartyId(int party_id){
        Organization organization = null;
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.organization as p JOIN SmartBankDb.Address as a JOIN SmartBankDb.emails as e on p.party_id=a.party_id AND p.party_id=e.party_id AND p.party_id=" + party_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                organization = new Organization();
                organization.setParty_id(resultSet.getInt("party_id"));
                organization.setOrg_id(resultSet.getInt("org_id"));
                organization.setParty_type(resultSet.getString("party_type"));
                organization.setOrganisation_name(resultSet.getString("organisation_name"));
                organization.setType(resultSet.getString("type"));
                organization.setParent_organisation(resultSet.getInt("parent_organisation"));
                organization.setRegid(resultSet.getString("regid"));
                organization.setActive(resultSet.getString("active"));
                organization.setAlter_date(resultSet.getDate("alter_date"));

                Address address = new Address();
                address.setParty_id(resultSet.getInt("party_id"));
                address.setADDRESSLINE1(resultSet.getString("ADDRESSLINE1"));
                address.setADDRESSLINE2(resultSet.getString("ADDRESSLINE2"));
                address.setADDRESSLINE3(resultSet.getString("ADDRESSLINE3"));
                address.setADDRESS_LINE4(resultSet.getString("ADDRESS_LINE4"));
                address.setADDRESS_LINE5(resultSet.getString("ADDRESS_LINE5"));
                address.setADDRESS_LINE6(resultSet.getString("ADDRESS_LINE6"));
                address.setPostcode(resultSet.getInt("postcode"));
                address.setGONEAWAY(resultSet.getString("GONEAWAY"));
                address.setPC_DAY(resultSet.getString("PC_DAY"));
                address.setPC_TIME(resultSet.getString("PC_TIME"));

                organization.setAddress(address);

                organization.setPrimaryPhoneNumbers(new PhoneNumberDAO().getPhoneNumberByPartyIdType(party_id, "l"));
                organization.setSecondaryPhoneNumbers(new PhoneNumberDAO().getPhoneNumberByPartyIdType(party_id, "h"));

                EMail eMail = new EMail();
                eMail.setParty_id(resultSet.getInt("party_id"));
                eMail.setEmail_type(resultSet.getString("email_type"));
                eMail.setEmail_id(resultSet.getString("email_id"));
                eMail.setActive(resultSet.getString("active"));

                organization.seteMail(eMail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return organization;
    }

    public Organization getOrganizationByEMailId(String email_id){
        Organization organization = null;
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.organization as p JOIN SmartBankDb.Address as a JOIN SmartBankDb.emails as e on p.party_id=a.party_id AND p.party_id=e.party_id AND e.email_id='" + email_id + "';");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                organization = new Organization();
                organization.setParty_id(resultSet.getInt("party_id"));
                organization.setOrg_id(resultSet.getInt("org_id"));
                organization.setParty_type(resultSet.getString("party_type"));
                organization.setOrganisation_name(resultSet.getString("organisation_name"));
                organization.setType(resultSet.getString("type"));
                organization.setParent_organisation(resultSet.getInt("parent_organisation"));
                organization.setRegid(resultSet.getString("regid"));
                organization.setActive(resultSet.getString("active"));
                organization.setAlter_date(resultSet.getDate("alter_date"));

                Address address = new Address();
                address.setParty_id(resultSet.getInt("party_id"));
                address.setADDRESSLINE1(resultSet.getString("ADDRESSLINE1"));
                address.setADDRESSLINE2(resultSet.getString("ADDRESSLINE2"));
                address.setADDRESSLINE3(resultSet.getString("ADDRESSLINE3"));
                address.setADDRESS_LINE4(resultSet.getString("ADDRESS_LINE4"));
                address.setADDRESS_LINE5(resultSet.getString("ADDRESS_LINE5"));
                address.setADDRESS_LINE6(resultSet.getString("ADDRESS_LINE6"));
                address.setPostcode(resultSet.getInt("postcode"));
                address.setGONEAWAY(resultSet.getString("GONEAWAY"));
                address.setPC_DAY(resultSet.getString("PC_DAY"));
                address.setPC_TIME(resultSet.getString("PC_TIME"));

                organization.setAddress(address);

                organization.setPrimaryPhoneNumbers(new PhoneNumberDAO().getPhoneNumberByPartyIdType(organization.getParty_id(), "l"));
                organization.setSecondaryPhoneNumbers(new PhoneNumberDAO().getPhoneNumberByPartyIdType(organization.getParty_id(),"h"));

                EMail eMail = new EMail();
                eMail.setParty_id(resultSet.getInt("party_id"));
                eMail.setEmail_type(resultSet.getString("email_type"));
                eMail.setEmail_id(resultSet.getString("email_id"));
                eMail.setActive(resultSet.getString("active"));

                organization.seteMail(eMail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrganizationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return organization;
    }
}
