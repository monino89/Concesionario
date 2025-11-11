
package People;
import Validation.ValidationClass;
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
    
    protected final void setSalesMade(int salesMade){
        ValidationClass.ValidateSalesMade(salesMade);
        this.salesMade = salesMade;
    }
    
    protected int getSalesMade(){
        return this.salesMade;
    }
    
    public void addListOfVehicles(Vehicle vehicle){
        this.vehicleInCharge.add(vehicle);
    }
    
    @Override
    public String toString(){
        String str = super.toString() + "\nSales made: " + this.salesMade;
        if (this.vehicleInCharge.size()>0){
            str += "Vehciles in charge: \n";
            for(Vehicle a: this.vehicleInCharge){
                str += a.toString() + "\n";
            }
            
        } else {
            str += "The seller does not have any vehicles to sell.\n";
        }
        return str;
    }
}
