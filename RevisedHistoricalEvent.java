/**
+----------------------------------------------------------------------------------+
|                           RevisedHistoricalEvent                                 |
+----------------------------------------------------------------------------------+
| - revisedDescription : String                                                    |
| - citation           : String                                                    |
+----------------------------------------------------------------------------------+
| + RevisedHistoricalEvent()                                                       |
| + RevisedHistoricalEvent(description:String, eventDay:Date,                      |
|        revisedDescription:String, citation:String)                               |
| + RevisedHistoricalEvent(original:RevisedHistoricalEvent)                        |
| + setRevisedDescription(revisedDescription:String) : void                        |
| + setCitation(citation:String) : void                                            |
| + setAll(description:String, eventDay:Date, revisedDescription:String,           |
|        citation:String) : void                                                   |
| + getRevisedDescription() : String                                               |
| + getCitation() : String                                                         |
| + toString() : String                                                            |
| + equals(other:Object) : boolean                                                 |
| + teach() : void                                                                 |
+----------------------------------------------------------------------------------+
Extends → HistoricalEvent
*/
public class RevisedHistoricalEvent extends HistoricalEvent {
    // text that corrects or expands the original description
    private String revisedDescription;
    // source for the revision (URL or full citation)
    private String citation;

    // makes an empty revised event that still has a valid base event
    public RevisedHistoricalEvent() {
        super();                 // builds the base HistoricalEvent part
        this.revisedDescription = "";
        this.citation = "";
    }

    // builds a revised event from the original description + date, plus the revision and citation
    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);                 // set base fields in parent
        this.revisedDescription = (revisedDescription != null) ? revisedDescription : "";
        this.citation = (citation != null) ? citation : "";
    }

    // copy constructor: makes a new object with the same data as another revised event
    public RevisedHistoricalEvent(RevisedHistoricalEvent original) {
        super(original); // parent copy constructor handles base fields
        if (original == null) {
            System.out.println("ERROR: trying to copy NULL RevisedHistoricalEvent. Exiting program...");
            System.exit(0);
        }
        this.revisedDescription = original.revisedDescription;
        this.citation = original.citation;
    }

    // set the revised description text
    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = (revisedDescription != null) ? revisedDescription : "";
    }

    // set the citation text or URL
    public void setCitation(String citation) {
        this.citation = (citation != null) ? citation : "";
    }

    // set everything at once: original description/date + revision + citation
    public void setAll(String description, Date eventDay, String revisedDescription, String citation) {
        super.setAll(description, eventDay); // use parent's setter for base data
        setRevisedDescription(revisedDescription);
        setCitation(citation);
    }

    // get the revised description
    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    // get the citation
    public String getCitation() {
        return this.citation;
    }

    // show the whole revised event as text
    @Override
    public String toString() {
        return super.toString() + "\nRevised: " + this.revisedDescription + "\nCitation: " + this.citation;
    }

    // check if two RevisedHistoricalEvent objects are equal
    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof RevisedHistoricalEvent)) {
            return false;
        }
        RevisedHistoricalEvent otherEvent = (RevisedHistoricalEvent) other;
        return super.equals(otherEvent)
            && this.revisedDescription.equals(otherEvent.revisedDescription)
            && this.citation.equals(otherEvent.citation);
    }

    // print a small lesson to the console in the format shown in the lab
    public void teach() {
        System.out.println("Date: " + getEventDay());
        System.out.println("Original telling:");
        System.out.println(getDescription());
        System.out.println();
        System.out.println("Revised history:");
        System.out.println(this.revisedDescription);
        System.out.println("Citation:\n" + this.citation);
    }
}