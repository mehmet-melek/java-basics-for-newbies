package com.java.basics.sample_apps.interfaceapp;

public class SignUpManager {
    
    private UserCheckService userCheckService;
    
    public SignUpManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }
    
    public void signUp(User user) {
        
        if (userCheckService.userCheck(user)) {
            
            System.out.println(user.getName() + " has registered.");
        
        }
        else {
            
            System.out.println(user.getName() + " has not registered.");
        }
    }
    
    
}
