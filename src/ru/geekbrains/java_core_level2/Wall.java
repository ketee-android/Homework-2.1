package ru.geekbrains.java_core_level2;

public class Wall extends Obstacle {
    public static int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void go(Actions participant) {
        participant.jump(height);
    }
}
