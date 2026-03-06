package SmartHomeSystem;

import java.util.Scanner;

public class SmartHomeController {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeviceManager manager = new DeviceManager();

        System.out.println("How many devices do you want to add? ");
        int devicesToAdd = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < devicesToAdd; i++) {
            System.out.println("Enter a device type (Light/Thermostat): ");
            String type = scanner.nextLine();

            switch (type.toLowerCase()) {
                case "light": {
                    System.out.println("Enter device name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter brightness level: ");
                    int brightness = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter device status (ON/OFF): ");
                    String status = scanner.nextLine().toLowerCase();

                    manager.addDevice(new Light(name, brightness, status));
                    System.out.println("Device " + name + " got added successfully!");
                    break;
                }
                case "thermostat": {
                    System.out.println("Enter device name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter temperature ºF: ");
                    int temperature = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter device status (ON/OFF): ");
                    String status = scanner.nextLine().toLowerCase();

                    manager.addDevice(new Thermostat(name, temperature, status));
                    System.out.println("Device " + name + " got added successfully!");
                    break;
                }
                default: {
                    System.out.println("Please enter a valid device.");
                }
            }
        }
        manager.displayAllDevices();
    }
}
