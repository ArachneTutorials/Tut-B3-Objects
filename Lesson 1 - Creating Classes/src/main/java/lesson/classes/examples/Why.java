package lesson.classes.examples;

import java.util.ArrayList;

public class Why {
    
    // ArrayList<FRCTeam> teams = new ArrayList<FRCTeam>();

    // void addTeam(FRCTeam team) {
    //     teams.add(team);
    // }

    // void addEvent(int teamNumber, String eventName) {
    //     for(FRCTeam team : teams) {
    //         if(team.number == teamNumber) {
    //             team.addEvent(eventName);
    //         }
    //     }
    // }

    ArrayList<Integer> teamNumbers = new ArrayList<Integer>();
    ArrayList<Integer> rookieYears = new ArrayList<Integer>();
    ArrayList<ArrayList<String>> eventsAttending = new ArrayList<ArrayList<String>>();

    void addTeam(int teamNumber, int rookieYear) {
        teamNumbers.add(teamNumber);
        rookieYears.add(rookieYear);
        eventsAttending.add(new ArrayList<String>());
    }

    void addEvent(int teamNumber, String eventName) {
        for(int i = 0; i < teamNumbers.size(); i++) {
            if(teamNumbers.get(i) == teamNumber) {
                eventsAttending.get(i).add(eventName);
            }
        }
    }
}