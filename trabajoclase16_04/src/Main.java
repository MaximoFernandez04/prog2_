// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        Team team1 = new Team();
        team1.addPlayer(new Player("Messi","Delantero", 10));
        team1.addPlayer(new Player("Ter Stegen","Arquero", 1));
        team1.addPlayer(new Player("Lema","Defensor", 2));
        team1.addPlayer(new Player("Rodri","Mediocampista", 5));

        int i = 1;
        for (Player jugadores:team1) {
            System.out.println("Jugador "+ i);
            System.out.println("Nombre = "+ jugadores.getName()+"\n"+
                                "Posicion = "+jugadores.getPosition()+"\n"+
                                "Número de camiseta = "+jugadores.getShirtNumber());
            i += 1;
        }
    }
}