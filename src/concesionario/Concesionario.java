
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
        String vehicleId;
        Scanner scanner= new Scanner(System.in);
        
        try{
            //Vehicle ArrayList
            ArrayList<Vehicle> veh=Menu.readVehicle();
        }catch(Exception e){
            
        }
           */
    }
}
