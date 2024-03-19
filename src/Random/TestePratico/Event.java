package TestePratico;

import java.time.*;
import java.util.Arrays;

public abstract class Event implements IEvent {
        
    private LocalDate date;
    private double totalPrice;
    private Activity[] activities;

    public Event(LocalDate date) {
        this.date = date;
        this.totalPrice = 0;
        this.activities = new Activity[0];
    }

    public LocalDate getDate() {
        return date;
    }

    public double totalPrice() {
        return totalPrice;
    }

    public Activity[] getActivities() {
        return activities;
    }

    public void setActivities(Activity[] activities) {
        this.activities = activities;
    }

    public void addActivity() {
        Activity[] newActivities = new Activity[activities.length + 1];
        for (int i = 0; i < activities.length; i++) {
            newActivities[i] = activities[i];
        }
    }

    @Override
    public String toString() {
        return "Event:\n" + Arrays.toString(activities) + ", date=" + date + ", totalPrice=" + totalPrice + "]";
    }
}