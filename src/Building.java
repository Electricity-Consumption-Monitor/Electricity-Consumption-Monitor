import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Concrete Component
class Building  {
    private String name;
    private List<Room> rooms;

    public Building(String name) {
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
    

    public String getName() {
        return name;
    }
}