package ru.geekbrains.java_core_level2;

public class Course {

    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }

    public void go(Team team) {
        Actions[] teamMembers = team.getParticipants();
        if(teamMembers.length > 0) {
            for (Actions c: teamMembers){
                for (Obstacle o: obstacles){
                    o.go(c);
                    if (!c.isOnDistance()) {
                        break;
                    }
                }
            }
        } else {
            System.out.println("В команде нет игроков.");
        }
    }
}
