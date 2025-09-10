/**
+----------------------------------------------------------------------------------+
|                               HistoricalEvent                                    |
+----------------------------------------------------------------------------------+
| - description : String                                                           |
| - eventDay    : Date                                                             |
+----------------------------------------------------------------------------------+
| + HistoricalEvent()                                                              |
| + HistoricalEvent(description:String, eventDay:Date)                             |
| + HistoricalEvent(original:HistoricalEvent)                                      |
| + setDescription(description:String) : void                                      |
| + setEventDay(eventDay:Date) : void                                              |
| + setAll(description:String, eventDay:Date) : void                               |
| + getDescription() : String                                                      |
| + getEventDay() : Date                                                           |
| + toString() : String                                                            |
| + equals(other:Object) : boolean                                                 |
+----------------------------------------------------------------------------------+
*/
public class HistoricalEvent {
    // text that explains the event
    private String description;
    // date when the event happened
    private Date eventDay;

    // default constructor: makes an empty description and a default date
    public HistoricalEvent() {
        this.description = "";
        this.eventDay = new Date();
    }

    // constructor that takes a description and a date
    // makes a copy of the date so changes outside do not affect this object
    public HistoricalEvent(String description, Date eventDay) {
        this.description = (description != null) ? description : "";
        this.eventDay = (eventDay != null) ? new Date(eventDay) : new Date();
    }

    // copy constructor: creates a new HistoricalEvent with the same data as another
    public HistoricalEvent(HistoricalEvent original) {
        if (original == null) {
            System.out.println("ERROR: trying to copy NULL HistoricalEvent. Exiting program...");
            System.exit(0);
        }
        this.description = original.description;
        this.eventDay = new Date(original.eventDay);
    }

    // set the description text
    public void setDescription(String description) {
        this.description = (description != null) ? description : "";
    }

    // set the event date, using a copy for safety
    public void setEventDay(Date eventDay) {
        if (eventDay != null) {
            this.eventDay = new Date(eventDay);
        }
    }

    // set both description and date at once
    public void setAll(String description, Date eventDay) {
        setDescription(description);
        setEventDay(eventDay);
    }

    // return the description
    public String getDescription() {
        return this.description;
    }

    // return a copy of the event date
    public Date getEventDay() {
        return new Date(this.eventDay);
    }

    // show the event as text, for printing
    @Override
    public String toString() {
        return "Date: " + this.eventDay + "\nDescription: " + this.description;
    }

    // check if this event is the same as another HistoricalEvent
    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof HistoricalEvent)) {
            return false;
        }
        HistoricalEvent otherEvent = (HistoricalEvent) other;
        return this.description.equals(otherEvent.description)
            && this.eventDay.equals(otherEvent.eventDay);
    }
}