//esto esta muy mal hecho para poder copiar y pegar, seria mejor no tocarlo
package Utility;
import People.Client;
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
import concesionario.Concesionario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class UtilityFileReader {
    //touring
    public static ArrayList<Vehicle> readTouring(String filePath){
        ArrayList<Vehicle> touring=new ArrayList<>();
        String line="";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=13){
                        String brand=parts[0].trim();
                String model=parts[1].trim();
                int year=Integer.parseInt(parts[2].trim());
                double price=Double.parseDouble(parts[3].trim());
                String color=parts[4].trim();
                double weight=Double.parseDouble(parts[5].trim());
                boolean used=Boolean.parseBoolean(parts[6].trim());
                double cylinderCapacity=Double.parseDouble(parts[7].trim());
                String engineType=parts[8].trim();
                String brakeType=parts[9].trim();
                double autonomyKm=Double.parseDouble(parts[10].trim());
                double tankCapacity=Double.parseDouble(parts[11].trim());
                int vehicleId=Integer.parseInt(parts[12].trim());
                        touring.add(new Touring(brand,model,year,price,color,weight,used,cylinderCapacity,engineType,brakeType,autonomyKm,tankCapacity,vehicleId));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
        return touring;
    }
    //sport
    public static void readSport(String filePath,ArrayList vehicles){
        String line="";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=13){
                        String brand=parts[0].trim();
                String model=parts[1].trim();
                int year=Integer.parseInt(parts[2].trim());
                double price=Double.parseDouble(parts[3].trim());
                String color=parts[4].trim();
                double weight=Double.parseDouble(parts[5].trim());
                boolean used=Boolean.parseBoolean(parts[6].trim());
                double cylinderCapacity=Double.parseDouble(parts[7].trim());
                String engineType=parts[8].trim();
                String brakeType=parts[9].trim();
                String autonomyKm=(parts[10].trim());//chassisMaterial
                double tankCapacity=Double.parseDouble(parts[11].trim());
                int vehicleId=Integer.parseInt(parts[12].trim());
                        vehicles.add(new Sport(brand,model,year,price,color,weight,used,cylinderCapacity,engineType,brakeType,autonomyKm,tankCapacity,vehicleId));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
    }
    //dualsport
    public static void readDualSport(String filePath,ArrayList vehicles){
        String line="";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=13){
                        String brand=parts[0].trim();
                String model=parts[1].trim();
                int year=Integer.parseInt(parts[2].trim());
                double price=Double.parseDouble(parts[3].trim());
                String color=parts[4].trim();
                double weight=Double.parseDouble(parts[5].trim());
                boolean used=Boolean.parseBoolean(parts[6].trim());
                double cylinderCapacity=Double.parseDouble(parts[7].trim());
                String engineType=parts[8].trim();
                String brakeType=parts[9].trim();
                double autonomyKm=Double.parseDouble(parts[10].trim());
                String tankCapacity=(parts[11].trim());
                int vehicleId=Integer.parseInt(parts[12].trim());
                        vehicles.add(new DualSport(brand,model,year,price,color,weight,used,cylinderCapacity,engineType,brakeType,autonomyKm,tankCapacity,vehicleId));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
    }
    //sedan
    public static void readSedan(String filePath,ArrayList vehicles){
        String line="";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=14){
                        String brand=parts[0].trim();
                String model=parts[1].trim();
                int year=Integer.parseInt(parts[2].trim());
                double price=Double.parseDouble(parts[3].trim());
                String color=parts[4].trim();
                double weight=Double.parseDouble(parts[5].trim());
                boolean used=Boolean.parseBoolean(parts[6].trim());
                int numDoor=Integer.parseInt(parts[7].trim());
                int passengerCapacity=Integer.parseInt(parts[8].trim());
                String fuelType=parts[9].trim();
                double power=Double.parseDouble(parts[10].trim());
                String typeSedan=parts[11].trim();
                double trunkCapacity=Double.parseDouble(parts[12].trim());
                int vehicleId=Integer.parseInt(parts[13].trim());
                        vehicles.add(new Sedan(brand,model,year,price,color,weight,used,numDoor,passengerCapacity,fuelType,power,typeSedan,trunkCapacity,vehicleId));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
    }
    //carsport
    public static void readCarSport(String filePath,ArrayList vehicles){
        String line="";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=14){
                        String brand=parts[0].trim();
                String model=parts[1].trim();
                int year=Integer.parseInt(parts[2].trim());
                double price=Double.parseDouble(parts[3].trim());
                String color=parts[4].trim();
                double weight=Double.parseDouble(parts[5].trim());
                boolean used=Boolean.parseBoolean(parts[6].trim());
                int numDoor=Integer.parseInt(parts[7].trim());
                int passengerCapacity=Integer.parseInt(parts[8].trim());
                String fuelType=parts[9].trim();
                double power=Double.parseDouble(parts[10].trim());
                double typeSedan=Double.parseDouble(parts[11].trim());
                String trunkCapacity=(parts[12].trim());
                int vehicleId=Integer.parseInt(parts[13].trim());
                        vehicles.add(new CarSport(brand,model,year,price,color,weight,used,numDoor,passengerCapacity,fuelType,power,typeSedan,trunkCapacity,vehicleId));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
    }
    //pickup
    public static void readPickup(String filePath,ArrayList vehicles){
        String line="";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=15){
                        String brand=parts[0].trim();
                String model=parts[1].trim();
                int year=Integer.parseInt(parts[2].trim());
                double price=Double.parseDouble(parts[3].trim());
                String color=parts[4].trim();
                double weight=Double.parseDouble(parts[5].trim());
                boolean used=Boolean.parseBoolean(parts[6].trim());
                int numDoor=Integer.parseInt(parts[7].trim());
                int passengerCapacity=Integer.parseInt(parts[8].trim());
                String fuelType=parts[9].trim();
                double power=Double.parseDouble(parts[10].trim());
                double typeSedan=Double.parseDouble(parts[11].trim());
                double trunkCapacity=Double.parseDouble(parts[12].trim());
                String traction=parts[13].trim();
                int vehicleId=Integer.parseInt(parts[14].trim());
                        vehicles.add(new Pickup(brand,model,year,price,color,weight,used,numDoor,passengerCapacity,fuelType,power,typeSedan,trunkCapacity,traction,vehicleId));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
    }
    //hypermotorbike
    public static void readHyperMotorbike(String filePath,ArrayList vehicles){
        String line="";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=15){
                        String brand=parts[0].trim();
                String model=parts[1].trim();
                int year=Integer.parseInt(parts[2].trim());
                double price=Double.parseDouble(parts[3].trim());
                String color=parts[4].trim();
                double weight=Double.parseDouble(parts[5].trim());
                boolean used=Boolean.parseBoolean(parts[6].trim());
                double cylinderCapacity=Double.parseDouble(parts[7].trim());
                String engineType=parts[8].trim();
                String brakeType=parts[9].trim();
                String autonomyKm=(parts[10].trim());//chassisMaterial
                double tankCapacity=Double.parseDouble(parts[11].trim());
                double maxSpeed=Double.parseDouble(parts[12].trim());
                int downForce=Integer.parseInt(parts[13].trim());
                int vehicleId=Integer.parseInt(parts[14].trim());
                        vehicles.add(new HyperMotorbike(brand,model,year,price,color,weight,used,cylinderCapacity,engineType,brakeType,autonomyKm,tankCapacity,maxSpeed,downForce,vehicleId));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
    }
    //hypercar
    public static void readHyperCar(String filePath,ArrayList vehicles){
        String line="";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=16){
                        String brand=parts[0].trim();
                String model=parts[1].trim();
                int year=Integer.parseInt(parts[2].trim());
                double price=Double.parseDouble(parts[3].trim());
                String color=parts[4].trim();
                double weight=Double.parseDouble(parts[5].trim());
                boolean used=Boolean.parseBoolean(parts[6].trim());
                int numDoor=Integer.parseInt(parts[7].trim());
                int passengerCapacity=Integer.parseInt(parts[8].trim());
                String fuelType=parts[9].trim();
                double power=Double.parseDouble(parts[10].trim());
                double typeSedan=Double.parseDouble(parts[11].trim());
                String trunkCapacity=(parts[12].trim());
                String hybridPropulsion=parts[13].trim();
                int downForce=Integer.parseInt(parts[14].trim());
                int vehicleId=Integer.parseInt(parts[15].trim());
                        vehicles.add(new HyperCar(brand,model,year,price,color,weight,used,numDoor,passengerCapacity,fuelType,power,typeSedan,trunkCapacity,hybridPropulsion,downForce,vehicleId));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
    }
    //client
    public static void readClient(String filePath,ArrayList vehicles){
        String line="";
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            reader.readLine();
            while((line=reader.readLine())!=null){
                String[] parts=line.split(",");
                try{
                    if(parts.length>=8){
                        String name=parts[0].trim();
                        String lastName1=parts[1].trim();
                        String lastName2=parts[2].trim();
                        int age=Integer.parseInt(parts[3].trim());
                        String dni=parts[4].trim();
                        String phone=parts[5].trim();
                        boolean newClient=Boolean.parseBoolean(parts[6].trim());
                        int clientId=Integer.parseInt(parts[7].trim());
                        vehicles.add(new Client(name,lastName1,lastName2,age,dni,phone,newClient,clientId));
                    }else{
                     System.out.println("Insuficiente data to create object");
                    }
                }catch(Exception e){
                    System.out.println("Error creating the object: "+e.getMessage());
                }
            }
            reader.close();
        }catch(IOException e){
            System.err.println("Error reading file: "+e.getMessage());
        }
    }
    
    //file writer
    
    public static void createReport(String filePath,ArrayList<Vehicle> vehicles){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath))){
            writer.write("\tVehicle information ");
            writer.newLine();
            for (Vehicle v: vehicles){
                writer.write(v.toString());
                writer.newLine();
            }
            writer.close();
            System.out.println("File has been created: "+filePath);
        }catch(IOException e){
            System.err.println("File could not be created: "+e.getMessage());
        }
    }
}
