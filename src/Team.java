import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team {
    private String team;
    private ArrayList<Player> players;
    private int total;
    private int maxSize;

    public Team(String team){
        this(team, 16);
    }

    public Team(String team, int maxSize) {
        this.team = team;
        this.players = new ArrayList<Player>();
        this.maxSize = maxSize;
        this.total = total;
    }

    public String getName() {
        return this.team;
    }

    public void addPlayer(Player member) {
        players.add(member);
    }

    public void printPlayers() {
        for (Player name : players) {
            System.out.println(name);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.maxSize;
    }

    public int goals(){
        for (Player p : players) {
            total += p.getGoals();
        }
        return total;
    }
}
