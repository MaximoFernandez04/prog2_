import java.util.ArrayList;
import java.util.Iterator;

public class Team implements Iterable<Player> {
    private String name;
    private ArrayList<Player> jugadores;

    public Team() {
        jugadores = new ArrayList<>();
    }
    public void addPlayer(Player player){
        jugadores.add(player);
    }
    @Override
    public Iterator<Player> iterator() {
        return jugadores.iterator();
    }
}
