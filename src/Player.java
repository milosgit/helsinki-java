
public class Player {
    private String player;
    public int goals;

    public Player(String player) {
        this(player, 0);
    }

    public Player(String player, int goals) {
        this.player = player;
        this.goals = goals;
    }

    public String toString() {
        return this.player + ", goals: " + this.goals;
    }

    public int getGoals() {
        return this.goals;
    }
}
