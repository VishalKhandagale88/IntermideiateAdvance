package hierarchical;

public class Player extends Cricket{
    private String name;
    private String role;
    private long runs;
    private int wickets;
    private int strikeRate;

    public Player(int size, String name, String role, long runs, int wickets, int strikeRate) {
        super(size);
        this.name = name;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
        this.strikeRate = strikeRate;
    }

    public Player(String name, String role, long runs, int wickets, int strikeRate) {
        this.name = name;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
        this.strikeRate = strikeRate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getRuns() {
        return runs;
    }

    public void setRuns(long runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(int strikeRate) {
        this.strikeRate = strikeRate;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", runs=" + runs +
                ", wickets=" + wickets +
                ", strikeRate=" + strikeRate +
                '}';
    }
}
