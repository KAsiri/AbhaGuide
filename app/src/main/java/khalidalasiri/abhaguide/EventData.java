package khalidalasiri.abhaguide;

/**
 * Created by kasir on 1/8/2018.
 */

public class EventData {
    private String eventName, eventLocation, eventTime;

    public EventData(String eventName, String eventLocation, String eventTime) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventTime = eventTime;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public String getEventTime() {
        return eventTime;
    }
}
