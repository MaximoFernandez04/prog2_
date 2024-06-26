import java.util.ArrayList;

public class NationalTeam {
    private String color;
    private String country;

    private ArrayList<Athlete> nationalTeamAthletes = new ArrayList<>();

    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Athlete> getNationalTeamAthletes() {
        return nationalTeamAthletes;
    }

    public void setNationalTeamAthletes(ArrayList<Athlete> nationalTeamAthletes) {
        this.nationalTeamAthletes = nationalTeamAthletes;
    }

    public void addAthletes(Athlete athlete){
        nationalTeamAthletes.add(athlete);
    }
}