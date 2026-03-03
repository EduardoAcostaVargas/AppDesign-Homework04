package SmartHomeSystem;

//Class Thermostat implementing Interface SmartDevice
public class Thermostat implements SmartDevice{

    //Declare class variables
    String deviceName;
    final String type = "Thermostat";
    float temperature;
    String status;

    //Thermostat Object constructor
    public Thermostat(String deviceName, float temperature, String status){
        this.deviceName = deviceName;
        this.temperature = temperature;
        this.status = status;
    }

    //Override methods from the Interface
    @Override
    public void turnOn() {
        status = "ON";
    }

    @Override
    public void turnOff() {
        status = "OFF";
    }

    @Override
    public void displayDeviceInfo() {
        System.out.println("Device name: " + deviceName);
        System.out.println("Device type: " + type);
        System.out.println("Temperature: " + temperature + "ºF");
        System.out.println("Status: " + status);
    }
}
