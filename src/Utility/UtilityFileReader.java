package Utility;

import People.Client;
import People.Mechanic;
import People.Person;
import People.Seller;
import VehicleCatalog.CarSport;
import VehicleCatalog.DualSport;
import VehicleCatalog.HyperCar;
import VehicleCatalog.HyperMotorbike;
import VehicleCatalog.Pickup;
import VehicleCatalog.Sedan;
import VehicleCatalog.Sport;
import VehicleCatalog.Vehicle;
import VehicleCatalog.Touring;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class UtilityFileReader {
    
    // Touring
    public static ArrayList<Vehicle> readTouring(String filePath) {
        ArrayList<Vehicle> touring = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 13) {
                        String brand = parts[0].trim();
                        String model = parts[1].trim();
                        int year = Integer.parseInt(parts[2].trim());
                        double price = Double.parseDouble(parts[3].trim());
                        String color = parts[4].trim();
                        double weight = Double.parseDouble(parts[5].trim());
                        boolean used = Boolean.parseBoolean(parts[6].trim());
                        double cylinderCapacity = Double.parseDouble(parts[7].trim());
                        String engineType = parts[8].trim();
                        String brakeType = parts[9].trim();
                        double autonomyKm = Double.parseDouble(parts[10].trim());
                        double tankCapacity = Double.parseDouble(parts[11].trim());
                        int vehicleId = Integer.parseInt(parts[12].trim());
                        
                        touring.add(new Touring(brand, model, year, price, color, weight, used, 
                                              cylinderCapacity, engineType, brakeType, 
                                              autonomyKm, tankCapacity, vehicleId));
                    }
                } catch (Exception e) {
                    // Error silencioso - no mostrar cada error individual
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading Touring file: " + e.getMessage());
        }
        return touring;
    }
    
    // Sport
    public static ArrayList<Vehicle> readSport(String filePath) {
        ArrayList<Vehicle> sports = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 13) {
                        String brand = parts[0].trim();
                        String model = parts[1].trim();
                        int year = Integer.parseInt(parts[2].trim());
                        double price = Double.parseDouble(parts[3].trim());
                        String color = parts[4].trim();
                        double weight = Double.parseDouble(parts[5].trim());
                        boolean used = Boolean.parseBoolean(parts[6].trim());
                        double cylinderCapacity = Double.parseDouble(parts[7].trim());
                        String engineType = parts[8].trim();
                        String brakeType = parts[9].trim();
                        String chassisMaterial = parts[10].trim();
                        double acceleration0to100 = Double.parseDouble(parts[11].trim());
                        int vehicleId = Integer.parseInt(parts[12].trim());
                        
                        sports.add(new Sport(brand, model, year, price, color, weight, used, 
                                           cylinderCapacity, engineType, brakeType, 
                                           chassisMaterial, acceleration0to100, vehicleId));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading sport file: " + e.getMessage());
        }
        return sports;
    }
    
    // DualSport
    public static ArrayList<Vehicle> readDualSport(String filePath) {
        ArrayList<Vehicle> dualSports = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 13) {
                        String brand = parts[0].trim();
                        String model = parts[1].trim();
                        int year = Integer.parseInt(parts[2].trim());
                        double price = Double.parseDouble(parts[3].trim());
                        String color = parts[4].trim();
                        double weight = Double.parseDouble(parts[5].trim());
                        boolean used = Boolean.parseBoolean(parts[6].trim());
                        double cylinderCapacity = Double.parseDouble(parts[7].trim());
                        String engineType = parts[8].trim();
                        String brakeType = parts[9].trim();
                        double seatHeight = Double.parseDouble(parts[10].trim());
                        String tireType = parts[11].trim();
                        int vehicleId = Integer.parseInt(parts[12].trim());
                        
                        dualSports.add(new DualSport(brand, model, year, price, color, weight, used, 
                                                   cylinderCapacity, engineType, brakeType, 
                                                   seatHeight, tireType, vehicleId));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading Dualsport file: " + e.getMessage());
        }
        return dualSports;
    }
    
    // Sedan
    public static ArrayList<Vehicle> readSedan(String filePath) {
        ArrayList<Vehicle> sedans = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 14) {
                        String brand = parts[0].trim();
                        String model = parts[1].trim();
                        int year = Integer.parseInt(parts[2].trim());
                        double price = Double.parseDouble(parts[3].trim());
                        String color = parts[4].trim();
                        double weight = Double.parseDouble(parts[5].trim());
                        boolean used = Boolean.parseBoolean(parts[6].trim());
                        int numDoor = Integer.parseInt(parts[7].trim());
                        int passengerCapacity = Integer.parseInt(parts[8].trim());
                        String fuelType = parts[9].trim();
                        double power = Double.parseDouble(parts[10].trim());
                        String typeSedan = parts[11].trim();
                        double trunkCapacity = Double.parseDouble(parts[12].trim());
                        int vehicleId = Integer.parseInt(parts[13].trim());
                        
                        sedans.add(new Sedan(brand, model, year, price, color, weight, used, 
                                           numDoor, passengerCapacity, fuelType, power, 
                                           typeSedan, trunkCapacity, vehicleId));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading Sedan file: " + e.getMessage());
        }
        return sedans;
    }
    
    // CarSport
    public static ArrayList<Vehicle> readCarSport(String filePath) {
        ArrayList<Vehicle> carSports = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 14) {
                        String brand = parts[0].trim();
                        String model = parts[1].trim();
                        int year = Integer.parseInt(parts[2].trim());
                        double price = Double.parseDouble(parts[3].trim());
                        String color = parts[4].trim();
                        double weight = Double.parseDouble(parts[5].trim());
                        boolean used = Boolean.parseBoolean(parts[6].trim());
                        int numDoor = Integer.parseInt(parts[7].trim());
                        int passengerCapacity = Integer.parseInt(parts[8].trim());
                        String fuelType = parts[9].trim();
                        double power = Double.parseDouble(parts[10].trim());
                        double acceleration0to100 = Double.parseDouble(parts[11].trim());
                        String material = parts[12].trim();
                        int vehicleId = Integer.parseInt(parts[13].trim());
                        
                        carSports.add(new CarSport(brand, model, year, price, color, weight, used, 
                                                 numDoor, passengerCapacity, fuelType, power, 
                                                 acceleration0to100, material, vehicleId));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CarSport file: " + e.getMessage());
        }
        return carSports;
    }
    
    // Pickup
    public static ArrayList<Vehicle> readPickup(String filePath) {
        ArrayList<Vehicle> pickups = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 15) {
                        String brand = parts[0].trim();
                        String model = parts[1].trim();
                        int year = Integer.parseInt(parts[2].trim());
                        double price = Double.parseDouble(parts[3].trim());
                        String color = parts[4].trim();
                        double weight = Double.parseDouble(parts[5].trim());
                        boolean used = Boolean.parseBoolean(parts[6].trim());
                        int numDoor = Integer.parseInt(parts[7].trim());
                        int passengerCapacity = Integer.parseInt(parts[8].trim());
                        String fuelType = parts[9].trim();
                        double power = Double.parseDouble(parts[10].trim());
                        double loadCapacity = Double.parseDouble(parts[11].trim());
                        double plateSize = Double.parseDouble(parts[12].trim());
                        String traction = parts[13].trim();
                        int vehicleId = Integer.parseInt(parts[14].trim());
                        
                        pickups.add(new Pickup(brand, model, year, price, color, weight, used, 
                                             numDoor, passengerCapacity, fuelType, power, 
                                             loadCapacity, plateSize, traction, vehicleId));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading Pickup file: " + e.getMessage());
        }
        return pickups;
    }
    
    // HyperMotorbike
    public static ArrayList<Vehicle> readHyperMotorbike(String filePath) {
        ArrayList<Vehicle> hyperMotorbikes = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 15) {
                        String brand = parts[0].trim();
                        String model = parts[1].trim();
                        int year = Integer.parseInt(parts[2].trim());
                        double price = Double.parseDouble(parts[3].trim());
                        String color = parts[4].trim();
                        double weight = Double.parseDouble(parts[5].trim());
                        boolean used = Boolean.parseBoolean(parts[6].trim());
                        double cylinderCapacity = Double.parseDouble(parts[7].trim());
                        String engineType = parts[8].trim();
                        String brakeType = parts[9].trim();
                        String chassisMaterial = parts[10].trim();
                        double acceleration0to100 = Double.parseDouble(parts[11].trim());
                        double maxSpeed = Double.parseDouble(parts[12].trim());
                        int downForce = Integer.parseInt(parts[13].trim());
                        int vehicleId = Integer.parseInt(parts[14].trim());
                        
                        hyperMotorbikes.add(new HyperMotorbike(brand, model, year, price, color, weight, used, 
                                                             cylinderCapacity, engineType, brakeType, 
                                                             chassisMaterial, acceleration0to100, 
                                                             maxSpeed, downForce, vehicleId));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading MotorBike file: " + e.getMessage());
        }
        return hyperMotorbikes;
    }
    
    // HyperCar
    public static ArrayList<Vehicle> readHyperCar(String filePath) {
        ArrayList<Vehicle> hyperCars = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 16) {
                        String brand = parts[0].trim();
                        String model = parts[1].trim();
                        int year = Integer.parseInt(parts[2].trim());
                        double price = Double.parseDouble(parts[3].trim());
                        String color = parts[4].trim();
                        double weight = Double.parseDouble(parts[5].trim());
                        boolean used = Boolean.parseBoolean(parts[6].trim());
                        int numDoor = Integer.parseInt(parts[7].trim());
                        int passengerCapacity = Integer.parseInt(parts[8].trim());
                        String fuelType = parts[9].trim();
                        double power = Double.parseDouble(parts[10].trim());
                        double acceleration0to100 = Double.parseDouble(parts[11].trim());
                        String material = parts[12].trim();
                        String hybridPropulsion = parts[13].trim();
                        int downForce = Integer.parseInt(parts[14].trim());
                        int vehicleId = Integer.parseInt(parts[15].trim());
                        
                        hyperCars.add(new HyperCar(brand, model, year, price, color, weight, used, 
                                                 numDoor, passengerCapacity, fuelType, power, 
                                                 acceleration0to100, material, hybridPropulsion, 
                                                 downForce, vehicleId));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading HyperCar file: " + e.getMessage());
        }
        return hyperCars;
    }
    
    // Client
    public static ArrayList<Client> readClient(String filePath) {
        ArrayList<Client> clients = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 8) {
                        String name = parts[0].trim();
                        String lastName1 = parts[1].trim();
                        String lastName2 = parts[2].trim();
                        int age = Integer.parseInt(parts[3].trim());
                        String dni = parts[4].trim();
                        String phone = parts[5].trim();
                        boolean newClient = Boolean.parseBoolean(parts[6].trim());
                        int clientId = Integer.parseInt(parts[7].trim());
                        
                        clients.add(new Client(name, lastName1, lastName2, age, dni, phone, newClient, clientId));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading Client file: " + e.getMessage());
        }
        return clients;
    }
    
    // Seller
    public static void readSeller(String filePath, ArrayList<Person> people) {
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 10) {
                        String name = parts[0].trim();
                        String lastName1 = parts[1].trim();
                        String lastName2 = parts[2].trim();
                        int age = Integer.parseInt(parts[3].trim());
                        String dni = parts[4].trim();
                        String phone = parts[5].trim();
                        String id = parts[6].trim();
                        String email = parts[7].trim();
                        int yearsOfExperience = Integer.parseInt(parts[8].trim());
                        int salesMade = Integer.parseInt(parts[9].trim());
                        
                        people.add(new Seller(name, lastName1, lastName2, age, dni, phone, 
                                            id, email, yearsOfExperience, salesMade));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading Sellers file: " + e.getMessage());
        }
    }
    
    // Mechanic
    public static void readMechanic(String filePath, ArrayList<Person> people) {
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 10) {
                        String name = parts[0].trim();
                        String lastName1 = parts[1].trim();
                        String lastName2 = parts[2].trim();
                        int age = Integer.parseInt(parts[3].trim());
                        String dni = parts[4].trim();
                        String phone = parts[5].trim();
                        String id = parts[6].trim();
                        String email = parts[7].trim();
                        int yearsOfExperience = Integer.parseInt(parts[8].trim());
                        String specialty = parts[9].trim();
                        
                        people.add(new Mechanic(name, lastName1, lastName2, age, dni, phone, 
                                              id, email, yearsOfExperience, specialty));
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading Mechanics file: " + e.getMessage());
        }
    }
    
    // Relations
    public static void createRelations(String filePath, ArrayList<Vehicle> vehicles, ArrayList<Person> people) {
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    if (parts.length >= 2) {
                        int vehicleId = Integer.parseInt(parts[0].trim());
                        int clientId = Integer.parseInt(parts[1].trim());
                        
                        for (Person person : people) {
                            if (person instanceof Client) {
                                Client client = (Client) person;
                                if (client.getClientId() == clientId) {
                                    for (Vehicle vehicle : vehicles) {
                                        if (vehicle.getVehicleId() == vehicleId) {
                                            client.addShoppingList(vehicle);
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    // Error silencioso
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading Relations file: " + e.getMessage());
        }
    }
    
    // Create Report
    public static void createReport(String filePath, ArrayList<Vehicle> vehicles, ArrayList<Person> people) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("=== CAR DEALERSHIP REPORT ===\n");
            writer.write("Generated on: " + java.time.LocalDateTime.now() + "\n\n");
            
            // Vehicle information
            writer.write("VEHICLE INFORMATION\n");
            writer.write("===================\n");
            for (Vehicle vehicle : vehicles) {
                writer.write(vehicle.toString());
                writer.write("\n-------------------\n");
            }
            
            // Client information
            writer.write("\nCLIENT INFORMATION\n");
            writer.write("==================\n");
            for (Person person : people) {
                if (person instanceof Client) {
                    writer.write(person.toString());
                    writer.write("\n-------------------\n");
                }
            }
            
            // Worker information
            writer.write("\nWORKER INFORMATION\n");
            writer.write("==================\n");
            for (Person person : people) {
                if (person instanceof Seller || person instanceof Mechanic) {
                    writer.write(person.toString());
                    writer.write("\n-------------------\n");
                }
            }
            
            System.out.println("Report created successfully: " + filePath);
            
        } catch (IOException e) {
            System.out.println("Error creating the report: " + e.getMessage());
        }
    }
    
    // Métodos de carga masiva
    public static ArrayList<Vehicle> loadAllVehicles(String dataFolder) {
        ArrayList<Vehicle> allVehicles = new ArrayList<>();
        
        allVehicles.addAll(readTouring(dataFolder + "/touring.txt"));
        allVehicles.addAll(readSport(dataFolder + "/sport.txt"));
        allVehicles.addAll(readDualSport(dataFolder + "/dualsport.txt"));
        allVehicles.addAll(readSedan(dataFolder + "/sedan.txt"));
        allVehicles.addAll(readCarSport(dataFolder + "/carsport.txt"));
        allVehicles.addAll(readPickup(dataFolder + "/pickup.txt"));
        allVehicles.addAll(readHyperMotorbike(dataFolder + "/hypermotorbike.txt"));
        allVehicles.addAll(readHyperCar(dataFolder + "/hypercar.txt"));
        
        return allVehicles;
    }
    
    public static ArrayList<Person> loadAllPeople(String dataFolder) {
        ArrayList<Person> allPeople = new ArrayList<>();
        
        allPeople.addAll(readClient(dataFolder + "/clients.txt"));
        readSeller(dataFolder + "/sellers.txt", allPeople);
        readMechanic(dataFolder + "/mechanics.txt", allPeople);
        
        return allPeople;
    }
}