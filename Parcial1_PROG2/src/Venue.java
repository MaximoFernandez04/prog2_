public class Venue {
    private Test test;
    private Facility facility;
    private int phase;
    private String date;
    private String time;

    public Venue(int phase, String date, String time) {
        this.phase = phase;
        this.date = date;
        this.time = time;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}