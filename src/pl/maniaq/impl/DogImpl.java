package pl.maniaq.impl;

import pl.maniaq.api.Dog;

public class DogImpl implements Dog {

    public DogImpl() {

    }

    @Override
    public void bark() {
        System.out.println("Pies szczeka");
    }

    @Override
    public void feedChildWithMilk() {
        System.out.println("Pies karmi potomstwo mlekiem.");
    }

    @Override
    public void move() {
        System.out.println("Pies się porusza");
    }

    @Override
    public void eat() {
        System.out.println("Pies je");
    }
}
