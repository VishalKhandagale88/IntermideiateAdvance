package basics;

import java.util.Arrays;
import java.util.Objects;

public class Player {
    // POJO class plain old java object
    private String name;
    private int runs;
    private int[] hundreds; // 101, 120, 140, 111
    private int[] fifties; // 57 , 64 , 73 , 88
    private boolean indian;
    private double instagramFollowers;
    private String[] brandAd; // puma , nike , adidas

    public Player(String name, int runs, int[] hundreds, int[] fifties, boolean indian, double instagramFollowers, String[] brandAd) {
        this.name = name;
        this.runs = runs;
        this.hundreds = hundreds;
        this.fifties = fifties;
        this.indian = indian;
        this.instagramFollowers = instagramFollowers;
        this.brandAd = brandAd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int[] getHundreds() {
        return hundreds;
    }

    public void setHundreds(int[] hundreds) {
        this.hundreds = hundreds;
    }

    public int[] getFifties() {
        return fifties;
    }

    public void setFifties(int[] fifties) {
        this.fifties = fifties;
    }

    public boolean isIndian() {
        return indian;
    }

    public void setIndian(boolean indian) {
        this.indian = indian;
    }

    public double getInstagramFollowers() {
        return instagramFollowers;
    }

    public void setInstagramFollowers(double instagramFollowers) {
        this.instagramFollowers = instagramFollowers;
    }

    public String[] getBrandAd() {
        return brandAd;
    }

    public void setBrandAd(String[] brandAd) {
        this.brandAd = brandAd;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", runs=" + runs +
                ", hundreds=" + Arrays.toString(hundreds) +
                ", fifties=" + Arrays.toString(fifties) +
                ", indian=" + indian +
                ", instagramFollowers=" + instagramFollowers +
                ", brandAd=" + Arrays.toString(brandAd) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return runs == player.runs && indian == player.indian && Double.compare(instagramFollowers, player.instagramFollowers) == 0 && Objects.equals(name, player.name) && Arrays.equals(hundreds, player.hundreds) && Arrays.equals(fifties, player.fifties) && Arrays.equals(brandAd, player.brandAd);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, runs, indian, instagramFollowers);
        result = 31 * result + Arrays.hashCode(hundreds);
        result = 31 * result + Arrays.hashCode(fifties);
        result = 31 * result + Arrays.hashCode(brandAd);
        return result;
    }
}