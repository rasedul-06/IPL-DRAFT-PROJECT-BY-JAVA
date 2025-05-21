package IPL_Draft_System;

public class Player {
    private String name;
    private String country;
    private int jerseyNumber;

    public Player(String name, String country, int jerseyNumber) {
        this.name = name;
        this.country = country;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @Override
    public String toString() {
        return name + " (" + country + ") - Jersey: " + jerseyNumber;
    }
}
