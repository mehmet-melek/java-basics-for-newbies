package com.java.basics.oop.inner_class;

public class AnonymousInnerClass {


    Car car = new Car() {

        @Override
        public void startCar() {

            System.out.printf("Working");

        }

        @Override
        public void stopCar() {

            System.out.println("Stoped");

        }
    };

    public interface Car {

        void startCar();
        void stopCar();

    }
}
