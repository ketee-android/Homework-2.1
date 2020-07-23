package ru.geekbrains.java_core_level2;

public class Team {
    Actions[] teamParticipants = new Actions[3];

    public Team(Actions[] teamMembers) {
        this.teamParticipants = teamMembers;
    }

    public Actions[] getParticipants() {
        return teamParticipants;
    }

    public void showResults(){
        for (Actions c: teamParticipants) {
            c.showResult();
        }
    }

    public void showMembersFinishedCourse() {
        for (Actions c: teamParticipants) {
            if(c.isOnDistance()) {
                c.showResult();
            }
        }
    }
}
