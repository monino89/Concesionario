package Utility;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import People.Client;
import People.Person;
import People.Seller;
import People.Mechanic;
import VehicleCatalog.Vehicle;

public final class Menu {
    
    private Menu() {}
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void printMenu() {
        System.out.println("\n\n=== CAR DEALERSHIP MANAGEMENT SYSTEM ===");
        System.out.println("1. Print vehicles information");
        System.out.println("2. Print clients information");
        System.out.println("3. Modify an existing Vehicle");
        System.out.println("4. Create new client");
        System.out.println("5. Create report file");
        System.out.println("6. Print workers information");
        System.out.println("7. End the program");
        System.out.print("Select an option: ");
    }
    
    public static void handleMenu(ArrayList<Vehicle> vehicles, ArrayList<Person> people, String dataFolder) {
        int option;
        do {
            printMenu();
            option = readIntInput();
            
            switch (option) {
                case 1:
                    printVehicles(vehicles);
                    break;
                case 2:
                    printClients(people);
                    break;
                case 3:
                    modifyVehicle(vehicles);
                    break;
                case 4:
                    createClient(people);
                    break;
                case 5:
                    createReport("dealership_report.txt", vehicles, people);
                    break;
                case 6:
                    printWorkers(people);
                    break;
                case 7:
                    System.out.println("Thank you for using the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 7);
    }
    
    private static void printVehicles(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }
        System.out.println("\n=== VEHICLES (" + vehicles.size() + " total) ===");
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            System.out.println("Vehicle #" + (i + 1) + " - " + vehicle.getClass().getSimpleName() + ":");
            System.out.println(vehicle.toString());
            
            // Mostrar métodos específicos
            vehicle.showPrice();
            vehicle.showState();
            
            System.out.println("-------------------");
        }
    }
    
    private static void printClients(ArrayList<Person> people) {
        ArrayList<Client> clients = new ArrayList<>();
        for (Person person : people) {
            if (person instanceof Client) {
                clients.add((Client) person);
            }
        }
        
        if (clients.isEmpty()) {
            System.out.println("No clients available.");
            return;
        }
        
        System.out.println("\n=== CLIENTS (" + clients.size() + " total) ===");
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            System.out.println("Client #" + (i + 1) + ":");
            System.out.println(client.toString());
            client.thankYouMessage();
            System.out.println("-------------------");
        }
    }
    
    private static void printWorkers(ArrayList<Person> people) {
        ArrayList<Seller> sellers = new ArrayList<>();
        ArrayList<Mechanic> mechanics = new ArrayList<>();
        
        for (Person person : people) {
            if (person instanceof Seller) {
                sellers.add((Seller) person);
            } else if (person instanceof Mechanic) {
                mechanics.add((Mechanic) person);
            }
        }
        
        if (sellers.isEmpty() && mechanics.isEmpty()) {
            System.out.println("No workers available.");
            return;
        }
        
        System.out.println("\n=== WORKERS ===");
        
        if (!sellers.isEmpty()) {
            System.out.println("\nSELLERS (" + sellers.size() + " total):");
            for (int i = 0; i < sellers.size(); i++) {
                Seller seller = sellers.get(i);
                System.out.println("Seller #" + (i + 1) + ":");
                System.out.println(seller.toString());
                System.out.println("-------------------");
            }
        }
        
        if (!mechanics.isEmpty()) {
            System.out.println("\nMECHANICS (" + mechanics.size() + " total):");
            for (int i = 0; i < mechanics.size(); i++) {
                Mechanic mechanic = mechanics.get(i);
                System.out.println("Mechanic #" + (i + 1) + ":");
                System.out.println(mechanic.toString());
                System.out.println("-------------------");
            }
        }
    }
    
    private static void modifyVehicle(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles to modify.");
            return;
        }
        
        System.out.println("\nAvailable vehicles:");
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            System.out.println((i + 1) + ". " + vehicle.getBrand() + " " + vehicle.getModel() + 
                             " (" + vehicle.getClass().getSimpleName() + " - ID: " + vehicle.getVehicleId() + ")");
        }
        
        System.out.print("Select vehicle to modify (1-" + vehicles.size() + "): ");
        int choice = readIntInput();
        
        if (choice < 1 || choice > vehicles.size()) {
            System.out.println("Invalid selection.");
            return;
        }
        
        Vehicle selectedVehicle = vehicles.get(choice - 1);
        System.out.println("Selected vehicle: " + selectedVehicle);
        
        System.out.println("What would you like to modify?");
        System.out.println("1. Price");
        System.out.println("2. Color");
        System.out.println("3. Cancel");
        
        int modifyChoice = readIntInput();
        switch (modifyChoice) {
            case 1:
                System.out.print("Enter new price: ");
                double newPrice = readDoubleInput();
                selectedVehicle.setPrice(newPrice);
                System.out.println("Price updated successfully.");
                break;
            case 2:
                System.out.print("Enter new color: ");
                String newColor = scanner.nextLine();
                selectedVehicle.setColor(newColor);
                System.out.println("Color updated successfully.");
                break;
            case 3:
                System.out.println("Modification cancelled.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private static void createClient(ArrayList<Person> people) {
        System.out.println("\n=== CREATE NEW CLIENT ===");
        System.out.println("Client creation feature - basic version");
        
        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter first last name: ");
            String lastName1 = scanner.nextLine();
            
            System.out.print("Enter second last name: ");
            String lastName2 = scanner.nextLine();
            
            System.out.print("Enter age: ");
            int age = readIntInput();
            
            System.out.print("Enter DNI: ");
            String dni = scanner.nextLine();
            
            System.out.print("Enter phone: ");
            String phone = scanner.nextLine();
            
            System.out.print("Is new client? (true/false): ");
            boolean newClient = Boolean.parseBoolean(scanner.nextLine());
            
            // Generar un ID único
            int clientId = generateUniqueClientId(people);
            
            Client newClientObj = new Client(name, lastName1, lastName2, age, dni, phone, newClient, clientId);
            people.add(newClientObj);
            
            System.out.println("Client created successfully with ID: " + clientId);
            
        } catch (Exception e) {
            System.out.println("Error creating client: " + e.getMessage());
        }
    }
    
    private static int generateUniqueClientId(ArrayList<Person> people) {
        int maxId = 0;
        for (Person person : people) {
            if (person instanceof Client) {
                Client client = (Client) person;
                if (client.getClientId() > maxId) {
                    maxId = client.getClientId();
                }
            }
        }
        return maxId + 1;
    }
    
    public static void createReport(String filePath, ArrayList<Vehicle> vehicles, ArrayList<Person> people) {
        UtilityFileReader.createReport(filePath, vehicles, people);
    }
    
    private static int readIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
    
    private static double readDoubleInput() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
}