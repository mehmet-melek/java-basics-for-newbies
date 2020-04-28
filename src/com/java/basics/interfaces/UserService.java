package com.java.basics.interfaces;

public interface UserService {
    
    void setNameById(int id,String name);
    
    String getNameById(int id);
    
    int getIdByName(String name);
    
}
