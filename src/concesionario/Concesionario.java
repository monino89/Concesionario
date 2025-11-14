
package concesionario;

import Utility.UtilityFileReader;
import VehicleCatalog.Touring;
import VehicleCatalog.MotorBike;
import VehicleCatalog.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
    public static void main(String[] args) {
        //crear la arraylist vehicles de todos los vehiculos leyendo los archivos, touring retorna arraylist y el resto solo agregan a la arraylist
        ArrayList<Vehicle> vehicles=new ArrayList<>(UtilityFileReader.readTouring("./touring.txt"));
        UtilityFileReader.readSport("./sport.txt", vehicles);
        UtilityFileReader.readDualSport("./dualsport.txt", vehicles);
        UtilityFileReader.readSedan("./sedan.txt", vehicles);
        UtilityFileReader.readCarSport("./carsport.txt", vehicles);
        UtilityFileReader.readPickup("./pickup.txt", vehicles);
        UtilityFileReader.readHyperMotorbike("./hypermotorbike.txt", vehicles);
        UtilityFileReader.readHyperCar("./hypercar.txt", vehicles);
        for(Vehicle v:vehicles){
            System.out.println(v.toString());
        }
        
        
        
        /*
        
        //CODIGO PARA EL MENU
        int option, addVehicleOpt;
        boolean stop=false;
        
        //Clase Client
        String name, lastName1, lastName2, dni, phone;
        int age, clientId;
        boolean newClient;
        
        //Clase Vehicle
        String brand, model, color;
        int year, vehicleId;
        double price, weight;
        boolean used;
        
        Scanner scanner= new Scanner(System.in);
        
        try{
            while(!stop){
                Menu.printMenu();
                System.out.println("Please type the desired option: ");
                option = scanner.nextInt();
                scanner.nextLine();
                
                switch(option){
                    case 1:
                        //Print vehicles information
                        System.out.println("VEHICLE INFORMATIONS");
                        for(Vehicle v: vehicles){
                            System.out.println(v.toString());
                        }
                        break;
                    case 2:
                        //Print Client information
                        System.out.println("\nCLIENTS INFORMATION");
                        for(Person p: people){
                            System.out.println(p.toString());
                        }
                        break;
                    case 3:
                        //Modyfi an existing client
                        Client tempC=null;
                        System.out.println("Please type the id of the client to modify");
                        clientId=scanner.nextLine();
                        for()
                        }
                }
            }
            
        }catch(Exception e){
            
        }*/
    }
}
