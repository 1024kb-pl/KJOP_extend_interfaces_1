package pl.maniaq.impl;

import pl.maniaq.api.Turtle;

public class TurtleImpl implements Turtle {

    public TurtleImpl() {

    }

    @Override
    public void hideInShell() {
        System.out.println("Żółw schował się w muszli");
    }

    @Override
    public void layEggs() {
        System.out.println("Zółw składa jaja");
    }

    @Override
    public void move() {
        System.out.println("Żółw się porusza");
    }

    @Override
    public void eat() {
        System.out.println("Zółw je");
    }
}
