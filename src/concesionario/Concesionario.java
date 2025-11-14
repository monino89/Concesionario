
package concesionario;

import People.Client;
import People.Person;
import Utility.UtilityFileReader;
import VehicleCatalog.Touring;
import VehicleCatalog.MotorBike;
import VehicleCatalog.Vehicle;
import java.util.ArrayList;

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
        
        //crear la lista de clientes, client retorna arraylist y el resto agregan a la lista
        ArrayList<Person> people = new ArrayList<>(UtilityFileReader.readClient("./clients.txt"));
        UtilityFileReader.readSeller("./sellers.txt", people);
        UtilityFileReader.readMechanic("./mechanics.txt", people);
        
        //Imprimir lista vehiculos
        for(Vehicle v:vehicles){
            System.out.println(v.toString());
        }
        
        //Imprimir lista de clientes y trabajadores
        for(Person p: people){
            System.out.println(p.toString() + "\n");
        }
        
    }
}
