package com.hepsiemlak.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration{

    @Override
    public String getConnectionString() {
        return "couchbase://127.0.0.1";
    }



    @Override
    public String getBucketName() {
        return "default";
    }



    @Override
    public String getUserName() {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return null;
    }



    
}

