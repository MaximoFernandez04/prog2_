// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Athlete athlete1 = new Athlete(24568964,"Julio Rojas", 1.75, 48, 78.5);
        Athlete athlete2 = new Athlete(21452145,"Cesar Silva", 1.80, 51, 79.8);
        Athlete athlete3 = new Athlete(32458453,"Pedro Lopez", 1.90, 40, 82.7);
        Athlete athlete4 = new Athlete(45698741,"Esteban Gutierres", 1.81, 20, 95);

        NationalTeam team1 = new NationalTeam("Blue", "Honduras");
        team1.addAthletes(athlete1);
        team1.addAthletes(athlete2);
        team1.addAthletes(athlete4);

        Test test1 = new Test(276,"Test1");
        test1.addParticipants(athlete1);
        Test test2 = new Test(245,"Test 2");
        test2.addParticipants(athlete1);
        test2.addParticipants(athlete2);
        test2.addParticipants(athlete3);

        Venue venue1 = new Venue(2,"03/02/2025","To be confirmed");
        Facility facility1 = new Facility("Island", "Europe","IslandStadium", "Ice rink");
        facility1.addIsMade(test1);
        facility1.addIsMade(test2);

// Accessing from the venue
        System.out.println("Tercer atleta en la segunda prueba: " + facility1.getIsMade().get(1).getParticipants().get(2).getName());
        System.out.println("Codigo del segundo texto: " + facility1.getIsMade().get(1).getCode());

// Accessing from the national team
        System.out.println("Altura de los atletas del equipo nacional:");
        for (Athlete athlete : team1.getNationalTeamAthletes()) {
            System.out.println(athlete.getHeight());
        }
        System.out.println("Peso de los atletas:");
        for (Athlete athlete : team1.getNationalTeamAthletes()) {
            System.out.println(athlete.hasExtraWeight(athlete.calculateBMI()));
        }
    }
}