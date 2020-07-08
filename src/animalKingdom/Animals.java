package animalKingdom;

public abstract class Animals {
    
    private static int maxId = 0;
    public int id;
    private String name;
    private int yearDiscovered;

    public Animals(String name, int yearDiscovered) {
        id = maxId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    //Getters

    public String getName() {
        return name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public String consume() {
        return "consumed";
    }

    public String move() {
        return "moved";
    }

    public String breathe() {
        return "breathes";
    }

    public String reproduce() {
        return "reproduced";
    }
}