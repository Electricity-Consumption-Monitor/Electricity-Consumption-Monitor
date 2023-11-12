import java.util.ArrayList;
import java.util.List;

public class ElectricityManagementMonitor {
    private static ElectricityManagementMonitor instance;

    private List<Building> buildings;

    private ElectricityManagementMonitor() {
        buildings = new ArrayList<>();
    }

    public static ElectricityManagementMonitor getInstance() {
        if (instance == null) {
            instance = new ElectricityManagementMonitor();
        }
        return instance;
    }
}