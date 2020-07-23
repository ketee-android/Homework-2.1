package ru.geekbrains.java_core_level2;

public class Participant implements Actions {
    String type;
    String name;
    int run;
    int jump;
    boolean distanceCheck;

    public boolean isOnDistance() {
        return distanceCheck;
    }

    public Participant(String type, String name, int maxRunLength, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.run = maxRunLength;
        this.jump = maxJumpHeight;
        this.distanceCheck = true;
    }

    public void run(int distance) {
        if (distance <= run) {
            System.out.println(type + " " + name + " " + " справился с беговой дорожкой длиной " + RunningTrack.length);
        } else {
            System.out.println(type + " " + name + " " + " не справился с беговой дорожкой длиной " + RunningTrack.length);
            distanceCheck = false;
        }
    }

    public void jump(int height) {
        if (height <= jump) {
            System.out.println(type + " " + name + " " + " смог перепрыгнуть стену высотой " + Wall.height);
        } else {
            System.out.println(type + " " + name + " " + " не смог перепрыгнуть высотой " + Wall.height);
            distanceCheck = false;
        }
    }

    public void showResult() {
        System.out.println(type + " " + name + ": " + distanceCheck);
    }
}

