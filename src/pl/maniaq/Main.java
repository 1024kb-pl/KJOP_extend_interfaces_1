package pl.maniaq;

import pl.maniaq.api.*;
import pl.maniaq.impl.DogImpl;
import pl.maniaq.impl.TurtleImpl;

public class Main {

    public static void main(String[] args) {
        // żółw jest zwierzęciem, więc typ może być Animal
        Animal turtle = new TurtleImpl();
        // zółw jest gadem, więc typ może być Reptiles
        Reptiles secondTurtle = new TurtleImpl();
        Turtle thirthTurtle = new TurtleImpl();


        // pies jest ssakiem, więc typ może być Mammal
        Mammal dog = new DogImpl();
        // pies jest zwierzęciem, więc typ może być Animal
        Animal secondDog = new DogImpl();
        Dog thirthDog = new DogImpl();

        turtle.eat();
        secondTurtle.layEggs();
        thirthTurtle.hideInShell();

        thirthDog.bark();
        dog.feedChildWithMilk();
        secondDog.move();

    }
}
