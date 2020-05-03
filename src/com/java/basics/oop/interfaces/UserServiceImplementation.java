package com.java.basics.oop.interfaces;

public class UserServiceImplementation implements UserService, SeconUserService {


    @Override
    public void setNameById(int id, String name) {

        // operations
        String sampleName = name;
        int    sampleId   = id;
    }

    @Override
    public String getNameById(int id) {

        //return operations
        String sample = "sample return value";
        return sample;
    }

    @Override
    public int getIdByName(String name) {

        //return operations
        int sample = 1;
        return sample;
    }


    @Override
    public void sampleMethod(int id) {

        //Operations

    }
}
