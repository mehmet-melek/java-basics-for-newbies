package com.java.basics.oop.scopeandvariables;

public class Scope {

    private int privateVariable = 10;

    public class InnerClass {

        private int privateVariable = 20;

        public void perform() {

            int privateVariable = 30;

            System.out.println(privateVariable);
            System.out.println(this.privateVariable);
            System.out.println(Scope.this.privateVariable);

        }
    }
}
