package com.java.polymorphism1;

public class Wolf extends Animal {
    String name = "狼";

    @Override
    public void run() {
        System.out.println("狼跑的贼溜");
    }
}
