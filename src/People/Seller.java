
package People;

import VehicleCatalog.Vehicle;
import java.util.ArrayList;


public class Seller extends Worker {
    
    
    private int salesMade;
    private ArrayList<Vehicle> vehicleInCharge;
    public Seller(){
        
    }
    
    public Seller(String name, String lastName1, String lastName2, int age, String dni, String phone, String id, String email, int yearsOfExperience, int salesMade){
        super(name, lastName1, lastName2, age, dni, phone, id, email, yearsOfExperience);
        this.setSalesMade(salesMade);
        this.vehicleInCharge = new ArrayList<>();
    }
    
    public final void setSalesMade(int salesMade){
        this.salesMade = salesMade;
    }
    
    public int getSalesMade(){
        return this.salesMade;
    }
    
    public void addListOfVehicles(Vehicle vehicle){
        this.vehicleInCharge.add(vehicle);
    }
    
    @Override
    public String toString(){
        String str = "\nSales made: " + this.salesMade;
        return str;
    }
}
