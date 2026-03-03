package SmartHomeSystem;

import java.util.ArrayList;

public  class DeviceManager {
    // List to store every Object that we create
    ArrayList<SmartDevice> devicesConnected = new ArrayList<>();

    //Method to add our objects to the list
    void addDevice(SmartDevice device) {
        devicesConnected.add(device);
    }

    //Method to display all the devices on our list
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
