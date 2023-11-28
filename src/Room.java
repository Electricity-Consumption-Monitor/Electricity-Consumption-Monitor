import java.util.ArrayList;
import java.util.List;

class Room  {
    private List<Device> devices;

    public Room() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    
}