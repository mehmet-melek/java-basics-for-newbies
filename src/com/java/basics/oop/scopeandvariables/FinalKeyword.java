package com.java.basics.oop.scopeandvariables;

public class FinalKeyword {

    public final        String finalVariable;
    public static final String staticFinalVariable = "Value";

    public FinalKeyword(String finalVariable) {

        this.finalVariable = finalVariable;
        //this.staticFinalVariable=staticFinalVariable;

    }

    public void setValueToFinal() {

        //finalVariable="sampleValue";
        //staticFinalVariable="sampleValue";

    }

    public void finalParameter(final String username, final String password) { // If we use final variable, ve can not change value of variable in method

        //username = "sample";

        System.out.println(username);
        System.out.println(password);

    }

    public final void finalMethod() { // If any class extend from this class; final method can not overwrite

        System.out.println("Do something");
    }

}
