package ru.geekbrains.java_core_level2;

public class RunningTrack extends Obstacle {
    public static int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void go(Actions participant) {
        participant.run(length);
    }
}
