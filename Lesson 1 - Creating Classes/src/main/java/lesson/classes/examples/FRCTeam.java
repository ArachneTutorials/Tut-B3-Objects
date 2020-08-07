package lesson.classes.examples;

import java.util.ArrayList;

class FRCTeam {
    // Properties
    int number;
    int rookieYear;
    ArrayList<String> eventsAttending;

    // Constructor
    FRCTeam(int number, int rookieYear) {
        this.number = number;
        this.rookieYear = rookieYear;

        this.eventsAttending = new ArrayList<String>();
    }

    // Methods
    void addEvent(String eventName) {
        if(!eventsAttending.contains(eventName)) {
            eventsAttending.add(eventName);
        }
    }
}
