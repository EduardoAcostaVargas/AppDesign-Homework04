package SmartHomeSystem;

import java.awt.desktop.SystemSleepEvent;

public class Light implements SmartDevice{
    String deviceName;
    final String type = "Light";
    int brightness;
    String status;

    public Light(String deviceName, int brightness, String status){}

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
