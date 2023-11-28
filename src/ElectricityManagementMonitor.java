import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectricityManagementMonitor {
    private static ElectricityManagementMonitor instance;

    private List<ElectricityComponent> components;

    private ElectricityManagementMonitor() {
        components = new ArrayList<>();
    }

    public static ElectricityManagementMonitor getInstance() {
        if (instance == null) {
            instance = new ElectricityManagementMonitor();
        }
        return instance;
    }

    public void addComponent(ElectricityComponent component) {
        components.add(component);
    }

    public double calculateTotalElectricityBill() {
        double totalElectricityBill = 0.0;
        for (ElectricityComponent component : components) {
            totalElectricityBill += component.calculateTotalElectricityBill();
        }
        return totalElectricityBill;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the building: ");
        String buildingName = scanner.nextLine();
        Building building = new Building(buildingName);


        System.out.print("Enter the number of rooms in " + buildingName + ": ");
        int numberOfRooms = scanner.nextInt();


        for (int roomNumber = 1; roomNumber <= numberOfRooms; roomNumber++) {
            System.out.println("\nRoom " + roomNumber + ":");
            Room room = new Room();

            System.out.print("Enter the number of devices in this room: ");
            int numberOfDevices = scanner.nextInt();
            
        }
    }
    }