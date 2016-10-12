package com.virtusa.microservices.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.virtusa.microservices.data.dao.AccountDAO;
import com.virtusa.microservices.data.model.Account;
import com.virtusa.microservices.data.model._AccountByPartyIDCorporate;
import com.virtusa.microservices.data.model._AccountByPartyIDRetail;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by DDEZOYSA on 8/26/2016.
 */
@Path("/account")
public class AccountService {

    Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

    @GET
    @Path("/getAccountByAccountId/{account_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAccountByAccountId(@PathParam("account_id") int account_id){
        Account account = new AccountDAO().getAccountById(account_id);
        return gson.toJson(account);
    }

    @GET
    @Path("/getAccountByPartyIdRetail/{party_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAccountByPartyIdRetail(@PathParam("party_id") int party_id){
        List<_AccountByPartyIDRetail> accountByPartyIDs = new AccountDAO().getAccountsbyPartyIdRetail(party_id);
        return gson.toJson(accountByPartyIDs);
    }

    @GET
    @Path("/getAccountByPartyIdCorporate/{party_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAccountByPartyIdCorporate(@PathParam("party_id") int party_id){
        List<_AccountByPartyIDCorporate> accountByPartyIDs = new AccountDAO().getAccountsbyPartyIdCorporate(party_id);
        return gson.toJson(accountByPartyIDs);
    }

}
