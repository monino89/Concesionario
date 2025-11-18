package concesionario;


import Utility.Menu;
import Utility.UtilityFileReader;
import People.Person;
import VehicleCatalog.Vehicle;
import java.util.ArrayList;
import java.io.File;

public class Concesionario {
    public static void main(String[] args) {
        System.out.println("=== CAR DEALERSHIP MANAGEMENT SYSTEM ===");
        
        String projectPath = System.getProperty("user.dir");
        String dataFolder = projectPath + File.separator + "data";
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();
        
        try {
            System.out.println("Loading data of the dealership...");
            
            // Cargar todos los datos
            vehicles = UtilityFileReader.loadAllVehicles(dataFolder);
            people = UtilityFileReader.loadAllPeople(dataFolder);
            UtilityFileReader.createRelations(dataFolder + "/relations.txt", vehicles, people);
            
            System.out.println("\n=== SYSTEM INITIALIZED ===");
            System.out.println("Vehicles on the system: " + vehicles.size());
            System.out.println("People registered: " + people.size());
            
        } catch (Exception e) {
            System.out.println("System initialization failed: " + e.getMessage());
            return;
        }
        
        // Iniciar menú principal
        Menu.handleMenu(vehicles, people, dataFolder);
    }
}