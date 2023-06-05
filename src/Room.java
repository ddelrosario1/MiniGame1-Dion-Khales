public class Room {
    private int Number;
    private String Name;
    private String description;
    private int north;
    private int west;
    private int south;
    private int east;
    private boolean visited = false;

    public void visitededRoom() {
        this.visited = true;
    }

    public Room(String name, int number, String description, int north, int west, int south, int east) {
        Number = number;
        Name = name;
        this.description = description;
        this.north = north;
        this.west = west;
        this.south = south;
        this.east = east;
    }

    public int getNumber() {
        return Number;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return description;
    }

    public int getNorth() {
        return north;
    }

    public int getWest() {
        return west;
    }

    public int getSouth() {
        return south;
    }

    public int getEast() {
        return east;
    }

    public boolean isVisited() {
        return visited;
    }
}
