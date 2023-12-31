import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Concrete Component
class Building implements ElectricityComponent {
    private String name;
    private List<Room> rooms;

    public Building(String name) {
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public double calculateTotalElectricityBill() {
        double totalElectricityBill = 0.0;
        for (Room room : rooms) {
            totalElectricityBill += room.calculateTotalElectricityBill();
        }
        return totalElectricityBill * 0.18;
    }

    public String getName() {
        return name;
    }
}
