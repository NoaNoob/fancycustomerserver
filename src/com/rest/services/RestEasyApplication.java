package com.rest.services;


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class RestEasyApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();
    
    public RestEasyApplication() {
        singletons.add(new CustomerService());
    }
 
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
