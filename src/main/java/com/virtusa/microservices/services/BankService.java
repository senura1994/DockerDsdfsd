/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.virtusa.microservices.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.virtusa.microservices.data.dao.BankDAO;
import com.virtusa.microservices.data.model.Bank;
import com.virtusa.microservices.data.model.BusinessUnits;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Hello service resource class.
 */
 
 
 
@Path("/bank")
public class BankService {

    Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
    
    
      @GET
    @Path("/hello")
    public String get() {
        // TODO: Implementation for HTTP GET request
        System.out.println("GET invoked");
        return "Hello from WSO2 MSF4J";
    }

    @GET
    @Path("/getAllBanks")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllBanks(){
        List<Bank> banks = new BankDAO().getAllBanks();
        return gson.toJson(banks);
    }

    @GET
    @Path("/getBankByBankId/{bank_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getBankByBankId(@PathParam("bank_id") int bank_id){
        Bank bank = new BankDAO().getBankByBankId(bank_id);
        return gson.toJson(bank);
    }

    @GET
    @Path("/getBranchesByBankId/{bank_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getBranchesByBankId(@PathParam("bank_id") int bank_id){
        List<BusinessUnits> businessUnitses = new BankDAO().getBranchesByBankId(bank_id);
        return gson.toJson(businessUnitses);
    }
}
