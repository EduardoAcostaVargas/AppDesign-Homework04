package SmartHomeSystem;

import java.awt.desktop.SystemSleepEvent;

//Class Light implementing the SmartDevice Interface
public class Light implements SmartDevice{

    //Declare variables for the class
    private String deviceName;
    private final String type = "Light";
    private int brightness;
    private String status;

    // Light Object constructor
    public Light(String deviceName, int brightness, String status){
        this.deviceName = deviceName;
        this.brightness = brightness;
        this.status = status;
    }

    //Override methods from the interface
    @Override
    public void turnOn() {
        status ="ON";
    }

    @Override
    public void turnOff() {
        status = "OFF";
    }

    @Override
    public void displayDeviceInfo() {
        System.out.println("Device name: " + deviceName);
        System.out.println("Device type: " + type);
        System.out.println("Brightness: " + brightness);
        System.out.println("Status: " + status);
    }
}
