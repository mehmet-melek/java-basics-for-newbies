package com.java.basics.sample_apps.interfaceapp;

public class UserAgeCheckService implements UserCheckService {
    
    
    @Override
    public boolean userCheck(User user) {
        
        if (user.getAge() < 18) {
            return false;
        }
        return true;
    }
}
