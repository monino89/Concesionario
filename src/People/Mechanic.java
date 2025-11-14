
package People;

import Validation.ValidationClass;
import VehicleCatalog.Vehicle;
import java.util.ArrayList;


public class Mechanic extends Worker {
    
    private String specialty;
    private ArrayList<Vehicle> vehicleCheck;
    
    public Mechanic(){
        
    }
    
    public Mechanic(String name, String lastName1, String lastName2, int age, String dni, String phone, String id, String email, int yearsOfExperience, String specialty){
        super(name, lastName1, lastName2, age, dni, phone, id, email, yearsOfExperience);
        this.setSpecialty(specialty);
        this.vehicleCheck = new ArrayList<>();
    }
    
    protected final void setSpecialty(String specialty){
        ValidationClass.ValidateSpecialTy(specialty);
        this.specialty = specialty;
    }
    
    protected String getSpecialty(){
        return this.specialty;
    }
    
    public void addCheckList(Vehicle vehicle){
        this.vehicleCheck.add(vehicle);
    }
    
    
    @Override
    public String toString(){
        String str = super.toString() + "\nSpecialty: " + this.specialty;
        if (this.vehicleCheck.size()>0){
            str += "Vehciles to repair: \n";
            for(Vehicle a: this.vehicleCheck){
                str += a.toString() + "\n";
            }
            
        } else {
            str += "The mechanic does not have any vehicles to check.\n";
        }
        return str;
    }
}
