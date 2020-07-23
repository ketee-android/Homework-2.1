package ru.geekbrains.java_core_level2;

public class Team {
    String teamName;
    Actions[] teamParticipants = new Actions[3];

    public Team(String teamName, Actions[] teamMembers){
        this.teamName = teamName;
        this.teamParticipants = teamMembers;
    }

    public String getTeamName() {
        return "Team name: " + teamName;
    }

    public Actions[] getMembers() {
        return teamParticipants;
    }

    public void showResults(){
        for (Actions c: teamParticipants) {
            c.showResult();
        }
    }

    public void showMembersFinishedCourse(){
        for (Actions c: teamParticipants) {
            if(c.isOnDistance()) {
                c.showResult();
            }
        }
    }
}
