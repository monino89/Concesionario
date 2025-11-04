
package concesionario;

import Utility.UtilityFileReader;
import VehicleCatalog.Touring;
import VehicleCatalog.MotorBike;
import VehicleCatalog.Vehicle;
import java.util.ArrayList;

public class Concesionario {
    public static void main(String[] args) {
        ArrayList<Vehicle> testtouring=new ArrayList<>(UtilityFileReader.readTouring("./touring.txt"));
        for(Vehicle v:testtouring){
            System.out.println(v.toString());
        }
    }
}
