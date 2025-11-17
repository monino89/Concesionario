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
        
        // Verificar carpeta data
        File folder = new File(dataFolder);
        if (!folder.exists()) {
            System.out.println("Error: La carpeta 'data' no existe en: " + dataFolder);
            System.out.println("Por favor crea una carpeta 'data' con los archivos necesarios.");
            return;
        }
        
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();
        
        try {
            System.out.println("Cargando datos del concesionario...");
            
            // Cargar todos los datos
            vehicles = UtilityFileReader.loadAllVehicles(dataFolder);
            people = UtilityFileReader.loadAllPeople(dataFolder);
            UtilityFileReader.createRelations(dataFolder + "/relations.txt", vehicles, people);
            
            System.out.println("\n=== SISTEMA INICIALIZADO ===");
            System.out.println("Vehículos cargados: " + vehicles.size());
            System.out.println("Personas registradas: " + people.size());
            
        } catch (Exception e) {
            System.out.println("Error inicializando el sistema: " + e.getMessage());
            return;
        }
        
        // Iniciar menú principal
        Menu.handleMenu(vehicles, people, dataFolder);
    }
}