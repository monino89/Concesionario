//menu de la aplicacion
package Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import People.Client;
import VehicleCatalog.Vehicle;

public final class Menu {
    /*
    private Menu(){}
    
    public static void printMenu(){
        System.out.println("\n\nAVAILABLE OPTIONS");
        System.out.println("1. Print vehicles information");
        System.out.println("2. Print clients information");
        System.out.println("3. Modify an existing Vehicle");
        System.out.println("4. Modify an existing Cliuent");
        System.out.println("5. Create a new vehicle");
        System.out.println("6. Create new client");
        System.out.println("7. Create report file");
        System.out.println("8. End the program");
    }
    
    public static ArrayList<Client> readClient(String filePath){
        
        ArrayList <Client> client = new ArrayList<>();
        
        String line="";
        String name="";
        String lastName1="";
        String lastName2="";
        int age=0;
        String dni="";
        String phone="";
        boolean newClient=false;
        int clientId=0;
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            
            while((line=reader.readLine())!=null){
                
                String[] parts = line.split(",");
                
                try{
                    if(parts.length>=8){
                        name=parts[0].trim();
                        lastName1=parts[1].trim();
                        lastName2=parts[2].trim();
                        age = Integer.parseInt(parts[3].trim());
                        dni=parts[4].trim();
                        phone=parts[5].trim();
                        newClient=Boolean.parseBoolean(parts[6].trim());
                        clientId=Integer.parseInt(parts[7].trim());
                        
                        client.add(new Client(name, lastName1, lastName2, age, dni, phone, newClient, clientId));
                    }else{
                        System.out.println("Imcomplete data to create the object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
        return client;
    }
    
    public static ArrayList<Vehicle> readVehicle(String filePath, ArrayList<Client>client){
        
        ArrayList <Vehicle> vehicle= new ArrayList<>();
        
        String line="";
        String brand="";
        String model="";
        int year=0;
        double price=0.0;
        String color="";
        double weight=0.0;
        boolean used = false;
        int vehicleId = 0; 
        int clientId=0;
        Vehicle tempV;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            
            while((line=reader.readLine())!=null){
                
                String[] parts = line.split(",");
                
                try{
                    if(parts.length>=9){
                        brand = parts[0].trim();
                        model=parts[1].trim();
                        year = Integer.parseInt(parts[2].trim());
                        price = Double.parseDouble(parts[3].trim());
                        color = parts[4].trim();
                        weight = Double.parseDouble(parts[5].trim());
                        used = Boolean.parseBoolean(parts[6].trim());
                        vehicleId = Integer.parseInt(parts[7].trim());
                        clientId = Integer.parseInt(parts[8].trim());
                        
                        tempV = new Vehicle(brand, model, year, price, color, weight, used, vehicleId);
                        vehicle.add(tempV);
                        
                        for(Client c; client){
                            if(clientId.equals(c.getClientId())){
                                c.addVehicle(tempV);
                            }
                        }
                        
                    }else{
                        System.out.println("No hay suficientes datos para crear el objeto");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }  
            }
            reader.close();
        }catch (IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
        return vehicle;
    }
    
    public static void createReport(String filePath, ArrayList<Vehicle> vehicle, ArrayList<Client>client){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            
            writer.write("VEHICLE INFORMATIONS\n");
            writer.newLine();
            
            //Writing vehicle information
            String line="";
            for(Vehicle v: vehicle){
                line=v.toString();
                writer.write(line);
                writer.newLine();
            }
            
            writer.write("\nCLIENT INFORMATION\n");
            writer.newLine();
            
            //Writing client information
            line="";
            for(Client c: client){
                line=c.toString();
                writer.write(line);
                writer.newLine();
            }
            
            //Closing BufferedWriter
            writer.close();
            System.out.println("The file was created: "+ filePath);
            
        }catch(IOException e){
            System.out.println("Error: File could not be created"+e.getMessage());
        }
    }*/
}
