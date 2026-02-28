package SmartHomeSystem;

import java.util.ArrayList;

public  class DeviceManager {
    ArrayList<SmartDevice> devicesConnected = new ArrayList<>();

    void addDevice(SmartDevice device) {
        devicesConnected.add(device);
    }

    void displayAllDevices() {
        System.out.println("---------- DEVICE SUMMARY ----------");

        if (devicesConnected.isEmpty()) {
            System.out.println("No devices to display");
        }
        else {
            for (SmartDevice smartDevice : devicesConnected) {
                smartDevice.displayDeviceInfo();
                System.out.println("-------------------------------------");
            }
        }

    }
}
