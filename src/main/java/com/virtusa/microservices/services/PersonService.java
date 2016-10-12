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
import com.virtusa.microservices.data.dao.PersonDAO;
import com.virtusa.microservices.data.dao.TransactionDAO;
import com.virtusa.microservices.data.model.Person;
import com.virtusa.microservices.data.model.Transaction;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Hello service resource class.
 */
@Path("/person")
public class PersonService {

    Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

    @GET
    @Path("/getPersonByPartyId/{party_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonByPartyId(@PathParam("party_id") int party_id){
        Person person = new PersonDAO().getPersonByPartyId(party_id);
        return gson.toJson(person);
    }

    @GET
    @Path("/getPersonByEMailId/{email_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonByEMailId(@PathParam("email_id") String email_id){
        Person person = new PersonDAO().getPersonByEMailId(email_id);
        return gson.toJson(person);
    }
}
