package com.example.demo.ioc.v2;

public class Car {
    private Framework framework;

    public Car(Framework framework) {
        this.framework = framework;
        System.out.println("car init...");
    }

    public void run() {
        System.out.println("car run...");
    }
}
