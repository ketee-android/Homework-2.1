package ru.geekbrains.java_core_level2;

public class Human extends Participant implements Actions{
    public Human(String name) {
        super("Человек", name, 300, 7);
    }
}
