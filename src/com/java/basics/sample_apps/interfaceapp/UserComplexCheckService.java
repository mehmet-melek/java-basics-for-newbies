package com.java.basics.sample_apps.interfaceapp;

public class UserComplexCheckService implements UserCheckService {
    
    
    @Override
    public boolean userCheck(User user) {
        
        if ((user.getAge() < 18) && user.getName().startsWith("Me")) {
            return true;
        }
        return false;
    }
}
