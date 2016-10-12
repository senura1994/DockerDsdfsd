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

package com.virtusa.microservices;

import com.virtusa.microservices.services.*;
import org.wso2.msf4j.MicroservicesRunner;

/**
 * Application entry point.
 */
public class Application {
    public static void main(String[] args) {
        int port=80;
        if (args.length>0){
            try {
                port = Integer.parseInt(args[0]);
            }catch(Exception ex){
                System.out.println("Invalid port. Default port 8080 will be used.");
            }
        }
        new MicroservicesRunner(port)
                .deploy(new BankService(), new AccountService(), new TransactionService(), new PersonService(), new OrganizationService(),new EmptyService())
                .start();
    }
}
