import java.util.ArrayList;

public class Test {
    private int code;
    private String title;

    private ArrayList<Athlete> participants = new ArrayList<>();
    private ArrayList<Facility> where = new ArrayList<>();


    public Test(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Athlete> getAthletes() {
        return participants;
    }

    public void setAthletes(ArrayList<Athlete> athletes) {
        this.participants = athletes;
    }

    public ArrayList<Facility> getWhere() {
        return where;
    }

    public void setWhere(ArrayList<Facility> where) {
        this.where = where;
    }

    public ArrayList<Athlete> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Athlete> participants) {
        this.participants = participants;
    }

    public void addParticipants(Athlete athlete){
        participants.add(athlete);
    }
}